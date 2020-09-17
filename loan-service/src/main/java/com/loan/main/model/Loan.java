package com.loan.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Loan {

	public Long getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(Long loan_id) {
		this.loan_id = loan_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Integer getTerm() {
		return term;
	}
	public void setTerm(Integer term) {
		this.term = term;
	}
	public Long getRequestedAmt() {
		return requestedAmt;
	}
	public void setRequestedAmt(Long requestedAmt) {
		this.requestedAmt = requestedAmt;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long loan_id;
	@Column
	private Long user_id;
	@Column
	private Integer term;
	@Column
	private Long requestedAmt;
	@Column
	private String type;
	@Column
	private String status;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date requestedDate;
	
	
}