package com.example.challenge.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class PropertiesFile {

  public static Properties read() {
    return read("application.properties");
  }

  public static Properties read(String fileName) {
    assert fileName.startsWith("application");
    assert fileName.endsWith(".properties");

    Properties properties = new Properties();
    try (InputStream in = PropertiesFile.class.getClassLoader().getResourceAsStream(fileName)) {
      properties.load(Objects.requireNonNull(in, fileName + " not found"));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return properties;
  }
}
