package com.cloud.aws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cloud.aws.model.UserModel;
import com.cloud.aws.repository.UserRepository;
import com.cloud.aws.repository.UserRepositoryImpl;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserRepositoryImpl userRepositoryimpl;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	@Override
	public UserModel saveUser(UserModel user) {
		String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
		return userRepository.save(user);
	}

	public UserModel getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	public UserModel createUser(UserModel user) {
		return userRepository.save(user);
	}

	public UserModel updateUser(Long id, UserModel userDetails) {
		UserModel user = userRepository.findById(id).orElse(null);
		if (user != null) {
			user.setName(userDetails.getName());
			user.setEmail(userDetails.getEmail());
			user.setPassword(userDetails.getPassword());
			return userRepository.save(user);
		}
		return null;
	}
	
	@Override
    public boolean verifyPassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
	
	@Override
	public UserModel findByEmail(String email) {
		return userRepositoryimpl.findByEmail(email);
	
	}
}