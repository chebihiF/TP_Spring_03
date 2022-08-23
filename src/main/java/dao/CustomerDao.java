package dao;

import entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.List;

public class CustomerDao implements ICustomerDao{
    private SessionFactory factory = HibernateUtil.getFactory();
    private Session session = null ;

    public Customer addCustomer(Customer customer) throws Exception {
        try {
            session = factory.openSession();
            session.beginTransaction();
            Long id = (Long) session.save(customer);
            customer.setId(id);
            session.getTransaction().commit();
            return customer;
        } catch (Exception ex){
            session.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        }finally{
            session.close();
        }
    }

    public Customer updateCustomer(Customer customer) throws Exception {
        try {
            session = factory.openSession();
            session.beginTransaction();
            session.update(customer);
            session.getTransaction().commit();
            return customer;
        } catch (Exception ex){
            session.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        }finally{
            session.close();
        }
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
