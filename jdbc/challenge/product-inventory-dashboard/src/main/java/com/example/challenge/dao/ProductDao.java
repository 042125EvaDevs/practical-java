package com.example.challenge.dao;

import com.example.challenge.connection.DatabaseConnection;
import com.example.challenge.exceptions.NotFoundException;
import com.example.challenge.model.Product;

import java.sql.Connection;
import java.util.List;

public class ProductDao {

  private final Connection db;

  public ProductDao() {
    this.db = DatabaseConnection.getInstance().getConnection();
  }


  public Product findById(Long id) throws NotFoundException {
    if (id == null) {
      throw new NotFoundException();
    }
    return new Product(1L);
  }

  public List<Product> findAll() {
    return List.of();
  }

  public Product save(Product product) {
    return null;
  }

  public void remove(Long targetId) {

  }
}
