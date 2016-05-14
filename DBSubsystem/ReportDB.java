package DBSubsystem;

/**
 * Implementation for the Report table in the database.
 * 
 * @author Jesus Molina
 */
public class ReportDB implements DB {

	/**
	 * Returns all the values for the entry.
	 */
	public String[] getEntry(int id) {
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from TIPReport where idTIPReport = " + id);
		connector.closeConnection();
		return result;
	}
	
	public String[] getTIPFederalEntry(int id){
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from TIPFederal where TIPReport_idTIPReport = " + id);
		connector.closeConnection();
		return result;
	}
	
	public String[] getTIPLane(int id){
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from TIPLane where TIPReport_idTIPReport = " + id);
		connector.closeConnection();
		return result;
	}
	
	public String[] getTIPLocation(int id){
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from TIPLocation where TIPReport_idTIPReport = " + id);
		connector.closeConnection();
		return result;
	}
	public String[] getTIPGeneralInfo(int id){
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from TIPGeneralInfo where TIPReport_idTIPReport = " + id);
		connector.closeConnection();
		return result;
	}
	
	

	/**
	 * Inserts a new entry into the Report table with the values from the given
	 * Report object.
	 * 
	 * @requires o.isInstance(Report) == true;
	 */
	@Override
	public void archive(String[] inf) {
		connector.establishConnection();
		if (connector.exists("SELECT * FROM TIPReport where idTIPReport = "
				+ inf[0])) {
			System.out.println("Id already exists in database");
			return;
		}
		String query = "insert into TIPReport values(";
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
	 * Updates an entry from the Report table with the values from the given
	 * Report object.
	 * 
	 * @requires o.isInstance(Report) == true;
	 */
	@Override
	public void update(String[] inf) {
		connector.establishConnection();

		if (!connector.exists("SELECT * FROM TIPReport where idTIPReport = "
				+ inf[0])) {
			System.out.println("Id doesn't exists in database");
			return;
		}
		String toExecute = "UPDATE TIPReport set `capacityProject` = '"
				+ inf[1] + "', ";
		toExecute += "`FundProjectId` = '" + inf[2] + "', ";
		toExecute += "`FundProjectType` = '" + inf[3] + "', ";
		toExecute += "`Highway/Roadway Name` = '" + inf[4] + "', ";
		toExecute += "`NetworkYear` = '" + inf[5] + "', ";
		toExecute += "`ProjectId` = '" + inf[6] + "', ";
		toExecute += "`TIPProjectName` = '" + inf[7] + "', ";
		toExecute += "`Remarks` = '" + inf[8] + "', ";
		toExecute += "`SponsorAgency` = '" + inf[9] + "', ";
		toExecute += "`TransitInformation` = '" + inf[10] + "', ";
		toExecute += "`ProjectCost` = '" + inf[11] + "', `ProjectFunding` = '"
				+ inf[12]+"' WHERE idTIPReport = " + inf[0];

		connector.execute(toExecute);
		connector.closeConnection();

	}

	/**
	 * Deletes the entry in the Report table that corresponds to the given
	 * identifier.
	 * 
	 * @requires identifier exists in the Report table.
	 */
	@Override
	public void delete(String identifier) {
		connector.establishConnection();
		connector.execute("delete from TIPReport where idTIPReport = " + identifier);
		connector.closeConnection();
	}

}
