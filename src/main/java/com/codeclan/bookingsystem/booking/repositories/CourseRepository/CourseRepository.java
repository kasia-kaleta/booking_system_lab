package com.codeclan.bookingsystem.booking.repositories.CourseRepository;

import com.codeclan.bookingsystem.booking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findAllCoursesByRating(int rating);
}
