package com.example.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Dto.AdminDTO;
import com.example.Dto.LoginDTO;
import com.example.Entity.Admin;
import com.example.Entity.User;
import com.example.response.LoginResponse;

@Service
public interface AdminService {
	Admin findAdminByUsername(String email);
	void deleteUser(int userId);
	List<User> getAllUsers();
	void registerAdmin(AdminDTO adminDTO);
	 boolean authenticateAdmin(Admin admin, String password);
	 LoginResponse loginAdmin(LoginDTO loginDTO);
}
