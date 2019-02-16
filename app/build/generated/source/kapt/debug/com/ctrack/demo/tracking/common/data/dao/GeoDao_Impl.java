package com.ctrack.demo.tracking.common.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.ctrack.demo.tracking.common.data.entity.Geo;
import java.lang.Override;
import java.lang.String;

public class GeoDao_Impl implements GeoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfGeo;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfGeo;

  public GeoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGeo = new EntityInsertionAdapter<Geo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `geo`(`id`,`lat`,`lng`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Geo value) {
        stmt.bindLong(1, value.getId());
        if (value.getLat() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLat());
        }
        if (value.getLng() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLng());
        }
      }
    };
    this.__deletionAdapterOfGeo = new EntityDeletionOrUpdateAdapter<Geo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `geo` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Geo value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(Geo geo) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfGeo.insert(geo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Geo geo) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfGeo.handle(geo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int count() {
    final String _sql = "SELECT COUNT(*) from geo";
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
