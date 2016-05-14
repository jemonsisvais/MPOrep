package ProjectSubsystem.Information;

public class Funding {
	private int idProject;
	private String federalShare;
	private String fundingCategory;
	private String localDistribution;
	private String localShare;
	private String regionalShare;
	private String stateShare;
	
	public int getIdProject() {
		return idProject;
	}
	public String getFederalShare() {
		return federalShare;
	}
	public String getFundingCategory() {
		return fundingCategory;
	}
	public String getLocalDistribution() {
		return localDistribution;
	}
	public String getLocalShare() {
		return localShare;
	}
	public String getRegionalShare() {
		return regionalShare;
	}
	public String getStateShare() {
		return stateShare;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	public void setFederalShare(String federalShare) {
		this.federalShare = federalShare;
	}
	public void setFundingCategory(String fundingCategory) {
		this.fundingCategory = fundingCategory;
	}
	public void setLocalDistribution(String localDistribution) {
		this.localDistribution = localDistribution;
	}
	public void setLocalShare(String localShare) {
		this.localShare = localShare;
	}
	public void setRegionalShare(String regionalShare) {
		this.regionalShare = regionalShare;
	}
	public void setStateShare(String stateShare) {
		this.stateShare = stateShare;
	}
}
