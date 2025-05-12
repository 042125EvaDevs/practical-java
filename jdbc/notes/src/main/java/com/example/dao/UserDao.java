package com.example.dao;

import com.example.connection.DatabaseConnection;
import com.example.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {

  private final Connection connection;

  public UserDao() {
    this.connection = DatabaseConnection.getInstance().getConnection();
  }

  public void createUser (String email, String name) {
    String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, name);
      statement.setString(2, email);
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

        return new User(userId, name, email);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return null;
  }



}
