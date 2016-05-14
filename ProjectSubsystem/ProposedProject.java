package ProjectSubsystem;

public class ProposedProject extends Project{
	private String approvedProjectId;
	private String projectReadinessElements;
	private String projectSelectionInformation;
	private String submissionDeadline;
	private String submissionType;
	private String workflowStatus;
	private String CN;
	private String CSJ;

	public String getApprovedProjectId() {
		return approvedProjectId;
	}
	public String getProjectReadinessElements() {
		return projectReadinessElements;
	}
	public String getProjectSelectionInformation() {
		return projectSelectionInformation;
	}
	public String getSubmissionDeadline() {
		return submissionDeadline;
	}
	public String getSubmissionType() {
		return submissionType;
	}
	public String getWorkflowStatus() {
		return workflowStatus;
	}
	public String getCN() {
		return CN;
	}
	public String getCSJ() {
		return CSJ;
	}

	public void setApprovedProjectId(String approvedProjectId) {
		this.approvedProjectId = approvedProjectId;
	}
	public void setProjectReadinessElements(String projectReadinessElements) {
		this.projectReadinessElements = projectReadinessElements;
	}
	public void setProjectSelectionInformation(String projectSelectionInformation) {
		this.projectSelectionInformation = projectSelectionInformation;
	}
	public void setSubmissionDeadline(String submissionDeadline) {
		this.submissionDeadline = submissionDeadline;
	}
	public void setSubmissionType(String submissionType) {
		this.submissionType = submissionType;
	}
	public void setWorkflowStatus(String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}
	public void setCN(String cN) {
		CN = cN;
	}
	public void setCSJ(String cSJ) {
		CSJ = cSJ;
	}
}
