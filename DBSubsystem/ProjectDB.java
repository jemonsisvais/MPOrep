package DBSubsystem;

/**
 * Implementation for the Project table in the database.
 * 
 * @author Jesus Molina
 */
public class ProjectDB implements DB {

	/**
	 * Returns all the values for the entry.
	 */
	@Override
	public String[] getEntry(int idProject) {
		connector.establishConnection();
		
		if (!connector.exists("SELECT * FROM Project where idProject = "
				+ idProject)) {
			System.out.println("Id doesn't exists in database");
			return null;
		}
		
		String[] result = connector
				.getRow("select * from Project where idProject = " + idProject);
		connector.closeConnection();
		return result;
	}
	
	public String[] getLocationEntry(int idProject){
		connector.establishConnection();
		
		if (!connector.exists("SELECT * FROM Location where Project_idProject = "
				+ idProject)) {
			System.out.println("Id doesn't exists in database");
			return null;
		}
		
		String[] location = connector
				.getRow("select * from Location where Project_idProject = " + idProject);
		connector.closeConnection();
		return location;
	}
	
	public String[] getAirQualityEntry(int idProject){
		connector.establishConnection();
		
		if (!connector.exists("SELECT * FROM `Air Quality` where Project_idProject = "
				+ idProject)) {
			System.out.println("Id doesn't exists in database");
			return null;
		}
		
		String[] airQuality = connector
				.getRow("select * from `Air Quality` where Project_idProject = " + idProject);
		connector.closeConnection();
		return airQuality;
	}

	public String[] getFederalInfoEntry(int idProject){
		connector.establishConnection();
		
		if (!connector.exists("SELECT * FROM `FederalInfo` where Project_idProject = "
				+ idProject)) {
			System.out.println("Id doesn't exists in database");
			return null;
		}
		
		String[] federalInfo = connector
				.getRow("select * from `FederalInfo` where Project_idProject = " + idProject);
		connector.closeConnection();
		return federalInfo;
	}
	
	public String[] getFundingEntry(int idProject){
		connector.establishConnection();
		
		if (!connector.exists("SELECT * FROM `Funding` where Project_idProject = "
				+ idProject)) {
			System.out.println("Id doesn't exists in database");
			return null;
		}
		
		String[] funding = connector
				.getRow("select * from `Funding` where Project_idProject = " + idProject);
		connector.closeConnection();
		return funding;
	}
	
	public String[] getGeneralInformationEntry(int idProject){
		connector.establishConnection();
		
		if (!connector.exists("SELECT * FROM `General Information` where Project_idProject = "
				+ idProject)) {
			System.out.println("Id doesn't exists in database");
			return null;
		}
		
		String[] generalInformation = connector
				.getRow("select * from `General Information` where Project_idProject = " + idProject);
		connector.closeConnection();
		return generalInformation;
	}
	
	public String[] getLanesEntry(int idProject){
		connector.establishConnection();
		
		if (!connector.exists("SELECT * FROM `Lanes` where Project_idProject = "
				+ idProject)) {
			System.out.println("Id doesn't exists in database");
			return null;
		}
		
		String[] lanes = connector
				.getRow("select * from `Lanes` where Project_idProject = " + idProject);
		connector.closeConnection();
		return lanes;
	}
	
	public String[] getMetadataEntry(int idProject){
		connector.establishConnection();
		
		if (!connector.exists("SELECT * FROM `Metadata` where Project_idProject = "
				+ idProject)) {
			System.out.println("Id doesn't exists in database");
			return null;
		}
		
		String[] metadata = connector
				.getRow("select * from `Metadata` where Project_idProject = " + idProject);
		connector.closeConnection();
		return metadata;
	}
	
	public String[] getOrganizationEntry(int idProject){
		connector.establishConnection();
		
		if (!connector.exists("SELECT * FROM `Organization` where Project_idProject = "
				+ idProject)) {
			System.out.println("Id doesn't exists in database");
			return null;
		}
		
		String[] organization = connector
				.getRow("select * from `Organization` where Project_idProject = " + idProject);
		connector.closeConnection();
		return organization;
	}
	
	public String[] getProjectCostEntry(int idProject){
		connector.establishConnection();
		
		if (!connector.exists("SELECT * FROM `Project Cost` where Project_idProject = "
				+ idProject)) {
			System.out.println("Id doesn't exists in database");
			return null;
		}
		
		String[] projectCost = connector
				.getRow("select * from `Project Cost` where Project_idProject = " + idProject);
		connector.closeConnection();
		return projectCost;
	}
	/**
	 * Inserts a new entry into the Project table with the values from the given
	 * Projet object.
	 * 
	 * @requires o instanceof Project == true;
	 */
	@Override
	public void archive(String[] inf) {
		
		connector.establishConnection();
		if (connector.exists("SELECT * FROM Project where idProject = "
				+ inf[0])) {
			System.out.println("Id already exists in database");
			return;
		}
		String query = "insert into Project values(";
		for (int i = 0; i < inf.length; i++) {
			if (inf.length - i > 1)
				query += "'" + inf[i] + "',";
			else
				query += "'" + inf[i] + "'";
		}
		query += ");";
		connector.execute(query);
		connector.closeConnection();
	}

	/**
	 * Updates an entry from the Project table with the values from the given
	 * Project object.
	 * 
	 * @requires o instanceof Project == true;
	 */
	@Override
	public void update(String[] inf) {		
		connector.establishConnection();
		
		if (!connector.exists("SELECT * FROM Project where idProject = "
				+ inf[0])) {
			System.out.println("Id doesn't exists in database");
			return;
		}
		
		String toExecute = "UPDATE Project set `Proposed Project` = '"
				+ inf[1] + "', ";
		toExecute += "`Capacity Project` = '" + inf[2]
				+ "', ";
		toExecute += "`Fund Project Type` = '" + inf[3]
				+ "', ";
		toExecute += "`Highway/Roadway Name` = '"
				+ inf[4] + "', ";
		toExecute += "`Network Year` = '" + inf[5] + "', ";
		toExecute += "`Remarks` = '" + inf[6] + "', ";
		toExecute += "`Scope of work` = '" + inf[7] + "', ";
		toExecute += "`Sponsor Agency` = '" + inf[8]
				+ "', ";
		toExecute += "`State System Road` = '" + inf[9]
				+ "', ";
		toExecute += "`Transit Information` = '"
				+ inf[10] + "', ";
		toExecute += "`area` = '"+inf[11]+"', `approved` = '"+inf[12]+"'";
		
		toExecute += " WHERE idProject = " + inf[0];

		connector.execute(toExecute);
		connector.closeConnection();
	}

	/**
	 * Deletes the entry in the Project table that corresponds to the given
	 * identifier.
	 * 
	 * @requires identifier exists in the Project table.
	 */
	@Override
	public void delete(String identifier) {
		connector.establishConnection();
		if (!connector.exists("SELECT * FROM Project where idProject = "
				+ identifier)) {
			System.out.println("Id doesn't exists in database");
			return;
		}
		connector
				.execute("delete from Project where idProject = " + identifier);
		connector.closeConnection();
	}

}
