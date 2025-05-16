package com.example.challenge.dao;

import com.example.challenge.exceptions.NotFoundException;
import com.example.challenge.model.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ProductDaoTest {

  private ProductDao dao;

  @BeforeEach
  void setUp() {
    dao = new ProductDao();
  }

  @Test
  void shouldFindProductWithID() throws NotFoundException {

    Long targetId = 1L;
    Product product = dao.findById(targetId);

    assertThat(product).isNotNull();
    assertThat(product.getId()).isEqualTo(targetId);
  }

  @Test
  @DisplayName("should throw if ID is null")
  void findByIdNullIdThrowsException() {
      /* GIVEN - null id */
      /* WHEN - findById */
      /* THEN - throws exception */
      Assertions.assertThatExceptionOfType(NotFoundException.class)
        .isThrownBy(() -> dao.findById(null));
  }

  @Test
  @DisplayName("should remove product")
  void removeCalledProductIdRemovedTarget() {
      /* GIVEN - product id */
      Long targetId = 1L;
      int originalLength = dao.findAll().size();

      /* WHEN - remove called */
      dao.remove(targetId);
      int sizeAfterRemove = dao.findAll().size();

      /* THEN - removed target */
      assertThat(sizeAfterRemove).isLessThan(originalLength);

  }
}
