package com.cloud.aws.repository;

import com.cloud.aws.model.UserModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

public class UserRepositoryImpl {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public UserModel findByEmail(String email) {
		TypedQuery<UserModel> query = entityManager.createQuery("SELECT u FROM UserModel u WHERE u.email = :email", UserModel.class);
        query.setParameter("email", email);
        return query.getSingleResult(); // or handle exceptions as needed
    }
	

}
