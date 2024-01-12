package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.Entity.User;
import java.util.List;


@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	User findByEmail(String email);
	//changes
	User findByUsername(String username);

	Optional<User> findOneByEmailAndPassword(String username, String password);

}
