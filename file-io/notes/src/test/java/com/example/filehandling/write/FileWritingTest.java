package com.example.filehandling.write;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FileWritingTest {


  private FileWriting fileWriting;

  @BeforeEach
  void setUp() {
    fileWriting = new FileWriting();
  }

  @AfterEach
  void tearDown() {
    fileWriting = null;
  }

  @Test
  @DisplayName("should write to file")
  void writeFileNameSuccess() {
      /* GIVEN - file name */
      String filename = "sample.txt";

      /* WHEN - write */
//      fileWriting.write(content);

      /* THEN - update contents */
//      Assertions.assertThat();

  }

  @Test
  @DisplayName("throw if file doesn't exist")
  void writeBadFileNameThrowsFileWritingException() {
      /* GIVEN - bad file name */
      String dne = "dne.txt";

      /* WHEN - write */


      /* THEN - throws FileWritingException */
      Assertions.assertThrows(FileWritingException.class, );

  }
}
