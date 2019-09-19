package com.codeclan.bookingsystem.booking.repositories.CustomerRepository;

import com.codeclan.bookingsystem.booking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom{
}
