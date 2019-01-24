package com.codeclan.CourseBookings.CourseBookings.repositories.CustomerRepository;

import com.codeclan.CourseBookings.CourseBookings.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
