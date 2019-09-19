package com.codeclan.bookingsystem.booking.repositories.CustomerRepository;

import com.codeclan.bookingsystem.booking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomerByCourseId(Long CourseId);
}
