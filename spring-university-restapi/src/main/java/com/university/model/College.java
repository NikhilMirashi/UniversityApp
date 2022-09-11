package com.university.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class College {

	@Id
	@GeneratedValue(generator = "college_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "college_gen", initialValue = 1, allocationSize = 1)
	private Integer collegeId;
	private String collegeName;

	@OneToMany
	Set<Department> department;

	@OneToOne
	Address address;

	public College() {
		super();
	}

	public College(String collegeName, Address address) {
		super();
		
		this.collegeName = collegeName;
		this.address = address;
	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Set<Department> getDepartment() {
		return department;
	}

	public void setDepartment(Set<Department> department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address + "]";
	}

}
