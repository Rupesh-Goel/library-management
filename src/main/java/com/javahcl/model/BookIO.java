package com.javahcl.model;

import java.sql.Timestamp;

public class BookIO {

	private String uuid;
	private String title;
	private String author;
	private String category;
	private int pageNumber;
	private String status;
	private Timestamp returnDueDate;
	private int numberOfData;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getReturnDueDate() {
		return returnDueDate;
	}

	public void setReturnDueDate(Timestamp returnDueDate) {
		this.returnDueDate = returnDueDate;
	}

	public int getNumberOfData() {
		return numberOfData;
	}

	public void setNumberOfData(int numberOfData) {
		this.numberOfData = numberOfData;
	}

}
