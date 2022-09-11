package com.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.model.Address;
import com.university.repository.IAddressRepository;

@Service
public class AddressServiceImpl implements IAddressService {

	IAddressRepository addressRepository;
	
	@Autowired
	public void setAddressRepository(IAddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}


	@Override
	public void add(Address address) {
		addressRepository.save(address);
	}

}
