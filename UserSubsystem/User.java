package UserSubsystem;
import DBSubsystem.UserDB;

import ProjectSubsystem.Project;
//import GUISubsystem.GUIController;
import ReportSubsystem.TIPReport;

public class User {

//	private GUIController guiController;
	
	public User(){
		
	}
	
	public void viewProject(int projectId){
		Project p = new Project(projectId);
		// Send project fields to guiController.
		
	}
	
	public void viewReport(int reportId){
		TIPReport r = new TIPReport(reportId);
		// Send report fields to guiController.
		
	}
	
	public TIPReport generateReport(int reportId){
		return new TIPReport(reportId);
	}
	

}
