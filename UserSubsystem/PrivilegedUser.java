package UserSubsystem;

import DBSubsystem.UserDB;

public class PrivilegedUser extends User{
	private UserDB udb;
	private String firstName;
	private String middleInitialName;
	private String lastName;
	private String orgName;
	private String deptName;
	private String positionTitle;
	private String deptContactName;
	private String workContactNumber;
	private String email;
	private String username;
	private String password;
	private String approved;
	private int userId;
	
	public PrivilegedUser(){
		udb = new UserDB();
	}
	
	public PrivilegedUser(int id){
		userId = id;
		udb = new UserDB();
		String values[] = udb.getEntry(id);
		setValues(values);
		
		
	}

	public PrivilegedUser(String username, String password){
		this.username = username;
		this.password = password;
		udb = new UserDB();
		String values[] = udb.getEntry(username, password);
		setValues(values);
	}
	
	public void update(){
		String[] inf = new String[13];
		inf[0] = ""+userId;
		inf[1] = firstName;
		inf[2] = middleInitialName;
		inf[3] = lastName;
		inf[4] = orgName;
		inf[5] = deptName;
		inf[6] = positionTitle;
		inf[7] = deptContactName;
		inf[8] = workContactNumber;
		inf[9] = email;
		inf[10] = username;
		inf[11] = password;
		inf[12] = approved;
		udb.update(inf);
	}
	
	public void delete(){
		udb.delete(""+userId);
	}
	
	public void archive(){
		String[] inf = new String[13];
		inf[0] = ""+userId;
		inf[1] = firstName;
		inf[2] = middleInitialName;
		inf[3] = lastName;
		inf[4] = orgName;
		inf[5] = deptName;
		inf[6] = positionTitle;
		inf[7] = deptContactName;
		inf[8] = workContactNumber;
		inf[9] = email;
		inf[10] = username;
		inf[11] = password;
		inf[12] = approved;
		udb.archive(inf);
		
	}
	private void setValues(String[] values) {
		firstName = values[0];
		middleInitialName = values[1];
		lastName = values[2];
		orgName = values[3];
		deptName = values[4];
		positionTitle = values[5];
		deptContactName = values[6];
		workContactNumber = values[7];
		email = values[8];
		username = values[9];
		password = values[10];
		approved = values[11];
	}
	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitialName() {
		return middleInitialName;
	}
	public void setMiddleInitialName(String middleInitialName) {
		this.middleInitialName = middleInitialName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getPositionTitle() {
		return positionTitle;
	}
	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}
	public String getDeptContactName() {
		return deptContactName;
	}
	public void setDeptContactName(String deptContactName) {
		this.deptContactName = deptContactName;
	}
	public String getWorkContactNumber() {
		return workContactNumber;
	}
	public void setWorkContactNumber(String workContactNumber) {
		this.workContactNumber = workContactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
