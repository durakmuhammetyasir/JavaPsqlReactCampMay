package com.Concrete;

import com.Abstracts.ICustomerCheckService;
import com.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}