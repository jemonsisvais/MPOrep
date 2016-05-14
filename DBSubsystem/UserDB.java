package DBSubsystem;

/**
 * Implementation for the User table in the database.
 * 
 * @author Jesus Molina.
 */
public class UserDB implements DB {

	/**
	 * Returns all the values for the entry.
	 */
	public String[] getEntry(String username, String password) {
		connector.establishConnection();
		String[] result = connector
				.getRow("select * from Users where Username = " + username
						+ " AND Password = " + password);
		connector.closeConnection();
		return result;
	}

	/**
	 * Inserts a new entry into the User table with the values from the given
	 * User object.
	 * 
	 * @requires o.isInstance(User) == true;
	 */
	@Override
	public void archive(String[] inf) {
		connector.establishConnection();
		String query = "insert into Users values(";
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
	 * Updates an entry from the User table with the values from the given User
	 * object.
	 * 
	 * @requires o.isInstance(User) == true;
	 */
	@Override
	public void update(String[] inf) {
		connector.establishConnection();
		connector
				.execute("update Users set `First Name` = '" + inf[1]
						+ "', `Middle Initial Name` = '" + inf[2]
						+ "', `Last Name` = '" + inf[3]
						+ "', `Organization Name` = '" + inf[4]
						+ "', `Department Name` = '" + inf[5]
						+ "', `Position Title` = '" + inf[6]
						+ "', `Department Contact Number` = '" + inf[7]
						+ "', `Work Contact Number` = '" + inf[8]
						+ "', `Email` = '" + inf[9] + "', `Username` = '"
						+ inf[10] + "', `Password` = '" + inf[11]
						+ "', `approved` = '"+inf[12]+"' where userId = " + inf[0]);
		
		connector.closeConnection();
	}

	/**
	 * Deletes the entry in the User table that corresponds to the given
	 * identifier.
	 * 
	 * @requires identifier exists in the User table.
	 */
	@Override
	public void delete(String identifier) {
		connector.establishConnection();
		connector.execute("delete from Users where userId = " + identifier);
		connector.closeConnection();
	}

	@Override
	public String[] getEntry(int id) {
		connector.establishConnection();
		String[] result = connector.getRow("select * from Users where userId = "
				+ id);
		connector.closeConnection();
		return result;
	}

}
