package com.kelaskoding.demospringboot.entity;

public class Product {
  private Long id;
  private String code;
  private String name;
  private double price;

  public Product() {

  }

  // Constructor
  public Product(Long id, String code, String name, double price) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.price = price;
  }

  // Getter & Setter
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return this.price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

}
