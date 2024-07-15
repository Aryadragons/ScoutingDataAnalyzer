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
	private String humPostion;
	private int humScoSkill;
	private int humAmpSkill;
	private int totalHumAmpNotes;
	private int timesHumAmp;
	private int timesHumSco;
	private List<String> listOfHumPostions;
	
	TempTeam(int tempTeamNum, int tempTotalCycles, int tempTotalMatchesPlayed, int tempTotalAmp, int tempTotalSpe, int tempTotalClimb, int tempTotalTrap, String comment, String tempHumPostion, int tempHumAmpSkill, int tempHumScoSkill, int tempHumAmpNotes){
		setTeamNum(tempTeamNum);
		setTotalCycles(tempTotalCycles);
		setTotalMatchesPlayed(tempTotalMatchesPlayed);
		setTotalAmp(tempTotalAmp);
		setTotalSpe(tempTotalSpe);
		setTotalTrap(tempTotalTrap);
		setTotalClimb(tempTotalClimb);
		listOfComments = new ArrayList<>();
		addOnCommentList(comment);
		setHumPostion(tempHumPostion);
		if (humPostion.compareTo("Amp") == 0) {
			timesHumAmp++;
			setHumAmpSkill(tempHumAmpSkill);
			setTotalHumAmpNotes(tempHumAmpNotes);
		}
		if (humPostion.compareTo("Scoure") == 0) {
			timesHumSco++;
			setHumScoSkill(tempHumScoSkill);
		}
	}
	
	public String setHumPostion(String tempHumanPostion) {
		return humPostion = tempHumanPostion;
	}
	
	public List<String> setHumPostionList(){
		listOfHumPostions.add(humPostion);
		return listOfHumPostions;
	}
	
	public int setHumScoSkill(int tempHumScoSkill) {
		return humScoSkill = tempHumScoSkill;
	}
	
	public int setHumAmpSkill(int tempHumAmpSkill) {
		return humAmpSkill = tempHumAmpSkill;
	}
	
	public int setTotalHumAmpNotes(int tempHumAmpNotes) {
		return totalHumAmpNotes = tempHumAmpNotes;
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
	
	public List<String> addOnHumPostionsList(String postion){
		listOfHumPostions.add(postion);
		return listOfHumPostions;
	}
	
	public void clearCommentsList(){
		listOfComments.clear();
	}
	
	public void clearHumPostionList(){
		listOfComments.clear();
	}
	
	public String getHumPostion() {
		return humPostion;
	}
	
	public List<String> getHumanPostionList() {
		return listOfHumPostions;
	}
	
	public int getHumAmpSkill() {
		return humAmpSkill;
	}
	
	public int getHumScoSkill() {
		return humScoSkill;
	}
	
	public int getHumAmpNotes() {
		return totalHumAmpNotes;
	}
	
	public int getTimesHumAmp() {
		return timesHumAmp;
	}
	
	public int getTimesHumSco() {
		return timesHumSco;
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
		return( "teamNum" + teamNum +"Total Cycles" + totalCycles +"Total Matches Played" + totalMatchesPlayed +"Total Amp" + totalAmp +"Total Spe" + totalSpe +"Total Trap" + totalTrap +"Total Climb" + totalClimb);
	}
}
