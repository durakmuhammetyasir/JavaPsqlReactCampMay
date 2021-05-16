package com.Concrete;

import com.Abstracts.BaseCustomerManager;
import com.Abstracts.ICustomerCheckService;
import com.Entities.Customer;
//implements ICustomerCheckService

public class StarbucksCustomerManager extends BaseCustomerManager 
{
	
	private ICustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		// TODO Auto-generated constructor stub
		this._customerCheckService = customerCheckService;
		
	}
	public void save(Customer customer) {
		
		if(_customerCheckService.CheckIfRealPerson(customer))
		{
			System.out.println("Starbucks Customer Manager : validation successfull");
			super.save(customer);	
		}else {
			System.out.println("Not a valid person");
		}
		
		
	}
	
	
}