package dao;

import entities.Customer;

import java.util.List;

public interface ICustomerDao {
    // cahier de charge !!!!!!
    Customer addCustomer(Customer customer) throws Exception;
    Customer updateCustomer(Customer customer) throws Exception;
    Customer deleteCustomer(Long id) throws Exception;
    Customer getCustomer(Long id) throws Exception;
    List<Customer> getCustomers() throws Exception;
}
