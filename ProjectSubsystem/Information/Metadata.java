package ProjectSubsystem.Information;

public class Metadata {
	private int idProject;
	private String changeDate;
	private String comments;
	private String identifier;
	private String userId;
	private String workflowStatus;
	
	public int getIdProject() {
		return idProject;
	}
	public String getChangeDate() {
		return changeDate;
	}
	public String getComments() {
		return comments;
	}
	public String getIdentifier() {
		return identifier;
	}
	public String getUserId() {
		return userId;
	}
	public String getWorkflowStatus() {
		return workflowStatus;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setWorkflowStatus(String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}
}
