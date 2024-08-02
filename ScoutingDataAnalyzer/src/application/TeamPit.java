package application;

public class TeamPit {
	// general info
	private int teamNum;
	private String teamName;
	private int numOfStud;
	private int numOfMent;
	private int numOfRobotBat;
	// Programming info
	private String programLan;
	private String doHaveVis;
	private int numOfVisCam;
	private int numOfDriverCams;
	//Drivetrain data
	private String drTrType;
	private String swevType;
	private String swevGearing;
	private String drTrMotorType;
	private AutoList theAutoList;
	// 
	public TeamPit(int imTeamNum, String imTeamName, int imNumOfStud, int imNumOfMent, int imNumOfRobotBat, String imProgramLan, String imDoHaveVis, int imNumOfVisCam, int imNumOfDriverCams, String imDrTrType, String imSwevType, String imSwevGearing, String imDrTrMotorType, AutoList imTheAutoList) {
		setTeamNum(imTeamNum);
		setTeamName(imTeamName);
		setNumOfStud(imNumOfStud);
		setNumOfMent(imNumOfMent);
		setNumOfRobotBat(imNumOfRobotBat);
		setProgramLan(imProgramLan);
		setDoHaveVis(imDoHaveVis);
		setNumOfVisCam(imNumOfVisCam);
		setNumOfDriverCams(imNumOfDriverCams);
		setDrTrType(imDrTrType);
		setSwevType(imSwevType);
		setSwevGearing(imSwevGearing);
		setDrTrMotorType(imDrTrMotorType);
		setTheAutoList(imTheAutoList);
	}
	
	//Set'ers
	public void setTeamNum(int imTeamNum) {
		teamNum = imTeamNum;
	}
	
	public void setTeamName(String imTeamName) {
		teamName = imTeamName;
	}
	
	public void setNumOfStud(int imNumOfStud) {
		numOfStud = imNumOfStud;
	}
	
	public void setNumOfMent(int imNumOfMent) {
		numOfMent = imNumOfMent;
	}
	
	public void setNumOfRobotBat(int imNumOfRobotBat) {
		numOfRobotBat = imNumOfRobotBat;
	}
	
	public void setProgramLan(String imProgramLan) {
		programLan = imProgramLan;
	}
	
	public void setDoHaveVis(String imDoHaveVis) {
		doHaveVis = imDoHaveVis;
	}
	
	public void setNumOfVisCam(int imNumOfVisCam) {
		numOfVisCam = imNumOfVisCam;
	}
	
	public void setNumOfDriverCams(int imNumOfDriverCams) {
		numOfDriverCams = imNumOfDriverCams;
	}
	
	public void setDrTrType(String imDrTrType) {
		drTrType = imDrTrType;
	}
	
	public void setSwevType(String imSwevType) {
		swevType = imSwevType;
	}
	
	public void setSwevGearing(String imSwevGearing) {
		swevGearing = imSwevGearing;
	}
	
	public void setDrTrMotorType(String imDrTrMotorType) {
		drTrMotorType = imDrTrMotorType;
	}
	
	public void setTheAutoList(AutoList temp) {
		theAutoList = temp;
	}
	
	// get'ers
	public int getTeamNum() {
		return teamNum;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public int getNumOfStud() {
		return numOfStud;
	}
	
	public int getNumOfMent() {
		return numOfMent;
	}
	
	public int getNumOfRobotBat() {
		return numOfRobotBat;
	}
	
	public String getProgramLan() {
		return programLan;
	}
	
	public String getDoHaveVis() {
		return doHaveVis;
	}
	
	public int getNumOfVisCam() {
		return numOfVisCam;
	}
	
	public int getNumOfDriverCams() {
		return numOfDriverCams;
	}
	
	public String getDrTrType() {
		return drTrType;
	}
	
	public String getSwevType() {
		return swevType;
	}
	
	public String getSwevGearing() {
		return swevGearing;
	}
	
	public String getDrTrMotorType() {
		return drTrMotorType;
	}
	
	public AutoList getTheAutoList() {
		return theAutoList;
	}
}
