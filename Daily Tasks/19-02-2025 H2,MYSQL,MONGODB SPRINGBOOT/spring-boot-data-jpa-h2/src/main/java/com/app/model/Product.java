package com.app.model;
//the below mentioned classes are represented as annotations.
//Entity is used to consider as a table

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Product {
  @Id
  @GeneratedValue
  private Integer prodId;
  private String prodName;
  private double prodCost;
  private String prodColor;
  
  //constructor
  public Product() {
	  super();
  }
  //Id based constructor
  public Product(Integer prodId) {
	  super();
	  this.prodId=prodId;
  }
  //parameterized constructor without id
  public Product(String prodName,double prodCost,String prodColor) {
	  super();
	  this.prodName=prodName;
	  this.prodCost=prodCost;
	  this.prodColor=prodColor;
  }
  public Product(Integer prodId,String prodName,double prodCost,String prodColor) {
	  super();
	  this.prodId=prodId;
	  this.prodName=prodName;
	  this.prodCost=prodCost;
	  this.prodColor=prodColor;
  }
  //setter and getter methods
  public Integer getProdId() {
	  return prodId;
  }
  public void setProdId(Integer prodId) {
	  this.prodId=prodId;
  }
  public String getProdName() {
	  return prodName;
  }
  public void setProdName(String prodName) {
	  this.prodName=prodName;
  }
  public double getProdCost() {
	  return prodCost;
  }
  public void setProdCost(double prodCost) {
	  this.prodCost=prodCost;
  }
  public String getProdColor() {
	  return prodColor;
  }
  public void setProdColor(String prodColor) {
	  this.prodColor=prodColor;
  }
  @Override
  public String toString() {
	  return "Product[prodId=" + prodId + ",prodName=" + prodName + ",prodCost=" +prodCost + ",prodColor=" + prodColor + "]";
  }
}