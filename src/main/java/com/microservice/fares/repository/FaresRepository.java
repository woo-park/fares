package com.microservice.fares.repository;

import com.microservice.fares.domain.Fare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaresRepository extends JpaRepository<Fare,Long> {
	Fare getFareByFlightNumberAndFlightDate(String flightNumber, String flightDate);
}
