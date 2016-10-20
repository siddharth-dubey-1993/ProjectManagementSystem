package com.cybage.projectManagementSystem.pojos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the master_gender database table.
 * 
 */
@Entity
@Table(name="master_gender")
@NamedQuery(name="MasterGender.findAll", query="SELECT m FROM MasterGender m")
public class MasterGender implements Serializable {
	private static final long serialVersionUID = 1L;
	private int genderId;
	private String genderType;

	public MasterGender() {
	}


	@Id
	@Column(name="gender_id")
	public int getGenderId() {
		return this.genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}


	@Column(name="gender_type")
	public String getGenderType() {
		return this.genderType;
	}

	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}

}