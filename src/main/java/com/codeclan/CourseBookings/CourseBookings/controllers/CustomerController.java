package com.codeclan.CourseBookings.CourseBookings.controllers;

import com.codeclan.CourseBookings.CourseBookings.models.Customer;
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
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

//    @GetMapping(value = "course/{course_id}")
//    public List<Customer> getCustomersForCourse(@PathVariable Long course_id){
//        return customerRepository.getCustomersForCourse(course_id);
//    }

    @GetMapping(value = "/course/{course_id}")
    public List<Customer> getAllCustomersByCourse(@PathVariable Long course_id){
        return customerRepository.getAllCustomersByCourse(course_id);
    }
}
