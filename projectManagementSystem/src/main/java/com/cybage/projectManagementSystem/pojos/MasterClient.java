package com.cybage.projectManagementSystem.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the master_client database table.
 * 
 */
@Entity
@Table(name="master_client")
@NamedQuery(name="MasterClient.findAll", query="SELECT m FROM MasterClient m")
public class MasterClient implements Serializable {
	private static final long serialVersionUID = 1L;
	private int clientId;
	private String clientName;
	private String clientPoc;
	private String clientPocPurpose;
	private List<Project> projects;

	public MasterClient() {
	}


	@Id
	@Column(name="client_id")
	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}


	@Column(name="client_name")
	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	@Column(name="client_poc")
	public String getClientPoc() {
		return this.clientPoc;
	}

	public void setClientPoc(String clientPoc) {
		this.clientPoc = clientPoc;
	}


	@Column(name="client_poc_purpose")
	public String getClientPocPurpose() {
		return this.clientPocPurpose;
	}

	public void setClientPocPurpose(String clientPocPurpose) {
		this.clientPocPurpose = clientPocPurpose;
	}


	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="masterClient")
	public List<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Project addProject(Project project) {
		getProjects().add(project);
		project.setMasterClient(this);

		return project;
	}

	public Project removeProject(Project project) {
		getProjects().remove(project);
		project.setMasterClient(null);

		return project;
	}

}