abstract class Issue {
	private final int ID;

	protected Issue(int ID) {
		this.ID = ID;
	}
	
	public int getID() {
		return ID;
	}
}

class BugReport extends Issue {

	public BugReport(int ID) {
		super(ID);
	}
}

class FeatureRequest extends Issue {

	public FeatureRequest(int ID) {
		super(ID);
	}
}

class MaintenanceTask extends Issue {

	public MaintenanceTask(int ID) {
		super(ID);
	}
}

class TrackingSystem {
	
	public static int numberOfBugReports(Issue[] issues) {
		int n = 0;
		for (int i = 0; i < issues.length; i++) 
			if (issues[i] instanceof BugReport)
				n++;
		return n;
	}
	
	public static int numberOfFeatureRequests(Issue[] issues) {
		int n = 0;
		for (int i = 0; i < issues.length; i++) 
			if (issues[i] instanceof FeatureRequest)
				n++;
		return n;
	}
	
	public static int numberOfMaintenanceTasks(Issue[] issues) {
		int n = 0;
		for (int i = 0; i < issues.length; i++) 
			if (issues[i] instanceof MaintenanceTask)
				n++;
		return n;
	}
	
	public static int mostRecentIssue(Issue[] issues) {
		int max = 0;
		for (int i = 0; i < issues.length; i++) {
			int id = issues[i].getID();
			if (id > max)
				max = id;
		}
		return max;
	}
}
