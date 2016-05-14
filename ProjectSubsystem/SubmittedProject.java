package ProjectSubsystem;

public class SubmittedProject extends Project {
	private int idProject;
	private String TPBApproval;
	private String federalApproval;
	private String stateApproval;
	private String submissionStatus;
	
	public int getIdProject() {
		return idProject;
	}
	public String getTPBApproval() {
		return TPBApproval;
	}
	public String getFederalApproval() {
		return federalApproval;
	}
	public String getStateApproval() {
		return stateApproval;
	}
	public String getSubmissionStatus() {
		return submissionStatus;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	public void setTPBApproval(String tPBApproval) {
		TPBApproval = tPBApproval;
	}
	public void setFederalApproval(String federalApproval) {
		this.federalApproval = federalApproval;
	}
	public void setStateApproval(String stateApproval) {
		this.stateApproval = stateApproval;
	}
	public void setSubmissionStatus(String submissionStatus) {
		this.submissionStatus = submissionStatus;
	}
}
