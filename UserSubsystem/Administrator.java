package UserSubsystem;

public class Administrator extends PrivilegedUser {
	public void createUser(String[] data){
		PrivilegedUser u = new PrivilegedUser();
		u.setFirstName(data[0]);
		u.setMiddleInitialName(data[1]);
		u.setLastName(data[2]);
		u.setOrgName(data[3]);
		u.setDeptName(data[4]);
		u.setPositionTitle(data[5]);
		u.setDeptContactName(data[6]);
		u.setWorkContactNumber(data[7]);
		u.setEmail(data[8]);
		u.setUsername(data[9]);
		u.setPassword(data[10]);
		u.setApproved(data[11]);
		u.archive();
	}
	public void editUser(String[] data, int userId){
		PrivilegedUser u = new PrivilegedUser(userId);
		u.setFirstName(data[0]);
		u.setMiddleInitialName(data[1]);
		u.setLastName(data[2]);
		u.setOrgName(data[3]);
		u.setDeptName(data[4]);
		u.setPositionTitle(data[5]);
		u.setDeptContactName(data[6]);
		u.setWorkContactNumber(data[7]);
		u.setEmail(data[8]);
		u.setUsername(data[9]);
		u.setPassword(data[10]);
		u.setApproved(data[11]);
		u.update();
	}
	public void deleteUser(int userId){
		PrivilegedUser u = new PrivilegedUser(userId);
		u.delete();
	}
}
