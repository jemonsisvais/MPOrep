package ReportSubsystem;
import DBSubsystem.ReportDB;
import ProjectSubsystem.Project;
import ReportSubsystem.TIPInfo.*;

public class TIPReport implements Report {
	private int idTIPReport;
	private String capacityProject;
	private String fundProjectId;
	private String fundProjectType;
	private String highwayRoadwayName;
	private String networkYear;
	private String projectId;
	private String TIPProjectName;
	private String remarks;
	private String sponsorAgency;
	private String transitInformation;
	private String projectCost;
	private String projectFunding;
	private ReportDB rdb;

	private TIPFederal tipFederal;
	private TIPGeneralInfo generalInfo;
	private TIPLane tipLane;
	private TIPLocation tipLocation;
	
	public TIPReport(int id){
		idTIPReport = id;
		rdb = new ReportDB();
		
		String[] values = rdb.getEntry(id);
		setValues(values);
		
		String[] federalValues = rdb.getTIPFederalEntry(id);
		setFederalValues(federalValues);
		
		String[] generalValues = rdb.getTIPGeneralInfo(id);
		setGeneralInfo(generalValues);
		
		String[] laneValues = rdb.getTIPLane(id);
		setLane(laneValues);
		
		String[] locationValues = rdb.getTIPLocation(id);
		setLocation(locationValues);
		
	}
	private void setLocation(String[] locationValues) {
		tipLocation = new TIPLocation();
		tipLocation.setCity(locationValues[0]);
		tipLocation.setCounty(locationValues[1]);
		tipLocation.setDOTDistrict(locationValues[2]);
		tipLocation.setLimitFrom(locationValues[3]);
		tipLocation.setLimitTo(locationValues[4]);
	}
	private void setLane(String[] laneValues) {
		tipLane = new TIPLane();
		tipLane.setNoOfExistingLanes(laneValues[0]);
		tipLane.setNoOfMilles(laneValues[1]);
		tipLane.setNoOfProjectedLanes(laneValues[2]);
	}
	private void setGeneralInfo(String[] generalValues) {
		generalInfo = new TIPGeneralInfo();
		generalInfo.setProjectDescription(generalValues[0]);
		generalInfo.setProjectPhases(generalValues[1]);
		generalInfo.setProjectType(generalValues[2]);
	}
	private void setFederalValues(String[] federalValues) {
		tipFederal = new TIPFederal();
		tipFederal.setFederalFiscalYear(federalValues[0]);
		tipFederal.setFederalFunctionalC(federalValues[1]);
	}
	private void setValues(String[] values) {
		capacityProject = values[11];
		fundProjectId = values[0];
		fundProjectType = values[1];
		highwayRoadwayName = values[2];
		networkYear = values[3];
		projectId = values[4];
		TIPProjectName = values[5];
		remarks = values[6];
		sponsorAgency = values[7];
		transitInformation = values[8];
		projectCost = values[9];
		projectFunding = values[10];
	}
	public int getIdTIPReport() {
		return idTIPReport;
	}
	public void setIdTIPReport(int idTIPReport) {
		this.idTIPReport = idTIPReport;
	}
	public TIPReport(){
		rdb = new ReportDB();
	}
	
	public String getCapacityProject() {
		return capacityProject;
	}
	public void setCapacityProject(String capacityProject) {
		this.capacityProject = capacityProject;
	}
	public String getFundProjectId() {
		return fundProjectId;
	}
	public void setFundProjectId(String fundProjectId) {
		this.fundProjectId = fundProjectId;
	}
	public String getFundProjectType() {
		return fundProjectType;
	}
	public void setFundProjectType(String fundProjectType) {
		this.fundProjectType = fundProjectType;
	}
	public String getHighwayRoadwayName() {
		return highwayRoadwayName;
	}
	public void setHighwayRoadwayName(String highwayRoadwayName) {
		this.highwayRoadwayName = highwayRoadwayName;
	}
	public String getNetworkYear() {
		return networkYear;
	}
	public void setNetworkYear(String networkYear) {
		this.networkYear = networkYear;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getTIPProjectName() {
		return TIPProjectName;
	}
	public void setTIPProjectName(String tIPProjectName) {
		TIPProjectName = tIPProjectName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getSponsorAgency() {
		return sponsorAgency;
	}
	public void setSponsorAgency(String sponsorAgency) {
		this.sponsorAgency = sponsorAgency;
	}
	public String getTransitInformation() {
		return transitInformation;
	}
	public void setTransitInformation(String transitInformation) {
		this.transitInformation = transitInformation;
	}
	public String getProjectCost() {
		return projectCost;
	}
	public void setProjectCost(String projectCost) {
		this.projectCost = projectCost;
	}
	public String getProjectFunding() {
		return projectFunding;
	}
	public void setProjectFunding(String projectFunding) {
		this.projectFunding = projectFunding;
	}
	
	@Override
	public void generateXLXS(Project p, String filename) {
		//FOR LATA
		
	}
	@Override
	public void archive() {		
		String[] inf = new String[13];
		inf[0] = "" + idTIPReport;
		inf[1] = fundProjectId;
		inf[2] = fundProjectType;
		inf[3] = highwayRoadwayName;
		inf[4] = networkYear;
		inf[5] = projectId;
		inf[6] = TIPProjectName;
		inf[7] = remarks;
		inf[8] = sponsorAgency;
		inf[9] = transitInformation;
		inf[10] = projectCost;
		inf[11] = projectFunding;
		inf[12] = capacityProject;

		rdb.archive(inf);
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		rdb.delete(""+idTIPReport);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String[] inf = new String[13];
		inf[0] = "" + idTIPReport;
		inf[1] = capacityProject;
		inf[2] = fundProjectId;
		inf[3] = fundProjectType;
		inf[4] = highwayRoadwayName;
		inf[5] = networkYear;
		inf[6] = projectId;
		inf[7] = TIPProjectName;
		inf[8] = remarks;
		inf[9] = sponsorAgency;
		inf[10] = transitInformation;
		inf[11] = projectCost;
		inf[12] = projectFunding;
		rdb.update(inf);
	}
	
	
}
