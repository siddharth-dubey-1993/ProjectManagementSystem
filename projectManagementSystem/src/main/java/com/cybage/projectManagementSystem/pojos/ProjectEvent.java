package com.cybage.projectManagementSystem.pojos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the project_event database table.
 * 
 */
@Entity
@Table(name="project_event")
@NamedQuery(name="ProjectEvent.findAll", query="SELECT p FROM ProjectEvent p")
public class ProjectEvent implements Serializable {
	private static final long serialVersionUID = 1L;
	private int projectEventId;
	private String projectEventDescription;
	private String projectEventRespondedby;
	private String projectEventResponse;
	private String projectEventTypre;
	private Project project;

	public ProjectEvent() {
	}


	@Id
	@Column(name="project_event_id")
	public int getProjectEventId() {
		return this.projectEventId;
	}

	public void setProjectEventId(int projectEventId) {
		this.projectEventId = projectEventId;
	}


	@Column(name="project_event_description")
	public String getProjectEventDescription() {
		return this.projectEventDescription;
	}

	public void setProjectEventDescription(String projectEventDescription) {
		this.projectEventDescription = projectEventDescription;
	}


	@Column(name="project_event_respondedby")
	public String getProjectEventRespondedby() {
		return this.projectEventRespondedby;
	}

	public void setProjectEventRespondedby(String projectEventRespondedby) {
		this.projectEventRespondedby = projectEventRespondedby;
	}


	@Column(name="project_event_response")
	public String getProjectEventResponse() {
		return this.projectEventResponse;
	}

	public void setProjectEventResponse(String projectEventResponse) {
		this.projectEventResponse = projectEventResponse;
	}


	@Column(name="project_event_typre")
	public String getProjectEventTypre() {
		return this.projectEventTypre;
	}

	public void setProjectEventTypre(String projectEventTypre) {
		this.projectEventTypre = projectEventTypre;
	}


	//bi-directional one-to-one association to Project
	@OneToOne
	@JoinColumn(name="project_event_id")
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}