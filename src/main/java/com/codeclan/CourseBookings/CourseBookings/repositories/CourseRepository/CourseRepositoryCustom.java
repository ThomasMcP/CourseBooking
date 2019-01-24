package com.codeclan.CourseBookings.CourseBookings.repositories.CourseRepository;

import com.codeclan.CourseBookings.CourseBookings.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> getAllCoursesByCustomer(Long customer_id);
}
