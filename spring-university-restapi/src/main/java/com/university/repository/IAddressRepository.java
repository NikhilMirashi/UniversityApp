package com.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.model.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer> {

}
