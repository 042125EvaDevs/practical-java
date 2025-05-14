package com.example.challenge.dao;

import com.example.challenge.connection.DatabaseConnection;
import com.example.challenge.model.User;
import com.example.challenge.model.UserBuilder;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

  private final Connection connection;

  public UserDao() {
    this.connection = DatabaseConnection.getInstance().getConnection();
  }

  public void createUser (String email, String name, String password) {
    String sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, name);
      statement.setString(2, email);
      statement.setString(3, password);
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public User findById (Integer id) {

    String sql = "SELECT * FROM users WHERE id=(?);";

    try (PreparedStatement statement = connection.prepareStatement(sql)) {

      statement.setInt(1, id);
      ResultSet resultSet = statement.executeQuery();

      if (resultSet.next()) {
        int userId = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String email = resultSet.getString("email");

        return new User(userId, name, email, null);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return null;
  }

  public List<User> getAllUsers() {
    String sql = "SELECT * FROM users;";
    try {
      Statement stmt = connection.createStatement();
      ResultSet resultSet = stmt.executeQuery(sql);
      List<User> users = new ArrayList<>();

      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String email = resultSet.getString("email");

        users.add(new UserBuilder()
          .name(name)
          .email(email)
          .id(id)
          .build()
        );
      }

      return users;

    } catch (SQLException e){
      e.printStackTrace();
    }
    return  List.of();
  }
}
