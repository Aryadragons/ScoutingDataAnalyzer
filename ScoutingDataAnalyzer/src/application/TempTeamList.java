package application;

import java.util.ArrayList;


public class TempTeamList {
	ArrayList<TempTeam> listOfTempTeams;
	ArrayList<TempTeam> emptyListOfTempTeams;
	TempTeamList() {
		listOfTempTeams = new ArrayList<TempTeam>();
	}
	
	public void addTempTeam(int tempTeamNum, int tempTotalCycles, int tempTotalMatchesPlayed, int tempTotalAmp, int tempTotalSpe, int tempTotalClimb, int tempTotalTrap) {
		TempTeam TempT = new TempTeam(tempTeamNum, tempTotalCycles, tempTotalMatchesPlayed, tempTotalAmp, tempTotalSpe, tempTotalClimb, tempTotalTrap);
		listOfTempTeams.add(TempT);
	}
	
	public void addOnToTempTeam(int teamNum, int tempTotalCycles, int tempTotalMatchesPlayed, int tempTotalAmp, int tempTotalSpe, int tempTotalClimb, int tempTotalTrap) {
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
		listOfTempTeams.get(i).setTotalCycles(tempTotalCycles + storedCycles);
		listOfTempTeams.get(i).setTotalMatchesPlayed(storedMatches + 1);
		listOfTempTeams.get(i).setTotalAmp(tempTotalAmp + storedAmp);
		listOfTempTeams.get(i).setTotalSpe(tempTotalSpe + storedSpe);
		listOfTempTeams.get(i).setTotalTrap(tempTotalTrap + storedTrap);
		listOfTempTeams.get(i).setTotalClimb(tempTotalClimb + storedClimb);
		
	}
	
	public TempTeam getATempTeam(int teamNum) {
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
		return tempTempT;
	}
	
	public void clearTempTeamList() {
		this.listOfTempTeams.clear();
	}
	
}
