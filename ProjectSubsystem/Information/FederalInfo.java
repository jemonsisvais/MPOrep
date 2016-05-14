package ProjectSubsystem.Information;

public class FederalInfo {
	private int idProject;
	private String federalFiscalYear;
	private String federalFunctionalClassification;
	
	public int getIdProject() {
		return idProject;
	}
	public String getFederalFiscalYear() {
		return federalFiscalYear;
	}
	public String getFederalFunctionalClassification() {
		return federalFunctionalClassification;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	public void setFederalFiscalYear(String federalFiscalYear) {
		this.federalFiscalYear = federalFiscalYear;
	}
	public void setFederalFunctionalClassification(
			String federalFunctionalClassification) {
		this.federalFunctionalClassification = federalFunctionalClassification;
	}
	
}
