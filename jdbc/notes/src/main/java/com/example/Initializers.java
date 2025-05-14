package com.example;

public class Initializers {

  static {
    System.out.println("This is a static initializer block (class is loading)");
  }

  {
    System.out.println("This is a block (instances)");
  }

  public Initializers() {
    System.out.println("This is the constructor");

  }

  public static void main(String[] args) {
    var i = new Initializers();
    var ii = new Initializers();
  }
}
