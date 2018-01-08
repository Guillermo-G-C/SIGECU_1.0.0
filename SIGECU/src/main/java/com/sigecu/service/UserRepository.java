package com.sigecu.service;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigecu.entity.Users;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<Users, Serializable> {

	//public abstract Users findByUsername(String username);
}
