package UserSubsystem;

import ProjectSubsystem.Project;

public class MPOStaff extends PrivilegedUser{
	public void approveSubmission(int projectId){
		Project p = new Project(projectId);
		p.setApproved("Approved");
		p.update();
	}
	public void reviewSubmission(int projectId){
		Project p = new Project(projectId);
		//SEND TO GUI CONTROLLER.
	}
	public void displayMode(){
		//we don't know
	}
	public void insertProject(Project p){
		p.archive();
	}
}
