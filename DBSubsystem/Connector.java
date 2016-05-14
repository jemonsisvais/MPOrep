package DBSubsystem;

import java.sql.*;

/**
 * Establishes connection to the MPO database and executes queries.
 * 
 * @author Jesus Molina.
 */
class Connector {
	/** Connection to the database. */
	private Connection conn;
	/** Statement to execute queries. */
	private Statement stm;

	/**
	 * Initializes the connection and creates a statement
	 */
	public boolean establishConnection() {
		boolean success = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:MySql://earth.cs.utep.edu/cs4311team3sp16",
					"cs4311team3sp16", "feathersoft");
			stm = conn.createStatement();
			success = true;
		} catch (Exception e) {
			success = false;
//			e.printStackTrace();
		}
		return success;
	}

	public boolean exists(String toExecute){
		boolean result = false;
		try{
			ResultSet resultSet = stm.executeQuery("SELECT EXISTS("+toExecute+")");
			resultSet.next();
			result = resultSet.getBoolean(1);
		}catch (SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Returns the string value of the query provided.
	 * 
	 * @param toExecute
	 *            query to execute.
	 * @return the string value.
	 */
	public String performQuery(String toExecute) {
		String result = null;
		try {
			ResultSet resultSet = stm.executeQuery(toExecute);
			resultSet.next();
			result = resultSet.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Returns whole row of values for the given query.
	 * 
	 * @param toExecute
	 *            the query to execute.
	 * @return the array of string values in the row.
	 */
	public String[] getRow(String toExecute) {
		String result[] = null;
		try {
			ResultSet resultSet = stm.executeQuery(toExecute);
			resultSet.next();
			ResultSetMetaData meta = resultSet.getMetaData();
			int numOfColumns = meta.getColumnCount() - 1;
			result = new String[numOfColumns];

			for (int i = 0; i < numOfColumns; i++) {
//				result[i] = (String) resultSet.getObject(i + 2);
				result[i] = resultSet.getObject(i+2).toString();
			}

		} catch (SQLException e) {
			System.out.println("Invalid Query");
		} catch (NullPointerException ne){
			System.out.println("toExecute was null");
		}
		return result;
	}

	/**
	 * Executes the given query.
	 * 
	 * @param toExecute
	 *            the given query.
	 */
	public void execute(String toExecute) {
		try {
			stm.execute(toExecute);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Closes connection to the database.
	 */
	public boolean closeConnection() {
		boolean success = false;
		try {
			conn.close();
			success = true;
		} catch (SQLException e) {
//			e.printStackTrace();
			success = false;
		}
		return success;
	}
}
