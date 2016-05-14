package GUISubsystem;

import ProjectSubsystem.Project;
import UserSubsystem.Administrator;
import UserSubsystem.ProjectLead;

public class GUIController {

	public static void main(String[] args) {
		Project p = new Project(4);
		System.out.println(p.getTransitInformation());
		System.out.println(p.getNetworkYear());
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void createUser(String[] userData) {
		Administrator a = new Administrator();
		a.createUser(userData);
	}

	public static void deleteUser(int userId) {
		Administrator a = new Administrator();
		a.deleteUser(userId);
	}

	public static void createSubmission() {
		ProjectLead pl = new ProjectLead();
		pl.createSubmission();
	}
	
	public static void updateProject(int projectId, String[] projectData){
		ProjectLead pl = new ProjectLead();
		pl.update(projectId, projectData);
	}

}
