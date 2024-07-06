package application;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private int teamNum;
	private int totalCycles;
	private int totalMatchesPlayed;
	private int totalAmp;
	private int totalSpe;
	private int totalClimb;
	private int totalTrap;
	//avg stuff
	private int avgCycles;
	private int avgAmp;
	private int avgSpe;
	private int avgClimb;
	private int avgTrap;
	// comments
	private List<String> listOfComments;
	Team(int tempTeamNum, int tempTotalCycles, int tempTotalMatchesPlayed, int tempTotalAmp, int tempTotalSpe, int tempTotalClimb, int tempTotalTrap, List<String> commentList){
		setTeamNum(tempTeamNum);
		setTotalCycles(tempTotalCycles);
		setTotalMatchesPlayed(tempTotalMatchesPlayed);
		setTotalAmp(tempTotalAmp);
		setTotalSpe(tempTotalSpe);
		setTotalTrap(tempTotalTrap);
		setTotalClimb(tempTotalClimb);
		// set er's for avg
		setAvgCycles(tempTotalCycles/totalMatchesPlayed);
		setAvgAmp(tempTotalAmp/totalMatchesPlayed);
		setAvgSpe(tempTotalSpe/totalMatchesPlayed);
		setAvgTrap(tempTotalTrap/totalMatchesPlayed);
		setAvgClimb(tempTotalClimb/totalMatchesPlayed);
		listOfComments = new ArrayList<>();
		addToCommentsList(commentList);
	}
	
	public int setTeamNum(int tempTeamNum){
		return teamNum = tempTeamNum;
	}
	
	public int setTotalCycles(int tempTotalCycles){
		return totalCycles = tempTotalCycles;
	}
	
	public int setTotalMatchesPlayed(int tempTotalMatchesPlayed){
		return totalMatchesPlayed = tempTotalMatchesPlayed;
	}
	
	public int setTotalAmp(int tempTotalAmp){
		return totalAmp = tempTotalAmp;
	}
	
	public int setTotalSpe(int tempTotalSpe){
		return totalSpe = tempTotalSpe;
	}
	
	public int setTotalTrap(int tempTotalTrap){
		return totalTrap = tempTotalTrap;
	}
	
	public int setTotalClimb(int tempTotalClimb){
		return totalClimb = tempTotalClimb;
	}
	//set er's for avg
	public int setAvgCycles(int tempAvgCycles){
		return avgCycles = tempAvgCycles;
	}
	
	public int setAvgAmp(int tempAvgAmp){
		return avgAmp = tempAvgAmp;
	}
	
	public int setAvgSpe(int tempAvgSpe){
		return avgSpe = tempAvgSpe;
	}
	//boop test
	public int setAvgTrap(int tempAvgTrap){
		return avgTrap = tempAvgTrap;
	}
	
	public int setAvgClimb(int tempAvgClimb){
		return avgClimb = tempAvgClimb;
	}
	
	public void addToCommentsList(List<String> commentList) {
		for (int i = 0; i < commentList.size(); i++) {
			listOfComments.add(commentList.get(i));
		}
	}
	//get er's for total
	public int getTeamNum() {
		return teamNum;
	}
	public int getTotalCycles() {
		return totalCycles;
	}
	public int getTotalMatchesPlayed() {
		return totalMatchesPlayed;
	}
	
	public int getTotalAmp() {
		return totalAmp;
	}
	
	public int getTotalSpe() {
		return totalSpe;
	}
	
	public int getTotalTrap() {
		return totalTrap;
	}
	
	public int getTotalClimb() {
		return totalClimb;
	}
	//get er's for avg
	public int getAvgCycles() {
		return avgCycles;
	}
	
	public int getAvgAmp() {
		return avgAmp;
	}
	
	public int getAvgSpe() {
		return avgSpe;
	}
	
	public int getAvgTrap() {
		return avgTrap;
	}
	
	public int getAvgClimb() {
		return avgClimb;
	}
	
	public List<String> getCommentsList() {
		return listOfComments;
	}
	public String toString() {
		return("Avg Cycles" + avgCycles + "Avg Amp" + avgAmp +"Avg Spe" + avgSpe +"Avg Trap" + avgTrap +"Avg Climb" + avgClimb);
	}
}
