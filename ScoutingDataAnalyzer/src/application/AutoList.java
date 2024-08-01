package application;

import java.util.ArrayList;

public class AutoList {
	
	ArrayList<Auto> listOfAutos;
	
	AutoList() {
		listOfAutos = new ArrayList<Auto>();
	}
	
	public void addAuto(int imTeamNum, int imAutoStartPos, int imTotalControl, int imTotalSpecker, int imTotalAmp, int imNumCenNotes, int imTimesUsed, int imTotalMadeInSpe, int imTotalMadeInAmp, int imTotalControled, double imAvgSpe, double imAvgAmp, double imAvgControl) {
		Auto A = new Auto(imTeamNum, imAutoStartPos, imTotalControl, imTotalSpecker, imTotalAmp, imNumCenNotes, imTimesUsed, imTotalMadeInSpe, imTotalMadeInAmp, imTotalControled, imAvgSpe, imAvgAmp, imAvgControl);
		listOfAutos.add(A);
	}
	
	public Auto getAnAuto(int startPos, int control, int spe) {
		int found = 0;
		int searched = 0;
		int size = listOfAutos.size();
		int i = 0;
		Auto A = new Auto();
		while(i < size & found == 0) {
			A = listOfAutos.get(i);
			if(A.getAutoStartPos() == startPos) {
				if(A.getTotalControl() == control) {
					if(A.getTotalSpecker() == spe) {
						found = 1;
				}}else {
					i++;
					searched++;
				}
			}else {
				i++;
				searched++;
			}
		}
		if(found == 1) {
			return A;
		}else {
			return null;
		}
	}
}
