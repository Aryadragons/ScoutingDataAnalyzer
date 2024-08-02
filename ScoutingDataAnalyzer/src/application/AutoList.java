package application;

import java.util.ArrayList;

public class AutoList {
	
	ArrayList<Auto> listOfAutos;
	
	AutoList() {
		listOfAutos = new ArrayList<Auto>();
	}
	
	public void addFullAuto(int imTeamNum, int imAutoStartPos, int imTotalControl, int imTotalSpecker, int imTotalAmp, int imNumCenNotes, int imTimesUsed, int imTotalMadeInSpe, int imTotalMadeInAmp, int imTotalControled, double imAvgSpe, double imAvgAmp, double imAvgControl) {
		Auto A = new Auto(imTeamNum, imAutoStartPos, imTotalControl, imTotalSpecker, imTotalAmp, imNumCenNotes, imTimesUsed, imTotalMadeInSpe, imTotalMadeInAmp, imTotalControled, imAvgSpe, imAvgAmp, imAvgControl);
		listOfAutos.add(A);
	}
	
	public void addPitAuto(int imTeamNum, int imAutoStartPos, int imTotalControl, int imTotalSpecker, int imTotalAmp, int imNumCenNotes) {
		Auto A = new Auto(imTeamNum, imAutoStartPos, imTotalControl, imTotalSpecker, imTotalAmp, imNumCenNotes);
		listOfAutos.add(A);
	}
	
	public Auto getAnAuto(int startPos, int control, int spe) {
		System.out.println("Boop30.4");
		int found = 0;
		int searched = 0;
		int size = listOfAutos.size();
		int i = 0;
		Auto A = new Auto();
		System.out.println("Boop30.5");
		while(i < size & found == 0) {
			A = listOfAutos.get(i);
			System.out.println("Boop30.6");
			if(A.getAutoStartPos() == startPos) {
				System.out.println("Boop30.7");
				if(A.getTotalControl() == control) {
					System.out.println("Boop30.8");
					if(A.getTotalSpecker() == spe) {
						System.out.println("Boop30.9");
						found = 1;
					}else {
						System.out.println("Boop30.9");
						i++;
						searched++;
					}
				}else {
					System.out.println("Boop30.8");
					i++;
					searched++;
				}
			}else {
				System.out.println("Boop30.7");
				i++;
				searched++;
			}
		}
		if(found == 1) {
			System.out.println("Boop30.10");
			return A;
		}else {
			System.out.println("Boop30.11");
			return null;
		}
	}
}
