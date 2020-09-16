package com.loan.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loan.main.model.Loan;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Integer> {
    List<Loan> findByUserId(Long userId);

    //Loan findByIdAndUserId(Long id, String userId);
}
