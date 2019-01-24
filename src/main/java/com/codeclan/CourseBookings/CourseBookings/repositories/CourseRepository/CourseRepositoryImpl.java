package com.codeclan.CourseBookings.CourseBookings.repositories.CourseRepository;

import com.codeclan.CourseBookings.CourseBookings.models.Course;
import com.codeclan.CourseBookings.CourseBookings.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl {

    @Autowired
    EntityManager entityManager;


    @Transactional
    public List<Course> getAllCoursesByCustomer(Long customer_id){
        List<Course> results = null;
            Session session = entityManager.unwrap(Session.class);

        Criteria cr = session.createCriteria(Course.class);
        cr.createAlias("bookings", "booking");
        cr.add(Restrictions.eq("booking.customer.id", customer_id));
        results = cr.list();

        return results;
    }

}
