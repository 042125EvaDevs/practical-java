package com.example.notes.exceptions;

public class BadCredentialsException extends Exception {

  public BadCredentialsException() {
    super("Bad username and/or password combination");
  }
}
