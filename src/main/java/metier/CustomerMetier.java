package metier;

import dao.ICustomerDao;
import entities.Customer;

import java.util.List;

public class CustomerMetier implements ICustomerMetier{

    // IOC
    private ICustomerDao dao ;

    public Customer subscribeCustomer(Customer customer) throws Exception {
        if(!customer.getEmail().contains("gmail")) throw new Exception("email invalid");
        if(customer.getName().isEmpty()) throw new Exception("name must be set");
        return dao.addCustomer(customer);
    }

    public Customer updateCustomer(Customer customer) throws Exception {
        return null;
    }

    public Customer deleteCustomer(Long id) throws Exception {
        return null;
    }

    public Customer getCustomer(Long id) throws Exception {
        return null;
    }

    public List<Customer> getCustomers() throws Exception {
        return null;
    }
}
