package com.example;

import com.example.connection.DatabaseConnection;
import com.example.dao.UserDao;
import com.example.model.User;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Connection connection = DatabaseConnection.getInstance().getConnection();

    UserDao userDao = new UserDao();

//    userDao.createUser(email, "devin@catuns.xyz", "Devin Catuns");
//    userDao.createUser(email, "tim@catuns.xyz", "Tim Cook");
//    userDao.createUser(email, "elsha@catuns.xyz", "Elsha Negash");

//    User firstUser = userDao.findById(1);
//    System.out.println("firstUser = " + firstUser);

    System.out.println("Register User");
    System.out.println("What is your name?");
    String name = scanner.nextLine();

    System.out.println("What is your email?");
    String email = scanner.nextLine();

    System.out.println("What is your password?");
    String password = scanner.nextLine();

    userDao.createUser(email, name, password);

    List<User> allUsers = userDao.getAllUsers();

    System.out.println("allUsers = " + allUsers);
  }
}
