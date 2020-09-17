package com.loan.main.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(LoanRestController.class)
public class LoanRestControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private LoanRestController loanRestController;

	@Test
	public void applyForLoan() {

	}

}
