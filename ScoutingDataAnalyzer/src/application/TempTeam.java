package application;

import java.util.ArrayList;
import java.util.List;

public class TempTeam {
	private int teamNum;
	private int totalCycles;
	private int totalMatchesPlayed;
	private int totalAmp;
	private int totalSpe;
	private int totalClimb;
	private int totalTrap;
	private List<String> listOfComments;
	
	TempTeam(int tempTeamNum, int tempTotalCycles, int tempTotalMatchesPlayed, int tempTotalAmp, int tempTotalSpe, int tempTotalClimb, int tempTotalTrap, String comment){
		setTotalCycles(tempTotalCycles);
		setTotalMatchesPlayed(tempTotalMatchesPlayed);
		setTotalAmp(tempTotalAmp);
		setTotalSpe(tempTotalSpe);
		setTotalTrap(tempTotalTrap);
		setTotalClimb(tempTotalClimb);
		listOfComments = new ArrayList<>();
		addOnCommentList(comment);
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
	
	public List<String> addOnCommentList(String comment) {
		listOfComments.add(comment);
		return listOfComments;
	}
	
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
	
	public List<String> getCommentList() {
		return listOfComments;
	}
	
	public String toString() {
		return("Total Cycles" + totalCycles +"Total Matches Played" + totalMatchesPlayed +"Total Amp" + totalAmp +"Total Spe" + totalSpe +"Total Trap" + totalTrap +"Total Climb" + totalClimb);
	}
}
