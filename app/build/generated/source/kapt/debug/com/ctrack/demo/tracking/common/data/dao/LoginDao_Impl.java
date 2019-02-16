package com.ctrack.demo.tracking.common.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.ctrack.demo.tracking.common.data.entity.Login;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class LoginDao_Impl implements LoginDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfLogin;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfLogin;

  public LoginDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLogin = new EntityInsertionAdapter<Login>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `login`(`id`,`username`,`password`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Login value) {
        stmt.bindLong(1, value.getId());
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPassword());
        }
      }
    };
    this.__deletionAdapterOfLogin = new EntityDeletionOrUpdateAdapter<Login>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `login` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Login value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(Login login) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLogin.insert(login);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<Login> logins) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLogin.insert(logins);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Login login) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfLogin.handle(login);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int count() {
    final String _sql = "SELECT COUNT(*) from login";
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

  @Override
  public Login getAuthenticationUser(String username, String password) {
    final String _sql = "SELECT * FROM login WHERE username LIKE ? AND password LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    _argIndex = 2;
    if (password == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, password);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfUsername = _cursor.getColumnIndexOrThrow("username");
      final int _cursorIndexOfPassword = _cursor.getColumnIndexOrThrow("password");
      final Login _result;
      if(_cursor.moveToFirst()) {
        _result = new Login();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        _result.setUsername(_tmpUsername);
        final String _tmpPassword;
        _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        _result.setPassword(_tmpPassword);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
