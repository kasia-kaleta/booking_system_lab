package com.codeclan.bookingsystem.booking.repositories.CustomerRepository;

import com.codeclan.bookingsystem.booking.models.Course;
import com.codeclan.bookingsystem.booking.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;


    @Transactional

    public List<Customer> findCustomerByCourseId(Long courseId){
        List<Customer> results = null;

        try{
            Session session = entityManager.unwrap(Session.class);
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "book");
            cr.createAlias("book.course", "cor");
            cr.add(Restrictions.eq("cor.id", courseId));
            results = cr.list();
        }
        catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }
}
