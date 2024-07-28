package application;

public class DriveTeamData {
	private int teamNum;
	//driver stuff
	private boolean saDrThisTour;
	private boolean saDrPastTour;
	private boolean saDrLastYear;
	private int drHourThisBot;
	private int drHourSameDrTr;
	private int drHourAnyBot;
	//operator stuff
	private String opRole;
	private boolean saOpThisTour;
	private boolean saOpPastTour;
	private boolean saOpLastYear;
	private int opHourThisBot;
	private int opHourAnyBot;
	//drive coach stuff
	private boolean isAdult;
	private String timeDriveCoach;
	//Human Player Stuff
	private int humHoursPracitce;
	
	DriveTeamData(int imTeamNum, boolean imSaDrThisTour, boolean imSaDrPastTour, boolean imSaDrLastYear, int imDrHourThisBot, int imDrHourSameDrTr, int imDrHourAnyBot, String imOpRole, boolean imSaOpThisTour, boolean imSaOpPastTours, boolean imSaOpLastYear, int imOpHourThisBot, int imOpHourAnyBot, boolean imIsAdult, String imTimeDriveCoach, int imHumHoursPracitce) {
		setTeamNum(imTeamNum);
		//driver
		setSaDrThisTour(imSaDrThisTour);
		setSaDrPastTour(imSaDrThisTour);
		setSaDrLastYear(imSaDrThisTour);
		setDrHourThisBot(imDrHourThisBot);
		setDrHourSameDrTr(imDrHourSameDrTr);
		setDrHourAnyBot(imDrHourAnyBot);
		//operator
		setSaOpThisTour(imSaOpThisTour);
		setSaOpPastTour(imSaOpThisTour);
		setSaOpLastYear(imSaOpThisTour);
		setOpHourThisBot(imOpHourThisBot);
		setOpHourAnyBot(imOpHourAnyBot);
		//drive coach
		setIsAdult(imIsAdult);
		setTimeDriveCoach(imTimeDriveCoach);
		//Human player
		setHumHoursPracitce(imHumHoursPracitce);
	}
	
	//set'ers
	public void setTeamNum(int temp) {
		teamNum = temp;
	}
	
	public void setSaDrThisTour(boolean temp) {
		saDrThisTour = temp;
	}
	
	public void setSaDrPastTour(boolean temp) {
		saDrPastTour = temp;
	}
	
	public void setSaDrLastYear(boolean temp) {
		saDrLastYear = temp;
	}
	
	public void setDrHourThisBot(int temp) {
		drHourThisBot = temp;
	}
	
	public void setDrHourSameDrTr(int temp) {
		drHourSameDrTr = temp;
	}
	
	public void setDrHourAnyBot(int temp) {
		drHourAnyBot = temp;
	}
	
	public void setOpRole(String temp) {
		opRole = temp;
	}
	
	public void setSaOpThisTour(boolean temp) {
		saOpThisTour = temp;
	}
	
	public void setSaOpPastTour(boolean temp) {
		saOpPastTour = temp;
	}
	
	public void setSaOpLastYear(boolean temp) {
		saOpLastYear = temp;
	}
	
	public void setOpHourThisBot(int temp) {
		opHourThisBot = temp;
	}
	
	public void setOpHourAnyBot(int temp) {
		opHourAnyBot = temp;
	}
	
	public void setIsAdult(boolean temp) {
		isAdult = temp;
	}
	
	public void setTimeDriveCoach(String temp) {
		timeDriveCoach = temp;
	}
	
	public void setHumHoursPracitce(int temp) {
		humHoursPracitce = temp;
	}
	
	// get'ers
	public int getTeamNum() {
		return teamNum;
	}
	
	public boolean getSaDrThisTour() {
		return saDrThisTour;
	}
	
	public boolean getSaDrPastTour() {
		return saDrPastTour;
	}
	
	public boolean getSaDrLastYear() {
		return saDrLastYear;
	}
	
	public int getDrHourThisBot() {
		return drHourThisBot;
	}
	
	public int getDrHourSameDrTr() {
		return drHourSameDrTr;
	}
	
	public int getDrHourAnyBot() {
		return drHourAnyBot;
	}
	
	public String getOpRole() {
		return opRole;
	}
	
	public boolean getSaOpThisTour() {
		return saOpThisTour;
	}
	
	public boolean getSaOpPastTour() {
		return saOpPastTour;
	}
	
	public boolean getSaOpLastYear() {
		return saOpLastYear;
	}
	
	public int getOpHourThisBot() {
		return opHourThisBot;
	}
	
	public int getOpHourAnyBot() {
		return opHourAnyBot;
	}
	
	public boolean getIsAdult() {
		return isAdult;
	}
	
	public String getTimeDriveCoach() {
		return timeDriveCoach;
	}
	
	public int getHumHoursPracitce() {
		return humHoursPracitce;
	}
}
