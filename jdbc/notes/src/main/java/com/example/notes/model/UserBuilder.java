package com.example.notes.model;

public class UserBuilder {

  private Integer id = 0;
  private String name = "";
  private String email = "";
  private String password = "";

  public UserBuilder() {}

  public UserBuilder name(String name) {
    this.name = name;
    return this;
  }

  public UserBuilder email(String email) {
    this.email = email;
    return this;
  }
  public UserBuilder password(String password) {
    this.password = password;
    return this;
  }
  public UserBuilder id(Integer id) {
    this.id = id;
    return this;
  }

  public User build() {
    return new User(
      this.id,
      this.name,
      this.email,
      this.password
    );
  }
}
