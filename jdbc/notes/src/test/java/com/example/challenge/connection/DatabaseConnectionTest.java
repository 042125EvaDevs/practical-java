package com.example.challenge.connection;


import com.example.notes.connection.DatabaseConnection;
import org.junit.jupiter.api.*;

class DatabaseConnectionTest {

  @BeforeEach
  void setUp() {

  }

  @AfterEach
  void tearDown() {
  }

  @Test
  @DisplayName("should be singleton (one instance)")
  void getInstanceDatabaseConnectionOneInstance() {
      /* GIVEN - Database connection */


      /* WHEN - get instance */

    DatabaseConnection instance = DatabaseConnection.getInstance();

    DatabaseConnection instance2 = DatabaseConnection.getInstance();

    /* THEN - one instance */
    Assertions.assertEquals(instance, instance2);

  }
}
