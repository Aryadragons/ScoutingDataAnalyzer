package application;

import java.util.ArrayList;

public class DriveTeamCommentsList {
	ArrayList<DriveTeamComments> listOfDriveTeamComments;
	
	DriveTeamCommentsList() {
		listOfDriveTeamComments = new ArrayList<DriveTeamComments>();
	}
	
	public void addDriveTeamComments(int imTeamNum, int imMatch, int imYellLevel, int imControlLevel, int imPhysical, int imDiscrimLevel, String imDiscrimType, int imOtherBLevel, int imTotalBLevel, int imFunLevel, int imStrategyLevel, int imOtherGLevel, String Comments) {
		DriveTeamComments DTC = new DriveTeamComments(imTeamNum, imMatch, imYellLevel, imControlLevel, imPhysical, imDiscrimLevel, imDiscrimType, imOtherBLevel, imTotalBLevel, imFunLevel, imStrategyLevel, imOtherGLevel, Comments);
		listOfDriveTeamComments.add(DTC);
	}
	
	public DriveTeamComments getADriveTeamComments(int teamNum) {
		System.out.println("Boop32.1DTC");
		int found = 0;
		int theTeam = -1;
		int teamDriveTeamCommentsSearched = 0;
		int i = 0;
		System.out.println("Boop32.2DTC");
		DriveTeamComments tempDTC;
		System.out.println("Boop32.2.DTC");
		tempDTC = listOfDriveTeamComments.get(i);
		System.out.println("Boop32.3DTC");
		while(found < 1 & i < listOfDriveTeamComments.size()) {
			System.out.println("Boop32.4DTC");
			tempDTC = listOfDriveTeamComments.get(i);
			if(tempDTC.getTeamNum() == teamNum) {
				System.out.println("Boop32.5DTC");
				found = 1;
				theTeam = i;
			} else {
				System.out.println("Boop32.6DTC");
				i++;
				teamDriveTeamCommentsSearched++;
			}
			System.out.println("Boop32.7DTC");
		}
		if (found == 1) {
			System.out.println("Boop32.8DTC");
			return tempDTC;
		}else {
			return null;
		}
	}
}
