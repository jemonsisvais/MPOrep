package ProjectSubsystem.Information;

public class GeneralInformation {
	private int idProject;
	private String projectDescription;
	private String projectName;
	private String projectPhases;
	private String projectType;
	
	public int getIdProject() {
		return idProject;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public String getProjectName() {
		return projectName;
	}
	public String getProjectPhases() {
		return projectPhases;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public void setProjectPhases(String projectPhases) {
		this.projectPhases = projectPhases;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
}
