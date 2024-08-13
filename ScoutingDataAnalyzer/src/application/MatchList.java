package application;

import java.util.ArrayList;
import java.util.List;

public class MatchList {
	
	ArrayList<Match> listOfMatches;
		
	MatchList() {
		listOfMatches = new ArrayList<Match>();
	}
	
	public void addMatch(int tempTeamNum, int tempMatchNum, int tempAmp, int tempSpe, int tempTrap, int tempClimb, String tempHumPos, int tempAmpSkill, int tempScoSkill, int tempAmpNotes, String tempComment, AutoAttempt imAutoList, Boolean imAllColor, Boolean imIsPrac){
		Match M = new Match(tempTeamNum, tempMatchNum, tempAmp, tempSpe, tempTrap, tempClimb, tempHumPos, tempAmpSkill, tempScoSkill, tempAmpNotes, tempComment, imAutoList, imAllColor, imIsPrac);
		listOfMatches.add(M);
	}
	
	public void addPreMadeMatch(Match tempMatch) {
		listOfMatches.add(tempMatch);
	}
	
	public Match getAMatch(int MatchNum) {
		int found = 0;
		int i = 0;
		int size = listOfMatches.size();
		while(found == 0 & i < size) {
			Match tempM = listOfMatches.get(i);
			if (tempM.getMatchNum() == MatchNum) {
				found = 1;
				return tempM;
			} else {
				i++;
			}
		}
		return null;
	}
	
	public List<Match> getMatchFromFullList(int matchNum){
		List<Match> teamsInThisMatch  = new ArrayList<>();
		int found = 0;
		for(int i = 0; i <listOfMatches.size(); i++) {
			Match tempM = listOfMatches.get(i);
			if (tempM.getMatchNum() == matchNum) {
				teamsInThisMatch.add(tempM);
				found = 1;
			}
		}
		if(found == 1) {
			return teamsInThisMatch;
		}else {
			return null;
		}
		
	}
}
