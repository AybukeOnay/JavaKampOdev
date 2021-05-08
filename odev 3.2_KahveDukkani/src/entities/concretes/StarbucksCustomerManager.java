package entities.concretes;

import entities.Customer;
import entities.abstracts.BaseCustomer;
import entities.abstracts.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomer{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	 
	 @Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
}
