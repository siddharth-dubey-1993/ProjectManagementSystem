package com.cybage.projectManagementSystem.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the project_log database table.
 * 
 */
@Entity
@Table(name="project_log")
@NamedQuery(name="ProjectLog.findAll", query="SELECT p FROM ProjectLog p")
public class ProjectLog implements Serializable {
	private static final long serialVersionUID = 1L;
	private int projectLogLogId;
	private String projectLogAm;
	private String projectLogBudget;
	private String projectLogClientpoc;
	private String projectLogConsultant;
	private String projectLogDescription;
	private String projectLogDm;
	private Date projectLogEnddate;
	private String projectLogEstimatedeffort;
	private String projectLogMethodology;
	private Date projectLogModificationdate;
	private String projectLogModifiedby;
	private String projectLogName;
	private String projectLogPm;
	private Date projectLogStartdate;
	private String projectLogStatus;
	private String projectLogTools;
	private String projectLogType;
	private String projectLogVisibleduration;
	private Project project;

	public ProjectLog() {
	}


	@Id
	@Column(name="project_log_log_id")
	public int getProjectLogLogId() {
		return this.projectLogLogId;
	}

	public void setProjectLogLogId(int projectLogLogId) {
		this.projectLogLogId = projectLogLogId;
	}


	@Column(name="project_log_am")
	public String getProjectLogAm() {
		return this.projectLogAm;
	}

	public void setProjectLogAm(String projectLogAm) {
		this.projectLogAm = projectLogAm;
	}


	@Column(name="project_log_budget")
	public String getProjectLogBudget() {
		return this.projectLogBudget;
	}

	public void setProjectLogBudget(String projectLogBudget) {
		this.projectLogBudget = projectLogBudget;
	}


	@Column(name="project_log_clientpoc")
	public String getProjectLogClientpoc() {
		return this.projectLogClientpoc;
	}

	public void setProjectLogClientpoc(String projectLogClientpoc) {
		this.projectLogClientpoc = projectLogClientpoc;
	}


	@Column(name="project_log_consultant")
	public String getProjectLogConsultant() {
		return this.projectLogConsultant;
	}

	public void setProjectLogConsultant(String projectLogConsultant) {
		this.projectLogConsultant = projectLogConsultant;
	}


	@Column(name="project_log_description")
	public String getProjectLogDescription() {
		return this.projectLogDescription;
	}

	public void setProjectLogDescription(String projectLogDescription) {
		this.projectLogDescription = projectLogDescription;
	}


	@Column(name="project_log_dm")
	public String getProjectLogDm() {
		return this.projectLogDm;
	}

	public void setProjectLogDm(String projectLogDm) {
		this.projectLogDm = projectLogDm;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="project_log_enddate")
	public Date getProjectLogEnddate() {
		return this.projectLogEnddate;
	}

	public void setProjectLogEnddate(Date projectLogEnddate) {
		this.projectLogEnddate = projectLogEnddate;
	}


	@Column(name="project_log_estimatedeffort")
	public String getProjectLogEstimatedeffort() {
		return this.projectLogEstimatedeffort;
	}

	public void setProjectLogEstimatedeffort(String projectLogEstimatedeffort) {
		this.projectLogEstimatedeffort = projectLogEstimatedeffort;
	}


	@Column(name="project_log_methodology")
	public String getProjectLogMethodology() {
		return this.projectLogMethodology;
	}

	public void setProjectLogMethodology(String projectLogMethodology) {
		this.projectLogMethodology = projectLogMethodology;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="project_log_modificationdate")
	public Date getProjectLogModificationdate() {
		return this.projectLogModificationdate;
	}

	public void setProjectLogModificationdate(Date projectLogModificationdate) {
		this.projectLogModificationdate = projectLogModificationdate;
	}


	@Column(name="project_log_modifiedby")
	public String getProjectLogModifiedby() {
		return this.projectLogModifiedby;
	}

	public void setProjectLogModifiedby(String projectLogModifiedby) {
		this.projectLogModifiedby = projectLogModifiedby;
	}


	@Column(name="project_log_name")
	public String getProjectLogName() {
		return this.projectLogName;
	}

	public void setProjectLogName(String projectLogName) {
		this.projectLogName = projectLogName;
	}


	@Column(name="project_log_pm")
	public String getProjectLogPm() {
		return this.projectLogPm;
	}

	public void setProjectLogPm(String projectLogPm) {
		this.projectLogPm = projectLogPm;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="project_log_startdate")
	public Date getProjectLogStartdate() {
		return this.projectLogStartdate;
	}

	public void setProjectLogStartdate(Date projectLogStartdate) {
		this.projectLogStartdate = projectLogStartdate;
	}


	@Column(name="project_log_status")
	public String getProjectLogStatus() {
		return this.projectLogStatus;
	}

	public void setProjectLogStatus(String projectLogStatus) {
		this.projectLogStatus = projectLogStatus;
	}


	@Column(name="project_log_tools")
	public String getProjectLogTools() {
		return this.projectLogTools;
	}

	public void setProjectLogTools(String projectLogTools) {
		this.projectLogTools = projectLogTools;
	}


	@Column(name="project_log_type")
	public String getProjectLogType() {
		return this.projectLogType;
	}

	public void setProjectLogType(String projectLogType) {
		this.projectLogType = projectLogType;
	}


	@Column(name="project_log_visibleduration")
	public String getProjectLogVisibleduration() {
		return this.projectLogVisibleduration;
	}

	public void setProjectLogVisibleduration(String projectLogVisibleduration) {
		this.projectLogVisibleduration = projectLogVisibleduration;
	}


	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="project_log_project_id")
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}