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
	private double avgCycles;
	private double avgAmp;
	private double avgSpe;
	private double avgClimb;
	private double avgTrap;
	// comments
	private List<String> listOfComments;
	//human Player stuff
	private double avgHumAmpPostion;
	private double avgHumScoPostion;
	private double avgHumNonePostion;
	private double avgHumScoSkill;
	private double avgHumAmpSkill;
	private double avgHumAmpNotes;
	private int timesHumAmp;
	private int timesHumSco;
	private List<String> listOfHumPostions;
	
	Team(int tempTeamNum, int tempTotalCycles, int tempTotalMatchesPlayed, int tempTotalAmp, int tempTotalSpe, int tempTotalClimb, int tempTotalTrap, List<String> commentList, List<String> tempHumPostionsList, int totalHumScoSkill, int totalHumAmpSkill, int totalHumAmpNotes, int importTimesHumAmp, int importTimesHumSco){
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
		// set er's for comments
		listOfComments = new ArrayList<>();
		addToCommentsList(commentList);
		// set er's for human player stuff
		setTimesHumAmp(importTimesHumAmp);
		setTimesHumSco(importTimesHumSco);
		setAvgHumAmpPostion();
		setAvgHumScoPostion();
		setAvgHumNonePostion();
		setAvgHumScoSkill(totalHumScoSkill);
		setAvgHumAmpSkill(totalHumAmpSkill);
		setAvgHumAmpNotes(totalHumAmpNotes);
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
	public double setAvgCycles(double tempAvgCycles){
		return avgCycles = tempAvgCycles;
	}
	
	public double setAvgAmp(double tempAvgAmp){
		return avgAmp = tempAvgAmp;
	}
	
	public double setAvgSpe(double tempAvgSpe){
		return avgSpe = tempAvgSpe;
	}
	//boop test
	public double setAvgTrap(double tempAvgTrap){
		return avgTrap = tempAvgTrap;
	}
	
	public double setAvgClimb(double tempAvgClimb){
		return avgClimb = tempAvgClimb;
	}
	
	public int setTimesHumAmp(int importedTimesHumAmp) {
		return timesHumAmp = importedTimesHumAmp;
	}
	
	public int setTimesHumSco(int importedTimesHumSco) {
		return timesHumSco = importedTimesHumSco;
	}
	
	public double setAvgHumAmpPostion() {
		return avgHumAmpPostion = (timesHumAmp/totalMatchesPlayed);
	}
	
	public double setAvgHumScoPostion() {
		return avgHumScoPostion = (timesHumSco/totalMatchesPlayed);
	}
	
	public double setAvgHumNonePostion() {
		return avgHumNonePostion = ((totalMatchesPlayed - timesHumAmp - timesHumSco)/totalMatchesPlayed);
	}
	
	public List<String> setHumPostionList(List<String> importedListOfHumPostion){
		listOfHumPostions = importedListOfHumPostion;
		return listOfHumPostions;
	}
	
	public double setAvgHumScoSkill(int tempHumScoSkill) {
		return avgHumScoSkill = (tempHumScoSkill/timesHumSco);
	}
	
	public double setAvgHumAmpSkill(int tempHumAmpSkill) {
		return avgHumAmpSkill = (tempHumAmpSkill/timesHumAmp);
	}
	
	public double setAvgHumAmpNotes(int tempHumAmpNotes) {
		return avgHumAmpNotes = (tempHumAmpNotes/timesHumAmp);
	}
	
	public void addToCommentsList(List<String> commentList) {
		for (int i = 0; i < commentList.size(); i++) {
			listOfComments.add(commentList.get(i));
		}
	}
	//clear list er's
	public void clearCommentsList(){
		listOfComments.clear();
	}
	
	public void clearHumPostionList(){
		listOfComments.clear();
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
	public double getAvgCycles() {
		return avgCycles;
	}
	
	public double getAvgAmp() {
		return avgAmp;
	}
	
	public double getAvgSpe() {
		return avgSpe;
	}
	
	public double getAvgTrap() {
		return avgTrap;
	}
	
	public double getAvgClimb() {
		return avgClimb;
	}
	
	public List<String> getCommentsList() {
		return listOfComments;
	}
	
	public List<String> getHumanPostionList() {
		return listOfHumPostions;
	}
	
	public double getAvgHumAmpPostion() {
		return avgHumAmpPostion;
	}
	
	public double getAvgHumScoPostion() {
		return avgHumScoPostion;
	}
	
	public double getAvgHumNonePostion() {
		return avgHumNonePostion;
	}
	
	public double getHumAmpSkill() {
		return avgHumAmpSkill;
	}
	
	public double getHumScoSkill() {
		return avgHumScoSkill;
	}
	
	public double getHumAmpNotes() {
		return avgHumAmpNotes;
	}
	
	public int getTimesHumAmp() {
		return timesHumAmp;
	}
	
	public int getTimesHumSco() {
		return timesHumSco;
	}
	
	public String toString() {
		return("Avg Cycles" + avgCycles + "Avg Amp" + avgAmp +"Avg Spe" + avgSpe +"Avg Trap" + avgTrap +"Avg Climb" + avgClimb);
	}
}
