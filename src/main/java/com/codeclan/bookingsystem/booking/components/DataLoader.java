package com.codeclan.bookingsystem.booking.components;

import com.codeclan.bookingsystem.booking.models.Booking;
import com.codeclan.bookingsystem.booking.models.Course;
import com.codeclan.bookingsystem.booking.models.Customer;
import com.codeclan.bookingsystem.booking.repositories.BookingRepository.BookingRepository;
import com.codeclan.bookingsystem.booking.repositories.CourseRepository.CourseRepository;
import com.codeclan.bookingsystem.booking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Jarrod", "Edinburgh", 48);
        customerRepository.save(customer1);

        Course course1 = new Course("Intro to Java", "Glasgow", 2);
        courseRepository.save(course1);

        Booking booking1 = new Booking("12/02/15", course1, customer1);
        bookingRepository.save(booking1);





    }
}
