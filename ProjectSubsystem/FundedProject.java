package ProjectSubsystem;

public class FundedProject extends Project {
	private String amendmentDate;
	private String CNNumber;
	private String CSJNumber;
	private String TIPName;
	private String TIPYear;
	
	public String getAmendmentDate() {
		return amendmentDate;
	}
	public String getCNNumber() {
		return CNNumber;
	}
	public String getCSJNumber() {
		return CSJNumber;
	}
	public String getTIPName() {
		return TIPName;
	}
	public String getTIPYear() {
		return TIPYear;
	}

	public void setAmendmentDate(String amendmentDate) {
		this.amendmentDate = amendmentDate;
	}
	public void setCNNumber(String cNNumber) {
		CNNumber = cNNumber;
	}
	public void setCSJNumber(String cSJNumber) {
		CSJNumber = cSJNumber;
	}
	public void setTIPName(String tIPName) {
		TIPName = tIPName;
	}
	public void setTIPYear(String tIPYear) {
		TIPYear = tIPYear;
	}
}
