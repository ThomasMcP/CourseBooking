package com.codeclan.CourseBookings.CourseBookings.components;

import com.codeclan.CourseBookings.CourseBookings.models.Booking;
import com.codeclan.CourseBookings.CourseBookings.models.Course;
import com.codeclan.CourseBookings.CourseBookings.models.Customer;
import com.codeclan.CourseBookings.CourseBookings.repositories.BookingRepository.BookingRepository;
import com.codeclan.CourseBookings.CourseBookings.repositories.CourseRepository.CourseRepository;
import com.codeclan.CourseBookings.CourseBookings.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Customer customer = new Customer("Jake", "Edinburgh", 26);
        customerRepository.save(customer);
        Customer customer2 = new Customer("Thomas", "Edinburgh", 27);
        customerRepository.save(customer2);
        Course course = new Course("CodeClan", "Edinburgh", 5);
        courseRepository.save(course);
        Booking booking = new Booking("10-10-19", course, customer);
        bookingRepository.save(booking);
        Booking booking2 = new Booking("10-10-20", course, customer2);
        bookingRepository.save(booking2);
        Course course2 = new Course("CodeClan 2.0", "Edinburgh", 6);
        courseRepository.save(course2);
        Booking booking3 = new Booking("10-11-19", course2, customer2);
        bookingRepository.save(booking3);

    }
}
