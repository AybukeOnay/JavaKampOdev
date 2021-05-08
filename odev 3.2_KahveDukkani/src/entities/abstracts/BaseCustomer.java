package entities.abstracts;

import entities.Customer;

public abstract class BaseCustomer implements CustomerService {
	
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db " + customer.getFirstName());
		
	}
	
}
