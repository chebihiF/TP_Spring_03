package util;

import entities.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory factory = null ;

    static {
        factory = new Configuration()
                .configure()
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();
    }

    public static SessionFactory getFactory() {
        return factory;
    }
}
