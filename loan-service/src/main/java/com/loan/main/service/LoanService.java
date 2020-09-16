package com.loan.main.service;

import java.util.List;

import com.loan.main.model.Loan;
import com.loan.main.model.LoanApplication;

public interface LoanService {

	Loan applyForLoan(LoanApplication application);

	//Loan extendLoan(Long loanId, String userId);

	List<Loan> getLoanHistory(Long userId);
}
