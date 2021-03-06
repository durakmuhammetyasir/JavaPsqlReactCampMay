import java.util.Date;

import com.Abstracts.BaseCustomerManager;
import com.Adapters.MernisServiceAdapter;
import com.Concrete.CustomerCheckManager;
import com.Concrete.NeroCustomerManager;
import com.Concrete.StarbucksCustomerManager;
import com.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"KENAN","YAZ","25646652106",new Date(2002,5,19));
		Customer customer2 = new Customer(2,"METE","KAYA","1234567890", new Date(1995,5,19));
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(customer1);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer1);
		starbucksCustomerManager.save(customer2);

	}

}