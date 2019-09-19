package com.codeclan.bookingsystem.booking.repositories.BookingRepository;

import com.codeclan.bookingsystem.booking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> findAllBookingsByDate(String date);
}
