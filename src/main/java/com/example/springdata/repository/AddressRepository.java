package com.example.springdata.repository;

import com.example.springdata.entity.Address;
import com.example.springdata.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
}