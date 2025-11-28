package com.ashokit.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="USER_TABLE")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USERID")
	private Integer userid;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="USEREMAIL")
	private String useremail;
	
	@Column(name="USERIMAGE")
	@Lob
	private byte[] userimage;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public byte[] getUserimage() {
		return userimage;
	}

	public void setUserimage(byte[] userimage) {
		this.userimage = userimage;
	}
	

}
