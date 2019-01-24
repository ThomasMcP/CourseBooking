package com.codeclan.CourseBookings.CourseBookings.repositories.CustomerRepository;

import com.codeclan.CourseBookings.CourseBookings.models.Course;
import com.codeclan.CourseBookings.CourseBookings.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getAllCustomersByCourse(Long course_id);
}
