package com.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.model.College;
import com.university.repository.ICollegeRepository;

@Service
public class CollegeServiceImpl implements ICollegeService {

	ICollegeRepository collegeRepository;

	@Autowired
	public void setCollegeRepository(ICollegeRepository collegeRepository) {
		this.collegeRepository = collegeRepository;
	}

	@Override
	public void add(College college) {
		collegeRepository.save(college);
	}
	
	
}
