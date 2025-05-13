package com.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

  private static DatabaseConnection INSTANCE;

  private static final String URL = "jdbc:mysql://localhost:3307/practical_java";
  private static final String USERNAME = "default";
  private static final String PASSWORD = "password";


  private Connection connection;


  private DatabaseConnection() {

    try {
      this.connection = DriverManager.getConnection(
        URL,
        USERNAME,
        PASSWORD
      );
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public static DatabaseConnection getInstance() {
    if (INSTANCE == null) {
//      Class.forName("com.mysql.cj.jdbc.Driver");
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
