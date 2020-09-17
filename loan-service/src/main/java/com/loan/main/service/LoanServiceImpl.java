package com.loan.main.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loan.main.constants.Constants;
import com.loan.main.model.Loan;
import com.loan.main.repository.LoanRepository;

@Service
@Transactional
public class LoanServiceImpl implements LoanService{
	
	private static final Logger logger = LoggerFactory.getLogger(LoanServiceImpl.class);

	@Autowired
	private LoanRepository loanRepository;

	@Override
	public Loan applyForLoan(Loan loan) {
		logger.info("LoanServiceImpl applyForLoan functionality ");
		loan.setStatus(Constants.ACTIVE);
		return loanRepository.save(loan);	
	}

	@Override
	public List<Loan> getLoanHistory(Long userId) {
		logger.info("LoanServiceImpl getLoanHistory functionality ");
        return loanRepository.findByUserId(userId);
    }

	@Override
	public void deleteLoan(Long loanId) {
		logger.info("LoanServiceImpl deleteLoan functionality ");
		loanRepository.deleteById(loanId);
	}
}
