package com.loan.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loan.main.model.Loan;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Long> {
    //List<Loan> findById(Long userid);
    
    @Query(value = "select * from Loan where user_id=:user_id",  nativeQuery=true)
    List<Loan> findByUserId(@Param("user_id") Long userid);

    //Loan findByIdAndUserId(Long id, String userId);
}
