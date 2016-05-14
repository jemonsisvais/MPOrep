package UserSubsystem;
import ProjectSubsystem.Project;
public class ProjectLead extends PrivilegedUser {
	Project p;
	
	public Project createSubmission(){
		p = new Project();
		p.archive();
		return p;
	}
	public void delete(){
		p.delete();
	}
	public void update(int projectId, String[] newData){
		Project p = new Project();
		p.setIdProject(projectId);
		p.setProposedProject(newData[0]);
		p.setCapacityProject(newData[1]);
		p.setFundProjectType(newData[2]);
		p.setHighwayRoadwayName(newData[3]);
		p.setNetworkYear(newData[4]);
		p.setRemarks(newData[5]);
		p.setScopeOfWork(newData[6]);
		p.setSponsorAgency(newData[7]);
		p.setStateSystemRoad(newData[8]);
		p.setTransitInformation(newData[9]);
		p.setArea(newData[10]);
		p.setApproved(newData[11]);
		p.update();
	}
}
