package ProjectSubsystem;

import DBSubsystem.ProjectDB;
import ProjectSubsystem.Information.AirQuality;
import ProjectSubsystem.Information.FederalInfo;
import ProjectSubsystem.Information.Funding;
import ProjectSubsystem.Information.GeneralInformation;
import ProjectSubsystem.Information.Lanes;
import ProjectSubsystem.Information.Location;
import ProjectSubsystem.Information.Metadata;
import ProjectSubsystem.Information.Organization;
import ProjectSubsystem.Information.ProjectCost;

public class Project {
	private int idProject;
	private String proposedProject;
	private String capacityProject;
	private String fundProjectType;
	private String highwayRoadwayName;
	private String networkYear;
	private String remarks;
	private String scopeOfWork;
	private String sponsorAgency;
	private String stateSystemRoad;
	private String transitInformation;
	private String area;
	private String approved;

	public void archive(){
		String[] inf = new String[13];
		inf[0] = "" + idProject;
		inf[1] = proposedProject;
		inf[2] = capacityProject;
		inf[3] = fundProjectType;
		inf[4] = highwayRoadwayName;
		inf[5] = networkYear;
		inf[6] = remarks;
		inf[7] = scopeOfWork;
		inf[8] = sponsorAgency;
		inf[9] = stateSystemRoad;
		inf[10] = transitInformation;
		inf[11] = area;
		inf[12] = approved;
		
		pdb.archive(inf);
		
	}
	
	public void update() {
		String[] inf = new String[13];
		inf[0] = "" + idProject;
		inf[1] = proposedProject;
		inf[2] = capacityProject;
		inf[3] = fundProjectType;
		inf[4] = highwayRoadwayName;
		inf[5] = networkYear;
		inf[6] = remarks;
		inf[7] = scopeOfWork;
		inf[8] = sponsorAgency;
		inf[9] = stateSystemRoad;
		inf[10] = transitInformation;
		inf[11] = area;
		inf[12] = approved;
		
		pdb.update(inf);
	}

	public String isApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	private Location location;
	private Lanes lanes;
	private FederalInfo federalInfo;
	private AirQuality airQuality;
	private ProjectCost projectCost;
	private GeneralInformation generalInformation;
	private Funding funding;
	private Organization organization;
	private Metadata metadata;

	private ProjectDB pdb;

	public void delete() {
		pdb.delete("" + this.idProject);
	}

	public Project() {
		pdb = new ProjectDB();
	}

	public Project(int id) {
		idProject = id;
		pdb = new ProjectDB();
		String[] values = pdb.getEntry(id);
		setValues(values);

//		location = new Location();
//		String[] locationValues = pdb.getLocationEntry(id);
//		setLocationValues(locationValues);
//
//		lanes = new Lanes();
//		String[] lanesValues = pdb.getLanesEntry(id);
//		setLanes(lanesValues);
//
//		federalInfo = new FederalInfo();
//		String[] federalValues = pdb.getFederalInfoEntry(id);
//		setFederalInfo(federalValues);
//
//		airQuality = new AirQuality();
//		String[] airValues = pdb.getAirQualityEntry(id);
//		setAirQuality(airValues);
//
//		projectCost = new ProjectCost();
//		String[] projectCostValues = pdb.getProjectCostEntry(id);
//		setProjectCost(projectCostValues);
//
//		generalInformation = new GeneralInformation();
//		String[] generalValues = pdb.getGeneralInformationEntry(id);
//		setGeneralInformation(generalValues);
//
//		funding = new Funding();
//		String[] fundingValues = pdb.getFundingEntry(id);
//		setFunding(fundingValues);
//
//		organization = new Organization();
//		String[] organizationValues = pdb.getOrganizationEntry(id);
//		setOrganization(organizationValues);
//
//		metadata = new Metadata();
//		String[] metadataValues = pdb.getMetadataEntry(id);
//		setMetadata(metadataValues);

	}

	private void setMetadata(String[] metadataValues) {
		metadata.setChangeDate(metadataValues[0]);
		metadata.setComments(metadataValues[1]);
		metadata.setIdentifier(metadataValues[2]);
		metadata.setUserId(metadataValues[3]);
		metadata.setWorkflowStatus(metadataValues[4]);
	}

	private void setOrganization(String[] organizationValues) {
		organization.setContactPersonFirstName(organizationValues[0]);
		organization.setContactPersonLastName(organizationValues[1]);
		organization.setContactPersonMiddleInitialName(organizationValues[2]);
		organization.setContactPersonPositionTitle(organizationValues[3]);
		organization.setDepartmentContactNumber(organizationValues[4]);
		organization.setDepartmentName(organizationValues[5]);
		organization.setEmail(organizationValues[6]);
		organization.setOrganizationName(organizationValues[7]);
		organization.setWorkContactNumber(organizationValues[8]);
	}

	private void setFunding(String[] fundingValues) {
		funding.setFederalShare(fundingValues[0]);
		funding.setFundingCategory(fundingValues[1]);
		funding.setLocalDistribution(fundingValues[2]);
		funding.setLocalShare(fundingValues[3]);
		funding.setRegionalShare(fundingValues[4]);
		funding.setStateShare(fundingValues[5]);
	}

	private void setGeneralInformation(String[] generalValues) {
		generalInformation.setProjectDescription(generalValues[0]);
		generalInformation.setProjectName(generalValues[1]);
		generalInformation.setProjectPhases(generalValues[2]);
		generalInformation.setProjectType(generalValues[3]);
	}

	private void setProjectCost(String[] projectCostValues) {
		projectCost.setConstructionCost(projectCostValues[0]);
		projectCost.setConstructionEngineeringCost(projectCostValues[1]);
		projectCost.setContingenciesCost(projectCostValues[2]);
		projectCost.setFTAtransferCost(projectCostValues[3]);
		projectCost.setNonContructionProjectCost(projectCostValues[4]);
		projectCost.setPotentialChangeOrderCost(projectCostValues[5]);
		projectCost.setPreeliminaryEngineeringCost(projectCostValues[6]);
		projectCost.setRightOfWayCost(projectCostValues[7]);
	}

	private void setAirQuality(String[] airValues) {
		airQuality.setAirQualityAnalysisCO(airValues[0]);
		airQuality.setAirQualityAnalysisNOX(airValues[1]);
		airQuality.setAirQualityAnalysisVOC(airValues[2]);
	}

	private void setFederalInfo(String[] federalValues) {
		federalInfo.setFederalFiscalYear(federalValues[0]);
		federalInfo.setFederalFunctionalClassification(federalValues[1]);
	}

	private void setLanes(String[] lanesValues) {
		lanes.setNumberOfExistingLanes(lanesValues[0]);
		lanes.setNumberOfMiles(lanesValues[1]);
		lanes.setNumberOfProjectedLanes(lanesValues[2]);
	}

	private void setLocationValues(String[] locationValues) {
		location.setCity(locationValues[0]);
		location.setCounty(locationValues[1]);
		location.setDOTDistrict(locationValues[2]);
		location.setLimitFrom(locationValues[3]);
		location.setLimitTo(locationValues[4]);
	}

	private void setValues(String[] values) {
		proposedProject = values[0];
		capacityProject = values[1];
		fundProjectType = values[2];
		highwayRoadwayName = values[3];
		networkYear = values[4];
		remarks = values[5];
		scopeOfWork = values[6];
		sponsorAgency = values[7];
		stateSystemRoad = values[8];
		transitInformation = values[9];
		area = values[10];
	}

	public String[] getValues() {
		return new String[] { "" + idProject, proposedProject, capacityProject,
				fundProjectType, highwayRoadwayName, networkYear, remarks,
				scopeOfWork, sponsorAgency, stateSystemRoad,
				transitInformation, area };
	}

	public int getIdProject() {
		return idProject;
	}

	public String getProposedProject() {
		return proposedProject;
	}

	public String getCapacityProject() {
		return capacityProject;
	}

	public String getFundProjectType() {
		return fundProjectType;
	}

	public String getHighwayRoadwayName() {
		return highwayRoadwayName;
	}

	public String getNetworkYear() {
		return networkYear;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getScopeOfWork() {
		return scopeOfWork;
	}

	public String getSponsorAgency() {
		return sponsorAgency;
	}

	public String getStateSystemRoad() {
		return stateSystemRoad;
	}

	public String getTransitInformation() {
		return transitInformation;
	}

	public String getArea() {
		return area;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public void setProposedProject(String proposedProject) {
		this.proposedProject = proposedProject;
	}

	public void setCapacityProject(String capacityProject) {
		this.capacityProject = capacityProject;
	}

	public void setFundProjectType(String fundProjectType) {
		this.fundProjectType = fundProjectType;
	}

	public void setHighwayRoadwayName(String highwayRoadwayName) {
		this.highwayRoadwayName = highwayRoadwayName;
	}

	public void setNetworkYear(String networkYear) {
		this.networkYear = networkYear;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setScopeOfWork(String scopeOfWork) {
		this.scopeOfWork = scopeOfWork;
	}

	public void setSponsorAgency(String sponsorAgency) {
		this.sponsorAgency = sponsorAgency;
	}

	public void setStateSystemRoad(String stateSystemRoad) {
		this.stateSystemRoad = stateSystemRoad;
	}

	public void setTransitInformation(String transitInformation) {
		this.transitInformation = transitInformation;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Location getLocation() {
		return location;
	}

	public Lanes getLanes() {
		return lanes;
	}

	public FederalInfo getFederalInfo() {
		return federalInfo;
	}

	public AirQuality getAirQuality() {
		return airQuality;
	}

	public ProjectCost getProjectCost() {
		return projectCost;
	}

	public GeneralInformation getGeneralInformation() {
		return generalInformation;
	}

	public Funding getFunding() {
		return funding;
	}

	public Organization getOrganization() {
		return organization;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setLanes(Lanes lanes) {
		this.lanes = lanes;
	}

	public void setFederalInfo(FederalInfo federalInfo) {
		this.federalInfo = federalInfo;
	}

	public void setAirQuality(AirQuality airQuality) {
		this.airQuality = airQuality;
	}

	public void setProjectCost(ProjectCost projectCost) {
		this.projectCost = projectCost;
	}

	public void setGeneralInformation(GeneralInformation generalInformation) {
		this.generalInformation = generalInformation;
	}

	public void setFunding(Funding funding) {
		this.funding = funding;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
