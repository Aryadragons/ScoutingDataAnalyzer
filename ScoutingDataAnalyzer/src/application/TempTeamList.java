package application;

import java.util.ArrayList;


public class TempTeamList {
	ArrayList<TempTeam> listOfTempTeams;
	ArrayList<TempTeam> emptyListOfTempTeams;
	TempTeamList() {
		listOfTempTeams = new ArrayList<TempTeam>();
	}
	
	public void addTempTeam(int tempTeamNum, int tempTotalCycles, int tempTotalMatchesPlayed, int tempTotalAmp, int tempTotalSpe, int tempTotalTrap, int tempTotalClimb, String comment, String tempHumPostion, int tempHumAmpSkill, int tempHumScoSkill, int tempHumAmpNotes) {
		System.out.println("boop4");
		TempTeam TempT = new TempTeam(tempTeamNum, tempTotalCycles, tempTotalMatchesPlayed, tempTotalAmp, tempTotalSpe, tempTotalClimb, tempTotalTrap, comment, tempHumPostion, tempHumAmpSkill, tempHumScoSkill, tempHumAmpNotes);
		listOfTempTeams.add(TempT);
	}
	
	public void addOnToTempTeam(int teamNum, int tempTotalCycles, int tempTotalMatchesPlayed, int tempTotalAmp, int tempTotalSpe, int tempTotalClimb, int tempTotalTrap, String comment, String tempHumPostion, int tempHumAmpSkill, int tempHumScoSkill, int tempHumAmpNotes) {
		int found = 0;
		int theTempTeam = -1;
		int tempsSearched = 0;
		int i = 0;
		TempTeam tempTempT;
		tempTempT = listOfTempTeams.get(i);
		while(found < 1) {
			tempTempT = listOfTempTeams.get(i);
			if(tempTempT.getTeamNum() == teamNum) {
				found = 1;
				theTempTeam = i;
			} else {
				i++;
				tempsSearched++;
			}
		}
		int storedCycles = tempTempT.getTotalCycles();
		int storedMatches = tempTempT.getTotalMatchesPlayed();
		int storedAmp = tempTempT.getTotalAmp();
		int storedSpe = tempTempT.getTotalSpe();
		int storedTrap = tempTempT.getTotalTrap();
		int storedClimb = tempTempT.getTotalClimb();
		int storedHumAmpSkill = tempTempT.getHumAmpSkill();
		int storedHumScoSkill = tempTempT.getHumScoSkill();
		int storedHumAmpNotes = tempTempT.getHumAmpNotes();
		listOfTempTeams.get(i).setTotalCycles(tempTotalCycles + storedCycles);
		listOfTempTeams.get(i).setTotalMatchesPlayed(storedMatches + 1);
		listOfTempTeams.get(i).setTotalAmp(tempTotalAmp + storedAmp);
		listOfTempTeams.get(i).setTotalSpe(tempTotalSpe + storedSpe);
		listOfTempTeams.get(i).setTotalTrap(tempTotalTrap + storedTrap);
		listOfTempTeams.get(i).setTotalClimb(tempTotalClimb + storedClimb);
		listOfTempTeams.get(i).addOnCommentList(comment);
		listOfTempTeams.get(i).setHumPostion(tempHumPostion);
		listOfTempTeams.get(i).setHumAmpSkill(tempHumAmpSkill + storedHumAmpSkill);
		listOfTempTeams.get(i).setHumScoSkill(tempHumScoSkill + storedHumScoSkill);
		listOfTempTeams.get(i).setTotalHumAmpNotes(tempHumAmpNotes + storedHumAmpNotes);
	}
	
	public TempTeam getATempTeam(int teamNum, TempTeamList theList) {
		int found = 0;
		int theTempTeam = -1;
		int tempsSearched = 0;
		int i = 0;
		TempTeam tempTempT;
		int boop = theList.listOfTempTeams.get(i).getTeamNum();
		tempTempT = theList.listOfTempTeams.get(i);
		while(found < 1 & i < theList.listOfTempTeams.size()) {
			tempTempT = theList.listOfTempTeams.get(i);
			if(tempTempT.getTeamNum() == teamNum) {
				found = 1;
				theTempTeam = i;
			} else {
				i++;
				tempsSearched++;
			}
		}
		if (found == 0) {
			return null;
		} else {
			return tempTempT;
		}
	}
	
	public void clearTempTeamList() {
		this.listOfTempTeams.clear();
	}
	
}
