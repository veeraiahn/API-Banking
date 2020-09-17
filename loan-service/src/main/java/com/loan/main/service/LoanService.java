package com.loan.main.service;

import java.util.List;

import com.loan.main.model.Loan;

public interface LoanService {

	Loan applyForLoan(Loan loan);

	//Loan extendLoan(Long loanId, String userId);

	List<Loan> getLoanHistory(Long userId);
	void deleteLoan(Long loanId);
}
