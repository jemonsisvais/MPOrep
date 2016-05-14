package ProjectSubsystem.Information;

public class Location {
	private int idProject;
	private String City;
	private String County;
	private String DOTDistrict;
	private String limitTo;
	private String limitFrom;
	
	public int getIdProject() {
		return idProject;
	}
	public String getCity() {
		return City;
	}
	public String getCounty() {
		return County;
	}
	public String getDOTDistrict() {
		return DOTDistrict;
	}
	public String getLimitTo() {
		return limitTo;
	}
	public String getLimitFrom() {
		return limitFrom;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	public void setCity(String city) {
		City = city;
	}
	public void setCounty(String county) {
		County = county;
	}
	public void setDOTDistrict(String dOTDistrict) {
		DOTDistrict = dOTDistrict;
	}
	public void setLimitTo(String limitTo) {
		this.limitTo = limitTo;
	}
	public void setLimitFrom(String limitFrom) {
		this.limitFrom = limitFrom;
	}
	
}
