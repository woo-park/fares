package com.microservice.fares;

import com.microservice.fares.domain.Fare;
import com.microservice.fares.repository.FaresRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class FaresApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(FaresApplication.class);

	@Autowired
	FaresRepository faresRepository;

	public static void main(String[] args) {
		SpringApplication.run(FaresApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {
		Fare[] fares = {
				new Fare("BF100","22-JAN-18", "101"),
				new Fare("BF101","22-JAN-18", "101"),
				new Fare("BF102","22-JAN-18", "102"),
				new Fare("BF103","22-JAN-18", "103"),
				new Fare("BF104","22-JAN-18", "104"),
				new Fare("BF105","22-JAN-18", "105"),
				new Fare("BF106","22-JAN-18", "106")};
		List<Fare> list = Arrays.stream(fares).collect(Collectors.toList());
		list.forEach(fare -> faresRepository.save(fare));

		logger.info("Result: " + faresRepository.getFareByFlightNumberAndFlightDate("BF101","22-JAN-18"));

	}
}
