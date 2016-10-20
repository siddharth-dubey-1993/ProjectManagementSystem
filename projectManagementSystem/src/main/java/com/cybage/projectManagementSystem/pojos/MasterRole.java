package com.cybage.projectManagementSystem.pojos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the master_role database table.
 * 
 */
@Entity
@Table(name="master_role")
@NamedQuery(name="MasterRole.findAll", query="SELECT m FROM MasterRole m")
public class MasterRole implements Serializable {
	private static final long serialVersionUID = 1L;
	private int roleId;
	private String roleDesc;

	public MasterRole() {
	}


	@Id
	@Column(name="role_id")
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}


	@Column(name="role_desc")
	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

}