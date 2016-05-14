package DBSubsystem;

/**
 * Interface to enforce behavior on database subclasses that will perform
 * specific queries depending their duties.
 * 
 * @author Jesus Molina
 */
interface DB {
	/** Connection needed for all subclasses. */
	Connector connector = new Connector();

	/** Retrieves all the column values for the entry with the given id. */
	public String[] getEntry(int id);

	/** Inserts a new entry with the object specific fields to the database. */
	public void archive(String[] inf);

	/** Updates a row in the database with specifics from the object. */
	public void update(String[] inf);

	/** Deletes a row in the database corresponding to the identifier provided. */
	public void delete(String identifier);

}
