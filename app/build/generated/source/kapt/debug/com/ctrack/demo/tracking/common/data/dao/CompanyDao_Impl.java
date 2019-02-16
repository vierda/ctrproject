package com.ctrack.demo.tracking.common.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.ctrack.demo.tracking.common.data.entity.Company;
import java.lang.Override;
import java.lang.String;

public class CompanyDao_Impl implements CompanyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCompany;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCompany;

  public CompanyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCompany = new EntityInsertionAdapter<Company>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `company`(`id`,`name`,`catchPhrase`,`bs`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Company value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getCatchPhrase() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCatchPhrase());
        }
        if (value.getBs() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBs());
        }
      }
    };
    this.__deletionAdapterOfCompany = new EntityDeletionOrUpdateAdapter<Company>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `company` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Company value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(Company company) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCompany.insert(company);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Company company) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCompany.handle(company);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int count() {
    final String _sql = "SELECT COUNT(*) from company";
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
