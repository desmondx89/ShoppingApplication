package com.shopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProductDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pdid;

	@Column(length = 45, nullable = false)
	private String pdname;

	@Column(length = 45, nullable = false)
	private String value;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Products product;

	public Integer getId() {
		return pdid;
	}

	public void setId(Integer id) {
		this.pdid = id;
	}

	public String getName() {
		return pdname;
	}

	public void setName(String name) {
		this.pdname = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public ProductDetails(Integer id, String name, String value, Products product) {
		super();
		this.pdid = id;
		this.pdname = name;
		this.value = value;
		this.product = product;
	}

	public ProductDetails(String name, String value, Products product) {
		this.pdname = name;
		this.value = value;
		this.product = product;
	}

	public ProductDetails() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pdid == null) ? 0 : pdid.hashCode());
		result = prime * result + ((pdname == null) ? 0 : pdname.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDetails other = (ProductDetails) obj;
		if (pdid == null) {
			if (other.pdid != null)
				return false;
		} else if (!pdid.equals(other.pdid))
			return false;
		if (pdname == null) {
			if (other.pdname != null)
				return false;
		} else if (!pdname.equals(other.pdname))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return pdname + "=" + value;
	}

}
