package com.cybage.projectManagementSystem.pojos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the resource database table.
 * 
 */
@Entity
@NamedQuery(name="Resource.findAll", query="SELECT r FROM Resource r")
public class Resource implements Serializable {
	private static final long serialVersionUID = 1L;
	private int resourceId;
	private String resourceName;
	private int resourceRole;

	public Resource() {
	}


	@Id
	@Column(name="resource_id")
	public int getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}


	@Column(name="resource_name")
	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}


	@Column(name="resource_role")
	public int getResourceRole() {
		return this.resourceRole;
	}

	public void setResourceRole(int resourceRole) {
		this.resourceRole = resourceRole;
	}

}