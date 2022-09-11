package com.university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.university.model.Address;
import com.university.model.College;
import com.university.service.IAddressService;
import com.university.service.ICollegeService;

@SpringBootApplication
public class SpringUniversityRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringUniversityRestapiApplication.class, args);
	}

	ICollegeService collegeService;

	@Autowired
	public void setCollegeService(ICollegeService collegeService) {
		this.collegeService = collegeService;
	}

	
	IAddressService addressService;
	@Autowired
	public void setAddressService(IAddressService addressService) {
		this.addressService = addressService;
	}

	@Override
	public void run(String... args) throws Exception {

		Address address = new Address("SHIMOGA", "KARNATAKA", 581398);
		addressService.add(address);
		
		College college = new College("PESITM", address);
		collegeService.add(college);
	}

}
