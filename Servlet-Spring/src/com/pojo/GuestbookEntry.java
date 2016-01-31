package com.pojo;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class GuestbookEntry {
	private int gid;
	   @Size(min = 2, max = 6, message = "Your name must between 2 and 6 characters")
	private String gname;
	 @NotEmpty
	 @Email
	private String gemail;
	  @NotEmpty(message = "Please enter your gcomment addresss.")
	private String gcomment;
	private Date date;
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGemail() {
		return gemail;
	}
	public void setGemail(String gemail) {
		this.gemail = gemail;
	}
	public String getGcomment() {
		return gcomment;
	}
	public void setGcomment(String gcomment) {
		this.gcomment = gcomment;
	}
	
	
	
}
