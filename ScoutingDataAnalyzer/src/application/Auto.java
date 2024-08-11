package application;

public class Auto {
	private int teamNum;
	private int autoStartPos;
	private int totalControl;
	private int totalSpecker;
	private int totalAmp;
	private int numCenNotes;
	private int timesUsed = 0;
	private int totalMadeInSpe;
	private int totalMadeInAmp;
	private int totalControled;
	private double avgSpe;
	private double avgAmp;
	private double avgControl;
	
	Auto(){
		
	}
	
	Auto(int imTeamNum, int imAutoStartPos, int imTotalControl, int imTotalSpecker, int imTotalAmp, int imNumCenNotes){
		setTeamNum(imTeamNum);
		setAutoStartPos(imAutoStartPos);
		setTotalControl(imTotalControl);
		setTotalSpecker(imTotalSpecker);
		setTotalAmp(imTotalAmp);
		setNumCenNotes(imNumCenNotes);
	}
	
	Auto(int imTeamNum, int imAutoStartPos, int imTotalControl, int imTotalSpecker, int imTotalAmp, int imNumCenNotes, int imTimesUsed, int imTotalMadeInSpe, int imTotalMadeInAmp, int imTotalControled, double imAvgSpe, double imAvgAmp, double imAvgControl){
		setTeamNum(imTeamNum);
		setAutoStartPos(imAutoStartPos);
		setTotalControl(imTotalControl);
		setTotalSpecker(imTotalSpecker);
		setTotalAmp(imTotalAmp);
		setNumCenNotes(imNumCenNotes);
		setTimesUsed(imTimesUsed);
		setTotalMadeInSpe(imTotalMadeInSpe);
		setTotalMadeInAmp(imTotalMadeInAmp);
		setTotalControled(imTotalControled);
		setAvgSpe(imAvgSpe);
		setAvgAmp(imAvgAmp);
		setAvgControl(imAvgControl);
	}
	
	public void submitAnUse(int imTotalMadeInSpe, int imTotalMadeInAmp, int imTotalControled){
		if(timesUsed == 0) {
			setTimesUsed(1);
			setTotalMadeInSpe(imTotalMadeInSpe);
			setTotalMadeInAmp(imTotalMadeInAmp);
			setTotalControled(imTotalControled);
			setAvgSpe(imTotalMadeInSpe);
			setAvgAmp(imTotalMadeInAmp);
			setAvgControl(imTotalControled);
		} else {
			setTimesUsed(getTimesUsed() + 1);
			setTotalMadeInSpe(getTotalMadeInSpe() + imTotalMadeInSpe);
			setTotalMadeInAmp(getTotalMadeInAmp() + imTotalMadeInAmp);
			setTotalControled(getTotalControled() + imTotalControled);
			setAvgSpe(getTotalMadeInSpe()/ getTimesUsed());
			setAvgAmp(getTotalMadeInAmp()/ getTimesUsed());
			setAvgControl(getTotalControled()/ getTimesUsed());
		}
	}
	
	//set'ers
	public int setTeamNum(int tempTeamNum){
		return teamNum = tempTeamNum;
	}
	
	public void setAutoStartPos(int temp) {
		autoStartPos = temp;
	}
	
	public void setTotalControl(int temp) {
		totalControl = temp;
	}
	
	public void setTotalSpecker(int temp) {
		totalSpecker = temp;
	}
	
	public void setTotalAmp(int temp) {
		totalAmp = temp;
	}
	
	public void setNumCenNotes(int temp) {
		numCenNotes = temp;
	}
	
	public void setTimesUsed(int temp) {
		timesUsed = temp;
	}
	
	public void setTotalMadeInSpe(int temp) {
		totalMadeInSpe = temp;
	}
	
	public void setTotalMadeInAmp(int temp) {
		totalMadeInAmp = temp;
	}
	
	public void setTotalControled(int temp) {
		totalControled = temp;
	}
	
	public void setAvgSpe(double temp) {
		avgSpe = temp;
	}
	
	public void setAvgAmp(double temp) {
		avgAmp = temp;
	}
	
	public void setAvgControl(double temp) {
		avgControl = temp;
	}
	
	
	
	//get'ers
	public int getTeamNum() {
		return teamNum;
	}
	
	public int getAutoStartPos() {
		return autoStartPos;
	}
	
	public int getTotalControl() {
		return totalControl;
	}
	
	public int getTotalSpecker() {
		return totalSpecker;
	}
	
	public int getTotalAmp() {
		return totalAmp;
	}
	
	public int getNumCenNotes() {
		return numCenNotes;
	}
	
	public int getTimesUsed() {
		return timesUsed;
	}
	
	public int getTotalMadeInSpe() {
		return totalMadeInSpe;
	}
	
	public int getTotalMadeInAmp() {
		return totalMadeInAmp;
	}
	
	public int getTotalControled() {
		return totalControled;
	}
	
	public double getAvgSpe() {
		return avgSpe;
	}
	
	public double getAvgAmp() {
		return avgAmp;
	}
	
	public double getAvgControl() {
		return avgControl;
	}
	
	public String toString() {
		String S = Integer.toString(teamNum) + timesUsed;
		return S;
	}
}
