package com.example;

import com.example.connection.DatabaseConnection;
import com.example.dao.UserDao;
import com.example.model.User;

import java.sql.Connection;

public class Main {
  public static void main(String[] args) {
    Connection connection = DatabaseConnection.getInstance().getConnection();

    UserDao userDao = new UserDao();

    userDao.createUser("devin@catuns.xyz", "Devin Catuns");
    userDao.createUser("tim@catuns.xyz", "Tim Cook");
    userDao.createUser("elsha@catuns.xyz", "Elsha Negash");


    User firstUser = userDao.findById(1);
    System.out.println("firstUser = " + firstUser);
  }
}
