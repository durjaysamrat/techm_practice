package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private Integer prodId;
	private String vendorCode;
    private String prodName;
	private Double prodCost;
	  
	  //constructor
	  public Product() {
		  super();
	  }
	  //Id based constructor
	  public Product(Integer prodId) {
		  super();
		  this.prodId=prodId;
	  }
	  public Product(Integer prodId,String vendorCode,String prodName,double prodCost) {
		  super();
		  this.prodId=prodId;
		  this.vendorCode=vendorCode;
		  this.prodName=prodName;
		  this.prodCost=prodCost;
		}
	  //setter and getter methods
	  public Integer getProdId() {
		  return prodId;
	  }
	  public void setProdId(Integer prodId) {
		  this.prodId=prodId;
	  }
	  
	  public String getVendorCode() {
		  return vendorCode;
	  }
	  public void setVendorCode(String vendorCode) {
		  this.vendorCode=vendorCode;
	  }
	  
	  public String getProdName() {
		  return prodName;
	  }
	  public void setProdName(String prodName) {
		  this.prodName=prodName;
	  }
	  public Double getProdCost() {
		  return prodCost;
	  }
	  public void setProdCost(Double prodCost) {
		  this.prodCost=prodCost;
	  }
	  
	  @Override
	  public String toString() {
		  return "Product[prodId=" + prodId + ",prodName=" + prodName + ",prodCost=" +prodCost + ",vendorCode=" + vendorCode + "]";
	  }

}
