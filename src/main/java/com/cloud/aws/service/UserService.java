package com.cloud.aws.service;

import com.cloud.aws.model.UserModel;

public interface UserService {
    UserModel saveUser(UserModel user);

	UserModel getUserById(Long id);
	
	UserModel findByEmail(String email);

	UserModel updateUser(Long id, UserModel userDetails);

	boolean verifyPassword(String rawPassword, String encodedPassword);
}
