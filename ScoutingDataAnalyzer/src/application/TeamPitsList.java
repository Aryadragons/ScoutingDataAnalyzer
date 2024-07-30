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
			System.out.println("Boop32.1");
			int found = 0;
			int theTeam = -1;
			int teamPitsSearched = 0;
			int i = 0;
			System.out.println("Boop32.2");
			TeamPit tempTP;
			System.out.println("Boop32.2.");
			tempTP = listOfTeamPits.get(i);
			System.out.println("Boop32.3");
			while(found < 1) {
				System.out.println("Boop32.4");
				tempTP = listOfTeamPits.get(i);
				if(tempTP.getTeamNum() == teamNum) {
					System.out.println("Boop32.5");
					found = 1;
					theTeam = i;
				} else {
					System.out.println("Boop32.6");
					i++;
					teamPitsSearched++;
				}
				System.out.println("Boop32.7");
			}
			System.out.println("Boop32.8");
			return tempTP;
		}
}
