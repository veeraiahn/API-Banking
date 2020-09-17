package com.loan.main;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.loan.main.LoanServiceApplication;


@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration
class LoanServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	  public void applicationStarts() {
		LoanServiceApplication.main(new String[] {});
	  }

}
