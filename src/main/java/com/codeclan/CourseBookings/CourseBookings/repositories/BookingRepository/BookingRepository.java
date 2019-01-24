package com.codeclan.CourseBookings.CourseBookings.repositories.BookingRepository;

import com.codeclan.CourseBookings.CourseBookings.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findBookingsByDate(String date);
}
