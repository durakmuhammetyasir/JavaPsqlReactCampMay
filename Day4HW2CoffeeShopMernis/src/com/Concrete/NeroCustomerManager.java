package com.Concrete;

import com.Abstracts.BaseCustomerManager;
import com.Abstracts.ICustomerCheckService;
import com.Entities.Customer;


public class NeroCustomerManager extends BaseCustomerManager {
	

	ICustomerCheckService _customerCheckService;
	
	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		
		this._customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Nero Customer Manager : validation successfull.");
			super.save(customer);
		}else {
			System.out.println("Nero Customer Manager : Error -- The person not a valid.");
		}
	
	}
}