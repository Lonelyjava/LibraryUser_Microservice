package com.lib.user.demo.entity;

import java.time.LocalDateTime;

public class AuthorEntity {
	
	
	private int id;
	private String authorName;
	private String authorMobile;
	private String authormail;
	private LocalDateTime createdDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorMobile() {
		return authorMobile;
	}
	public void setAuthorMobile(String authorMobile) {
		this.authorMobile = authorMobile;
	}
	public String getAuthormail() {
		return authormail;
	}
	public void setAuthormail(String authormail) {
		this.authormail = authormail;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

}
