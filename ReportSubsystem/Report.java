package ReportSubsystem;

import ProjectSubsystem.Project;

public interface Report {
	public void generateXLXS(Project p, String filename);
	public void archive();
	public void delete();
	public void update();
}
