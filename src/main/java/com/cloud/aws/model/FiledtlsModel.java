package com.cloud.aws.model;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class FiledtlsModel {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userId;

	    private String fileName;
	    private String path;
	    private Date createdDt;
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public Date getCreatedDt() {
			return createdDt;
		}
		public void setCreatedDt(Date createdDt) {
			this.createdDt = createdDt;
		}
		@Override
		public String toString() {
			return "FiledtlsModel [userId=" + userId + ", fileName=" + fileName + ", path=" + path + ", createdDt="
					+ createdDt + "]";
		}
	    
	    
	

}
