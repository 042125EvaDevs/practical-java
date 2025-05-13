package com.example.model;

import java.util.Objects;

public class User {

  private final Integer id;
  private final String name;
  private final String email;
  private final String password;

  public User(Integer id, String name, String email, String password) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public boolean validatePassword(String password) {
    return Objects.hash(this.password) == Objects.hash(password);
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public Integer getId() {
    return id;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", email='" + email + '\'' +
      '}';
  }
}
