package com.codeclan.CourseBookings.CourseBookings.controllers;

import com.codeclan.CourseBookings.CourseBookings.models.Course;
import com.codeclan.CourseBookings.CourseBookings.repositories.BookingRepository.BookingRepository;
import com.codeclan.CourseBookings.CourseBookings.repositories.CourseRepository.CourseRepository;
import com.codeclan.CourseBookings.CourseBookings.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/rating/{starRating}")
    public List<Course> findCourseByStarRating(@PathVariable int starRating){
        return courseRepository.findCoursesByStarRating(starRating);
    }

    @GetMapping(value = "/customer/{customer_id}")
    public List<Course> getAllCourseByCustomers(@PathVariable Long customer_id){
        return courseRepository.getAllCoursesByCustomer(customer_id);
    }
}
