package application;

public class Match {
	private int matchTeamNum;
	private int matchNum;
	private int matchAmp;
	private int matchSpe;
	private int matchTrap;
	private int matchClimb;
	private String matchHumPos;
	private int matchAmpSkill;
	private int matchScoSkill;
	private int matchAmpNotes;
	private String matchComment;
	
	//constructor
	public Match(int tempTeamNum, int tempMatchNum, int tempAmp, int tempSpe, int tempTrap, int tempClimb, String tempHumPos, int tempAmpSkill, int tempScoSkill, int tempAmpNotes, String tempComment) {
		setMatchTeamNum(tempTeamNum);
		setMatchNum(tempMatchNum);
		setMatchAmp(tempAmp);
		setMatchSpe(tempSpe);
		setMatchTrap(tempTrap);
		setMatchClimb(tempClimb);
		setMatchHumPos(tempHumPos);
		setMatchAmpSkill(tempAmpSkill);
		setMatchScoSkill(tempScoSkill);
		setMatchAmpNotes(tempAmpNotes);
		setMatchComment(tempComment);
	}
	
	//setters
	public void setMatchTeamNum(int tempVaule) {
		matchTeamNum = tempVaule;
	}
	
	public void setMatchNum(int tempVaule) {
		matchNum = tempVaule;
	}
	
	public void setMatchAmp(int tempVaule) {
		matchAmp = tempVaule;
	}
	
	public void setMatchSpe(int tempVaule) {
		matchSpe = tempVaule;
	}
	
	public void setMatchTrap(int tempVaule) {
		matchTrap= tempVaule;
	}
	
	public void setMatchClimb(int tempVaule) {
		matchClimb = tempVaule;
	}
	
	public void setMatchHumPos(String tempVaule) {
		matchHumPos = tempVaule;
	}
	
	public void setMatchAmpSkill(int tempVaule) {
		matchAmpSkill = tempVaule;
	}
	
	public void setMatchScoSkill(int tempVaule) {
		matchScoSkill = tempVaule;
	}
	
	public void setMatchAmpNotes(int tempVaule) {
		matchAmpNotes = tempVaule;
	}
	
	public void setMatchComment(String tempVaule) {
		matchComment = tempVaule;
	}
	
	//getters
	public int getMatchTeamNum() {
		return matchTeamNum;
	}
	
	public int getMatchNum() {
		return matchNum;
	}
	
	public int getMatchAmp() {
		return matchAmp;
	}
	
	public int getMatchSpe() {
		return matchSpe;
	}
	
	public int getMatchTrap() {
		return matchTrap;
	}
	
	public int getMatchClimb() {
		return matchClimb;
	}
	
	public String getMatchHumPos() {
		return matchHumPos;
	}
	
	public int getMatchAmpSkill() {
		return matchAmpSkill;
	}
	
	public int getMatchScoSkill() {
		return matchScoSkill;
	}
	
	public int getMatchAmpNotes() {
		return matchAmpNotes;
	}
	
	public String getMatchComment() {
		return matchComment;
	}
	
}