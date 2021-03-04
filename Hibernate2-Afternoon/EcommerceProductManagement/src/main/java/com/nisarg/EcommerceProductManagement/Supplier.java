package com.nisarg.EcommerceProductManagement;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String supplierName;

	@ManyToMany(targetEntity = Categories.class, cascade = CascadeType.ALL)
	@JoinTable(name = "category_supplier", joinColumns = { @JoinColumn(name = "category_id") }, inverseJoinColumns = {@JoinColumn(name = "supplier_id") })
	private List<Categories> categories;

	public List<Categories> getCategories() {
		return categories;
	}

	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

}
