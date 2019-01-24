package com.codeclan.CourseBookings.CourseBookings.repositories.CustomerRepository;

import com.codeclan.CourseBookings.CourseBookings.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
//    List<Customer> getCustomersForCourse(Long course_id);
        List<Customer> getAllCustomersByCourse(Long course_id);


}
