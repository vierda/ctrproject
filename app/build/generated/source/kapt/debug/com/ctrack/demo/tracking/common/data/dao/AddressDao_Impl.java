package com.ctrack.demo.tracking.common.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.ctrack.demo.tracking.common.data.converter.GeoConverter;
import com.ctrack.demo.tracking.common.data.entity.Address;
import java.lang.Override;
import java.lang.String;

public class AddressDao_Impl implements AddressDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfAddress;

  private final GeoConverter __geoConverter = new GeoConverter();

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfAddress;

  public AddressDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAddress = new EntityInsertionAdapter<Address>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `address`(`id`,`street`,`suite`,`city`,`zipcode`,`geo`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Address value) {
        stmt.bindLong(1, value.getId());
        if (value.getStreet() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getStreet());
        }
        if (value.getSuite() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSuite());
        }
        if (value.getCity() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCity());
        }
        if (value.getZipcode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getZipcode());
        }
        final String _tmp;
        _tmp = __geoConverter.getStringFromGeo(value.geo);
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
      }
    };
    this.__deletionAdapterOfAddress = new EntityDeletionOrUpdateAdapter<Address>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `address` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Address value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(Address address) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfAddress.insert(address);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Address address) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfAddress.handle(address);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int count() {
    final String _sql = "SELECT COUNT(*) from address";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
