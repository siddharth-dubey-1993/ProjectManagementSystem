package com.cybage.projectManagementSystem.pojos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the login database table.
 * 
 */
@Entity
@NamedQuery(name="Login.findAll", query="SELECT l FROM Login l")
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;
	private int username;
	private String password;
	private int role;

	public Login() {
	}


	@Id
	public int getUsername() {
		return this.username;
	}

	public void setUsername(int username) {
		this.username = username;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getRole() {
		return this.role;
	}

	public void setRole(int role) {
		this.role = role;
	}

}