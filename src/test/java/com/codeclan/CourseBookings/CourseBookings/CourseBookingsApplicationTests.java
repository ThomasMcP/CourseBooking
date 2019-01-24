package com.codeclan.CourseBookings.CourseBookings;

import com.codeclan.CourseBookings.CourseBookings.models.Booking;
import com.codeclan.CourseBookings.CourseBookings.models.Course;
import com.codeclan.CourseBookings.CourseBookings.models.Customer;
import com.codeclan.CourseBookings.CourseBookings.repositories.BookingRepository.BookingRepository;
import com.codeclan.CourseBookings.CourseBookings.repositories.CourseRepository.CourseRepository;
import com.codeclan.CourseBookings.CourseBookings.repositories.CustomerRepository.CustomerRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

//	@Ignore
//	@Test
//	public void canSaveCourse(){
//		Course course = new Course("CodeClan", "Edinburgh", 5);
//		courseRepository.save(course);
//		assertEquals(1, courseRepository.findAll().size());
//	}
//
//
//	@Test
//	public void canSaveCustomer(){
//		Customer customer = new Customer("Jake", "Edinburgh", 26);
//		customerRepository.save(customer);
//		assertEquals(1, customerRepository.findAll().size());
//	}

	@Test
	public void canSaveBooking(){
		Customer customer = new Customer("Jake", "Edinburgh", 26);
		customerRepository.save(customer);
		Course course = new Course("CodeClan", "Edinburgh", 5);
		courseRepository.save(course);
		Booking booking = new Booking("10-10-19", course, customer);
		bookingRepository.save(booking);
		assertEquals(1, bookingRepository.findAll().size());
		assertEquals(1, customerRepository.findAll().size());
		assertEquals(1, courseRepository.findAll().size());
	}



}

