package metier;

import entities.Customer;

import java.util.List;

public interface ICustomerMetier {
    // 1
    Customer subscribeCustomer(Customer customer) throws Exception;
    Customer updateCustomer(Customer customer) throws Exception;
    Customer deleteCustomer(Long id) throws Exception;
    Customer getCustomer(Long id) throws Exception;
    List<Customer> getCustomers() throws Exception;
}
