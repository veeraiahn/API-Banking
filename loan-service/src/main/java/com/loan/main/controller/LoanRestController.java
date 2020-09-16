package com.loan.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loan.main.model.Loan;
import com.loan.main.model.LoanApplication;
import com.loan.main.service.LoanService;

@RestController
public class LoanRestController {

	private final LoanService loanService;

	@Autowired
	LoanRestController(LoanService loanService) {
		this.loanService = loanService;
	}

	@PostMapping("/applyForLoan")
	public ResponseEntity<String> applyForLoan(@RequestParam("userId") Integer userId, @RequestParam("amount") Long amount,
			@RequestParam("term") Integer term, HttpServletRequest request) {

		LoanApplication application = new LoanApplication();
		application.setUserId(userId);
		application.setAmount(amount);
		application.setTerm(term);
		loanService.applyForLoan(application);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@GetMapping("/loans/{userId}")
	public List<Loan> getLoanHistory(@PathVariable("userId") Long userId) {
		return loanService.getLoanHistory(userId);
	}

}
