package com.java.OTServerSide.com.OT.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.OTServerSide.com.OT.security.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
