package com.yc.bean;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;// Y
	private String name;// Y
	private String password;// Y
	private String telephone;
	private String username;// Y
	private String isadmin;// Y

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(String isadmin) {
		this.isadmin = isadmin;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", password=" + password + ", telephone=" + telephone
				+ ", username=" + username + ", isadmin=" + isadmin + "]";
	}

}
