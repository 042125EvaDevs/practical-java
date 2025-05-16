package com.example.notes.exceptions;

public class UserNotFoundException extends Exception {

  public UserNotFoundException() {
    super("User not found!");
  }

  public UserNotFoundException(Integer targetUserId) {
    super("User not found with id: " + targetUserId);
  }
}
