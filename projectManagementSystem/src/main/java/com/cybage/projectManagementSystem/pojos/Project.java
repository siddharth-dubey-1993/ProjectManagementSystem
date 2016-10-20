package com.cybage.projectManagementSystem.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the project database table.
 * 
 */
@Entity
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;
	private int projectId;
	private String projectAm;
	private String projectBudget;
	private String projectClientpoc;
	private String projectConsultant;
	private String projectCreatedby;
	private Date projectCreationdate;
	private String projectDescription;
	private String projectDm;
	private Date projectEnddate;
	private String projectEstimatedeffort;
	private String projectMethodology;
	private Date projectModificationdate;
	private String projectModifiedby;
	private String projectName;
	private String projectPm;
	private Date projectStartdate;
	private String projectStatus;
	private String projectTools;
	private String projectType;
	private int projectVisibleduration;
	private Portfolio portfolio;
	private MasterClient masterClient;
	private ProjectEvent projectEvent;
	private List<ProjectLog> projectLogs;

	public Project() {
	}


	@Id
	@Column(name="project_id")
	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	@Column(name="project_am")
	public String getProjectAm() {
		return this.projectAm;
	}

	public void setProjectAm(String projectAm) {
		this.projectAm = projectAm;
	}


	@Column(name="project_budget")
	public String getProjectBudget() {
		return this.projectBudget;
	}

	public void setProjectBudget(String projectBudget) {
		this.projectBudget = projectBudget;
	}


	@Column(name="project_clientpoc")
	public String getProjectClientpoc() {
		return this.projectClientpoc;
	}

	public void setProjectClientpoc(String projectClientpoc) {
		this.projectClientpoc = projectClientpoc;
	}


	@Column(name="project_consultant")
	public String getProjectConsultant() {
		return this.projectConsultant;
	}

	public void setProjectConsultant(String projectConsultant) {
		this.projectConsultant = projectConsultant;
	}


	@Column(name="project_createdby")
	public String getProjectCreatedby() {
		return this.projectCreatedby;
	}

	public void setProjectCreatedby(String projectCreatedby) {
		this.projectCreatedby = projectCreatedby;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="project_creationdate")
	public Date getProjectCreationdate() {
		return this.projectCreationdate;
	}

	public void setProjectCreationdate(Date projectCreationdate) {
		this.projectCreationdate = projectCreationdate;
	}


	@Column(name="project_description")
	public String getProjectDescription() {
		return this.projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}


	@Column(name="project_dm")
	public String getProjectDm() {
		return this.projectDm;
	}

	public void setProjectDm(String projectDm) {
		this.projectDm = projectDm;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="project_enddate")
	public Date getProjectEnddate() {
		return this.projectEnddate;
	}

	public void setProjectEnddate(Date projectEnddate) {
		this.projectEnddate = projectEnddate;
	}


	@Column(name="project_estimatedeffort")
	public String getProjectEstimatedeffort() {
		return this.projectEstimatedeffort;
	}

	public void setProjectEstimatedeffort(String projectEstimatedeffort) {
		this.projectEstimatedeffort = projectEstimatedeffort;
	}


	@Column(name="project_methodology")
	public String getProjectMethodology() {
		return this.projectMethodology;
	}

	public void setProjectMethodology(String projectMethodology) {
		this.projectMethodology = projectMethodology;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="project_modificationdate")
	public Date getProjectModificationdate() {
		return this.projectModificationdate;
	}

	public void setProjectModificationdate(Date projectModificationdate) {
		this.projectModificationdate = projectModificationdate;
	}


	@Column(name="project_modifiedby")
	public String getProjectModifiedby() {
		return this.projectModifiedby;
	}

	public void setProjectModifiedby(String projectModifiedby) {
		this.projectModifiedby = projectModifiedby;
	}


	@Column(name="project_name")
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	@Column(name="project_pm")
	public String getProjectPm() {
		return this.projectPm;
	}

	public void setProjectPm(String projectPm) {
		this.projectPm = projectPm;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="project_startdate")
	public Date getProjectStartdate() {
		return this.projectStartdate;
	}

	public void setProjectStartdate(Date projectStartdate) {
		this.projectStartdate = projectStartdate;
	}


	@Column(name="project_status")
	public String getProjectStatus() {
		return this.projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}


	@Column(name="project_tools")
	public String getProjectTools() {
		return this.projectTools;
	}

	public void setProjectTools(String projectTools) {
		this.projectTools = projectTools;
	}


	@Column(name="project_type")
	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}


	@Column(name="project_visibleduration")
	public int getProjectVisibleduration() {
		return this.projectVisibleduration;
	}

	public void setProjectVisibleduration(int projectVisibleduration) {
		this.projectVisibleduration = projectVisibleduration;
	}


	//bi-directional one-to-one association to Portfolio
	@OneToOne(mappedBy="project")
	public Portfolio getPortfolio() {
		return this.portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}


	//bi-directional many-to-one association to MasterClient
	@ManyToOne
	@JoinColumn(name="project_client")
	public MasterClient getMasterClient() {
		return this.masterClient;
	}

	public void setMasterClient(MasterClient masterClient) {
		this.masterClient = masterClient;
	}


	//bi-directional one-to-one association to ProjectEvent
	@OneToOne(mappedBy="project")
	public ProjectEvent getProjectEvent() {
		return this.projectEvent;
	}

	public void setProjectEvent(ProjectEvent projectEvent) {
		this.projectEvent = projectEvent;
	}


	//bi-directional many-to-one association to ProjectLog
	@OneToMany(mappedBy="project")
	public List<ProjectLog> getProjectLogs() {
		return this.projectLogs;
	}

	public void setProjectLogs(List<ProjectLog> projectLogs) {
		this.projectLogs = projectLogs;
	}

	public ProjectLog addProjectLog(ProjectLog projectLog) {
		getProjectLogs().add(projectLog);
		projectLog.setProject(this);

		return projectLog;
	}

	public ProjectLog removeProjectLog(ProjectLog projectLog) {
		getProjectLogs().remove(projectLog);
		projectLog.setProject(null);

		return projectLog;
	}

}