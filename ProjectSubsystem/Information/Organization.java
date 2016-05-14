package ProjectSubsystem.Information;

public class Organization {
	private int idProject;
	private String contactPersonFirstName;
	private String contactPersonLastName;
	private String contactPersonMiddleInitialName;
	private String contactPersonPositionTitle;
	private String departmentContactNumber;
	private String departmentName;
	private String email;
	private String organizationName;
	private String workContactNumber;
	
	public int getIdProject() {
		return idProject;
	}
	public String getContactPersonFirstName() {
		return contactPersonFirstName;
	}
	public String getContactPersonLastName() {
		return contactPersonLastName;
	}
	public String getContactPersonMiddleInitialName() {
		return contactPersonMiddleInitialName;
	}
	public String getContactPersonPositionTitle() {
		return contactPersonPositionTitle;
	}
	public String getDepartmentContactNumber() {
		return departmentContactNumber;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public String getEmail() {
		return email;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public String getWorkContactNumber() {
		return workContactNumber;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	public void setContactPersonFirstName(String contactPersonFirstName) {
		this.contactPersonFirstName = contactPersonFirstName;
	}
	public void setContactPersonLastName(String contactPersonLastName) {
		this.contactPersonLastName = contactPersonLastName;
	}
	public void setContactPersonMiddleInitialName(
			String contactPersonMiddleInitialName) {
		this.contactPersonMiddleInitialName = contactPersonMiddleInitialName;
	}
	public void setContactPersonPositionTitle(String contactPersonPositionTitle) {
		this.contactPersonPositionTitle = contactPersonPositionTitle;
	}
	public void setDepartmentContactNumber(String departmentContactNumber) {
		this.departmentContactNumber = departmentContactNumber;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public void setWorkContactNumber(String workContactNumber) {
		this.workContactNumber = workContactNumber;
	}
}
