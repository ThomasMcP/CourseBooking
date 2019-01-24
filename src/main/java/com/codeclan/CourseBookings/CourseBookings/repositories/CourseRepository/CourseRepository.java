package com.codeclan.CourseBookings.CourseBookings.repositories.CourseRepository;

import com.codeclan.CourseBookings.CourseBookings.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
