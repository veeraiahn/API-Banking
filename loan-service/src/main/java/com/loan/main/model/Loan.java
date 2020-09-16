package com.loan.main.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private Integer userId;

	/*
	 * @Column private UUID loanId;
	 */

	@Column
	private Integer term;

	@Column
	private Long principle;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date requestedDate;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/*
	 * public UUID getLoanId() { return loanId; }
	 * 
	 * public void setLoanId(UUID loanId) { this.loanId = loanId; }
	 */
	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public Long getPrinciple() {
		return principle;
	}

	public void setPrinciple(Long principle) {
		this.principle = principle;
	}

	public Date getRequestedDate() {
		return requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}


}
