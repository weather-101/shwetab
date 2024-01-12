package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Admin;
import com.example.Entity.User;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

	 Optional<Admin> findByUsername(String username);
	 Admin findByEmail(String email);
	Optional<Admin> findOneByEmailAndPassword(String email, String encodedPassword);
}
