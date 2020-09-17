package com.loan.main.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loan.main.model.Loan;
import com.loan.main.service.LoanService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/loans")
public class LoanRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoanRestController.class);

	private final LoanService loanService;

	@Autowired
	LoanRestController(LoanService loanService) {
		this.loanService = loanService;
	}

	@PostMapping("/applyForLoan")
	public ResponseEntity<String> applyForLoan(@RequestParam("userId") Long userId, 
			                                   @RequestParam("amount") Long amount,
			                                   @RequestParam("term") Integer term,
			                                   @RequestParam("type") String type) {
	logger.info("LoanRestController applyForLoan functionality ");
		
		Loan loan = new Loan();
		loan.setUser_id(userId);
		loan.setRequestedAmt(amount);
		loan.setTerm(term);
		loan.setType(type);
		loan.setRequestedDate(new Date());
		Loan id = loanService.applyForLoan(loan);
		return new ResponseEntity<>("Your applicaion has been successfully submitted with this reference "+id.getLoan_id(), HttpStatus.OK);
	}

	@GetMapping("/loanHistory/{userId}")
	public List<Loan> getLoanHistory(@PathVariable("userId") Long userId) {
		logger.info("LoanRestController getLoanHistory functionality ");
		return loanService.getLoanHistory(userId);
	}
	
	@DeleteMapping("/deleteLoan/{loanId}")
	public  ResponseEntity<String> deleteLoan(@PathVariable("loanId") Long loanId){
		logger.info("LoanRestController deleteLoan functionality ");
		loanService.deleteLoan(loanId);
		return new ResponseEntity<>("Loan Id "+loanId+" has been removed from you account", HttpStatus.OK);
		
	}
		
}
