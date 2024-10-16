package com.cloud.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.aws.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
