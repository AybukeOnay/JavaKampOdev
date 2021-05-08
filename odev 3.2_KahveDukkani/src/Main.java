import entities.concretes.*;
import entities.Customer;
import entities.abstracts.*;
import java.util.GregorianCalendar;

import adapters.*;
public class Main {

	public static void main(String[] args) {
		BaseCustomer customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//Date bDate = new Date(1997,10,11);
		customerManager.save(new Customer(1, "Aybüke", "Onay", new GregorianCalendar(1997,10,11).getTime(),"11401144286"));
		
		
	}

}
