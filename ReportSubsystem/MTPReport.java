package ReportSubsystem;

import DBSubsystem.MTPReportDB;
import ProjectSubsystem.Project;
import ReportSubsystem.MTPInfo.AirQualityMTP;
import ReportSubsystem.MTPInfo.MTPFederal;
import ReportSubsystem.MTPInfo.MTPGeneralInfo;
import ReportSubsystem.MTPInfo.MTPLanes;
import ReportSubsystem.MTPInfo.MTPLocation;

public class MTPReport implements Report {
	private MTPReportDB rdb;
	private int idMTPReport;
	private String remarks;
	private String scopeOfWork;
	private String sponsorAgency;
	private String stateSystemRoad;
	private String transitInformation;
	
	private AirQualityMTP airQuality;
	private MTPFederal federal;
	private MTPGeneralInfo general;
	private MTPLanes lanes;
	private MTPLocation location;
	
	public MTPReport(){
		rdb = new MTPReportDB();
	}
	
	public MTPReport(int id){
		idMTPReport = id;
		rdb = new MTPReportDB();
		String values[] = rdb.getEntry(idMTPReport);
		setValues(values);
		airQuality = new AirQualityMTP();
		String[] airValues = rdb.getAirQualityMTP(idMTPReport);
		setAirValues(airValues);
		
		federal = new MTPFederal();
		String[] federalValues = rdb.getMTPFederalEntry(idMTPReport);
		setFederal(federalValues);
		
		general = new MTPGeneralInfo();
		String[] generalValues = rdb.getMTPGeneralInfo(idMTPReport);
		setGeneral(generalValues);
		
		lanes = new MTPLanes();
		String[] lanesValues = rdb.getMTPLane(idMTPReport);
		setLanes(lanesValues);
		
		location = new MTPLocation();
		String[] locationValues = rdb.getMTPLocation(idMTPReport);
		setLocation(locationValues);
		
	}

	private void setLocation(String[] locationValues) {
		location.setCity(locationValues[0]);
		location.setCounty(locationValues[1]);
		location.setDOTDistrict(locationValues[2]);
		location.setLimitFrom(locationValues[3]);
		location.setLimitTo(locationValues[4]);
	}

	private void setLanes(String[] lanesValues) {
		lanes.setNumberOfExistingLanes(lanesValues[0]);
		lanes.setNumberOfMiles(lanesValues[1]);
		lanes.setNumberOfProjectedLanes(lanesValues[2]);
	}

	private void setGeneral(String[] generalValues) {
		general.setProjectDescription(generalValues[0]);
		general.setProjectName(generalValues[1]);
		general.setProjectPhases(generalValues[2]);
		general.setProjectType(generalValues[3]);
	}

	private void setFederal(String[] federalValues) {
		federal.setFederalFiscalYear(federalValues[0]);
		federal.setFederalFuncionalClassification(federalValues[1]);
	}

	private void setAirValues(String[] airValues) {
		airQuality.setAirQualityAnalysisCO(airValues[0]);
		airQuality.setAirQualityAnalysisNOX(airValues[1]);
		airQuality.setAirQualityAnalysisVOC(airValues[2]);
	}

	private void setValues(String[] values) {
		remarks = values[0];
		scopeOfWork = values[1];
		sponsorAgency = values[2];
		stateSystemRoad = values[3];
		transitInformation = values[4];
	}
	
	
	
	
	public int getIdMTPReport() {
		return idMTPReport;
	}

	public void setIdMTPReport(int idMTPReport) {
		this.idMTPReport = idMTPReport;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getScopeOfWork() {
		return scopeOfWork;
	}

	public void setScopeOfWork(String scopeOfWork) {
		this.scopeOfWork = scopeOfWork;
	}

	public String getSponsorAgency() {
		return sponsorAgency;
	}

	public void setSponsorAgency(String sponsorAgency) {
		this.sponsorAgency = sponsorAgency;
	}

	public String getStateSystemRoad() {
		return stateSystemRoad;
	}

	public void setStateSystemRoad(String stateSystemRoad) {
		this.stateSystemRoad = stateSystemRoad;
	}

	public String getTransitInformation() {
		return transitInformation;
	}

	public void setTransitInformation(String transitInformation) {
		this.transitInformation = transitInformation;
	}

	@Override
	public void generateXLXS(Project p, String filename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void archive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
