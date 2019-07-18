package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="producttab")
public class Product {

	@Id
	@Column(name="id")
	@GeneratedValue(generator="id")
	@GenericGenerator(name="id", strategy="com.app.gen.IdGenerator")
	private Integer prodId;
	@Column(name="name")
	private String prodName;
	@Column(name="code")
	private String prodCode;
	@Column(name="cost")
	private Double prodCost;
	@Column(name="type")
	private String prodType;
	@Column(name="data")
	private String prodDes;
	
	public Product() {
		super();
	}
	public Product(Integer prodId) {
		super();
		this.prodId = prodId;
	}
	public Product(Integer prodId, String prodName, String prodCode, Double prodCost, String prodType, String prodDes) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
		this.prodType = prodType;
		this.prodDes = prodDes;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public String getProdDes() {
		return prodDes;
	}
	public void setProdDes(String prodDes) {
		this.prodDes = prodDes;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCode=" + prodCode + ", prodCost="
				+ prodCost + ", prodType=" + prodType + ", prodDes=" + prodDes + "]";
	}
	
}
