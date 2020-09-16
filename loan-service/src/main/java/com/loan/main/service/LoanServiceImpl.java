package com.loan.main.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loan.main.model.Loan;
import com.loan.main.model.LoanApplication;
import com.loan.main.repository.LoanRepository;

@Service
@Transactional
public class LoanServiceImpl implements LoanService{

	@Autowired
	private LoanRepository loanRepository;

	@Override
	public Loan applyForLoan(LoanApplication application) {

		Loan loan = new Loan();
		loan.setUserId(application.getUserId());
		//loan.setLoanId(UUID.randomUUID());
		loan.setTerm(application.getTerm());
		loan.setPrinciple(application.getAmount());
		loan.setRequestedDate(new Date());
		return loanRepository.save(loan);	
	}

	@Override
	public List<Loan> getLoanHistory(Long userId) {
        return loanRepository.findByUserId(userId);
    }

	

}
