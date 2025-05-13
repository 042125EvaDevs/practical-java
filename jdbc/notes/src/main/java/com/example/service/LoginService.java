package com.example.service;

import com.example.dao.UserDao;
import com.example.exceptions.BadCredentialsException;
import com.example.exceptions.UserNotFoundException;
import com.example.model.User;

import java.util.Objects;

public class LoginService {

  private final UserDao userDao;

  public LoginService() {
    this.userDao = new UserDao();
  }

  public User login(Integer id, String password) throws UserNotFoundException, BadCredentialsException {
    User user = userDao.findById(id);
    if (user == null) {
      throw new UserNotFoundException(id);
    }

    /* validate password */

    if (user.validatePassword(password)) {
      return user;
    }


    throw new BadCredentialsException();
  }

  public void register(String email, String name, String password) {
    String hashedPassword = String.valueOf(Objects.hash(password));
    userDao.createUser(email, name, hashedPassword);
  }
}
