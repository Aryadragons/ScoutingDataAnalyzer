package application;

public class DriveTeamComments {
	private int teamNum;
	private int match;
	private int yellLevel;
	private int controlLevel;
	private int physicalLevel;
	private int discrimLevel;
	private String discrimType;
	private int otherBLevel;
	private int totalBLevel;
	private int funLevel;
	private int strategyLevel;
	private int otherGLevel;
	private String comments;
	
	DriveTeamComments(int imTeamNum, int imMatch, int imYellLevel, int imControlLevel, int imPhysical, int imDiscrimLevel, String imDiscrimType, int imOtherBLevel, int imTotalBLevel, int imFunLevel, int imStrategyLevel, int imOtherGLevel, String Comments){
		setTeamNum(imTeamNum);
		setMatch(imMatch);
		setYellLevel(imYellLevel);
		setControlLevel(imControlLevel);
		setPhysicalLevel(imPhysical);
		setDiscrimLevel(imDiscrimLevel);
		setDiscrimType(imDiscrimType);
		setOtherBLevel(imOtherBLevel);
		setTotalBLevel(imTotalBLevel);
		setFunLevel(imFunLevel);
		setStrategyLevel(imStrategyLevel);
		setOtherGLevel(imOtherGLevel);
		setComments(Comments);
	}
	
	//set'ers
	public void setTeamNum(int temp) {
		teamNum = temp;
	}
	
	public void setMatch(int temp) {
		match = temp;
	}
	
	public void setYellLevel(int temp) {
		yellLevel = temp;
	}
	
	public void setControlLevel(int temp) {
		controlLevel = temp;
	}
	
	public void setPhysicalLevel(int temp) {
		physicalLevel = temp;
	}
	
	public void setDiscrimLevel(int temp) {
		discrimLevel = temp;
	}
	
	public void setDiscrimType(String temp) {
		discrimType = temp;
	}
	
	public void setOtherBLevel(int temp) {
		otherBLevel = temp;
	}
	
	public void setTotalBLevel(int temp) {
		totalBLevel = temp;
	}
	
	public void setFunLevel(int temp) {
		funLevel = temp;
	}
	
	public void setStrategyLevel(int temp) {
		strategyLevel = temp;
	}
	
	public void setOtherGLevel(int temp) {
		otherGLevel = temp;
	}
	
	public void setComments(String temp) {
		comments = temp;
	}
	
	//get'ers
	public int getTeamNum() {
		return teamNum;
	}
	
	public int getMatch() {
		return match;
	}
	
	public int getYellLevel() {
		return yellLevel;
	}
	
	public int getControlLevel() {
		return controlLevel;
	}
	
	public int getPhysicalLevel() {
		return physicalLevel;
	}
	
	public int getDiscrimLevel() {
		return discrimLevel;
	}
	
	public String getDisCrimType() {
		return discrimType;
	}
	
	public int getOtherBLevel() {
		return otherBLevel;
	}
	
	public int gettotalBLevel() {
		return totalBLevel;
	}
	
	public int getFunLevel() {
		return funLevel;
	}
	
	public int getStrategyLevel() {
		return strategyLevel;
	}
	
	public int getOtherGLevel() {
		return otherGLevel;
	}
	
	public String getComments() {
		return comments;
	}
}
