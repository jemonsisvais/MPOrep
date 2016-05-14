package DBSubsystem;

/**
 * Implementation for the Report table in the database.
 * 
 * @author Jesus Molina
 */
public class MTPReportDB implements DB {

	/**
	 * Returns all the values for the entry.
	 */
	public String[] getEntry(int id) {
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from MTPReport where idMTPReport = " + id);
		connector.closeConnection();
		return result;
	}

	public String[] getMTPFederalEntry(int id) {
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from MTPFederal where MTPReport_idMTPReport = "
						+ id);
		connector.closeConnection();
		return result;
	}

	public String[] getMTPLane(int id) {
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from MTPLane where MTPReport_idMTPReport = "
						+ id);
		connector.closeConnection();
		return result;
	}

	public String[] getMTPLocation(int id) {
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from MTPLocation where MTPReport_idMTPReport = "
						+ id);
		connector.closeConnection();
		return result;
	}

	public String[] getMTPGeneralInfo(int id) {
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from MTPGeneralInfo where MTPReport_idMTPReport = "
						+ id);
		connector.closeConnection();
		return result;
	}

	public String[] getAirQualityMTP(int id) {
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from `Air QualityMTP` where MTPReport_idMTPReport = "
						+ id);
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
		if (connector.exists("SELECT * FROM MTPReport where idMTPReport = "
				+ inf[0])) {
			System.out.println("Id already exists in database");
			return;
		}
		String query = "insert into MTPReport values(";
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

		if (!connector.exists("SELECT * FROM MTPReport where idMTPReport = "
				+ inf[0])) {
			System.out.println("Id doesn't exists in database");
			return;
		}
		String toExecute = "UPDATE MTPReport set `remarks` = '" + inf[1]
				+ "', `scopeOfWork` = '" + inf[2] + "', `sponsorAgency` = '"
				+ inf[3] + "', `stateSystemRoad` = '" + inf[4]
				+ "', `TransitInformation` = '" + "' WHERE idMTPReport = "
				+ inf[0];

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
		connector.execute("delete from MTPReport where idMTPReport = "
				+ identifier);
		connector.closeConnection();
	}

}
