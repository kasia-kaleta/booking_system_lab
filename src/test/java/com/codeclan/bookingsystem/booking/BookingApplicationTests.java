package com.codeclan.bookingsystem.booking;

import com.codeclan.bookingsystem.booking.models.Booking;
import com.codeclan.bookingsystem.booking.models.Course;
import com.codeclan.bookingsystem.booking.repositories.BookingRepository.BookingRepository;
import com.codeclan.bookingsystem.booking.repositories.CourseRepository.CourseRepository;
import com.codeclan.bookingsystem.booking.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findAllCoursesWithGivenRating(){
		List<Course> found = courseRepository.findAllCoursesByRating(2);
		assertEquals("Intro to Java", found.get(0).getName());
	}

	@Test
	public void findAllBookingsByDate(){
		List<Booking> found = bookingRepository.findAllBookingsByDate("12/02/15");
		assertEquals("12/02/15", found.get(0).getDate());
	}






}
