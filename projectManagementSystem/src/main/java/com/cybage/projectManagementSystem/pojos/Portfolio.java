package com.cybage.projectManagementSystem.pojos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the portfolio database table.
 * 
 */
@Entity
@NamedQuery(name="Portfolio.findAll", query="SELECT p FROM Portfolio p")
public class Portfolio implements Serializable {
	private static final long serialVersionUID = 1L;
	private int projectId;
	private double budget;
	private String name;
	private String owner;
	private String projects;
	private Project project;

	public Portfolio() {
	}


	@Id
	@Column(name="project_id")
	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public double getBudget() {
		return this.budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getProjects() {
		return this.projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}


	//bi-directional one-to-one association to Project
	@OneToOne
	@JoinColumn(name="project_id")
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}