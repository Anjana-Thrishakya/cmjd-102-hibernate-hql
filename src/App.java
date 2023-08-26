import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

import entity.CustomerEntity;
import repository.CustomerRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepository customerRepository = new CustomerRepository();
        
        /////////////////////////////////////////////////////////////////////////////////
      
        // List<CustomerEntity> custEntities = customerRepository.getAllCustomers();
        // custEntities.forEach(System.out::println);

        //////////////////////////////////////////////////////////////////////////////////////////

        List<Object[]> data = customerRepository.getAllCustomerNativeQuery();
        for (Object[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }
}
