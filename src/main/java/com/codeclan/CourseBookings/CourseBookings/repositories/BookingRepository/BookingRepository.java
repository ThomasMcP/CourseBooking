package com.codeclan.CourseBookings.CourseBookings.repositories.BookingRepository;

import com.codeclan.CourseBookings.CourseBookings.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
