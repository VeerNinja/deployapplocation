package com.cloud.aws.dto;

import com.cloud.aws.model.FiledtlsModel;
import com.cloud.aws.model.UserModel;

public class UserDetailsdto {
	private UserModel users;
	private FiledtlsModel fdtls;
	
	public UserModel getUsers() {
		return users;
	}
	public void setUsers(UserModel users) {
		this.users = users;
	}
	public FiledtlsModel getFdtls() {
		return fdtls;
	}
	public void setFdtls(FiledtlsModel fdtls) {
		this.fdtls = fdtls;
	}
	
	

}
