package ReportSubsystem.MTPInfo;

public class MTPLocation {
	private String City;
	private String County;
	private String DOTDistrict;
	private String limitTo;
	private String limitFrom;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCounty() {
		return County;
	}
	public void setCounty(String county) {
		County = county;
	}
	public String getDOTDistrict() {
		return DOTDistrict;
	}
	public void setDOTDistrict(String dOTDistrict) {
		DOTDistrict = dOTDistrict;
	}
	public String getLimitTo() {
		return limitTo;
	}
	public void setLimitTo(String limitTo) {
		this.limitTo = limitTo;
	}
	public String getLimitFrom() {
		return limitFrom;
	}
	public void setLimitFrom(String limitFrom) {
		this.limitFrom = limitFrom;
	}
}
