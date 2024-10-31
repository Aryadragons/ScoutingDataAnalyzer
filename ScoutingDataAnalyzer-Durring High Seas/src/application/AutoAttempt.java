package application;

public class AutoAttempt {
	private int teamNum;
	private int matchNum;
	private int autoStartPos;
	private int autoANControl;
	private int autoASpecker;
	private int autoAAmp;
	private int autoNControl;
	private int autoSpecker;
	private int autoAmp;
	
	AutoAttempt(int imteamNum, int immatchNum, int imautoStartPos, int imautoANControl, int imautoASpecker, int imautoAAmp, int imautoNControl, int imautoSpecker, int imautoAmp){
		setTeamNum(imteamNum);
		setMatchNum(immatchNum);
		setAutoStartPos(imautoStartPos);
		setAutoANControl(imautoANControl);
		setAutoASpecker(imautoASpecker);
		setAutoAAmp(imautoAAmp);
		setAutoNControl(imautoNControl);
		setAutoSpecker(imautoSpecker);
		setAutoAmp(imautoAmp);
	}
	
	//set'ers
	public void setTeamNum(int tempTeamNum){
		teamNum = tempTeamNum;
	}
	
	public void setMatchNum(int temp){
		matchNum = temp;
	}
	
	public void setAutoStartPos(int temp) {
		autoStartPos = temp;
	}
	
	public void setAutoANControl(int temp) {
		autoANControl = temp;
	}
	
	public void setAutoASpecker(int temp) {
		autoASpecker = temp;
	}
	
	public void setAutoAAmp(int temp) {
		autoAAmp = temp;
	}
	
	public void setAutoNControl(int temp) {
		autoNControl = temp;
	}
	
	public void setAutoSpecker(int temp) {
		autoSpecker = temp;
	}
	
	public void setAutoAmp(int temp) {
		autoAmp = temp;
	}
	
	
	//get'ers
	public int getTeamNum(){
		return teamNum;
	}
	
	public int getMatchmNum(){
		return matchNum;
	}
	
	public int getAutoStartPos() {
		return autoStartPos;
	}
	
	public int getAutoANControl() {
		return autoANControl;
	}
	
	public int getAutoASpecker() {
		return autoASpecker;
	}
	
	public int getAutoAAmp() {
		return autoAAmp;
	}
	
	public int getAutoNControl() {
		return autoNControl;
	}
	
	public int getAutoSpecker() {
		return autoSpecker;
	}
	
	public int getAutoAmp() {
		return autoAmp;
	}
}
