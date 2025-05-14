package com.example.challenge.connection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DatabaseConnectionTest {

  @Test
  @DisplayName("should create connection")
  void getInstancePropertiesFileCreatesConnection() {
      /* GIVEN - properties file */
      /* WHEN - get instance */
      DatabaseConnection instance = DatabaseConnection.getInstance();

      /* THEN - creates connection */
      Assertions.assertThat(instance).isNotNull();
      Assertions.assertThat(instance.getConnection()).isNotNull();
  }
}
