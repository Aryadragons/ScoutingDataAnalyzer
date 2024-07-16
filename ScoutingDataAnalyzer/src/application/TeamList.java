package application;

import java.util.ArrayList;
import java.util.List;

public class TeamList {
	
	ArrayList<Team> listOfTeams;
	
	TeamList() {
		listOfTeams = new ArrayList<Team>();
	}
	
	public void addTempTeam(int tempTeamNum, int tempTotalCycles, int tempTotalMatchesPlayed, int tempTotalAmp, int tempTotalSpe, int tempTotalTrap, int tempTotalClimb, List<String> commentList, List<String> tempHumPostionsList, int tempHumAmpSkill, int tempHumScoSkill, int tempHumAmpNotes, int importTimesHumAmp, int importTimesHumSco) {
		Team T = new Team(tempTeamNum, tempTotalCycles, tempTotalMatchesPlayed, tempTotalAmp, tempTotalSpe, tempTotalClimb, tempTotalTrap, commentList, tempHumPostionsList, tempHumAmpSkill, tempHumScoSkill, tempHumAmpNotes, importTimesHumAmp, importTimesHumSco);
		listOfTeams.add(T);
	}
	
	public void addTempTeamInMain(int tempTeamNum, double tempAvgCycles, int tempTotalMatchesPlayed, double tempAvgAmp, double tempAvgSpe, double tempAvgTrap, double tempAvgClimb, List<String> commentList, List<String> tempHumPostionsList, double tempHumAmpSkill, double tempHumScoSkill, double tempHumAmpNotes, int importTimesHumAmp, int importTimesHumSco) {
		Team T = new Team();
		T.setTeamInMain(tempTeamNum, tempAvgCycles, tempTotalMatchesPlayed, tempAvgAmp, tempAvgSpe, tempAvgClimb, tempAvgTrap, commentList, tempHumPostionsList, tempHumAmpSkill, tempHumScoSkill, tempHumAmpNotes, importTimesHumAmp, importTimesHumSco);
		listOfTeams.add(T);
	}
	
	public Team getATeam(int teamNum) {
		int found = 0;
		int theTeam = -1;
		int teamsSearched = 0;
		int i = 0;
		Team tempT;
		tempT = listOfTeams.get(i);
		while(found < 1) {
			tempT = listOfTeams.get(i);
			if(tempT.getTeamNum() == teamNum) {
				found = 1;
				theTeam = i;
			} else {
				i++;
				teamsSearched++;
			}
		}
		return tempT;
	}
}
