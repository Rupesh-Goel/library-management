package com.javahcl.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "borrowhistory")
public class BorrowHistory {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "memberid")
	private String memberId;

	@Column(name = "uuid")
	private int uuId;

	@Column(name = "borroweddate")
	private Timestamp borrowedDate;

	@Column(name = "returndate")
	private Timestamp returnDate;

	@Column(name = "duedate")
	private Timestamp dueDate;

	@Column(name = "status")
	private String status;

	@Column(name = "charges")
	private double charges;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getUuId() {
		return uuId;
	}

	public void setUuId(int uuId) {
		this.uuId = uuId;
	}

	public Timestamp getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(Timestamp borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public Timestamp getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Timestamp returnDate) {
		this.returnDate = returnDate;
	}

	public Timestamp getDueDate() {
		return dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

}
