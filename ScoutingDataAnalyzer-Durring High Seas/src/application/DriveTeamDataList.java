package application;

import java.util.ArrayList;

public class DriveTeamDataList {
	ArrayList<DriveTeamData> listOfDriveTeamData;
		
	DriveTeamDataList() {
		listOfDriveTeamData = new ArrayList<DriveTeamData>();
	}
	
	public void addDriveTeamData(int imTeamNum, boolean imSaDrThisTour, boolean imSaDrPastTour, boolean imSaDrLastYear, int imDrHourThisBot, int imDrHourSameDrTr, int imDrHourAnyBot, String imOpRole, boolean imSaOpThisTour, boolean imSaOpPastTours, boolean imSaOpLastYear, int imOpHourThisBot, int imOpHourAnyBot, boolean imIsAdult, String imTimeDriveCoach, int imHumHoursPracitce) {
		DriveTeamData DTD = new DriveTeamData(imTeamNum, imSaDrThisTour, imSaDrPastTour, imSaDrLastYear, imDrHourThisBot, imDrHourSameDrTr, imDrHourAnyBot, imOpRole, imSaOpThisTour, imSaOpPastTours, imSaOpLastYear, imOpHourThisBot, imOpHourAnyBot, imIsAdult, imTimeDriveCoach, imHumHoursPracitce);
		listOfDriveTeamData.add(DTD);
	}
	
	public DriveTeamData getATeamPit(int teamNum) {
		System.out.println("Boop32.1");
		int found = 0;
		int theTeam = -1;
		int teamDriveTeamDataSearched = 0;
		int i = 0;
		System.out.println("Boop32.2");
		DriveTeamData tempDTD;
		System.out.println("Boop32.2.");
		tempDTD = listOfDriveTeamData.get(i);
		System.out.println("Boop32.3");
		while(found < 1  & i < listOfDriveTeamData.size()) {
			System.out.println("Boop32.4");
			tempDTD = listOfDriveTeamData.get(i);
			if(tempDTD.getTeamNum() == teamNum) {
				System.out.println("Boop32.5");
				found = 1;
				theTeam = i;
			} else {
				System.out.println("Boop32.6");
				i++;
				teamDriveTeamDataSearched++;
			}
			System.out.println("Boop32.7");
		}
		if (found == 1) {
			System.out.println("Boop32.8DTD");
			return tempDTD;
		}else {
			return null;
		}
	}
}
