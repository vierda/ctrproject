package com.ctrack.demo.tracking.common.data.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import com.ctrack.demo.tracking.common.data.dao.AddressDao;
import com.ctrack.demo.tracking.common.data.dao.AddressDao_Impl;
import com.ctrack.demo.tracking.common.data.dao.CompanyDao;
import com.ctrack.demo.tracking.common.data.dao.CompanyDao_Impl;
import com.ctrack.demo.tracking.common.data.dao.GeoDao;
import com.ctrack.demo.tracking.common.data.dao.GeoDao_Impl;
import com.ctrack.demo.tracking.common.data.dao.LoginDao;
import com.ctrack.demo.tracking.common.data.dao.LoginDao_Impl;
import com.ctrack.demo.tracking.common.data.dao.UserDao;
import com.ctrack.demo.tracking.common.data.dao.UserDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.HashSet;

public class AppDatabase_Impl extends AppDatabase {
  private volatile AddressDao _addressDao;

  private volatile CompanyDao _companyDao;

  private volatile GeoDao _geoDao;

  private volatile LoginDao _loginDao;

  private volatile UserDao _userDao;

  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `address` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `street` TEXT NOT NULL, `suite` TEXT NOT NULL, `city` TEXT NOT NULL, `zipcode` TEXT NOT NULL, `geo` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `company` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `catchPhrase` TEXT NOT NULL, `bs` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `geo` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `lat` TEXT NOT NULL, `lng` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `login` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `username` TEXT NOT NULL, `password` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `username` TEXT NOT NULL, `email` TEXT NOT NULL, `address` TEXT NOT NULL, `phone` TEXT NOT NULL, `website` TEXT NOT NULL, `company` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"4266303cfcf653c3fd2424ae1557e466\")");
      }

      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `address`");
        _db.execSQL("DROP TABLE IF EXISTS `company`");
        _db.execSQL("DROP TABLE IF EXISTS `geo`");
        _db.execSQL("DROP TABLE IF EXISTS `login`");
        _db.execSQL("DROP TABLE IF EXISTS `user`");
      }

      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAddress = new HashMap<String, TableInfo.Column>(6);
        _columnsAddress.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsAddress.put("street", new TableInfo.Column("street", "TEXT", true, 0));
        _columnsAddress.put("suite", new TableInfo.Column("suite", "TEXT", true, 0));
        _columnsAddress.put("city", new TableInfo.Column("city", "TEXT", true, 0));
        _columnsAddress.put("zipcode", new TableInfo.Column("zipcode", "TEXT", true, 0));
        _columnsAddress.put("geo", new TableInfo.Column("geo", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAddress = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAddress = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAddress = new TableInfo("address", _columnsAddress, _foreignKeysAddress, _indicesAddress);
        final TableInfo _existingAddress = TableInfo.read(_db, "address");
        if (! _infoAddress.equals(_existingAddress)) {
          throw new IllegalStateException("Migration didn't properly handle address(com.ctrack.demo.tracking.common.data.entity.Address).\n"
                  + " Expected:\n" + _infoAddress + "\n"
                  + " Found:\n" + _existingAddress);
        }
        final HashMap<String, TableInfo.Column> _columnsCompany = new HashMap<String, TableInfo.Column>(4);
        _columnsCompany.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsCompany.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsCompany.put("catchPhrase", new TableInfo.Column("catchPhrase", "TEXT", true, 0));
        _columnsCompany.put("bs", new TableInfo.Column("bs", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCompany = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCompany = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCompany = new TableInfo("company", _columnsCompany, _foreignKeysCompany, _indicesCompany);
        final TableInfo _existingCompany = TableInfo.read(_db, "company");
        if (! _infoCompany.equals(_existingCompany)) {
          throw new IllegalStateException("Migration didn't properly handle company(com.ctrack.demo.tracking.common.data.entity.Company).\n"
                  + " Expected:\n" + _infoCompany + "\n"
                  + " Found:\n" + _existingCompany);
        }
        final HashMap<String, TableInfo.Column> _columnsGeo = new HashMap<String, TableInfo.Column>(3);
        _columnsGeo.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsGeo.put("lat", new TableInfo.Column("lat", "TEXT", true, 0));
        _columnsGeo.put("lng", new TableInfo.Column("lng", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGeo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGeo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGeo = new TableInfo("geo", _columnsGeo, _foreignKeysGeo, _indicesGeo);
        final TableInfo _existingGeo = TableInfo.read(_db, "geo");
        if (! _infoGeo.equals(_existingGeo)) {
          throw new IllegalStateException("Migration didn't properly handle geo(com.ctrack.demo.tracking.common.data.entity.Geo).\n"
                  + " Expected:\n" + _infoGeo + "\n"
                  + " Found:\n" + _existingGeo);
        }
        final HashMap<String, TableInfo.Column> _columnsLogin = new HashMap<String, TableInfo.Column>(3);
        _columnsLogin.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsLogin.put("username", new TableInfo.Column("username", "TEXT", true, 0));
        _columnsLogin.put("password", new TableInfo.Column("password", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLogin = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLogin = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLogin = new TableInfo("login", _columnsLogin, _foreignKeysLogin, _indicesLogin);
        final TableInfo _existingLogin = TableInfo.read(_db, "login");
        if (! _infoLogin.equals(_existingLogin)) {
          throw new IllegalStateException("Migration didn't properly handle login(com.ctrack.demo.tracking.common.data.entity.Login).\n"
                  + " Expected:\n" + _infoLogin + "\n"
                  + " Found:\n" + _existingLogin);
        }
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(8);
        _columnsUser.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsUser.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsUser.put("username", new TableInfo.Column("username", "TEXT", true, 0));
        _columnsUser.put("email", new TableInfo.Column("email", "TEXT", true, 0));
        _columnsUser.put("address", new TableInfo.Column("address", "TEXT", true, 0));
        _columnsUser.put("phone", new TableInfo.Column("phone", "TEXT", true, 0));
        _columnsUser.put("website", new TableInfo.Column("website", "TEXT", true, 0));
        _columnsUser.put("company", new TableInfo.Column("company", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("user", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "user");
        if (! _infoUser.equals(_existingUser)) {
          throw new IllegalStateException("Migration didn't properly handle user(com.ctrack.demo.tracking.common.data.entity.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
      }
    }, "4266303cfcf653c3fd2424ae1557e466");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "address","company","geo","login","user");
  }

  @Override
  public AddressDao AddressDao() {
    if (_addressDao != null) {
      return _addressDao;
    } else {
      synchronized(this) {
        if(_addressDao == null) {
          _addressDao = new AddressDao_Impl(this);
        }
        return _addressDao;
      }
    }
  }

  @Override
  public CompanyDao CompanyDao() {
    if (_companyDao != null) {
      return _companyDao;
    } else {
      synchronized(this) {
        if(_companyDao == null) {
          _companyDao = new CompanyDao_Impl(this);
        }
        return _companyDao;
      }
    }
  }

  @Override
  public GeoDao GeoDao() {
    if (_geoDao != null) {
      return _geoDao;
    } else {
      synchronized(this) {
        if(_geoDao == null) {
          _geoDao = new GeoDao_Impl(this);
        }
        return _geoDao;
      }
    }
  }

  @Override
  public LoginDao LoginDao() {
    if (_loginDao != null) {
      return _loginDao;
    } else {
      synchronized(this) {
        if(_loginDao == null) {
          _loginDao = new LoginDao_Impl(this);
        }
        return _loginDao;
      }
    }
  }

  @Override
  public UserDao UserDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }
}
