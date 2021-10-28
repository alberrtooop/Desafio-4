package com.everis.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.spring.repository.EverisCustomer;
import com.everis.spring.services.EverisCustomerManagementServiceI;



@RestController
@RequestMapping("/Customer")
public class EverisController {
	@Autowired
	private EverisCustomerManagementServiceI customerService;

	@PostMapping
	public List<EverisCustomer> showAllCustomer(Model model) {
		return customerService.searchAllCustomers();
	}
	
}
