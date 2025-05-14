package com.example.challenge.connection;

import com.example.challenge.utils.PropertiesFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;

public class DatabaseConnection {

  private static DatabaseConnection INSTANCE;

  private final Connection connection;

  private DatabaseConnection() {
    try {
      Properties properties = PropertiesFile.read();

      String driver = Objects.requireNonNull(properties.getProperty("db.driver"), "'db.driver' missing in properties");
      Class.forName(driver);
      this.connection = DriverManager.getConnection(
              properties.getProperty("db.url"),
              properties.getProperty("db.user"),
              properties.getProperty("db.password")
      );
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
        throw new RuntimeException("incorrect driver", e);
    }
  }

  public static DatabaseConnection getInstance() {
    if (INSTANCE == null) {
      synchronized (DatabaseConnection.class) {
        INSTANCE = new DatabaseConnection();
      }
    }

    return INSTANCE;
  }

  public Connection getConnection() {
    return connection;
  }
}
