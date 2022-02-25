package com.zensar.olx.bean;

import java.util.Objects;

public class NewAdvertisementPostRequest {

	int id;
	String title;
	int CategoryId;
	String description;
	double price;
	private int statusId;
	public NewAdvertisementPostRequest(int id, String title, int categoryId, String description, double price) {
		super();
		this.id = id;
		this.title = title;
		CategoryId = categoryId;
		this.description = description;
		this.price = price;
	}
	public NewAdvertisementPostRequest(String title, int categoryId, String description, double price) {
		super();
		this.title = title;
		CategoryId = categoryId;
		this.description = description;
		this.price = price;
	}
	public NewAdvertisementPostRequest(int id) {
		super();
		this.id = id;
	}
	public NewAdvertisementPostRequest() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	@Override
	public String toString() {
		return "NewAdvertisementPostRequest [id=" + id + ", title=" + title + ", CategoryId=" + CategoryId
				+ ", description=" + description + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewAdvertisementPostRequest other = (NewAdvertisementPostRequest) obj;
		return id == other.id;
	}
	
	
	
}
	