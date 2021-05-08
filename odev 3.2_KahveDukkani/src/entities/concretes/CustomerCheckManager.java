package entities.concretes;

import entities.Customer;
import entities.abstracts.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		
		return true ;
	}

}
