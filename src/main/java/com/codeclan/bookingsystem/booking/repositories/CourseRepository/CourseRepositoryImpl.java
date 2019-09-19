package com.codeclan.bookingsystem.booking.repositories.CourseRepository;

import com.codeclan.bookingsystem.booking.models.Course;
import com.codeclan.bookingsystem.booking.repositories.CustomerRepository.CustomerRepository;
import com.codeclan.bookingsystem.booking.repositories.CustomerRepository.CustomerRepositoryCustom;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;





//    @Transactional
//
//    public List<Course> findAllCoursesWithGivenRating(int rating){
//        List<Course> results = null;
//
//        try{
//            Session session = entityManager.unwrap(Session.class);
//            Criteria cr = session.createCriteria(Course.class);
//            cr.createAlias()
//        }
//    }
}
