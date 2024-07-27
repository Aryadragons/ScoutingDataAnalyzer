package application;

import java.util.ArrayList;
	
	public class TeamPitsList {
			
		ArrayList<TeamPit> listOfTeamPits;
			
		TeamPitsList() {
			listOfTeamPits = new ArrayList<TeamPit>();
		}
		
		public void addTeamPit(int imTeamNum, String imTeamName, int imNumOfStud, int imNumOfMent, int imNumOfRobotBat, String imProgramLan, String imDoHaveVis, int imNumOfVisCam, int imNumOfDriverCams, String imDrTrType, String imSwevType, String imSwevGearing, String imDrTrMotorType){
			TeamPit TP = new TeamPit(imTeamNum, imTeamName, imNumOfStud, imNumOfMent, imNumOfRobotBat, imProgramLan, imDoHaveVis, imNumOfVisCam, imNumOfDriverCams, imDrTrType, imSwevType, imSwevGearing, imDrTrMotorType);
			listOfTeamPits.add(TP);
		}
		
		public TeamPit getATeamPit(int teamNum) {
			int found = 0;
			int theTeam = -1;
			int teamPitsSearched = 0;
			int i = 0;
			TeamPit tempTP;
			tempTP = listOfTeamPits.get(i);
			while(found < 1) {
				tempTP = listOfTeamPits.get(i);
				if(tempTP.getTeamNum() == teamNum) {
					found = 1;
					theTeam = i;
				} else {
					i++;
					teamPitsSearched++;
				}
			}
			return tempTP;
		}
}
