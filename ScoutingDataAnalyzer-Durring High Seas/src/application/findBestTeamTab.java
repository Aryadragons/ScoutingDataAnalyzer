package application;

import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class findBestTeamTab extends GridPane {
	
	private ComboBox<String> firstMetCB;
	private ComboBox<String> secondMetCB;
	private ComboBox<String> thirdMetCB;
	private ComboBox<String> fourthMetCB;
	private ComboBox<String> fifthMetCB;
	private ComboBox<String> range1CB;
	private ComboBox<String> range2CB;
	private ComboBox<String> range3CB;
	private ComboBox<String> range4CB;
	private ComboBox<String> range5CB;
	private ComboBox<String> numOfTeamsCB;
	private Button submitB;
	private TeamList theTL;
	
	public findBestTeamTab(TeamList imTL) {
		theTL = imTL;
		Label mect1L = new Label("First Meterict to Sort on");
		Label mect2L = new Label("Second Meterict to Sort on");
		Label mect3L = new Label("Third Meterict to Sort on");
		Label mect4L = new Label("Fourth Meterict to Sort on");
		Label mect5L = new Label("Fifth Meterict to Sort on");
		mect1L.setId("smallTitle");
		mect2L.setId("smallTitle");
		mect3L.setId("smallTitle");
		mect4L.setId("smallTitle");
		mect5L.setId("smallTitle");
		firstMetCB = new ComboBox<String>();
		firstMetCB.getItems().addAll("Cycles", "Speckers", "Amp", "Trap", "Climb", "High Notes");
		secondMetCB = new ComboBox<String>();
		secondMetCB.getItems().addAll("Cycles", "Specker", "Amp", "Trap", "Climb", "High Notes");
		thirdMetCB = new ComboBox<String>();
		thirdMetCB.getItems().addAll("Cycles", "Specker", "Amp", "Trap", "Climb", "High Notes");
		fourthMetCB = new ComboBox<String>();
		fourthMetCB.getItems().addAll("Cycles", "Specker", "Amp", "Trap", "Climb", "High Notes");
		fifthMetCB = new ComboBox<String>();
		fifthMetCB.getItems().addAll("Cycles", "Specker", "Amp", "Trap", "Climb", "High Notes");
		BorderPane mect1BP = new BorderPane();
		BorderPane mect2BP = new BorderPane();
		BorderPane mect3BP = new BorderPane();
		BorderPane mect4BP = new BorderPane();
		BorderPane mect5BP = new BorderPane();
		mect1BP.setTop(mect1L);
		mect2BP.setTop(mect2L);
		mect3BP.setTop(mect3L);
		mect4BP.setTop(mect4L);
		mect5BP.setTop(mect5L);
		mect1BP.setCenter(firstMetCB);
		mect2BP.setCenter(secondMetCB);
		mect3BP.setCenter(thirdMetCB);
		mect4BP.setCenter(fourthMetCB);
		mect5BP.setCenter(fifthMetCB);
		mect1BP.setId("findBestTeamSelMectBP");
		mect2BP.setId("findBestTeamSelMectBP");
		mect3BP.setId("findBestTeamSelMectBP");
		mect4BP.setId("findBestTeamSelMectBP");
		mect5BP.setId("findBestTeamSelMectBP");
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 2, 0);
		this.add(new Label("    "), 4, 0);
		this.add(new Label("    "), 6, 0);
		this.add(new Label("    "), 8, 0);
		this.add(new Label("    "), 0, 2);
		this.add(new Label("    "), 0, 4);
		this.add(mect1BP, 1, 1);
		this.add(mect2BP, 3, 1);
		this.add(mect3BP, 5, 1);
		this.add(mect4BP, 7, 1);
		this.add(mect5BP, 9, 1);
		Label range1L = new Label("Range of tieing for stat 1");
		Label range2L = new Label("Range of tieing for stat 2");
		Label range3L = new Label("Range of tieing for stat 3");
		Label range4L = new Label("Range of tieing for stat 4");
		Label range5L = new Label("Range of tieing for stat 5");
		range1L.setId("smallTitle");
		range2L.setId("smallTitle");
		range3L.setId("smallTitle");
		range4L.setId("smallTitle");
		range5L.setId("smallTitle");
		range1CB = new ComboBox<String>();
		range2CB = new ComboBox<String>();
		range3CB = new ComboBox<String>();
		range4CB = new ComboBox<String>();
		range5CB = new ComboBox<String>();
		range1CB.getItems().addAll("0.2", "0.5", "1", "2", "3", "4", "5");
		range2CB.getItems().addAll("0.2", "0.5", "1", "2", "3", "4", "5");
		range3CB.getItems().addAll("0.2", "0.5", "1", "2", "3", "4", "5");
		range4CB.getItems().addAll("0.2", "0.5", "1", "2", "3", "4", "5");
		range5CB.getItems().addAll("0.2", "0.5", "1", "2", "3", "4", "5");
		BorderPane range1BP = new BorderPane();
		BorderPane range2BP = new BorderPane();
		BorderPane range3BP = new BorderPane();
		BorderPane range4BP = new BorderPane();
		BorderPane range5BP = new BorderPane();
		range1BP.setTop(range1L);
		range2BP.setTop(range2L);
		range3BP.setTop(range3L);
		range4BP.setTop(range4L);
		range5BP.setTop(range5L);
		range1BP.setCenter(range1CB);
		range2BP.setCenter(range2CB);
		range3BP.setCenter(range3CB);
		range4BP.setCenter(range4CB);
		range5BP.setCenter(range5CB);
		range1BP.setId("findBestTeamSelRangeBP");
		range2BP.setId("findBestTeamSelRangeBP");
		range3BP.setId("findBestTeamSelRangeBP");
		range4BP.setId("findBestTeamSelRangeBP");
		range5BP.setId("findBestTeamSelRangeBP");
		this.add(range1BP, 1, 3);
		this.add(range2BP, 3, 3);
		this.add(range3BP, 5, 3);
		this.add(range4BP, 7, 3);
		this.add(range5BP, 9, 3);
		Label numOfTeamsL = new Label("How Many teams");
		numOfTeamsL.setId("smallTitle");
		numOfTeamsCB = new ComboBox<String>();
		numOfTeamsCB.getItems().addAll("5", "10", "15", "20", "25", "30", "35", "40");
		BorderPane numOfTeamsBP = new BorderPane();
		numOfTeamsBP.setTop(numOfTeamsL);
		numOfTeamsBP.setCenter(numOfTeamsCB);
		numOfTeamsBP.setId("findBestTeamSelNumOfTeamBP");
		this.add(numOfTeamsBP, 1, 5);
		//Adding in the Button
		submitB = new Button("Submit");
		this.add(submitB, 1, 7);
	}
	
	public TeamList findBestTeams(int numOfTeams, int cyPr, int ampPr, int spePr, int trapPr, int climbPr, int highNPr, int range1, int range2, int range3, int range4, int range5) {
		String stat1 = null;
		String stat2 = null;
		String stat3 = null;
		String stat4 = null;
		String stat5 = null;
		if(cyPr == 1) {
			stat1 = "cy";
		}
		if(cyPr == 2) {
			stat2 = "cy";
		}
		if(cyPr == 3) {
			stat3 = "cy";
		}
		if(cyPr == 4) {
			stat4 = "cy";
		}
		if(cyPr == 5) {
			stat5 = "cy";
		}
		if(spePr == 1) {
			stat1 = "spe";
		}
		if(spePr == 2) {
			stat2 = "spe";
		}
		if(spePr == 3) {
			stat3 = "spe";
		}
		if(spePr == 4) {
			stat4 = "spe";
		}
		if(spePr == 5) {
			stat5 = "spe";
		}
		if(ampPr == 1) {
			stat1 = "amp";
		}
		if(ampPr == 2) {
			stat2 = "amp";
		}
		if(ampPr == 3) {
			stat3 = "amp";
		}
		if(ampPr == 4) {
			stat4 = "amp";
		}
		if(ampPr == 5) {
			stat5 = "amp";
		}
		if(trapPr == 1) {
			stat1 = "trap";
		}
		if(trapPr == 2) {
			stat2 = "trap";
		}
		if(trapPr == 3) {
			stat3 = "trap";
		}
		if(trapPr == 4) {
			stat4 = "trap";
		}
		if(trapPr == 5) {
			stat5 = "trap";
		}
		if(climbPr == 1) {
			stat1 = "climb";
		}
		if(climbPr == 2) {
			stat2 = "climb";
		}
		if(climbPr == 3) {
			stat3 = "climb";
		}
		if(climbPr == 4) {
			stat4 = "climb";
		}
		if(climbPr == 5) {
			stat5 = "climb";
		}
		if(highNPr == 1) {
			stat1 = "highN";
		}
		if(highNPr == 2) {
			stat2 = "highN";
		}
		if(highNPr == 3) {
			stat3 = "highN";
		}
		if(highNPr == 4) {
			stat4 = "highN";
		}
		if(highNPr == 5) {
			stat5 = "highN";
		}
		TeamList listOfTeamNumsSorted = new TeamList();
		listOfTeamNumsSorted.listOfTeams.clear();
		for (int i = 0; i < 80; i++) {
			listOfTeamNumsSorted.listOfTeams.add(null);
		}
		int place = 0;
		for (int i = 0; i < theTL.listOfTeams.size(); i++) {
			place = 0;
			for(int e = 0; e < theTL.listOfTeams.size(); e++) {
				if(stat1.compareTo("cy") == 0) {
					if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
						place++;
					}else {
						if(stat2.compareTo("spe") == 0) {
							if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
								place++;
							}else {
								if(stat3.compareTo("amp") == 0) {
									if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("trap") == 0) {
									if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("climb") == 0) {
									if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("highN") == 0) {
									if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
							}
						}
						if(stat2.compareTo("amp") == 0) {
							if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
								place++;
							}else {
								if(stat3.compareTo("spe") == 0) {
									if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
								
								if(stat3.compareTo("trap") == 0) {
									if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
										place++;
									}else {
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("climb") == 0) {
									if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("highN") == 0) {
									if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
							}
							}
						}
						if(stat2.compareTo("trap") == 0) {
							if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
								place++;
							}else {
								if(stat3.compareTo("spe") == 0) {
									if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								
								if(stat3.compareTo("amp") == 0) {
									if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
										place++;
									}else {
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("climb") == 0) {
									if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("highN") == 0) {
									if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									
								}
							}
						}
						if(stat2.compareTo("climb") == 0) {
							if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
								place++;
							}else {
								if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
									place++;
								}else {
									if(stat3.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat4.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
													
												}
											}
											if(stat4.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}else {
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
												}
											}
										}
									}
									
									if(stat3.compareTo("amp") == 0) {
										if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
											place++;
										}else {
											if(stat4.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}else {
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
													if(stat5.compareTo("spe") == 0) {
														if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("spe") == 0) {
														if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
															place++;
														}
													}
												}
											}
										}
									}
									if(stat3.compareTo("trap") == 0) {
										if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
											place++;
										}else {
											if(stat4.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}else {
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
													if(stat5.compareTo("spe") == 0) {
														if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}else {
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}else {
													if(stat5.compareTo("spe") == 0) {
														if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
															place++;
														}
													}
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
												}
											}
										}
									}
									if(stat3.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat4.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("spe") == 0) {
														if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}else {
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
													if(stat5.compareTo("spe") == 0) {
														if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
												}
											}
										}
									}
								}
							}
						}
						if(stat2.compareTo("highN") == 0) {
							if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
								place++;
							}else {
								if(stat3.compareTo("spe") == 0) {
									if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								
								if(stat3.compareTo("amp") == 0) {
									if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
										place++;
									}else {
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("climb") == 0) {
									if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("trap") == 0) {
									if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				//spe as 1st 
				if(stat1.compareTo("spe") == 0) {
					if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
						place++;
					}else {
						if(stat2.compareTo("cy") == 0) {
							if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
								place++;
							}else {
								if(stat3.compareTo("amp") == 0) {
									if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("trap") == 0) {
									if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("climb") == 0) {
									if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("highN") == 0) {
									if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
							}
						}
						if(stat2.compareTo("amp") == 0) {
							if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
								place++;
							}else {
								if(stat3.compareTo("cy") == 0) {
									if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
								
								if(stat3.compareTo("trap") == 0) {
									if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
										place++;
									}else {
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("climb") == 0) {
									if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("highN") == 0) {
									if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
										place++;
									}else {
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
									}
								}
							}
							}
						}
						if(stat2.compareTo("trap") == 0) {
							if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
								place++;
							}else {
								if(stat3.compareTo("cy") == 0) {
									if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								
								if(stat3.compareTo("amp") == 0) {
									if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
										place++;
									}else {
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("climb") == 0) {
									if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("highN") == 0) {
									if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									
								}
							}
						}
						if(stat2.compareTo("climb") == 0) {
							if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
								place++;
							}else {
								if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
									place++;
								}else {
									if(stat3.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat4.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
													
												}
											}
											if(stat4.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}else {
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
												}
											}
										}
									}
									
									if(stat3.compareTo("amp") == 0) {
										if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
											place++;
										}else {
											if(stat4.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}else {
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
													if(stat5.compareTo("cy") == 0) {
														if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("cy") == 0) {
														if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
															place++;
														}
													}
												}
											}
										}
									}
									if(stat3.compareTo("trap") == 0) {
										if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
											place++;
										}else {
											if(stat4.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}else {
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
													if(stat5.compareTo("cy") == 0) {
														if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}else {
													if(stat5.compareTo("highN") == 0) {
														if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
															place++;
														}
													}
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}else {
													if(stat5.compareTo("cy") == 0) {
														if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
															place++;
														}
													}
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
												}
											}
										}
									}
									if(stat3.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat4.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("cy") == 0) {
														if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}else {
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
													if(stat5.compareTo("cy") == 0) {
														if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
															place++;
														}
													}
												}
											}
											if(stat4.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}else {
													if(stat5.compareTo("trap") == 0) {
														if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
															place++;
														}
													}
													if(stat5.compareTo("amp") == 0) {
														if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
															place++;
														}
													}
												}
											}
										}
									}
								}
							}
						}
						if(stat2.compareTo("highN") == 0) {
							if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
								place++;
							}else {
								if(stat3.compareTo("cy") == 0) {
									if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								
								if(stat3.compareTo("amp") == 0) {
									if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
										place++;
									}else {
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("climb") == 0) {
									if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("trap") == 0) {
									if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("climb") == 0) {
											if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
												place++;
											}else {
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("climb") == 0) {
													if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			//amp as 1st 
			if(stat1.compareTo("amp") == 0) {
				if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
					place++;
				}else {
					if(stat2.compareTo("cy") == 0) {
						if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
							place++;
						}else {
							if(stat3.compareTo("spe") == 0) {
								if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
									place++;
								}else {
									if(stat4.compareTo("trap") == 0) {
										if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("trap") == 0) {
								if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("climb") == 0) {
								if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
									place++;
								}else {
									if(stat4.compareTo("trap") == 0) {
										if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("highN") == 0) {
								if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
									place++;
								}else {
									if(stat4.compareTo("trap") == 0) {
										if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
										}
									}
								}
							}
						}
					}
					if(stat2.compareTo("spe") == 0) {
						if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
							place++;
						}else {
							if(stat3.compareTo("cy") == 0) {
								if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
									place++;
								}else {
									if(stat4.compareTo("trap") == 0) {
										if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
										}
									}
								}
							}
							
							if(stat3.compareTo("trap") == 0) {
								if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
									place++;
								}else {
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("climb") == 0) {
								if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
									place++;
								}else {
									if(stat4.compareTo("trap") == 0) {
										if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("highN") == 0) {
								if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
									place++;
								}else {
									if(stat4.compareTo("trap") == 0) {
										if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
										}
									}
								}
							}
						}
						}
					}
					if(stat2.compareTo("trap") == 0) {
						if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
							place++;
						}else {
							if(stat3.compareTo("cy") == 0) {
								if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
							
							if(stat3.compareTo("spe") == 0) {
								if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
									place++;
								}else {
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("climb") == 0) {
								if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("highN") == 0) {
								if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								
							}
						}
					}
					if(stat2.compareTo("climb") == 0) {
						if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
							place++;
						}else {
							if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
								place++;
							}else {
								if(stat3.compareTo("cy") == 0) {
									if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
										place++;
									}else {
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												
											}
										}
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
									}
								}
								
								if(stat3.compareTo("spe") == 0) {
									if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
										place++;
									}else {
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("trap") == 0) {
									if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
										place++;
									}else {
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("highN") == 0) {
									if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
										place++;
									}else {
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("trap") == 0) {
											if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
												place++;
											}else {
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("trap") == 0) {
													if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
														place++;
													}
												}
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
											}
										}
									}
								}
							}
						}
					}
					if(stat2.compareTo("highN") == 0) {
						if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
							place++;
						}else {
							if(stat3.compareTo("cy") == 0) {
								if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
											
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("trap") == 0) {
										if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
							
							if(stat3.compareTo("spe") == 0) {
								if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
									place++;
								}else {
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("trap") == 0) {
										if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("climb") == 0) {
								if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("trap") == 0) {
												if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("trap") == 0) {
										if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
											place++;
										}else {
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("trap") == 0) {
								if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			//Trap as 1st 
			if(stat1.compareTo("Trap") == 0) {
				if(theTL.listOfTeams.get(i).getAvgTrap() - range1 > theTL.listOfTeams.get(e).getAvgTrap()) {
					place++;
				}else {
					if(stat2.compareTo("cy") == 0) {
						if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
							place++;
						}else {
							if(stat3.compareTo("amp") == 0) {
								if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("spe") == 0) {
								if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
									place++;
								}else {
									if(stat4.compareTo("amp") == 0) {
										if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("climb") == 0) {
								if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("amp") == 0) {
										if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("highN") == 0) {
								if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("amp") == 0) {
										if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
						}
					}
					if(stat2.compareTo("amp") == 0) {
						if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
							place++;
						}else {
							if(stat3.compareTo("cy") == 0) {
								if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
							
							if(stat3.compareTo("spe") == 0) {
								if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
									place++;
								}else {
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("climb") == 0) {
								if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("highN") == 0) {
								if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
									place++;
								}else {
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
								}
							}
						}
						}
					}
					if(stat2.compareTo("spe") == 0) {
						if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
							place++;
						}else {
							if(stat3.compareTo("cy") == 0) {
								if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
									place++;
								}else {
									if(stat4.compareTo("amp") == 0) {
										if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
								}
							}
							
							if(stat3.compareTo("amp") == 0) {
								if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
									place++;
								}else {
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("climb") == 0) {
								if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
									place++;
								}else {
									if(stat4.compareTo("amp") == 0) {
										if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("highN") == 0) {
												if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("highN") == 0) {
										if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
											place++;
										}else {
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("highN") == 0) {
								if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
									place++;
								}else {
									if(stat4.compareTo("amp") == 0) {
										if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
								
							}
						}
					}
					if(stat2.compareTo("climb") == 0) {
						if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
							place++;
						}else {
							if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
								place++;
							}else {
								if(stat3.compareTo("cy") == 0) {
									if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												
											}
										}
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								
								if(stat3.compareTo("amp") == 0) {
									if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
										place++;
									}else {
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("spe") == 0) {
									if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("highN") == 0) {
													if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("highN") == 0) {
											if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
												place++;
											}else {
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
								if(stat3.compareTo("highN") == 0) {
									if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
										place++;
									}else {
										if(stat4.compareTo("amp") == 0) {
											if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
												place++;
											}else {
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("spe") == 0) {
											if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
												place++;
											}else {
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
												if(stat5.compareTo("cy") == 0) {
													if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
														place++;
													}
												}
											}
										}
										if(stat4.compareTo("cy") == 0) {
											if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
												place++;
											}else {
												if(stat5.compareTo("spe") == 0) {
													if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
														place++;
													}
												}
												if(stat5.compareTo("amp") == 0) {
													if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
														place++;
													}
												}
											}
										}
									}
								}
							}
						}
					}
					if(stat2.compareTo("highN") == 0) {
						if(theTL.listOfTeams.get(i).getHumAmpNotes() - range1 > theTL.listOfTeams.get(e).getHumAmpNotes()) {
							place++;
						}else {
							if(stat3.compareTo("cy") == 0) {
								if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
									place++;
								}else {
									if(stat4.compareTo("amp") == 0) {
										if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
											
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
								}
							}
							
							if(stat3.compareTo("amp") == 0) {
								if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
									place++;
								}else {
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("climb") == 0) {
								if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
									place++;
								}else {
									if(stat4.compareTo("amp") == 0) {
										if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
											place++;
										}else {
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("spe") == 0) {
												if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("spe") == 0) {
										if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
											place++;
										}else {
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
								}
							}
							if(stat3.compareTo("spe") == 0) {
								if(theTL.listOfTeams.get(i).getAvgSpe() - range1 > theTL.listOfTeams.get(e).getAvgSpe()) {
									place++;
								}else {
									if(stat4.compareTo("amp") == 0) {
										if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("climb") == 0) {
										if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
											place++;
										}else {
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
											if(stat5.compareTo("cy") == 0) {
												if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
													place++;
												}
											}
										}
									}
									if(stat4.compareTo("cy") == 0) {
										if(theTL.listOfTeams.get(i).getAvgCycles() - range1 > theTL.listOfTeams.get(e).getAvgCycles()) {
											place++;
										}else {
											if(stat5.compareTo("climb") == 0) {
												if(theTL.listOfTeams.get(i).getAvgClimb() - range1 > theTL.listOfTeams.get(e).getAvgClimb()) {
													place++;
												}
											}
											if(stat5.compareTo("amp") == 0) {
												if(theTL.listOfTeams.get(i).getAvgAmp() - range1 > theTL.listOfTeams.get(e).getAvgAmp()) {
													place++;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			
		
		}
			listOfTeamNumsSorted.listOfTeams.set(place, theTL.listOfTeams.get(i));
		}
		return null;
	}
	
	
	public void displayBestTeams(int numOfTeams, TeamList sortedTL, int cyPr, int ampPr, int spePr, int trapPr, int climbPr, int highNotePr) {
		int HPlacement = 1;
		int VPlacement = 1;
		Team tempT;
		//team 1
		tempT = sortedTL.listOfTeams.get(0);
		int team1teamNum = tempT.getTeamNum();
		double team1cy = tempT.getAvgCycles();
		double team1spe = tempT.getAvgSpe();
		double team1amp = tempT.getAvgAmp();
		double team1trap = tempT.getAvgTrap();
		double team1climb = tempT.getAvgClimb();
		double team1highN = tempT.getHumAmpNotes();
		Label team1teamNumL = new Label(Integer.toString(team1teamNum));
		Label team1cyL = new Label(Double.toString(team1cy));
		Label team1speL = new Label(Double.toString(team1spe));
		Label team1ampL = new Label(Double.toString(team1amp));
		Label team1trapL = new Label(Double.toString(team1trap));
		Label team1climbL = new Label(Double.toString(team1climb));
		Label team1highNL = new Label(Double.toString(team1highN));
		team1teamNumL.setId("avgStat");
		team1cyL.setId("avgStat");
		team1speL.setId("avgStat");
		team1ampL.setId("avgStat");
		team1trapL.setId("avgStat");
		team1climbL.setId("avgStat");
		team1highNL.setId("avgStat");
		Label team1teamNumTitleL = new Label("Team Num");
		Label team1cyTitleL = new Label("Avg Cycles");
		Label team1speTitleL = new Label("Avg Speaker");
		Label team1ampTitleL = new Label("Avg Amp");
		Label team1trapTitleL = new Label("Avg Trap");
		Label team1climbTitleL = new Label("Avg CLimb");
		Label team1highNTitleL = new Label("Avg High Notes");
		team1teamNumTitleL.setId("smallTitle");
		team1cyTitleL.setId("smallTitle");
		team1speTitleL.setId("smallTitle");
		team1ampTitleL.setId("smallTitle");
		team1trapTitleL.setId("smallTitle");
		team1climbTitleL.setId("smallTitle");
		team1highNTitleL.setId("smallTitle");
		BorderPane team1teamNumBP = new BorderPane();
		BorderPane team1cyBP = new BorderPane();
		BorderPane team1speBP = new BorderPane();
		BorderPane team1ampBP = new BorderPane();
		BorderPane team1trapBP = new BorderPane();
		BorderPane team1climbBP = new BorderPane();
		BorderPane team1highNBP = new BorderPane();
		team1teamNumBP.setTop(team1teamNumTitleL);
		team1cyBP.setTop(team1cyTitleL);
		team1speBP.setTop(team1speTitleL);
		team1ampBP.setTop(team1ampTitleL);
		team1trapBP.setTop(team1trapTitleL);
		team1climbBP.setTop(team1climbTitleL);
		team1highNBP.setTop(team1highNTitleL);
		team1teamNumBP.setCenter(team1teamNumL);
		team1cyBP.setCenter(team1cyL);
		team1speBP.setCenter(team1speL);
		team1ampBP.setCenter(team1ampL);
		team1trapBP.setCenter(team1trapL);
		team1climbBP.setCenter(team1climbL);
		team1highNBP.setCenter(team1highNL);
		team1teamNumBP.setId("findBestTeamStatBP1");
		team1cyBP.setId("findBestTeamStatBP2");
		team1speBP.setId("findBestTeamStatBP3");
		team1ampBP.setId("findBestTeamStatBP4");
		team1trapBP.setId("findBestTeamStatBP5");
		team1climbBP.setId("findBestTeamStatBP6");
		team1highNBP.setId("findBestTeamStatBP7");
		VBox team1teamVB = new VBox(5);
		team1teamVB.getChildren().addAll(team1teamNumBP, team1cyBP, team1speBP, team1ampBP, team1trapBP, team1climbBP, team1highNBP);
		BorderPane team1teamBP = new BorderPane();
		team1teamBP.setCenter(team1teamVB);
		team1teamBP.setId("findBestTeamStatAllBP1");
		//team 2
		tempT = sortedTL.listOfTeams.get(1);
		int team2teamNum = tempT.getTeamNum();
		double team2cy = tempT.getAvgCycles();
		double team2spe = tempT.getAvgSpe();
		double team2amp = tempT.getAvgAmp();
		double team2trap = tempT.getAvgTrap();
		double team2climb = tempT.getAvgClimb();
		double team2highN = tempT.getHumAmpNotes();
		Label team2teamNumL = new Label(Integer.toString(team2teamNum));
		Label team2cyL = new Label(Double.toString(team2cy));
		Label team2speL = new Label(Double.toString(team2spe));
		Label team2ampL = new Label(Double.toString(team2amp));
		Label team2trapL = new Label(Double.toString(team2trap));
		Label team2climbL = new Label(Double.toString(team2climb));
		Label team2highNL = new Label(Double.toString(team2highN));
		team2teamNumL.setId("avgStat");
		team2cyL.setId("avgStat");
		team2speL.setId("avgStat");
		team2ampL.setId("avgStat");
		team2trapL.setId("avgStat");
		team2climbL.setId("avgStat");
		team2highNL.setId("avgStat");
		Label team2teamNumTitleL = new Label("Team Num");
		Label team2cyTitleL = new Label("Avg Cycles");
		Label team2speTitleL = new Label("Avg Speaker");
		Label team2ampTitleL = new Label("Avg Amp");
		Label team2trapTitleL = new Label("Avg Trap");
		Label team2climbTitleL = new Label("Avg CLimb");
		Label team2highNTitleL = new Label("Avg High Notes");
		team2teamNumTitleL.setId("smallTitle");
		team2cyTitleL.setId("smallTitle");
		team2speTitleL.setId("smallTitle");
		team2ampTitleL.setId("smallTitle");
		team2trapTitleL.setId("smallTitle");
		team2climbTitleL.setId("smallTitle");
		team2highNTitleL.setId("smallTitle");
		BorderPane team2teamNumBP = new BorderPane();
		BorderPane team2cyBP = new BorderPane();
		BorderPane team2speBP = new BorderPane();
		BorderPane team2ampBP = new BorderPane();
		BorderPane team2trapBP = new BorderPane();
		BorderPane team2climbBP = new BorderPane();
		BorderPane team2highNBP = new BorderPane();
		team2teamNumBP.setTop(team2teamNumTitleL);
		team2cyBP.setTop(team2cyTitleL);
		team2speBP.setTop(team2speTitleL);
		team2ampBP.setTop(team2ampTitleL);
		team2trapBP.setTop(team2trapTitleL);
		team2climbBP.setTop(team2climbTitleL);
		team2highNBP.setTop(team2highNTitleL);
		team2teamNumBP.setCenter(team2teamNumL);
		team2cyBP.setCenter(team2cyL);
		team2speBP.setCenter(team2speL);
		team2ampBP.setCenter(team2ampL);
		team2trapBP.setCenter(team2trapL);
		team2climbBP.setCenter(team2climbL);
		team2highNBP.setCenter(team2highNL);
		team2teamNumBP.setId("findBestTeamStatBP1");
		team2cyBP.setId("findBestTeamStatBP2");
		team2speBP.setId("findBestTeamStatBP3");
		team2ampBP.setId("findBestTeamStatBP4");
		team2trapBP.setId("findBestTeamStatBP5");
		team2climbBP.setId("findBestTeamStatBP6");
		team2highNBP.setId("findBestTeamStatBP7");
		VBox team2teamVB = new VBox(5);
		team2teamVB.getChildren().addAll(team2teamNumBP, team2cyBP, team2speBP, team2ampBP, team2trapBP, team2climbBP, team2highNBP);
		BorderPane team2teamBP = new BorderPane();
		team2teamBP.setCenter(team2teamVB);
		team2teamBP.setId("findBestTeamStatAllBP1");
		//team 3
		tempT = sortedTL.listOfTeams.get(2);
		int team3teamNum = tempT.getTeamNum();
		double team3cy = tempT.getAvgCycles();
		double team3spe = tempT.getAvgSpe();
		double team3amp = tempT.getAvgAmp();
		double team3trap = tempT.getAvgTrap();
		double team3climb = tempT.getAvgClimb();
		double team3highN = tempT.getHumAmpNotes();
		Label team3teamNumL = new Label(Integer.toString(team3teamNum));
		Label team3cyL = new Label(Double.toString(team3cy));
		Label team3speL = new Label(Double.toString(team3spe));
		Label team3ampL = new Label(Double.toString(team3amp));
		Label team3trapL = new Label(Double.toString(team3trap));
		Label team3climbL = new Label(Double.toString(team3climb));
		Label team3highNL = new Label(Double.toString(team3highN));
		team3teamNumL.setId("avgStat");
		team3cyL.setId("avgStat");
		team3speL.setId("avgStat");
		team3ampL.setId("avgStat");
		team3trapL.setId("avgStat");
		team3climbL.setId("avgStat");
		team3highNL.setId("avgStat");
		Label team3teamNumTitleL = new Label("Team Num");
		Label team3cyTitleL = new Label("Avg Cycles");
		Label team3speTitleL = new Label("Avg Speaker");
		Label team3ampTitleL = new Label("Avg Amp");
		Label team3trapTitleL = new Label("Avg Trap");
		Label team3climbTitleL = new Label("Avg CLimb");
		Label team3highNTitleL = new Label("Avg High Notes");
		team3teamNumTitleL.setId("smallTitle");
		team3cyTitleL.setId("smallTitle");
		team3speTitleL.setId("smallTitle");
		team3ampTitleL.setId("smallTitle");
		team3trapTitleL.setId("smallTitle");
		team3climbTitleL.setId("smallTitle");
		team3highNTitleL.setId("smallTitle");
		BorderPane team3teamNumBP = new BorderPane();
		BorderPane team3cyBP = new BorderPane();
		BorderPane team3speBP = new BorderPane();
		BorderPane team3ampBP = new BorderPane();
		BorderPane team3trapBP = new BorderPane();
		BorderPane team3climbBP = new BorderPane();
		BorderPane team3highNBP = new BorderPane();
		team3teamNumBP.setTop(team3teamNumTitleL);
		team3cyBP.setTop(team3cyTitleL);
		team3speBP.setTop(team3speTitleL);
		team3ampBP.setTop(team3ampTitleL);
		team3trapBP.setTop(team3trapTitleL);
		team3climbBP.setTop(team3climbTitleL);
		team3highNBP.setTop(team3highNTitleL);
		team3teamNumBP.setCenter(team3teamNumL);
		team3cyBP.setCenter(team3cyL);
		team3speBP.setCenter(team3speL);
		team3ampBP.setCenter(team3ampL);
		team3trapBP.setCenter(team3trapL);
		team3climbBP.setCenter(team3climbL);
		team3highNBP.setCenter(team3highNL);
		team3teamNumBP.setId("findBestTeamStatBP1");
		team3cyBP.setId("findBestTeamStatBP2");
		team3speBP.setId("findBestTeamStatBP3");
		team3ampBP.setId("findBestTeamStatBP4");
		team3trapBP.setId("findBestTeamStatBP5");
		team3climbBP.setId("findBestTeamStatBP6");
		team3highNBP.setId("findBestTeamStatBP7");
		VBox team3teamVB = new VBox(5);
		team3teamVB.getChildren().addAll(team3teamNumBP, team3cyBP, team3speBP, team3ampBP, team3trapBP, team3climbBP, team3highNBP);
		BorderPane team3teamBP = new BorderPane();
		team3teamBP.setCenter(team3teamVB);
		team3teamBP.setId("findBestTeamStatAllBP1");
		//team 4
		tempT = sortedTL.listOfTeams.get(3);
		int team4teamNum = tempT.getTeamNum();
		double team4cy = tempT.getAvgCycles();
		double team4spe = tempT.getAvgSpe();
		double team4amp = tempT.getAvgAmp();
		double team4trap = tempT.getAvgTrap();
		double team4climb = tempT.getAvgClimb();
		double team4highN = tempT.getHumAmpNotes();
		Label team4teamNumL = new Label(Integer.toString(team4teamNum));
		Label team4cyL = new Label(Double.toString(team4cy));
		Label team4speL = new Label(Double.toString(team4spe));
		Label team4ampL = new Label(Double.toString(team4amp));
		Label team4trapL = new Label(Double.toString(team4trap));
		Label team4climbL = new Label(Double.toString(team4climb));
		Label team4highNL = new Label(Double.toString(team4highN));
		team4teamNumL.setId("avgStat");
		team4cyL.setId("avgStat");
		team4speL.setId("avgStat");
		team4ampL.setId("avgStat");
		team4trapL.setId("avgStat");
		team4climbL.setId("avgStat");
		team4highNL.setId("avgStat");
		Label team4teamNumTitleL = new Label("Team Num");
		Label team4cyTitleL = new Label("Avg Cycles");
		Label team4speTitleL = new Label("Avg Speaker");
		Label team4ampTitleL = new Label("Avg Amp");
		Label team4trapTitleL = new Label("Avg Trap");
		Label team4climbTitleL = new Label("Avg CLimb");
		Label team4highNTitleL = new Label("Avg High Notes");
		team4teamNumTitleL.setId("smallTitle");
		team4cyTitleL.setId("smallTitle");
		team4speTitleL.setId("smallTitle");
		team4ampTitleL.setId("smallTitle");
		team4trapTitleL.setId("smallTitle");
		team4climbTitleL.setId("smallTitle");
		team4highNTitleL.setId("smallTitle");
		BorderPane team4teamNumBP = new BorderPane();
		BorderPane team4cyBP = new BorderPane();
		BorderPane team4speBP = new BorderPane();
		BorderPane team4ampBP = new BorderPane();
		BorderPane team4trapBP = new BorderPane();
		BorderPane team4climbBP = new BorderPane();
		BorderPane team4highNBP = new BorderPane();
		team4teamNumBP.setTop(team4teamNumTitleL);
		team4cyBP.setTop(team4cyTitleL);
		team4speBP.setTop(team4speTitleL);
		team4ampBP.setTop(team4ampTitleL);
		team4trapBP.setTop(team4trapTitleL);
		team4climbBP.setTop(team4climbTitleL);
		team4highNBP.setTop(team4highNTitleL);
		team4teamNumBP.setCenter(team4teamNumL);
		team4cyBP.setCenter(team4cyL);
		team4speBP.setCenter(team4speL);
		team4ampBP.setCenter(team4ampL);
		team4trapBP.setCenter(team4trapL);
		team4climbBP.setCenter(team4climbL);
		team4highNBP.setCenter(team4highNL);
		team4teamNumBP.setId("findBestTeamStatBP1");
		team4cyBP.setId("findBestTeamStatBP2");
		team4speBP.setId("findBestTeamStatBP3");
		team4ampBP.setId("findBestTeamStatBP4");
		team4trapBP.setId("findBestTeamStatBP5");
		team4climbBP.setId("findBestTeamStatBP6");
		team4highNBP.setId("findBestTeamStatBP7");
		VBox team4teamVB = new VBox(5);
		team4teamVB.getChildren().addAll(team4teamNumBP, team4cyBP, team4speBP, team4ampBP, team4trapBP, team4climbBP, team4highNBP);
		BorderPane team4teamBP = new BorderPane();
		team4teamBP.setCenter(team4teamVB);
		team4teamBP.setId("findBestTeamStatAllBP1");
		//team 5
		tempT = sortedTL.listOfTeams.get(4);
		int team5teamNum = tempT.getTeamNum();
		double team5cy = tempT.getAvgCycles();
		double team5spe = tempT.getAvgSpe();
		double team5amp = tempT.getAvgAmp();
		double team5trap = tempT.getAvgTrap();
		double team5climb = tempT.getAvgClimb();
		double team5highN = tempT.getHumAmpNotes();
		Label team5teamNumL = new Label(Integer.toString(team5teamNum));
		Label team5cyL = new Label(Double.toString(team5cy));
		Label team5speL = new Label(Double.toString(team5spe));
		Label team5ampL = new Label(Double.toString(team5amp));
		Label team5trapL = new Label(Double.toString(team5trap));
		Label team5climbL = new Label(Double.toString(team5climb));
		Label team5highNL = new Label(Double.toString(team5highN));
		team5teamNumL.setId("avgStat");
		team5cyL.setId("avgStat");
		team5speL.setId("avgStat");
		team5ampL.setId("avgStat");
		team5trapL.setId("avgStat");
		team5climbL.setId("avgStat");
		team5highNL.setId("avgStat");
		Label team5teamNumTitleL = new Label("Team Num");
		Label team5cyTitleL = new Label("Avg Cycles");
		Label team5speTitleL = new Label("Avg Speaker");
		Label team5ampTitleL = new Label("Avg Amp");
		Label team5trapTitleL = new Label("Avg Trap");
		Label team5climbTitleL = new Label("Avg CLimb");
		Label team5highNTitleL = new Label("Avg High Notes");
		team5teamNumTitleL.setId("smallTitle");
		team5cyTitleL.setId("smallTitle");
		team5speTitleL.setId("smallTitle");
		team5ampTitleL.setId("smallTitle");
		team5trapTitleL.setId("smallTitle");
		team5climbTitleL.setId("smallTitle");
		team5highNTitleL.setId("smallTitle");
		BorderPane team5teamNumBP = new BorderPane();
		BorderPane team5cyBP = new BorderPane();
		BorderPane team5speBP = new BorderPane();
		BorderPane team5ampBP = new BorderPane();
		BorderPane team5trapBP = new BorderPane();
		BorderPane team5climbBP = new BorderPane();
		BorderPane team5highNBP = new BorderPane();
		team5teamNumBP.setTop(team5teamNumTitleL);
		team5cyBP.setTop(team5cyTitleL);
		team5speBP.setTop(team5speTitleL);
		team5ampBP.setTop(team5ampTitleL);
		team5trapBP.setTop(team5trapTitleL);
		team5climbBP.setTop(team5climbTitleL);
		team5highNBP.setTop(team5highNTitleL);
		team5teamNumBP.setCenter(team5teamNumL);
		team5cyBP.setCenter(team5cyL);
		team5speBP.setCenter(team5speL);
		team5ampBP.setCenter(team5ampL);
		team5trapBP.setCenter(team5trapL);
		team5climbBP.setCenter(team5climbL);
		team5highNBP.setCenter(team5highNL);
		team5teamNumBP.setId("findBestTeamStatBP1");
		team5cyBP.setId("findBestTeamStatBP2");
		team5speBP.setId("findBestTeamStatBP3");
		team5ampBP.setId("findBestTeamStatBP4");
		team5trapBP.setId("findBestTeamStatBP5");
		team5climbBP.setId("findBestTeamStatBP6");
		team5highNBP.setId("findBestTeamStatBP7");
		VBox team5teamVB = new VBox(5);
		team5teamVB.getChildren().addAll(team5teamNumBP, team5cyBP, team5speBP, team5ampBP, team5trapBP, team5climbBP, team5highNBP);
		BorderPane team5teamBP = new BorderPane();
		team5teamBP.setCenter(team5teamVB);
		team5teamBP.setId("findBestTeamStatAllBP1");
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 2, 0);
		this.add(new Label("    "), 4, 0);
		this.add(new Label("    "), 6, 0);
		this.add(new Label("    "), 8, 0);
		this.add(new Label("    "), 0, 2);
		this.add(new Label("    "), 0, 4);
		this.add(new Label("    "), 0, 6);
		this.add(new Label("    "), 0, 8);
		this.add(new Label("    "), 0, 10);
		this.add(new Label("    "), 0, 12);
		this.add(new Label("    "), 0, 14);
		this.add(team1teamBP, 1, 1);
		this.add(team2teamBP, 3, 1);
		this.add(team3teamBP, 5, 1);
		this.add(team4teamBP, 7, 1);
		this.add(team5teamBP, 9, 1);
		if(numOfTeams == 10) {
			//team 6
			tempT = sortedTL.listOfTeams.get(5);
			int team6teamNum = tempT.getTeamNum();
			double team6cy = tempT.getAvgCycles();
			double team6spe = tempT.getAvgSpe();
			double team6amp = tempT.getAvgAmp();
			double team6trap = tempT.getAvgTrap();
			double team6climb = tempT.getAvgClimb();
			double team6highN = tempT.getHumAmpNotes();
			Label team6teamNumL = new Label(Integer.toString(team6teamNum));
			Label team6cyL = new Label(Double.toString(team6cy));
			Label team6speL = new Label(Double.toString(team6spe));
			Label team6ampL = new Label(Double.toString(team6amp));
			Label team6trapL = new Label(Double.toString(team6trap));
			Label team6climbL = new Label(Double.toString(team6climb));
			Label team6highNL = new Label(Double.toString(team6highN));
			team6teamNumL.setId("avgStat");
			team6cyL.setId("avgStat");
			team6speL.setId("avgStat");
			team6ampL.setId("avgStat");
			team6trapL.setId("avgStat");
			team6climbL.setId("avgStat");
			team6highNL.setId("avgStat");
			Label team6teamNumTitleL = new Label("Team Num");
			Label team6cyTitleL = new Label("Avg Cycles");
			Label team6speTitleL = new Label("Avg Speaker");
			Label team6ampTitleL = new Label("Avg Amp");
			Label team6trapTitleL = new Label("Avg Trap");
			Label team6climbTitleL = new Label("Avg CLimb");
			Label team6highNTitleL = new Label("Avg High Notes");
			team6teamNumTitleL.setId("smallTitle");
			team6cyTitleL.setId("smallTitle");
			team6speTitleL.setId("smallTitle");
			team6ampTitleL.setId("smallTitle");
			team6trapTitleL.setId("smallTitle");
			team6climbTitleL.setId("smallTitle");
			team6highNTitleL.setId("smallTitle");
			BorderPane team6teamNumBP = new BorderPane();
			BorderPane team6cyBP = new BorderPane();
			BorderPane team6speBP = new BorderPane();
			BorderPane team6ampBP = new BorderPane();
			BorderPane team6trapBP = new BorderPane();
			BorderPane team6climbBP = new BorderPane();
			BorderPane team6highNBP = new BorderPane();
			team6teamNumBP.setTop(team6teamNumTitleL);
			team6cyBP.setTop(team6cyTitleL);
			team6speBP.setTop(team6speTitleL);
			team6ampBP.setTop(team6ampTitleL);
			team6trapBP.setTop(team6trapTitleL);
			team6climbBP.setTop(team6climbTitleL);
			team6highNBP.setTop(team6highNTitleL);
			team6teamNumBP.setCenter(team6teamNumL);
			team6cyBP.setCenter(team6cyL);
			team6speBP.setCenter(team6speL);
			team6ampBP.setCenter(team6ampL);
			team6trapBP.setCenter(team6trapL);
			team6climbBP.setCenter(team6climbL);
			team6highNBP.setCenter(team6highNL);
			team6teamNumBP.setId("findBestTeamStatBP1");
			team6cyBP.setId("findBestTeamStatBP2");
			team6speBP.setId("findBestTeamStatBP3");
			team6ampBP.setId("findBestTeamStatBP4");
			team6trapBP.setId("findBestTeamStatBP5");
			team6climbBP.setId("findBestTeamStatBP6");
			team6highNBP.setId("findBestTeamStatBP7");
			VBox team6teamVB = new VBox(5);
			team6teamVB.getChildren().addAll(team6teamNumBP, team6cyBP, team6speBP, team6ampBP, team6trapBP, team6climbBP, team6highNBP);
			BorderPane team6teamBP = new BorderPane();
			team6teamBP.setCenter(team6teamVB);
			team6teamBP.setId("findBestTeamStatAllBP1");
			//team 7
			tempT = sortedTL.listOfTeams.get(6);
			int team7teamNum = tempT.getTeamNum();
			double team7cy = tempT.getAvgCycles();
			double team7spe = tempT.getAvgSpe();
			double team7amp = tempT.getAvgAmp();
			double team7trap = tempT.getAvgTrap();
			double team7climb = tempT.getAvgClimb();
			double team7highN = tempT.getHumAmpNotes();
			Label team7teamNumL = new Label(Integer.toString(team7teamNum));
			Label team7cyL = new Label(Double.toString(team7cy));
			Label team7speL = new Label(Double.toString(team7spe));
			Label team7ampL = new Label(Double.toString(team7amp));
			Label team7trapL = new Label(Double.toString(team7trap));
			Label team7climbL = new Label(Double.toString(team7climb));
			Label team7highNL = new Label(Double.toString(team7highN));
			team7teamNumL.setId("avgStat");
			team7cyL.setId("avgStat");
			team7speL.setId("avgStat");
			team7ampL.setId("avgStat");
			team7trapL.setId("avgStat");
			team7climbL.setId("avgStat");
			team7highNL.setId("avgStat");
			Label team7teamNumTitleL = new Label("Team Num");
			Label team7cyTitleL = new Label("Avg Cycles");
			Label team7speTitleL = new Label("Avg Speaker");
			Label team7ampTitleL = new Label("Avg Amp");
			Label team7trapTitleL = new Label("Avg Trap");
			Label team7climbTitleL = new Label("Avg CLimb");
			Label team7highNTitleL = new Label("Avg High Notes");
			team7teamNumTitleL.setId("smallTitle");
			team7cyTitleL.setId("smallTitle");
			team7speTitleL.setId("smallTitle");
			team7ampTitleL.setId("smallTitle");
			team7trapTitleL.setId("smallTitle");
			team7climbTitleL.setId("smallTitle");
			team7highNTitleL.setId("smallTitle");
			BorderPane team7teamNumBP = new BorderPane();
			BorderPane team7cyBP = new BorderPane();
			BorderPane team7speBP = new BorderPane();
			BorderPane team7ampBP = new BorderPane();
			BorderPane team7trapBP = new BorderPane();
			BorderPane team7climbBP = new BorderPane();
			BorderPane team7highNBP = new BorderPane();
			team7teamNumBP.setTop(team7teamNumTitleL);
			team7cyBP.setTop(team7cyTitleL);
			team7speBP.setTop(team7speTitleL);
			team7ampBP.setTop(team7ampTitleL);
			team7trapBP.setTop(team7trapTitleL);
			team7climbBP.setTop(team7climbTitleL);
			team7highNBP.setTop(team7highNTitleL);
			team7teamNumBP.setCenter(team7teamNumL);
			team7cyBP.setCenter(team7cyL);
			team7speBP.setCenter(team7speL);
			team7ampBP.setCenter(team7ampL);
			team7trapBP.setCenter(team7trapL);
			team7climbBP.setCenter(team7climbL);
			team7highNBP.setCenter(team7highNL);
			team7teamNumBP.setId("findBestTeamStatBP1");
			team7cyBP.setId("findBestTeamStatBP2");
			team7speBP.setId("findBestTeamStatBP3");
			team7ampBP.setId("findBestTeamStatBP4");
			team7trapBP.setId("findBestTeamStatBP5");
			team7climbBP.setId("findBestTeamStatBP6");
			team7highNBP.setId("findBestTeamStatBP7");
			VBox team7teamVB = new VBox(5);
			team7teamVB.getChildren().addAll(team7teamNumBP, team7cyBP, team7speBP, team7ampBP, team7trapBP, team7climbBP, team7highNBP);
			BorderPane team7teamBP = new BorderPane();
			team7teamBP.setCenter(team7teamVB);
			team7teamBP.setId("findBestTeamStatAllBP1");
			//team 8
			tempT = sortedTL.listOfTeams.get(7);
			int team8teamNum = tempT.getTeamNum();
			double team8cy = tempT.getAvgCycles();
			double team8spe = tempT.getAvgSpe();
			double team8amp = tempT.getAvgAmp();
			double team8trap = tempT.getAvgTrap();
			double team8climb = tempT.getAvgClimb();
			double team8highN = tempT.getHumAmpNotes();
			Label team8teamNumL = new Label(Integer.toString(team8teamNum));
			Label team8cyL = new Label(Double.toString(team8cy));
			Label team8speL = new Label(Double.toString(team8spe));
			Label team8ampL = new Label(Double.toString(team8amp));
			Label team8trapL = new Label(Double.toString(team8trap));
			Label team8climbL = new Label(Double.toString(team8climb));
			Label team8highNL = new Label(Double.toString(team8highN));
			team8teamNumL.setId("avgStat");
			team8cyL.setId("avgStat");
			team8speL.setId("avgStat");
			team8ampL.setId("avgStat");
			team8trapL.setId("avgStat");
			team8climbL.setId("avgStat");
			team8highNL.setId("avgStat");
			Label team8teamNumTitleL = new Label("Team Num");
			Label team8cyTitleL = new Label("Avg Cycles");
			Label team8speTitleL = new Label("Avg Speaker");
			Label team8ampTitleL = new Label("Avg Amp");
			Label team8trapTitleL = new Label("Avg Trap");
			Label team8climbTitleL = new Label("Avg CLimb");
			Label team8highNTitleL = new Label("Avg High Notes");
			team8teamNumTitleL.setId("smallTitle");
			team8cyTitleL.setId("smallTitle");
			team8speTitleL.setId("smallTitle");
			team8ampTitleL.setId("smallTitle");
			team8trapTitleL.setId("smallTitle");
			team8climbTitleL.setId("smallTitle");
			team8highNTitleL.setId("smallTitle");
			BorderPane team8teamNumBP = new BorderPane();
			BorderPane team8cyBP = new BorderPane();
			BorderPane team8speBP = new BorderPane();
			BorderPane team8ampBP = new BorderPane();
			BorderPane team8trapBP = new BorderPane();
			BorderPane team8climbBP = new BorderPane();
			BorderPane team8highNBP = new BorderPane();
			team8teamNumBP.setTop(team8teamNumTitleL);
			team8cyBP.setTop(team8cyTitleL);
			team8speBP.setTop(team8speTitleL);
			team8ampBP.setTop(team8ampTitleL);
			team8trapBP.setTop(team8trapTitleL);
			team8climbBP.setTop(team8climbTitleL);
			team8highNBP.setTop(team8highNTitleL);
			team8teamNumBP.setCenter(team8teamNumL);
			team8cyBP.setCenter(team8cyL);
			team8speBP.setCenter(team8speL);
			team8ampBP.setCenter(team8ampL);
			team8trapBP.setCenter(team8trapL);
			team8climbBP.setCenter(team8climbL);
			team8highNBP.setCenter(team8highNL);
			team8teamNumBP.setId("findBestTeamStatBP1");
			team8cyBP.setId("findBestTeamStatBP2");
			team8speBP.setId("findBestTeamStatBP3");
			team8ampBP.setId("findBestTeamStatBP4");
			team8trapBP.setId("findBestTeamStatBP5");
			team8climbBP.setId("findBestTeamStatBP6");
			team8highNBP.setId("findBestTeamStatBP7");
			VBox team8teamVB = new VBox(5);
			team8teamVB.getChildren().addAll(team8teamNumBP, team8cyBP, team8speBP, team8ampBP, team8trapBP, team8climbBP, team8highNBP);
			BorderPane team8teamBP = new BorderPane();
			team8teamBP.setCenter(team8teamVB);
			team8teamBP.setId("findBestTeamStatAllBP1");
			//team 9
			tempT = sortedTL.listOfTeams.get(8);
			int team9teamNum = tempT.getTeamNum();
			double team9cy = tempT.getAvgCycles();
			double team9spe = tempT.getAvgSpe();
			double team9amp = tempT.getAvgAmp();
			double team9trap = tempT.getAvgTrap();
			double team9climb = tempT.getAvgClimb();
			double team9highN = tempT.getHumAmpNotes();
			Label team9teamNumL = new Label(Integer.toString(team9teamNum));
			Label team9cyL = new Label(Double.toString(team9cy));
			Label team9speL = new Label(Double.toString(team9spe));
			Label team9ampL = new Label(Double.toString(team9amp));
			Label team9trapL = new Label(Double.toString(team9trap));
			Label team9climbL = new Label(Double.toString(team9climb));
			Label team9highNL = new Label(Double.toString(team9highN));
			team9teamNumL.setId("avgStat");
			team9cyL.setId("avgStat");
			team9speL.setId("avgStat");
			team9ampL.setId("avgStat");
			team9trapL.setId("avgStat");
			team9climbL.setId("avgStat");
			team9highNL.setId("avgStat");
			Label team9teamNumTitleL = new Label("Team Num");
			Label team9cyTitleL = new Label("Avg Cycles");
			Label team9speTitleL = new Label("Avg Speaker");
			Label team9ampTitleL = new Label("Avg Amp");
			Label team9trapTitleL = new Label("Avg Trap");
			Label team9climbTitleL = new Label("Avg CLimb");
			Label team9highNTitleL = new Label("Avg High Notes");
			team9teamNumTitleL.setId("smallTitle");
			team9cyTitleL.setId("smallTitle");
			team9speTitleL.setId("smallTitle");
			team9ampTitleL.setId("smallTitle");
			team9trapTitleL.setId("smallTitle");
			team9climbTitleL.setId("smallTitle");
			team9highNTitleL.setId("smallTitle");
			BorderPane team9teamNumBP = new BorderPane();
			BorderPane team9cyBP = new BorderPane();
			BorderPane team9speBP = new BorderPane();
			BorderPane team9ampBP = new BorderPane();
			BorderPane team9trapBP = new BorderPane();
			BorderPane team9climbBP = new BorderPane();
			BorderPane team9highNBP = new BorderPane();
			team9teamNumBP.setTop(team9teamNumTitleL);
			team9cyBP.setTop(team9cyTitleL);
			team9speBP.setTop(team9speTitleL);
			team9ampBP.setTop(team9ampTitleL);
			team9trapBP.setTop(team9trapTitleL);
			team9climbBP.setTop(team9climbTitleL);
			team9highNBP.setTop(team9highNTitleL);
			team9teamNumBP.setCenter(team9teamNumL);
			team9cyBP.setCenter(team9cyL);
			team9speBP.setCenter(team9speL);
			team9ampBP.setCenter(team9ampL);
			team9trapBP.setCenter(team9trapL);
			team9climbBP.setCenter(team9climbL);
			team9highNBP.setCenter(team9highNL);
			team9teamNumBP.setId("findBestTeamStatBP1");
			team9cyBP.setId("findBestTeamStatBP2");
			team9speBP.setId("findBestTeamStatBP3");
			team9ampBP.setId("findBestTeamStatBP4");
			team9trapBP.setId("findBestTeamStatBP5");
			team9climbBP.setId("findBestTeamStatBP6");
			team9highNBP.setId("findBestTeamStatBP7");
			VBox team9teamVB = new VBox(5);
			team9teamVB.getChildren().addAll(team9teamNumBP, team9cyBP, team9speBP, team9ampBP, team9trapBP, team9climbBP, team9highNBP);
			BorderPane team9teamBP = new BorderPane();
			team9teamBP.setCenter(team9teamVB);
			team9teamBP.setId("findBestTeamStatAllBP1");
			//team 10
			tempT = sortedTL.listOfTeams.get(9);
			int team10teamNum = tempT.getTeamNum();
			double team10cy = tempT.getAvgCycles();
			double team10spe = tempT.getAvgSpe();
			double team10amp = tempT.getAvgAmp();
			double team10trap = tempT.getAvgTrap();
			double team10climb = tempT.getAvgClimb();
			double team10highN = tempT.getHumAmpNotes();
			Label team10teamNumL = new Label(Integer.toString(team10teamNum));
			Label team10cyL = new Label(Double.toString(team10cy));
			Label team10speL = new Label(Double.toString(team10spe));
			Label team10ampL = new Label(Double.toString(team10amp));
			Label team10trapL = new Label(Double.toString(team10trap));
			Label team10climbL = new Label(Double.toString(team10climb));
			Label team10highNL = new Label(Double.toString(team10highN));
			team10teamNumL.setId("avgStat");
			team10cyL.setId("avgStat");
			team10speL.setId("avgStat");
			team10ampL.setId("avgStat");
			team10trapL.setId("avgStat");
			team10climbL.setId("avgStat");
			team10highNL.setId("avgStat");
			Label team10teamNumTitleL = new Label("Team Num");
			Label team10cyTitleL = new Label("Avg Cycles");
			Label team10speTitleL = new Label("Avg Speaker");
			Label team10ampTitleL = new Label("Avg Amp");
			Label team10trapTitleL = new Label("Avg Trap");
			Label team10climbTitleL = new Label("Avg CLimb");
			Label team10highNTitleL = new Label("Avg High Notes");
			team10teamNumTitleL.setId("smallTitle");
			team10cyTitleL.setId("smallTitle");
			team10speTitleL.setId("smallTitle");
			team10ampTitleL.setId("smallTitle");
			team10trapTitleL.setId("smallTitle");
			team10climbTitleL.setId("smallTitle");
			team10highNTitleL.setId("smallTitle");
			BorderPane team10teamNumBP = new BorderPane();
			BorderPane team10cyBP = new BorderPane();
			BorderPane team10speBP = new BorderPane();
			BorderPane team10ampBP = new BorderPane();
			BorderPane team10trapBP = new BorderPane();
			BorderPane team10climbBP = new BorderPane();
			BorderPane team10highNBP = new BorderPane();
			team10teamNumBP.setTop(team10teamNumTitleL);
			team10cyBP.setTop(team10cyTitleL);
			team10speBP.setTop(team10speTitleL);
			team10ampBP.setTop(team10ampTitleL);
			team10trapBP.setTop(team10trapTitleL);
			team10climbBP.setTop(team10climbTitleL);
			team10highNBP.setTop(team10highNTitleL);
			team10teamNumBP.setCenter(team10teamNumL);
			team10cyBP.setCenter(team10cyL);
			team10speBP.setCenter(team10speL);
			team10ampBP.setCenter(team10ampL);
			team10trapBP.setCenter(team10trapL);
			team10climbBP.setCenter(team10climbL);
			team10highNBP.setCenter(team10highNL);
			team10teamNumBP.setId("findBestTeamStatBP1");
			team10cyBP.setId("findBestTeamStatBP2");
			team10speBP.setId("findBestTeamStatBP3");
			team10ampBP.setId("findBestTeamStatBP4");
			team10trapBP.setId("findBestTeamStatBP5");
			team10climbBP.setId("findBestTeamStatBP6");
			team10highNBP.setId("findBestTeamStatBP7");
			VBox team10teamVB = new VBox(5);
			team10teamVB.getChildren().addAll(team10teamNumBP, team10cyBP, team10speBP, team10ampBP, team10trapBP, team10climbBP, team10highNBP);
			BorderPane team10teamBP = new BorderPane();
			team10teamBP.setCenter(team10teamVB);
			team10teamBP.setId("findBestTeamStatAllBP1");
			this.add(team6teamBP, 1, 3);
			this.add(team7teamBP, 3, 3);
			this.add(team8teamBP, 5, 3);
			this.add(team9teamBP, 7, 3);
			this.add(team10teamBP, 9, 3);
		}
		if(numOfTeams == 15) {
			//team 11
			tempT = sortedTL.listOfTeams.get(10);
			int team11teamNum = tempT.getTeamNum();
			double team11cy = tempT.getAvgCycles();
			double team11spe = tempT.getAvgSpe();
			double team11amp = tempT.getAvgAmp();
			double team11trap = tempT.getAvgTrap();
			double team11climb = tempT.getAvgClimb();
			double team11highN = tempT.getHumAmpNotes();
			Label team11teamNumL = new Label(Integer.toString(team11teamNum));
			Label team11cyL = new Label(Double.toString(team11cy));
			Label team11speL = new Label(Double.toString(team11spe));
			Label team11ampL = new Label(Double.toString(team11amp));
			Label team11trapL = new Label(Double.toString(team11trap));
			Label team11climbL = new Label(Double.toString(team11climb));
			Label team11highNL = new Label(Double.toString(team11highN));
			team11teamNumL.setId("avgStat");
			team11cyL.setId("avgStat");
			team11speL.setId("avgStat");
			team11ampL.setId("avgStat");
			team11trapL.setId("avgStat");
			team11climbL.setId("avgStat");
			team11highNL.setId("avgStat");
			Label team11teamNumTitleL = new Label("Team Num");
			Label team11cyTitleL = new Label("Avg Cycles");
			Label team11speTitleL = new Label("Avg Speaker");
			Label team11ampTitleL = new Label("Avg Amp");
			Label team11trapTitleL = new Label("Avg Trap");
			Label team11climbTitleL = new Label("Avg CLimb");
			Label team11highNTitleL = new Label("Avg High Notes");
			team11teamNumTitleL.setId("smallTitle");
			team11cyTitleL.setId("smallTitle");
			team11speTitleL.setId("smallTitle");
			team11ampTitleL.setId("smallTitle");
			team11trapTitleL.setId("smallTitle");
			team11climbTitleL.setId("smallTitle");
			team11highNTitleL.setId("smallTitle");
			BorderPane team11teamNumBP = new BorderPane();
			BorderPane team11cyBP = new BorderPane();
			BorderPane team11speBP = new BorderPane();
			BorderPane team11ampBP = new BorderPane();
			BorderPane team11trapBP = new BorderPane();
			BorderPane team11climbBP = new BorderPane();
			BorderPane team11highNBP = new BorderPane();
			team11teamNumBP.setTop(team11teamNumTitleL);
			team11cyBP.setTop(team11cyTitleL);
			team11speBP.setTop(team11speTitleL);
			team11ampBP.setTop(team11ampTitleL);
			team11trapBP.setTop(team11trapTitleL);
			team11climbBP.setTop(team11climbTitleL);
			team11highNBP.setTop(team11highNTitleL);
			team11teamNumBP.setCenter(team11teamNumL);
			team11cyBP.setCenter(team11cyL);
			team11speBP.setCenter(team11speL);
			team11ampBP.setCenter(team11ampL);
			team11trapBP.setCenter(team11trapL);
			team11climbBP.setCenter(team11climbL);
			team11highNBP.setCenter(team11highNL);
			team11teamNumBP.setId("findBestTeamStatBP1");
			team11cyBP.setId("findBestTeamStatBP2");
			team11speBP.setId("findBestTeamStatBP3");
			team11ampBP.setId("findBestTeamStatBP4");
			team11trapBP.setId("findBestTeamStatBP5");
			team11climbBP.setId("findBestTeamStatBP6");
			team11highNBP.setId("findBestTeamStatBP7");
			VBox team11teamVB = new VBox(5);
			team11teamVB.getChildren().addAll(team11teamNumBP, team11cyBP, team11speBP, team11ampBP, team11trapBP, team11climbBP, team11highNBP);
			BorderPane team11teamBP = new BorderPane();
			team11teamBP.setCenter(team11teamVB);
			team11teamBP.setId("findBestTeamStatAllBP1");
			//team 12
			tempT = sortedTL.listOfTeams.get(11);
			int team12teamNum = tempT.getTeamNum();
			double team12cy = tempT.getAvgCycles();
			double team12spe = tempT.getAvgSpe();
			double team12amp = tempT.getAvgAmp();
			double team12trap = tempT.getAvgTrap();
			double team12climb = tempT.getAvgClimb();
			double team12highN = tempT.getHumAmpNotes();
			Label team12teamNumL = new Label(Integer.toString(team12teamNum));
			Label team12cyL = new Label(Double.toString(team12cy));
			Label team12speL = new Label(Double.toString(team12spe));
			Label team12ampL = new Label(Double.toString(team12amp));
			Label team12trapL = new Label(Double.toString(team12trap));
			Label team12climbL = new Label(Double.toString(team12climb));
			Label team12highNL = new Label(Double.toString(team12highN));
			team12teamNumL.setId("avgStat");
			team12cyL.setId("avgStat");
			team12speL.setId("avgStat");
			team12ampL.setId("avgStat");
			team12trapL.setId("avgStat");
			team12climbL.setId("avgStat");
			team12highNL.setId("avgStat");
			Label team12teamNumTitleL = new Label("Team Num");
			Label team12cyTitleL = new Label("Avg Cycles");
			Label team12speTitleL = new Label("Avg Speaker");
			Label team12ampTitleL = new Label("Avg Amp");
			Label team12trapTitleL = new Label("Avg Trap");
			Label team12climbTitleL = new Label("Avg CLimb");
			Label team12highNTitleL = new Label("Avg High Notes");
			team12teamNumTitleL.setId("smallTitle");
			team12cyTitleL.setId("smallTitle");
			team12speTitleL.setId("smallTitle");
			team12ampTitleL.setId("smallTitle");
			team12trapTitleL.setId("smallTitle");
			team12climbTitleL.setId("smallTitle");
			team12highNTitleL.setId("smallTitle");
			BorderPane team12teamNumBP = new BorderPane();
			BorderPane team12cyBP = new BorderPane();
			BorderPane team12speBP = new BorderPane();
			BorderPane team12ampBP = new BorderPane();
			BorderPane team12trapBP = new BorderPane();
			BorderPane team12climbBP = new BorderPane();
			BorderPane team12highNBP = new BorderPane();
			team12teamNumBP.setTop(team12teamNumTitleL);
			team12cyBP.setTop(team12cyTitleL);
			team12speBP.setTop(team12speTitleL);
			team12ampBP.setTop(team12ampTitleL);
			team12trapBP.setTop(team12trapTitleL);
			team12climbBP.setTop(team12climbTitleL);
			team12highNBP.setTop(team12highNTitleL);
			team12teamNumBP.setCenter(team12teamNumL);
			team12cyBP.setCenter(team12cyL);
			team12speBP.setCenter(team12speL);
			team12ampBP.setCenter(team12ampL);
			team12trapBP.setCenter(team12trapL);
			team12climbBP.setCenter(team12climbL);
			team12highNBP.setCenter(team12highNL);
			team12teamNumBP.setId("findBestTeamStatBP1");
			team12cyBP.setId("findBestTeamStatBP2");
			team12speBP.setId("findBestTeamStatBP3");
			team12ampBP.setId("findBestTeamStatBP4");
			team12trapBP.setId("findBestTeamStatBP5");
			team12climbBP.setId("findBestTeamStatBP6");
			team12highNBP.setId("findBestTeamStatBP7");
			VBox team12teamVB = new VBox(5);
			team12teamVB.getChildren().addAll(team12teamNumBP, team12cyBP, team12speBP, team12ampBP, team12trapBP, team12climbBP, team12highNBP);
			BorderPane team12teamBP = new BorderPane();
			team12teamBP.setCenter(team12teamVB);
			team12teamBP.setId("findBestTeamStatAllBP1");
			//team 13
			tempT = sortedTL.listOfTeams.get(12);
			int team13teamNum = tempT.getTeamNum();
			double team13cy = tempT.getAvgCycles();
			double team13spe = tempT.getAvgSpe();
			double team13amp = tempT.getAvgAmp();
			double team13trap = tempT.getAvgTrap();
			double team13climb = tempT.getAvgClimb();
			double team13highN = tempT.getHumAmpNotes();
			Label team13teamNumL = new Label(Integer.toString(team13teamNum));
			Label team13cyL = new Label(Double.toString(team13cy));
			Label team13speL = new Label(Double.toString(team13spe));
			Label team13ampL = new Label(Double.toString(team13amp));
			Label team13trapL = new Label(Double.toString(team13trap));
			Label team13climbL = new Label(Double.toString(team13climb));
			Label team13highNL = new Label(Double.toString(team13highN));
			team13teamNumL.setId("avgStat");
			team13cyL.setId("avgStat");
			team13speL.setId("avgStat");
			team13ampL.setId("avgStat");
			team13trapL.setId("avgStat");
			team13climbL.setId("avgStat");
			team13highNL.setId("avgStat");
			Label team13teamNumTitleL = new Label("Team Num");
			Label team13cyTitleL = new Label("Avg Cycles");
			Label team13speTitleL = new Label("Avg Speaker");
			Label team13ampTitleL = new Label("Avg Amp");
			Label team13trapTitleL = new Label("Avg Trap");
			Label team13climbTitleL = new Label("Avg CLimb");
			Label team13highNTitleL = new Label("Avg High Notes");
			team13teamNumTitleL.setId("smallTitle");
			team13cyTitleL.setId("smallTitle");
			team13speTitleL.setId("smallTitle");
			team13ampTitleL.setId("smallTitle");
			team13trapTitleL.setId("smallTitle");
			team13climbTitleL.setId("smallTitle");
			team13highNTitleL.setId("smallTitle");
			BorderPane team13teamNumBP = new BorderPane();
			BorderPane team13cyBP = new BorderPane();
			BorderPane team13speBP = new BorderPane();
			BorderPane team13ampBP = new BorderPane();
			BorderPane team13trapBP = new BorderPane();
			BorderPane team13climbBP = new BorderPane();
			BorderPane team13highNBP = new BorderPane();
			team13teamNumBP.setTop(team13teamNumTitleL);
			team13cyBP.setTop(team13cyTitleL);
			team13speBP.setTop(team13speTitleL);
			team13ampBP.setTop(team13ampTitleL);
			team13trapBP.setTop(team13trapTitleL);
			team13climbBP.setTop(team13climbTitleL);
			team13highNBP.setTop(team13highNTitleL);
			team13teamNumBP.setCenter(team13teamNumL);
			team13cyBP.setCenter(team13cyL);
			team13speBP.setCenter(team13speL);
			team13ampBP.setCenter(team13ampL);
			team13trapBP.setCenter(team13trapL);
			team13climbBP.setCenter(team13climbL);
			team13highNBP.setCenter(team13highNL);
			team13teamNumBP.setId("findBestTeamStatBP1");
			team13cyBP.setId("findBestTeamStatBP2");
			team13speBP.setId("findBestTeamStatBP3");
			team13ampBP.setId("findBestTeamStatBP4");
			team13trapBP.setId("findBestTeamStatBP5");
			team13climbBP.setId("findBestTeamStatBP6");
			team13highNBP.setId("findBestTeamStatBP7");
			VBox team13teamVB = new VBox(5);
			team13teamVB.getChildren().addAll(team13teamNumBP, team13cyBP, team13speBP, team13ampBP, team13trapBP, team13climbBP, team13highNBP);
			BorderPane team13teamBP = new BorderPane();
			team13teamBP.setCenter(team13teamVB);
			team13teamBP.setId("findBestTeamStatAllBP1");
			//team 14
			tempT = sortedTL.listOfTeams.get(13);
			int team14teamNum = tempT.getTeamNum();
			double team14cy = tempT.getAvgCycles();
			double team14spe = tempT.getAvgSpe();
			double team14amp = tempT.getAvgAmp();
			double team14trap = tempT.getAvgTrap();
			double team14climb = tempT.getAvgClimb();
			double team14highN = tempT.getHumAmpNotes();
			Label team14teamNumL = new Label(Integer.toString(team14teamNum));
			Label team14cyL = new Label(Double.toString(team14cy));
			Label team14speL = new Label(Double.toString(team14spe));
			Label team14ampL = new Label(Double.toString(team14amp));
			Label team14trapL = new Label(Double.toString(team14trap));
			Label team14climbL = new Label(Double.toString(team14climb));
			Label team14highNL = new Label(Double.toString(team14highN));
			team14teamNumL.setId("avgStat");
			team14cyL.setId("avgStat");
			team14speL.setId("avgStat");
			team14ampL.setId("avgStat");
			team14trapL.setId("avgStat");
			team14climbL.setId("avgStat");
			team14highNL.setId("avgStat");
			Label team14teamNumTitleL = new Label("Team Num");
			Label team14cyTitleL = new Label("Avg Cycles");
			Label team14speTitleL = new Label("Avg Speaker");
			Label team14ampTitleL = new Label("Avg Amp");
			Label team14trapTitleL = new Label("Avg Trap");
			Label team14climbTitleL = new Label("Avg CLimb");
			Label team14highNTitleL = new Label("Avg High Notes");
			team14teamNumTitleL.setId("smallTitle");
			team14cyTitleL.setId("smallTitle");
			team14speTitleL.setId("smallTitle");
			team14ampTitleL.setId("smallTitle");
			team14trapTitleL.setId("smallTitle");
			team14climbTitleL.setId("smallTitle");
			team14highNTitleL.setId("smallTitle");
			BorderPane team14teamNumBP = new BorderPane();
			BorderPane team14cyBP = new BorderPane();
			BorderPane team14speBP = new BorderPane();
			BorderPane team14ampBP = new BorderPane();
			BorderPane team14trapBP = new BorderPane();
			BorderPane team14climbBP = new BorderPane();
			BorderPane team14highNBP = new BorderPane();
			team14teamNumBP.setTop(team14teamNumTitleL);
			team14cyBP.setTop(team14cyTitleL);
			team14speBP.setTop(team14speTitleL);
			team14ampBP.setTop(team14ampTitleL);
			team14trapBP.setTop(team14trapTitleL);
			team14climbBP.setTop(team14climbTitleL);
			team14highNBP.setTop(team14highNTitleL);
			team14teamNumBP.setCenter(team14teamNumL);
			team14cyBP.setCenter(team14cyL);
			team14speBP.setCenter(team14speL);
			team14ampBP.setCenter(team14ampL);
			team14trapBP.setCenter(team14trapL);
			team14climbBP.setCenter(team14climbL);
			team14highNBP.setCenter(team14highNL);
			team14teamNumBP.setId("findBestTeamStatBP1");
			team14cyBP.setId("findBestTeamStatBP2");
			team14speBP.setId("findBestTeamStatBP3");
			team14ampBP.setId("findBestTeamStatBP4");
			team14trapBP.setId("findBestTeamStatBP5");
			team14climbBP.setId("findBestTeamStatBP6");
			team14highNBP.setId("findBestTeamStatBP7");
			VBox team14teamVB = new VBox(5);
			team14teamVB.getChildren().addAll(team14teamNumBP, team14cyBP, team14speBP, team14ampBP, team14trapBP, team14climbBP, team14highNBP);
			BorderPane team14teamBP = new BorderPane();
			team14teamBP.setCenter(team14teamVB);
			team14teamBP.setId("findBestTeamStatAllBP1");
			//team 15
			tempT = sortedTL.listOfTeams.get(14);
			int team15teamNum = tempT.getTeamNum();
			double team15cy = tempT.getAvgCycles();
			double team15spe = tempT.getAvgSpe();
			double team15amp = tempT.getAvgAmp();
			double team15trap = tempT.getAvgTrap();
			double team15climb = tempT.getAvgClimb();
			double team15highN = tempT.getHumAmpNotes();
			Label team15teamNumL = new Label(Integer.toString(team15teamNum));
			Label team15cyL = new Label(Double.toString(team15cy));
			Label team15speL = new Label(Double.toString(team15spe));
			Label team15ampL = new Label(Double.toString(team15amp));
			Label team15trapL = new Label(Double.toString(team15trap));
			Label team15climbL = new Label(Double.toString(team15climb));
			Label team15highNL = new Label(Double.toString(team15highN));
			team15teamNumL.setId("avgStat");
			team15cyL.setId("avgStat");
			team15speL.setId("avgStat");
			team15ampL.setId("avgStat");
			team15trapL.setId("avgStat");
			team15climbL.setId("avgStat");
			team15highNL.setId("avgStat");
			Label team15teamNumTitleL = new Label("Team Num");
			Label team15cyTitleL = new Label("Avg Cycles");
			Label team15speTitleL = new Label("Avg Speaker");
			Label team15ampTitleL = new Label("Avg Amp");
			Label team15trapTitleL = new Label("Avg Trap");
			Label team15climbTitleL = new Label("Avg CLimb");
			Label team15highNTitleL = new Label("Avg High Notes");
			team15teamNumTitleL.setId("smallTitle");
			team15cyTitleL.setId("smallTitle");
			team15speTitleL.setId("smallTitle");
			team15ampTitleL.setId("smallTitle");
			team15trapTitleL.setId("smallTitle");
			team15climbTitleL.setId("smallTitle");
			team15highNTitleL.setId("smallTitle");
			BorderPane team15teamNumBP = new BorderPane();
			BorderPane team15cyBP = new BorderPane();
			BorderPane team15speBP = new BorderPane();
			BorderPane team15ampBP = new BorderPane();
			BorderPane team15trapBP = new BorderPane();
			BorderPane team15climbBP = new BorderPane();
			BorderPane team15highNBP = new BorderPane();
			team15teamNumBP.setTop(team15teamNumTitleL);
			team15cyBP.setTop(team15cyTitleL);
			team15speBP.setTop(team15speTitleL);
			team15ampBP.setTop(team15ampTitleL);
			team15trapBP.setTop(team15trapTitleL);
			team15climbBP.setTop(team15climbTitleL);
			team15highNBP.setTop(team15highNTitleL);
			team15teamNumBP.setCenter(team15teamNumL);
			team15cyBP.setCenter(team15cyL);
			team15speBP.setCenter(team15speL);
			team15ampBP.setCenter(team15ampL);
			team15trapBP.setCenter(team15trapL);
			team15climbBP.setCenter(team15climbL);
			team15highNBP.setCenter(team15highNL);
			team15teamNumBP.setId("findBestTeamStatBP1");
			team15cyBP.setId("findBestTeamStatBP2");
			team15speBP.setId("findBestTeamStatBP3");
			team15ampBP.setId("findBestTeamStatBP4");
			team15trapBP.setId("findBestTeamStatBP5");
			team15climbBP.setId("findBestTeamStatBP6");
			team15highNBP.setId("findBestTeamStatBP7");
			VBox team15teamVB = new VBox(5);
			team15teamVB.getChildren().addAll(team15teamNumBP, team15cyBP, team15speBP, team15ampBP, team15trapBP, team15climbBP, team15highNBP);
			BorderPane team15teamBP = new BorderPane();
			team15teamBP.setCenter(team15teamVB);
			team15teamBP.setId("findBestTeamStatAllBP1");
			this.add(team11teamBP, 1, 5);
			this.add(team12teamBP, 3, 5);
			this.add(team13teamBP, 5, 5);
			this.add(team14teamBP, 7, 5);
			this.add(team15teamBP, 9, 5);
		}
		if(numOfTeams == 20) {
			//team 16
			tempT = sortedTL.listOfTeams.get(15);
			int team16teamNum = tempT.getTeamNum();
			double team16cy = tempT.getAvgCycles();
			double team16spe = tempT.getAvgSpe();
			double team16amp = tempT.getAvgAmp();
			double team16trap = tempT.getAvgTrap();
			double team16climb = tempT.getAvgClimb();
			double team16highN = tempT.getHumAmpNotes();
			Label team16teamNumL = new Label(Integer.toString(team16teamNum));
			Label team16cyL = new Label(Double.toString(team16cy));
			Label team16speL = new Label(Double.toString(team16spe));
			Label team16ampL = new Label(Double.toString(team16amp));
			Label team16trapL = new Label(Double.toString(team16trap));
			Label team16climbL = new Label(Double.toString(team16climb));
			Label team16highNL = new Label(Double.toString(team16highN));
			team16teamNumL.setId("avgStat");
			team16cyL.setId("avgStat");
			team16speL.setId("avgStat");
			team16ampL.setId("avgStat");
			team16trapL.setId("avgStat");
			team16climbL.setId("avgStat");
			team16highNL.setId("avgStat");
			Label team16teamNumTitleL = new Label("Team Num");
			Label team16cyTitleL = new Label("Avg Cycles");
			Label team16speTitleL = new Label("Avg Speaker");
			Label team16ampTitleL = new Label("Avg Amp");
			Label team16trapTitleL = new Label("Avg Trap");
			Label team16climbTitleL = new Label("Avg CLimb");
			Label team16highNTitleL = new Label("Avg High Notes");
			team16teamNumTitleL.setId("smallTitle");
			team16cyTitleL.setId("smallTitle");
			team16speTitleL.setId("smallTitle");
			team16ampTitleL.setId("smallTitle");
			team16trapTitleL.setId("smallTitle");
			team16climbTitleL.setId("smallTitle");
			team16highNTitleL.setId("smallTitle");
			BorderPane team16teamNumBP = new BorderPane();
			BorderPane team16cyBP = new BorderPane();
			BorderPane team16speBP = new BorderPane();
			BorderPane team16ampBP = new BorderPane();
			BorderPane team16trapBP = new BorderPane();
			BorderPane team16climbBP = new BorderPane();
			BorderPane team16highNBP = new BorderPane();
			team16teamNumBP.setTop(team16teamNumTitleL);
			team16cyBP.setTop(team16cyTitleL);
			team16speBP.setTop(team16speTitleL);
			team16ampBP.setTop(team16ampTitleL);
			team16trapBP.setTop(team16trapTitleL);
			team16climbBP.setTop(team16climbTitleL);
			team16highNBP.setTop(team16highNTitleL);
			team16teamNumBP.setCenter(team16teamNumL);
			team16cyBP.setCenter(team16cyL);
			team16speBP.setCenter(team16speL);
			team16ampBP.setCenter(team16ampL);
			team16trapBP.setCenter(team16trapL);
			team16climbBP.setCenter(team16climbL);
			team16highNBP.setCenter(team16highNL);
			team16teamNumBP.setId("findBestTeamStatBP1");
			team16cyBP.setId("findBestTeamStatBP2");
			team16speBP.setId("findBestTeamStatBP3");
			team16ampBP.setId("findBestTeamStatBP4");
			team16trapBP.setId("findBestTeamStatBP5");
			team16climbBP.setId("findBestTeamStatBP6");
			team16highNBP.setId("findBestTeamStatBP7");
			VBox team16teamVB = new VBox(5);
			team16teamVB.getChildren().addAll(team16teamNumBP, team16cyBP, team16speBP, team16ampBP, team16trapBP, team16climbBP, team16highNBP);
			BorderPane team16teamBP = new BorderPane();
			team16teamBP.setCenter(team16teamVB);
			team16teamBP.setId("findBestTeamStatAllBP1");
			//team 17
			tempT = sortedTL.listOfTeams.get(16);
			int team17teamNum = tempT.getTeamNum();
			double team17cy = tempT.getAvgCycles();
			double team17spe = tempT.getAvgSpe();
			double team17amp = tempT.getAvgAmp();
			double team17trap = tempT.getAvgTrap();
			double team17climb = tempT.getAvgClimb();
			double team17highN = tempT.getHumAmpNotes();
			Label team17teamNumL = new Label(Integer.toString(team17teamNum));
			Label team17cyL = new Label(Double.toString(team17cy));
			Label team17speL = new Label(Double.toString(team17spe));
			Label team17ampL = new Label(Double.toString(team17amp));
			Label team17trapL = new Label(Double.toString(team17trap));
			Label team17climbL = new Label(Double.toString(team17climb));
			Label team17highNL = new Label(Double.toString(team17highN));
			team17teamNumL.setId("avgStat");
			team17cyL.setId("avgStat");
			team17speL.setId("avgStat");
			team17ampL.setId("avgStat");
			team17trapL.setId("avgStat");
			team17climbL.setId("avgStat");
			team17highNL.setId("avgStat");
			Label team17teamNumTitleL = new Label("Team Num");
			Label team17cyTitleL = new Label("Avg Cycles");
			Label team17speTitleL = new Label("Avg Speaker");
			Label team17ampTitleL = new Label("Avg Amp");
			Label team17trapTitleL = new Label("Avg Trap");
			Label team17climbTitleL = new Label("Avg CLimb");
			Label team17highNTitleL = new Label("Avg High Notes");
			team17teamNumTitleL.setId("smallTitle");
			team17cyTitleL.setId("smallTitle");
			team17speTitleL.setId("smallTitle");
			team17ampTitleL.setId("smallTitle");
			team17trapTitleL.setId("smallTitle");
			team17climbTitleL.setId("smallTitle");
			team17highNTitleL.setId("smallTitle");
			BorderPane team17teamNumBP = new BorderPane();
			BorderPane team17cyBP = new BorderPane();
			BorderPane team17speBP = new BorderPane();
			BorderPane team17ampBP = new BorderPane();
			BorderPane team17trapBP = new BorderPane();
			BorderPane team17climbBP = new BorderPane();
			BorderPane team17highNBP = new BorderPane();
			team17teamNumBP.setTop(team17teamNumTitleL);
			team17cyBP.setTop(team17cyTitleL);
			team17speBP.setTop(team17speTitleL);
			team17ampBP.setTop(team17ampTitleL);
			team17trapBP.setTop(team17trapTitleL);
			team17climbBP.setTop(team17climbTitleL);
			team17highNBP.setTop(team17highNTitleL);
			team17teamNumBP.setCenter(team17teamNumL);
			team17cyBP.setCenter(team17cyL);
			team17speBP.setCenter(team17speL);
			team17ampBP.setCenter(team17ampL);
			team17trapBP.setCenter(team17trapL);
			team17climbBP.setCenter(team17climbL);
			team17highNBP.setCenter(team17highNL);
			team17teamNumBP.setId("findBestTeamStatBP1");
			team17cyBP.setId("findBestTeamStatBP2");
			team17speBP.setId("findBestTeamStatBP3");
			team17ampBP.setId("findBestTeamStatBP4");
			team17trapBP.setId("findBestTeamStatBP5");
			team17climbBP.setId("findBestTeamStatBP6");
			team17highNBP.setId("findBestTeamStatBP7");
			VBox team17teamVB = new VBox(5);
			team17teamVB.getChildren().addAll(team17teamNumBP, team17cyBP, team17speBP, team17ampBP, team17trapBP, team17climbBP, team17highNBP);
			BorderPane team17teamBP = new BorderPane();
			team17teamBP.setCenter(team17teamVB);
			team17teamBP.setId("findBestTeamStatAllBP1");
			//team 18
			tempT = sortedTL.listOfTeams.get(17);
			int team18teamNum = tempT.getTeamNum();
			double team18cy = tempT.getAvgCycles();
			double team18spe = tempT.getAvgSpe();
			double team18amp = tempT.getAvgAmp();
			double team18trap = tempT.getAvgTrap();
			double team18climb = tempT.getAvgClimb();
			double team18highN = tempT.getHumAmpNotes();
			Label team18teamNumL = new Label(Integer.toString(team18teamNum));
			Label team18cyL = new Label(Double.toString(team18cy));
			Label team18speL = new Label(Double.toString(team18spe));
			Label team18ampL = new Label(Double.toString(team18amp));
			Label team18trapL = new Label(Double.toString(team18trap));
			Label team18climbL = new Label(Double.toString(team18climb));
			Label team18highNL = new Label(Double.toString(team18highN));
			team18teamNumL.setId("avgStat");
			team18cyL.setId("avgStat");
			team18speL.setId("avgStat");
			team18ampL.setId("avgStat");
			team18trapL.setId("avgStat");
			team18climbL.setId("avgStat");
			team18highNL.setId("avgStat");
			Label team18teamNumTitleL = new Label("Team Num");
			Label team18cyTitleL = new Label("Avg Cycles");
			Label team18speTitleL = new Label("Avg Speaker");
			Label team18ampTitleL = new Label("Avg Amp");
			Label team18trapTitleL = new Label("Avg Trap");
			Label team18climbTitleL = new Label("Avg CLimb");
			Label team18highNTitleL = new Label("Avg High Notes");
			team18teamNumTitleL.setId("smallTitle");
			team18cyTitleL.setId("smallTitle");
			team18speTitleL.setId("smallTitle");
			team18ampTitleL.setId("smallTitle");
			team18trapTitleL.setId("smallTitle");
			team18climbTitleL.setId("smallTitle");
			team18highNTitleL.setId("smallTitle");
			BorderPane team18teamNumBP = new BorderPane();
			BorderPane team18cyBP = new BorderPane();
			BorderPane team18speBP = new BorderPane();
			BorderPane team18ampBP = new BorderPane();
			BorderPane team18trapBP = new BorderPane();
			BorderPane team18climbBP = new BorderPane();
			BorderPane team18highNBP = new BorderPane();
			team18teamNumBP.setTop(team18teamNumTitleL);
			team18cyBP.setTop(team18cyTitleL);
			team18speBP.setTop(team18speTitleL);
			team18ampBP.setTop(team18ampTitleL);
			team18trapBP.setTop(team18trapTitleL);
			team18climbBP.setTop(team18climbTitleL);
			team18highNBP.setTop(team18highNTitleL);
			team18teamNumBP.setCenter(team18teamNumL);
			team18cyBP.setCenter(team18cyL);
			team18speBP.setCenter(team18speL);
			team18ampBP.setCenter(team18ampL);
			team18trapBP.setCenter(team18trapL);
			team18climbBP.setCenter(team18climbL);
			team18highNBP.setCenter(team18highNL);
			team18teamNumBP.setId("findBestTeamStatBP1");
			team18cyBP.setId("findBestTeamStatBP2");
			team18speBP.setId("findBestTeamStatBP3");
			team18ampBP.setId("findBestTeamStatBP4");
			team18trapBP.setId("findBestTeamStatBP5");
			team18climbBP.setId("findBestTeamStatBP6");
			team18highNBP.setId("findBestTeamStatBP7");
			VBox team18teamVB = new VBox(5);
			team18teamVB.getChildren().addAll(team18teamNumBP, team18cyBP, team18speBP, team18ampBP, team18trapBP, team18climbBP, team18highNBP);
			BorderPane team18teamBP = new BorderPane();
			team18teamBP.setCenter(team18teamVB);
			team18teamBP.setId("findBestTeamStatAllBP1");
			//team 19
			tempT = sortedTL.listOfTeams.get(18);
			int team19teamNum = tempT.getTeamNum();
			double team19cy = tempT.getAvgCycles();
			double team19spe = tempT.getAvgSpe();
			double team19amp = tempT.getAvgAmp();
			double team19trap = tempT.getAvgTrap();
			double team19climb = tempT.getAvgClimb();
			double team19highN = tempT.getHumAmpNotes();
			Label team19teamNumL = new Label(Integer.toString(team19teamNum));
			Label team19cyL = new Label(Double.toString(team19cy));
			Label team19speL = new Label(Double.toString(team19spe));
			Label team19ampL = new Label(Double.toString(team19amp));
			Label team19trapL = new Label(Double.toString(team19trap));
			Label team19climbL = new Label(Double.toString(team19climb));
			Label team19highNL = new Label(Double.toString(team19highN));
			team19teamNumL.setId("avgStat");
			team19cyL.setId("avgStat");
			team19speL.setId("avgStat");
			team19ampL.setId("avgStat");
			team19trapL.setId("avgStat");
			team19climbL.setId("avgStat");
			team19highNL.setId("avgStat");
			Label team19teamNumTitleL = new Label("Team Num");
			Label team19cyTitleL = new Label("Avg Cycles");
			Label team19speTitleL = new Label("Avg Speaker");
			Label team19ampTitleL = new Label("Avg Amp");
			Label team19trapTitleL = new Label("Avg Trap");
			Label team19climbTitleL = new Label("Avg CLimb");
			Label team19highNTitleL = new Label("Avg High Notes");
			team19teamNumTitleL.setId("smallTitle");
			team19cyTitleL.setId("smallTitle");
			team19speTitleL.setId("smallTitle");
			team19ampTitleL.setId("smallTitle");
			team19trapTitleL.setId("smallTitle");
			team19climbTitleL.setId("smallTitle");
			team19highNTitleL.setId("smallTitle");
			BorderPane team19teamNumBP = new BorderPane();
			BorderPane team19cyBP = new BorderPane();
			BorderPane team19speBP = new BorderPane();
			BorderPane team19ampBP = new BorderPane();
			BorderPane team19trapBP = new BorderPane();
			BorderPane team19climbBP = new BorderPane();
			BorderPane team19highNBP = new BorderPane();
			team19teamNumBP.setTop(team19teamNumTitleL);
			team19cyBP.setTop(team19cyTitleL);
			team19speBP.setTop(team19speTitleL);
			team19ampBP.setTop(team19ampTitleL);
			team19trapBP.setTop(team19trapTitleL);
			team19climbBP.setTop(team19climbTitleL);
			team19highNBP.setTop(team19highNTitleL);
			team19teamNumBP.setCenter(team19teamNumL);
			team19cyBP.setCenter(team19cyL);
			team19speBP.setCenter(team19speL);
			team19ampBP.setCenter(team19ampL);
			team19trapBP.setCenter(team19trapL);
			team19climbBP.setCenter(team19climbL);
			team19highNBP.setCenter(team19highNL);
			team19teamNumBP.setId("findBestTeamStatBP1");
			team19cyBP.setId("findBestTeamStatBP2");
			team19speBP.setId("findBestTeamStatBP3");
			team19ampBP.setId("findBestTeamStatBP4");
			team19trapBP.setId("findBestTeamStatBP5");
			team19climbBP.setId("findBestTeamStatBP6");
			team19highNBP.setId("findBestTeamStatBP7");
			VBox team19teamVB = new VBox(5);
			team19teamVB.getChildren().addAll(team19teamNumBP, team19cyBP, team19speBP, team19ampBP, team19trapBP, team19climbBP, team19highNBP);
			BorderPane team19teamBP = new BorderPane();
			team19teamBP.setCenter(team19teamVB);
			team19teamBP.setId("findBestTeamStatAllBP1");
			//team 20
			tempT = sortedTL.listOfTeams.get(19);
			int team20teamNum = tempT.getTeamNum();
			double team20cy = tempT.getAvgCycles();
			double team20spe = tempT.getAvgSpe();
			double team20amp = tempT.getAvgAmp();
			double team20trap = tempT.getAvgTrap();
			double team20climb = tempT.getAvgClimb();
			double team20highN = tempT.getHumAmpNotes();
			Label team20teamNumL = new Label(Integer.toString(team20teamNum));
			Label team20cyL = new Label(Double.toString(team20cy));
			Label team20speL = new Label(Double.toString(team20spe));
			Label team20ampL = new Label(Double.toString(team20amp));
			Label team20trapL = new Label(Double.toString(team20trap));
			Label team20climbL = new Label(Double.toString(team20climb));
			Label team20highNL = new Label(Double.toString(team20highN));
			team20teamNumL.setId("avgStat");
			team20cyL.setId("avgStat");
			team20speL.setId("avgStat");
			team20ampL.setId("avgStat");
			team20trapL.setId("avgStat");
			team20climbL.setId("avgStat");
			team20highNL.setId("avgStat");
			Label team20teamNumTitleL = new Label("Team Num");
			Label team20cyTitleL = new Label("Avg Cycles");
			Label team20speTitleL = new Label("Avg Speaker");
			Label team20ampTitleL = new Label("Avg Amp");
			Label team20trapTitleL = new Label("Avg Trap");
			Label team20climbTitleL = new Label("Avg CLimb");
			Label team20highNTitleL = new Label("Avg High Notes");
			team20teamNumTitleL.setId("smallTitle");
			team20cyTitleL.setId("smallTitle");
			team20speTitleL.setId("smallTitle");
			team20ampTitleL.setId("smallTitle");
			team20trapTitleL.setId("smallTitle");
			team20climbTitleL.setId("smallTitle");
			team20highNTitleL.setId("smallTitle");
			BorderPane team20teamNumBP = new BorderPane();
			BorderPane team20cyBP = new BorderPane();
			BorderPane team20speBP = new BorderPane();
			BorderPane team20ampBP = new BorderPane();
			BorderPane team20trapBP = new BorderPane();
			BorderPane team20climbBP = new BorderPane();
			BorderPane team20highNBP = new BorderPane();
			team20teamNumBP.setTop(team20teamNumTitleL);
			team20cyBP.setTop(team20cyTitleL);
			team20speBP.setTop(team20speTitleL);
			team20ampBP.setTop(team20ampTitleL);
			team20trapBP.setTop(team20trapTitleL);
			team20climbBP.setTop(team20climbTitleL);
			team20highNBP.setTop(team20highNTitleL);
			team20teamNumBP.setCenter(team20teamNumL);
			team20cyBP.setCenter(team20cyL);
			team20speBP.setCenter(team20speL);
			team20ampBP.setCenter(team20ampL);
			team20trapBP.setCenter(team20trapL);
			team20climbBP.setCenter(team20climbL);
			team20highNBP.setCenter(team20highNL);
			team20teamNumBP.setId("findBestTeamStatBP1");
			team20cyBP.setId("findBestTeamStatBP2");
			team20speBP.setId("findBestTeamStatBP3");
			team20ampBP.setId("findBestTeamStatBP4");
			team20trapBP.setId("findBestTeamStatBP5");
			team20climbBP.setId("findBestTeamStatBP6");
			team20highNBP.setId("findBestTeamStatBP7");
			VBox team20teamVB = new VBox(5);
			team20teamVB.getChildren().addAll(team20teamNumBP, team20cyBP, team20speBP, team20ampBP, team20trapBP, team20climbBP, team20highNBP);
			BorderPane team20teamBP = new BorderPane();
			team20teamBP.setCenter(team20teamVB);
			team20teamBP.setId("findBestTeamStatAllBP1");
			this.add(team16teamBP, 1, 7);
			this.add(team17teamBP, 3, 7);
			this.add(team18teamBP, 5, 7);
			this.add(team19teamBP, 7, 7);
			this.add(team20teamBP, 9, 7);
		}
		if(numOfTeams == 25) {
			//team 21
			tempT = sortedTL.listOfTeams.get(20);
			int team21teamNum = tempT.getTeamNum();
			double team21cy = tempT.getAvgCycles();
			double team21spe = tempT.getAvgSpe();
			double team21amp = tempT.getAvgAmp();
			double team21trap = tempT.getAvgTrap();
			double team21climb = tempT.getAvgClimb();
			double team21highN = tempT.getHumAmpNotes();
			Label team21teamNumL = new Label(Integer.toString(team21teamNum));
			Label team21cyL = new Label(Double.toString(team21cy));
			Label team21speL = new Label(Double.toString(team21spe));
			Label team21ampL = new Label(Double.toString(team21amp));
			Label team21trapL = new Label(Double.toString(team21trap));
			Label team21climbL = new Label(Double.toString(team21climb));
			Label team21highNL = new Label(Double.toString(team21highN));
			team21teamNumL.setId("avgStat");
			team21cyL.setId("avgStat");
			team21speL.setId("avgStat");
			team21ampL.setId("avgStat");
			team21trapL.setId("avgStat");
			team21climbL.setId("avgStat");
			team21highNL.setId("avgStat");
			Label team21teamNumTitleL = new Label("Team Num");
			Label team21cyTitleL = new Label("Avg Cycles");
			Label team21speTitleL = new Label("Avg Speaker");
			Label team21ampTitleL = new Label("Avg Amp");
			Label team21trapTitleL = new Label("Avg Trap");
			Label team21climbTitleL = new Label("Avg CLimb");
			Label team21highNTitleL = new Label("Avg High Notes");
			team21teamNumTitleL.setId("smallTitle");
			team21cyTitleL.setId("smallTitle");
			team21speTitleL.setId("smallTitle");
			team21ampTitleL.setId("smallTitle");
			team21trapTitleL.setId("smallTitle");
			team21climbTitleL.setId("smallTitle");
			team21highNTitleL.setId("smallTitle");
			BorderPane team21teamNumBP = new BorderPane();
			BorderPane team21cyBP = new BorderPane();
			BorderPane team21speBP = new BorderPane();
			BorderPane team21ampBP = new BorderPane();
			BorderPane team21trapBP = new BorderPane();
			BorderPane team21climbBP = new BorderPane();
			BorderPane team21highNBP = new BorderPane();
			team21teamNumBP.setTop(team21teamNumTitleL);
			team21cyBP.setTop(team21cyTitleL);
			team21speBP.setTop(team21speTitleL);
			team21ampBP.setTop(team21ampTitleL);
			team21trapBP.setTop(team21trapTitleL);
			team21climbBP.setTop(team21climbTitleL);
			team21highNBP.setTop(team21highNTitleL);
			team21teamNumBP.setCenter(team21teamNumL);
			team21cyBP.setCenter(team21cyL);
			team21speBP.setCenter(team21speL);
			team21ampBP.setCenter(team21ampL);
			team21trapBP.setCenter(team21trapL);
			team21climbBP.setCenter(team21climbL);
			team21highNBP.setCenter(team21highNL);
			team21teamNumBP.setId("findBestTeamStatBP1");
			team21cyBP.setId("findBestTeamStatBP2");
			team21speBP.setId("findBestTeamStatBP3");
			team21ampBP.setId("findBestTeamStatBP4");
			team21trapBP.setId("findBestTeamStatBP5");
			team21climbBP.setId("findBestTeamStatBP6");
			team21highNBP.setId("findBestTeamStatBP7");
			VBox team21teamVB = new VBox(5);
			team21teamVB.getChildren().addAll(team21teamNumBP, team21cyBP, team21speBP, team21ampBP, team21trapBP, team21climbBP, team21highNBP);
			BorderPane team21teamBP = new BorderPane();
			team21teamBP.setCenter(team21teamVB);
			team21teamBP.setId("findBestTeamStatAllBP1");
			//team 22
			tempT = sortedTL.listOfTeams.get(21);;
			int team22teamNum = tempT.getTeamNum();
			double team22cy = tempT.getAvgCycles();
			double team22spe = tempT.getAvgSpe();
			double team22amp = tempT.getAvgAmp();
			double team22trap = tempT.getAvgTrap();
			double team22climb = tempT.getAvgClimb();
			double team22highN = tempT.getHumAmpNotes();
			Label team22teamNumL = new Label(Integer.toString(team22teamNum));
			Label team22cyL = new Label(Double.toString(team22cy));
			Label team22speL = new Label(Double.toString(team22spe));
			Label team22ampL = new Label(Double.toString(team22amp));
			Label team22trapL = new Label(Double.toString(team22trap));
			Label team22climbL = new Label(Double.toString(team22climb));
			Label team22highNL = new Label(Double.toString(team22highN));
			team22teamNumL.setId("avgStat");
			team22cyL.setId("avgStat");
			team22speL.setId("avgStat");
			team22ampL.setId("avgStat");
			team22trapL.setId("avgStat");
			team22climbL.setId("avgStat");
			team22highNL.setId("avgStat");
			Label team22teamNumTitleL = new Label("Team Num");
			Label team22cyTitleL = new Label("Avg Cycles");
			Label team22speTitleL = new Label("Avg Speaker");
			Label team22ampTitleL = new Label("Avg Amp");
			Label team22trapTitleL = new Label("Avg Trap");
			Label team22climbTitleL = new Label("Avg CLimb");
			Label team22highNTitleL = new Label("Avg High Notes");
			team22teamNumTitleL.setId("smallTitle");
			team22cyTitleL.setId("smallTitle");
			team22speTitleL.setId("smallTitle");
			team22ampTitleL.setId("smallTitle");
			team22trapTitleL.setId("smallTitle");
			team22climbTitleL.setId("smallTitle");
			team22highNTitleL.setId("smallTitle");
			BorderPane team22teamNumBP = new BorderPane();
			BorderPane team22cyBP = new BorderPane();
			BorderPane team22speBP = new BorderPane();
			BorderPane team22ampBP = new BorderPane();
			BorderPane team22trapBP = new BorderPane();
			BorderPane team22climbBP = new BorderPane();
			BorderPane team22highNBP = new BorderPane();
			team22teamNumBP.setTop(team22teamNumTitleL);
			team22cyBP.setTop(team22cyTitleL);
			team22speBP.setTop(team22speTitleL);
			team22ampBP.setTop(team22ampTitleL);
			team22trapBP.setTop(team22trapTitleL);
			team22climbBP.setTop(team22climbTitleL);
			team22highNBP.setTop(team22highNTitleL);
			team22teamNumBP.setCenter(team22teamNumL);
			team22cyBP.setCenter(team22cyL);
			team22speBP.setCenter(team22speL);
			team22ampBP.setCenter(team22ampL);
			team22trapBP.setCenter(team22trapL);
			team22climbBP.setCenter(team22climbL);
			team22highNBP.setCenter(team22highNL);
			team22teamNumBP.setId("findBestTeamStatBP1");
			team22cyBP.setId("findBestTeamStatBP2");
			team22speBP.setId("findBestTeamStatBP3");
			team22ampBP.setId("findBestTeamStatBP4");
			team22trapBP.setId("findBestTeamStatBP5");
			team22climbBP.setId("findBestTeamStatBP6");
			team22highNBP.setId("findBestTeamStatBP7");
			VBox team22teamVB = new VBox(5);
			team22teamVB.getChildren().addAll(team22teamNumBP, team22cyBP, team22speBP, team22ampBP, team22trapBP, team22climbBP, team22highNBP);
			BorderPane team22teamBP = new BorderPane();
			team22teamBP.setCenter(team22teamVB);
			team22teamBP.setId("findBestTeamStatAllBP1");
			//team 23
			tempT = sortedTL.listOfTeams.get(22);
			int team23teamNum = tempT.getTeamNum();
			double team23cy = tempT.getAvgCycles();
			double team23spe = tempT.getAvgSpe();
			double team23amp = tempT.getAvgAmp();
			double team23trap = tempT.getAvgTrap();
			double team23climb = tempT.getAvgClimb();
			double team23highN = tempT.getHumAmpNotes();
			Label team23teamNumL = new Label(Integer.toString(team23teamNum));
			Label team23cyL = new Label(Double.toString(team23cy));
			Label team23speL = new Label(Double.toString(team23spe));
			Label team23ampL = new Label(Double.toString(team23amp));
			Label team23trapL = new Label(Double.toString(team23trap));
			Label team23climbL = new Label(Double.toString(team23climb));
			Label team23highNL = new Label(Double.toString(team23highN));
			team23teamNumL.setId("avgStat");
			team23cyL.setId("avgStat");
			team23speL.setId("avgStat");
			team23ampL.setId("avgStat");
			team23trapL.setId("avgStat");
			team23climbL.setId("avgStat");
			team23highNL.setId("avgStat");
			Label team23teamNumTitleL = new Label("Team Num");
			Label team23cyTitleL = new Label("Avg Cycles");
			Label team23speTitleL = new Label("Avg Speaker");
			Label team23ampTitleL = new Label("Avg Amp");
			Label team23trapTitleL = new Label("Avg Trap");
			Label team23climbTitleL = new Label("Avg CLimb");
			Label team23highNTitleL = new Label("Avg High Notes");
			team23teamNumTitleL.setId("smallTitle");
			team23cyTitleL.setId("smallTitle");
			team23speTitleL.setId("smallTitle");
			team23ampTitleL.setId("smallTitle");
			team23trapTitleL.setId("smallTitle");
			team23climbTitleL.setId("smallTitle");
			team23highNTitleL.setId("smallTitle");
			BorderPane team23teamNumBP = new BorderPane();
			BorderPane team23cyBP = new BorderPane();
			BorderPane team23speBP = new BorderPane();
			BorderPane team23ampBP = new BorderPane();
			BorderPane team23trapBP = new BorderPane();
			BorderPane team23climbBP = new BorderPane();
			BorderPane team23highNBP = new BorderPane();
			team23teamNumBP.setTop(team23teamNumTitleL);
			team23cyBP.setTop(team23cyTitleL);
			team23speBP.setTop(team23speTitleL);
			team23ampBP.setTop(team23ampTitleL);
			team23trapBP.setTop(team23trapTitleL);
			team23climbBP.setTop(team23climbTitleL);
			team23highNBP.setTop(team23highNTitleL);
			team23teamNumBP.setCenter(team23teamNumL);
			team23cyBP.setCenter(team23cyL);
			team23speBP.setCenter(team23speL);
			team23ampBP.setCenter(team23ampL);
			team23trapBP.setCenter(team23trapL);
			team23climbBP.setCenter(team23climbL);
			team23highNBP.setCenter(team23highNL);
			team23teamNumBP.setId("findBestTeamStatBP1");
			team23cyBP.setId("findBestTeamStatBP2");
			team23speBP.setId("findBestTeamStatBP3");
			team23ampBP.setId("findBestTeamStatBP4");
			team23trapBP.setId("findBestTeamStatBP5");
			team23climbBP.setId("findBestTeamStatBP6");
			team23highNBP.setId("findBestTeamStatBP7");
			VBox team23teamVB = new VBox(5);
			team23teamVB.getChildren().addAll(team23teamNumBP, team23cyBP, team23speBP, team23ampBP, team23trapBP, team23climbBP, team23highNBP);
			BorderPane team23teamBP = new BorderPane();
			team23teamBP.setCenter(team23teamVB);
			team23teamBP.setId("findBestTeamStatAllBP1");
			//team 24
			tempT = sortedTL.listOfTeams.get(23);
			int team24teamNum = tempT.getTeamNum();
			double team24cy = tempT.getAvgCycles();
			double team24spe = tempT.getAvgSpe();
			double team24amp = tempT.getAvgAmp();
			double team24trap = tempT.getAvgTrap();
			double team24climb = tempT.getAvgClimb();
			double team24highN = tempT.getHumAmpNotes();
			Label team24teamNumL = new Label(Integer.toString(team24teamNum));
			Label team24cyL = new Label(Double.toString(team24cy));
			Label team24speL = new Label(Double.toString(team24spe));
			Label team24ampL = new Label(Double.toString(team24amp));
			Label team24trapL = new Label(Double.toString(team24trap));
			Label team24climbL = new Label(Double.toString(team24climb));
			Label team24highNL = new Label(Double.toString(team24highN));
			team24teamNumL.setId("avgStat");
			team24cyL.setId("avgStat");
			team24speL.setId("avgStat");
			team24ampL.setId("avgStat");
			team24trapL.setId("avgStat");
			team24climbL.setId("avgStat");
			team24highNL.setId("avgStat");
			Label team24teamNumTitleL = new Label("Team Num");
			Label team24cyTitleL = new Label("Avg Cycles");
			Label team24speTitleL = new Label("Avg Speaker");
			Label team24ampTitleL = new Label("Avg Amp");
			Label team24trapTitleL = new Label("Avg Trap");
			Label team24climbTitleL = new Label("Avg CLimb");
			Label team24highNTitleL = new Label("Avg High Notes");
			team24teamNumTitleL.setId("smallTitle");
			team24cyTitleL.setId("smallTitle");
			team24speTitleL.setId("smallTitle");
			team24ampTitleL.setId("smallTitle");
			team24trapTitleL.setId("smallTitle");
			team24climbTitleL.setId("smallTitle");
			team24highNTitleL.setId("smallTitle");
			BorderPane team24teamNumBP = new BorderPane();
			BorderPane team24cyBP = new BorderPane();
			BorderPane team24speBP = new BorderPane();
			BorderPane team24ampBP = new BorderPane();
			BorderPane team24trapBP = new BorderPane();
			BorderPane team24climbBP = new BorderPane();
			BorderPane team24highNBP = new BorderPane();
			team24teamNumBP.setTop(team24teamNumTitleL);
			team24cyBP.setTop(team24cyTitleL);
			team24speBP.setTop(team24speTitleL);
			team24ampBP.setTop(team24ampTitleL);
			team24trapBP.setTop(team24trapTitleL);
			team24climbBP.setTop(team24climbTitleL);
			team24highNBP.setTop(team24highNTitleL);
			team24teamNumBP.setCenter(team24teamNumL);
			team24cyBP.setCenter(team24cyL);
			team24speBP.setCenter(team24speL);
			team24ampBP.setCenter(team24ampL);
			team24trapBP.setCenter(team24trapL);
			team24climbBP.setCenter(team24climbL);
			team24highNBP.setCenter(team24highNL);
			team24teamNumBP.setId("findBestTeamStatBP1");
			team24cyBP.setId("findBestTeamStatBP2");
			team24speBP.setId("findBestTeamStatBP3");
			team24ampBP.setId("findBestTeamStatBP4");
			team24trapBP.setId("findBestTeamStatBP5");
			team24climbBP.setId("findBestTeamStatBP6");
			team24highNBP.setId("findBestTeamStatBP7");
			VBox team24teamVB = new VBox(5);
			team24teamVB.getChildren().addAll(team24teamNumBP, team24cyBP, team24speBP, team24ampBP, team24trapBP, team24climbBP, team24highNBP);
			BorderPane team24teamBP = new BorderPane();
			team24teamBP.setCenter(team24teamVB);
			team24teamBP.setId("findBestTeamStatAllBP1");
			//team 25
			tempT = sortedTL.listOfTeams.get(24);
			int team25teamNum = tempT.getTeamNum();
			double team25cy = tempT.getAvgCycles();
			double team25spe = tempT.getAvgSpe();
			double team25amp = tempT.getAvgAmp();
			double team25trap = tempT.getAvgTrap();
			double team25climb = tempT.getAvgClimb();
			double team25highN = tempT.getHumAmpNotes();
			Label team25teamNumL = new Label(Integer.toString(team25teamNum));
			Label team25cyL = new Label(Double.toString(team25cy));
			Label team25speL = new Label(Double.toString(team25spe));
			Label team25ampL = new Label(Double.toString(team25amp));
			Label team25trapL = new Label(Double.toString(team25trap));
			Label team25climbL = new Label(Double.toString(team25climb));
			Label team25highNL = new Label(Double.toString(team25highN));
			team25teamNumL.setId("avgStat");
			team25cyL.setId("avgStat");
			team25speL.setId("avgStat");
			team25ampL.setId("avgStat");
			team25trapL.setId("avgStat");
			team25climbL.setId("avgStat");
			team25highNL.setId("avgStat");
			Label team25teamNumTitleL = new Label("Team Num");
			Label team25cyTitleL = new Label("Avg Cycles");
			Label team25speTitleL = new Label("Avg Speaker");
			Label team25ampTitleL = new Label("Avg Amp");
			Label team25trapTitleL = new Label("Avg Trap");
			Label team25climbTitleL = new Label("Avg CLimb");
			Label team25highNTitleL = new Label("Avg High Notes");
			team25teamNumTitleL.setId("smallTitle");
			team25cyTitleL.setId("smallTitle");
			team25speTitleL.setId("smallTitle");
			team25ampTitleL.setId("smallTitle");
			team25trapTitleL.setId("smallTitle");
			team25climbTitleL.setId("smallTitle");
			team25highNTitleL.setId("smallTitle");
			BorderPane team25teamNumBP = new BorderPane();
			BorderPane team25cyBP = new BorderPane();
			BorderPane team25speBP = new BorderPane();
			BorderPane team25ampBP = new BorderPane();
			BorderPane team25trapBP = new BorderPane();
			BorderPane team25climbBP = new BorderPane();
			BorderPane team25highNBP = new BorderPane();
			team25teamNumBP.setTop(team25teamNumTitleL);
			team25cyBP.setTop(team25cyTitleL);
			team25speBP.setTop(team25speTitleL);
			team25ampBP.setTop(team25ampTitleL);
			team25trapBP.setTop(team25trapTitleL);
			team25climbBP.setTop(team25climbTitleL);
			team25highNBP.setTop(team25highNTitleL);
			team25teamNumBP.setCenter(team25teamNumL);
			team25cyBP.setCenter(team25cyL);
			team25speBP.setCenter(team25speL);
			team25ampBP.setCenter(team25ampL);
			team25trapBP.setCenter(team25trapL);
			team25climbBP.setCenter(team25climbL);
			team25highNBP.setCenter(team25highNL);
			team25teamNumBP.setId("findBestTeamStatBP1");
			team25cyBP.setId("findBestTeamStatBP2");
			team25speBP.setId("findBestTeamStatBP3");
			team25ampBP.setId("findBestTeamStatBP4");
			team25trapBP.setId("findBestTeamStatBP5");
			team25climbBP.setId("findBestTeamStatBP6");
			team25highNBP.setId("findBestTeamStatBP7");
			VBox team25teamVB = new VBox(5);
			team25teamVB.getChildren().addAll(team25teamNumBP, team25cyBP, team25speBP, team25ampBP, team25trapBP, team25climbBP, team25highNBP);
			BorderPane team25teamBP = new BorderPane();
			team25teamBP.setCenter(team25teamVB);
			team25teamBP.setId("findBestTeamStatAllBP1");
			this.add(team21teamBP, 1, 9);
			this.add(team22teamBP, 3, 9);
			this.add(team23teamBP, 5, 9);
			this.add(team24teamBP, 7, 9);
			this.add(team25teamBP, 9, 9);
		}
		if(numOfTeams == 30) {
			//team 26
			tempT = sortedTL.listOfTeams.get(25);
			int team26teamNum = tempT.getTeamNum();
			double team26cy = tempT.getAvgCycles();
			double team26spe = tempT.getAvgSpe();
			double team26amp = tempT.getAvgAmp();
			double team26trap = tempT.getAvgTrap();
			double team26climb = tempT.getAvgClimb();
			double team26highN = tempT.getHumAmpNotes();
			Label team26teamNumL = new Label(Integer.toString(team26teamNum));
			Label team26cyL = new Label(Double.toString(team26cy));
			Label team26speL = new Label(Double.toString(team26spe));
			Label team26ampL = new Label(Double.toString(team26amp));
			Label team26trapL = new Label(Double.toString(team26trap));
			Label team26climbL = new Label(Double.toString(team26climb));
			Label team26highNL = new Label(Double.toString(team26highN));
			team26teamNumL.setId("avgStat");
			team26cyL.setId("avgStat");
			team26speL.setId("avgStat");
			team26ampL.setId("avgStat");
			team26trapL.setId("avgStat");
			team26climbL.setId("avgStat");
			team26highNL.setId("avgStat");
			Label team26teamNumTitleL = new Label("Team Num");
			Label team26cyTitleL = new Label("Avg Cycles");
			Label team26speTitleL = new Label("Avg Speaker");
			Label team26ampTitleL = new Label("Avg Amp");
			Label team26trapTitleL = new Label("Avg Trap");
			Label team26climbTitleL = new Label("Avg CLimb");
			Label team26highNTitleL = new Label("Avg High Notes");
			team26teamNumTitleL.setId("smallTitle");
			team26cyTitleL.setId("smallTitle");
			team26speTitleL.setId("smallTitle");
			team26ampTitleL.setId("smallTitle");
			team26trapTitleL.setId("smallTitle");
			team26climbTitleL.setId("smallTitle");
			team26highNTitleL.setId("smallTitle");
			BorderPane team26teamNumBP = new BorderPane();
			BorderPane team26cyBP = new BorderPane();
			BorderPane team26speBP = new BorderPane();
			BorderPane team26ampBP = new BorderPane();
			BorderPane team26trapBP = new BorderPane();
			BorderPane team26climbBP = new BorderPane();
			BorderPane team26highNBP = new BorderPane();
			team26teamNumBP.setTop(team26teamNumTitleL);
			team26cyBP.setTop(team26cyTitleL);
			team26speBP.setTop(team26speTitleL);
			team26ampBP.setTop(team26ampTitleL);
			team26trapBP.setTop(team26trapTitleL);
			team26climbBP.setTop(team26climbTitleL);
			team26highNBP.setTop(team26highNTitleL);
			team26teamNumBP.setCenter(team26teamNumL);
			team26cyBP.setCenter(team26cyL);
			team26speBP.setCenter(team26speL);
			team26ampBP.setCenter(team26ampL);
			team26trapBP.setCenter(team26trapL);
			team26climbBP.setCenter(team26climbL);
			team26highNBP.setCenter(team26highNL);
			team26teamNumBP.setId("findBestTeamStatBP1");
			team26cyBP.setId("findBestTeamStatBP2");
			team26speBP.setId("findBestTeamStatBP3");
			team26ampBP.setId("findBestTeamStatBP4");
			team26trapBP.setId("findBestTeamStatBP5");
			team26climbBP.setId("findBestTeamStatBP6");
			team26highNBP.setId("findBestTeamStatBP7");
			VBox team26teamVB = new VBox(5);
			team26teamVB.getChildren().addAll(team26teamNumBP, team26cyBP, team26speBP, team26ampBP, team26trapBP, team26climbBP, team26highNBP);
			BorderPane team26teamBP = new BorderPane();
			team26teamBP.setCenter(team26teamVB);
			team26teamBP.setId("findBestTeamStatAllBP1");
			//team 27
			tempT = sortedTL.listOfTeams.get(26);
			int team27teamNum = tempT.getTeamNum();
			double team27cy = tempT.getAvgCycles();
			double team27spe = tempT.getAvgSpe();
			double team27amp = tempT.getAvgAmp();
			double team27trap = tempT.getAvgTrap();
			double team27climb = tempT.getAvgClimb();
			double team27highN = tempT.getHumAmpNotes();
			Label team27teamNumL = new Label(Integer.toString(team27teamNum));
			Label team27cyL = new Label(Double.toString(team27cy));
			Label team27speL = new Label(Double.toString(team27spe));
			Label team27ampL = new Label(Double.toString(team27amp));
			Label team27trapL = new Label(Double.toString(team27trap));
			Label team27climbL = new Label(Double.toString(team27climb));
			Label team27highNL = new Label(Double.toString(team27highN));
			team27teamNumL.setId("avgStat");
			team27cyL.setId("avgStat");
			team27speL.setId("avgStat");
			team27ampL.setId("avgStat");
			team27trapL.setId("avgStat");
			team27climbL.setId("avgStat");
			team27highNL.setId("avgStat");
			Label team27teamNumTitleL = new Label("Team Num");
			Label team27cyTitleL = new Label("Avg Cycles");
			Label team27speTitleL = new Label("Avg Speaker");
			Label team27ampTitleL = new Label("Avg Amp");
			Label team27trapTitleL = new Label("Avg Trap");
			Label team27climbTitleL = new Label("Avg CLimb");
			Label team27highNTitleL = new Label("Avg High Notes");
			team27teamNumTitleL.setId("smallTitle");
			team27cyTitleL.setId("smallTitle");
			team27speTitleL.setId("smallTitle");
			team27ampTitleL.setId("smallTitle");
			team27trapTitleL.setId("smallTitle");
			team27climbTitleL.setId("smallTitle");
			team27highNTitleL.setId("smallTitle");
			BorderPane team27teamNumBP = new BorderPane();
			BorderPane team27cyBP = new BorderPane();
			BorderPane team27speBP = new BorderPane();
			BorderPane team27ampBP = new BorderPane();
			BorderPane team27trapBP = new BorderPane();
			BorderPane team27climbBP = new BorderPane();
			BorderPane team27highNBP = new BorderPane();
			team27teamNumBP.setTop(team27teamNumTitleL);
			team27cyBP.setTop(team27cyTitleL);
			team27speBP.setTop(team27speTitleL);
			team27ampBP.setTop(team27ampTitleL);
			team27trapBP.setTop(team27trapTitleL);
			team27climbBP.setTop(team27climbTitleL);
			team27highNBP.setTop(team27highNTitleL);
			team27teamNumBP.setCenter(team27teamNumL);
			team27cyBP.setCenter(team27cyL);
			team27speBP.setCenter(team27speL);
			team27ampBP.setCenter(team27ampL);
			team27trapBP.setCenter(team27trapL);
			team27climbBP.setCenter(team27climbL);
			team27highNBP.setCenter(team27highNL);
			team27teamNumBP.setId("findBestTeamStatBP1");
			team27cyBP.setId("findBestTeamStatBP2");
			team27speBP.setId("findBestTeamStatBP3");
			team27ampBP.setId("findBestTeamStatBP4");
			team27trapBP.setId("findBestTeamStatBP5");
			team27climbBP.setId("findBestTeamStatBP6");
			team27highNBP.setId("findBestTeamStatBP7");
			VBox team27teamVB = new VBox(5);
			team27teamVB.getChildren().addAll(team27teamNumBP, team27cyBP, team27speBP, team27ampBP, team27trapBP, team27climbBP, team27highNBP);
			BorderPane team27teamBP = new BorderPane();
			team27teamBP.setCenter(team27teamVB);
			team27teamBP.setId("findBestTeamStatAllBP1");
			//team 28
			tempT = sortedTL.listOfTeams.get(27);
			int team28teamNum = tempT.getTeamNum();
			double team28cy = tempT.getAvgCycles();
			double team28spe = tempT.getAvgSpe();
			double team28amp = tempT.getAvgAmp();
			double team28trap = tempT.getAvgTrap();
			double team28climb = tempT.getAvgClimb();
			double team28highN = tempT.getHumAmpNotes();
			Label team28teamNumL = new Label(Integer.toString(team28teamNum));
			Label team28cyL = new Label(Double.toString(team28cy));
			Label team28speL = new Label(Double.toString(team28spe));
			Label team28ampL = new Label(Double.toString(team28amp));
			Label team28trapL = new Label(Double.toString(team28trap));
			Label team28climbL = new Label(Double.toString(team28climb));
			Label team28highNL = new Label(Double.toString(team28highN));
			team28teamNumL.setId("avgStat");
			team28cyL.setId("avgStat");
			team28speL.setId("avgStat");
			team28ampL.setId("avgStat");
			team28trapL.setId("avgStat");
			team28climbL.setId("avgStat");
			team28highNL.setId("avgStat");
			Label team28teamNumTitleL = new Label("Team Num");
			Label team28cyTitleL = new Label("Avg Cycles");
			Label team28speTitleL = new Label("Avg Speaker");
			Label team28ampTitleL = new Label("Avg Amp");
			Label team28trapTitleL = new Label("Avg Trap");
			Label team28climbTitleL = new Label("Avg CLimb");
			Label team28highNTitleL = new Label("Avg High Notes");
			team28teamNumTitleL.setId("smallTitle");
			team28cyTitleL.setId("smallTitle");
			team28speTitleL.setId("smallTitle");
			team28ampTitleL.setId("smallTitle");
			team28trapTitleL.setId("smallTitle");
			team28climbTitleL.setId("smallTitle");
			team28highNTitleL.setId("smallTitle");
			BorderPane team28teamNumBP = new BorderPane();
			BorderPane team28cyBP = new BorderPane();
			BorderPane team28speBP = new BorderPane();
			BorderPane team28ampBP = new BorderPane();
			BorderPane team28trapBP = new BorderPane();
			BorderPane team28climbBP = new BorderPane();
			BorderPane team28highNBP = new BorderPane();
			team28teamNumBP.setTop(team28teamNumTitleL);
			team28cyBP.setTop(team28cyTitleL);
			team28speBP.setTop(team28speTitleL);
			team28ampBP.setTop(team28ampTitleL);
			team28trapBP.setTop(team28trapTitleL);
			team28climbBP.setTop(team28climbTitleL);
			team28highNBP.setTop(team28highNTitleL);
			team28teamNumBP.setCenter(team28teamNumL);
			team28cyBP.setCenter(team28cyL);
			team28speBP.setCenter(team28speL);
			team28ampBP.setCenter(team28ampL);
			team28trapBP.setCenter(team28trapL);
			team28climbBP.setCenter(team28climbL);
			team28highNBP.setCenter(team28highNL);
			team28teamNumBP.setId("findBestTeamStatBP1");
			team28cyBP.setId("findBestTeamStatBP2");
			team28speBP.setId("findBestTeamStatBP3");
			team28ampBP.setId("findBestTeamStatBP4");
			team28trapBP.setId("findBestTeamStatBP5");
			team28climbBP.setId("findBestTeamStatBP6");
			team28highNBP.setId("findBestTeamStatBP7");
			VBox team28teamVB = new VBox(5);
			team28teamVB.getChildren().addAll(team28teamNumBP, team28cyBP, team28speBP, team28ampBP, team28trapBP, team28climbBP, team28highNBP);
			BorderPane team28teamBP = new BorderPane();
			team28teamBP.setCenter(team28teamVB);
			team28teamBP.setId("findBestTeamStatAllBP1");
			//team 29
			tempT = sortedTL.listOfTeams.get(28);
			int team29teamNum = tempT.getTeamNum();
			double team29cy = tempT.getAvgCycles();
			double team29spe = tempT.getAvgSpe();
			double team29amp = tempT.getAvgAmp();
			double team29trap = tempT.getAvgTrap();
			double team29climb = tempT.getAvgClimb();
			double team29highN = tempT.getHumAmpNotes();
			Label team29teamNumL = new Label(Integer.toString(team29teamNum));
			Label team29cyL = new Label(Double.toString(team29cy));
			Label team29speL = new Label(Double.toString(team29spe));
			Label team29ampL = new Label(Double.toString(team29amp));
			Label team29trapL = new Label(Double.toString(team29trap));
			Label team29climbL = new Label(Double.toString(team29climb));
			Label team29highNL = new Label(Double.toString(team29highN));
			team29teamNumL.setId("avgStat");
			team29cyL.setId("avgStat");
			team29speL.setId("avgStat");
			team29ampL.setId("avgStat");
			team29trapL.setId("avgStat");
			team29climbL.setId("avgStat");
			team29highNL.setId("avgStat");
			Label team29teamNumTitleL = new Label("Team Num");
			Label team29cyTitleL = new Label("Avg Cycles");
			Label team29speTitleL = new Label("Avg Speaker");
			Label team29ampTitleL = new Label("Avg Amp");
			Label team29trapTitleL = new Label("Avg Trap");
			Label team29climbTitleL = new Label("Avg CLimb");
			Label team29highNTitleL = new Label("Avg High Notes");
			team29teamNumTitleL.setId("smallTitle");
			team29cyTitleL.setId("smallTitle");
			team29speTitleL.setId("smallTitle");
			team29ampTitleL.setId("smallTitle");
			team29trapTitleL.setId("smallTitle");
			team29climbTitleL.setId("smallTitle");
			team29highNTitleL.setId("smallTitle");
			BorderPane team29teamNumBP = new BorderPane();
			BorderPane team29cyBP = new BorderPane();
			BorderPane team29speBP = new BorderPane();
			BorderPane team29ampBP = new BorderPane();
			BorderPane team29trapBP = new BorderPane();
			BorderPane team29climbBP = new BorderPane();
			BorderPane team29highNBP = new BorderPane();
			team29teamNumBP.setTop(team29teamNumTitleL);
			team29cyBP.setTop(team29cyTitleL);
			team29speBP.setTop(team29speTitleL);
			team29ampBP.setTop(team29ampTitleL);
			team29trapBP.setTop(team29trapTitleL);
			team29climbBP.setTop(team29climbTitleL);
			team29highNBP.setTop(team29highNTitleL);
			team29teamNumBP.setCenter(team29teamNumL);
			team29cyBP.setCenter(team29cyL);
			team29speBP.setCenter(team29speL);
			team29ampBP.setCenter(team29ampL);
			team29trapBP.setCenter(team29trapL);
			team29climbBP.setCenter(team29climbL);
			team29highNBP.setCenter(team29highNL);
			team29teamNumBP.setId("findBestTeamStatBP1");
			team29cyBP.setId("findBestTeamStatBP2");
			team29speBP.setId("findBestTeamStatBP3");
			team29ampBP.setId("findBestTeamStatBP4");
			team29trapBP.setId("findBestTeamStatBP5");
			team29climbBP.setId("findBestTeamStatBP6");
			team29highNBP.setId("findBestTeamStatBP7");
			VBox team29teamVB = new VBox(5);
			team29teamVB.getChildren().addAll(team29teamNumBP, team29cyBP, team29speBP, team29ampBP, team29trapBP, team29climbBP, team29highNBP);
			BorderPane team29teamBP = new BorderPane();
			team29teamBP.setCenter(team29teamVB);
			team29teamBP.setId("findBestTeamStatAllBP1");
			//team 30
			tempT = sortedTL.listOfTeams.get(29);
			int team30teamNum = tempT.getTeamNum();
			double team30cy = tempT.getAvgCycles();
			double team30spe = tempT.getAvgSpe();
			double team30amp = tempT.getAvgAmp();
			double team30trap = tempT.getAvgTrap();
			double team30climb = tempT.getAvgClimb();
			double team30highN = tempT.getHumAmpNotes();
			Label team30teamNumL = new Label(Integer.toString(team30teamNum));
			Label team30cyL = new Label(Double.toString(team30cy));
			Label team30speL = new Label(Double.toString(team30spe));
			Label team30ampL = new Label(Double.toString(team30amp));
			Label team30trapL = new Label(Double.toString(team30trap));
			Label team30climbL = new Label(Double.toString(team30climb));
			Label team30highNL = new Label(Double.toString(team30highN));
			team30teamNumL.setId("avgStat");
			team30cyL.setId("avgStat");
			team30speL.setId("avgStat");
			team30ampL.setId("avgStat");
			team30trapL.setId("avgStat");
			team30climbL.setId("avgStat");
			team30highNL.setId("avgStat");
			Label team30teamNumTitleL = new Label("Team Num");
			Label team30cyTitleL = new Label("Avg Cycles");
			Label team30speTitleL = new Label("Avg Speaker");
			Label team30ampTitleL = new Label("Avg Amp");
			Label team30trapTitleL = new Label("Avg Trap");
			Label team30climbTitleL = new Label("Avg CLimb");
			Label team30highNTitleL = new Label("Avg High Notes");
			team30teamNumTitleL.setId("smallTitle");
			team30cyTitleL.setId("smallTitle");
			team30speTitleL.setId("smallTitle");
			team30ampTitleL.setId("smallTitle");
			team30trapTitleL.setId("smallTitle");
			team30climbTitleL.setId("smallTitle");
			team30highNTitleL.setId("smallTitle");
			BorderPane team30teamNumBP = new BorderPane();
			BorderPane team30cyBP = new BorderPane();
			BorderPane team30speBP = new BorderPane();
			BorderPane team30ampBP = new BorderPane();
			BorderPane team30trapBP = new BorderPane();
			BorderPane team30climbBP = new BorderPane();
			BorderPane team30highNBP = new BorderPane();
			team30teamNumBP.setTop(team30teamNumTitleL);
			team30cyBP.setTop(team30cyTitleL);
			team30speBP.setTop(team30speTitleL);
			team30ampBP.setTop(team30ampTitleL);
			team30trapBP.setTop(team30trapTitleL);
			team30climbBP.setTop(team30climbTitleL);
			team30highNBP.setTop(team30highNTitleL);
			team30teamNumBP.setCenter(team30teamNumL);
			team30cyBP.setCenter(team30cyL);
			team30speBP.setCenter(team30speL);
			team30ampBP.setCenter(team30ampL);
			team30trapBP.setCenter(team30trapL);
			team30climbBP.setCenter(team30climbL);
			team30highNBP.setCenter(team30highNL);
			team30teamNumBP.setId("findBestTeamStatBP1");
			team30cyBP.setId("findBestTeamStatBP2");
			team30speBP.setId("findBestTeamStatBP3");
			team30ampBP.setId("findBestTeamStatBP4");
			team30trapBP.setId("findBestTeamStatBP5");
			team30climbBP.setId("findBestTeamStatBP6");
			team30highNBP.setId("findBestTeamStatBP7");
			VBox team30teamVB = new VBox(5);
			team30teamVB.getChildren().addAll(team30teamNumBP, team30cyBP, team30speBP, team30ampBP, team30trapBP, team30climbBP, team30highNBP);
			BorderPane team30teamBP = new BorderPane();
			team30teamBP.setCenter(team30teamVB);
			team30teamBP.setId("findBestTeamStatAllBP1");
			this.add(team26teamBP, 1, 11);
			this.add(team27teamBP, 3, 11);
			this.add(team28teamBP, 5, 11);
			this.add(team29teamBP, 7, 11);
			this.add(team30teamBP, 9, 11);
		}
		if(numOfTeams == 35) {
			//team 31
			tempT = sortedTL.listOfTeams.get(30);
			int team31teamNum = tempT.getTeamNum();
			double team31cy = tempT.getAvgCycles();
			double team31spe = tempT.getAvgSpe();
			double team31amp = tempT.getAvgAmp();
			double team31trap = tempT.getAvgTrap();
			double team31climb = tempT.getAvgClimb();
			double team31highN = tempT.getHumAmpNotes();
			Label team31teamNumL = new Label(Integer.toString(team31teamNum));
			Label team31cyL = new Label(Double.toString(team31cy));
			Label team31speL = new Label(Double.toString(team31spe));
			Label team31ampL = new Label(Double.toString(team31amp));
			Label team31trapL = new Label(Double.toString(team31trap));
			Label team31climbL = new Label(Double.toString(team31climb));
			Label team31highNL = new Label(Double.toString(team31highN));
			team31teamNumL.setId("avgStat");
			team31cyL.setId("avgStat");
			team31speL.setId("avgStat");
			team31ampL.setId("avgStat");
			team31trapL.setId("avgStat");
			team31climbL.setId("avgStat");
			team31highNL.setId("avgStat");
			Label team31teamNumTitleL = new Label("Team Num");
			Label team31cyTitleL = new Label("Avg Cycles");
			Label team31speTitleL = new Label("Avg Speaker");
			Label team31ampTitleL = new Label("Avg Amp");
			Label team31trapTitleL = new Label("Avg Trap");
			Label team31climbTitleL = new Label("Avg CLimb");
			Label team31highNTitleL = new Label("Avg High Notes");
			team31teamNumTitleL.setId("smallTitle");
			team31cyTitleL.setId("smallTitle");
			team31speTitleL.setId("smallTitle");
			team31ampTitleL.setId("smallTitle");
			team31trapTitleL.setId("smallTitle");
			team31climbTitleL.setId("smallTitle");
			team31highNTitleL.setId("smallTitle");
			BorderPane team31teamNumBP = new BorderPane();
			BorderPane team31cyBP = new BorderPane();
			BorderPane team31speBP = new BorderPane();
			BorderPane team31ampBP = new BorderPane();
			BorderPane team31trapBP = new BorderPane();
			BorderPane team31climbBP = new BorderPane();
			BorderPane team31highNBP = new BorderPane();
			team31teamNumBP.setTop(team31teamNumTitleL);
			team31cyBP.setTop(team31cyTitleL);
			team31speBP.setTop(team31speTitleL);
			team31ampBP.setTop(team31ampTitleL);
			team31trapBP.setTop(team31trapTitleL);
			team31climbBP.setTop(team31climbTitleL);
			team31highNBP.setTop(team31highNTitleL);
			team31teamNumBP.setCenter(team31teamNumL);
			team31cyBP.setCenter(team31cyL);
			team31speBP.setCenter(team31speL);
			team31ampBP.setCenter(team31ampL);
			team31trapBP.setCenter(team31trapL);
			team31climbBP.setCenter(team31climbL);
			team31highNBP.setCenter(team31highNL);
			team31teamNumBP.setId("findBestTeamStatBP1");
			team31cyBP.setId("findBestTeamStatBP2");
			team31speBP.setId("findBestTeamStatBP3");
			team31ampBP.setId("findBestTeamStatBP4");
			team31trapBP.setId("findBestTeamStatBP5");
			team31climbBP.setId("findBestTeamStatBP6");
			team31highNBP.setId("findBestTeamStatBP7");
			VBox team31teamVB = new VBox(5);
			team31teamVB.getChildren().addAll(team31teamNumBP, team31cyBP, team31speBP, team31ampBP, team31trapBP, team31climbBP, team31highNBP);
			BorderPane team31teamBP = new BorderPane();
			team31teamBP.setCenter(team31teamVB);
			team31teamBP.setId("findBestTeamStatAllBP1");
			//team 32
			tempT = sortedTL.listOfTeams.get(31);
			int team32teamNum = tempT.getTeamNum();
			double team32cy = tempT.getAvgCycles();
			double team32spe = tempT.getAvgSpe();
			double team32amp = tempT.getAvgAmp();
			double team32trap = tempT.getAvgTrap();
			double team32climb = tempT.getAvgClimb();
			double team32highN = tempT.getHumAmpNotes();
			Label team32teamNumL = new Label(Integer.toString(team32teamNum));
			Label team32cyL = new Label(Double.toString(team32cy));
			Label team32speL = new Label(Double.toString(team32spe));
			Label team32ampL = new Label(Double.toString(team32amp));
			Label team32trapL = new Label(Double.toString(team32trap));
			Label team32climbL = new Label(Double.toString(team32climb));
			Label team32highNL = new Label(Double.toString(team32highN));
			team32teamNumL.setId("avgStat");
			team32cyL.setId("avgStat");
			team32speL.setId("avgStat");
			team32ampL.setId("avgStat");
			team32trapL.setId("avgStat");
			team32climbL.setId("avgStat");
			team32highNL.setId("avgStat");
			Label team32teamNumTitleL = new Label("Team Num");
			Label team32cyTitleL = new Label("Avg Cycles");
			Label team32speTitleL = new Label("Avg Speaker");
			Label team32ampTitleL = new Label("Avg Amp");
			Label team32trapTitleL = new Label("Avg Trap");
			Label team32climbTitleL = new Label("Avg CLimb");
			Label team32highNTitleL = new Label("Avg High Notes");
			team32teamNumTitleL.setId("smallTitle");
			team32cyTitleL.setId("smallTitle");
			team32speTitleL.setId("smallTitle");
			team32ampTitleL.setId("smallTitle");
			team32trapTitleL.setId("smallTitle");
			team32climbTitleL.setId("smallTitle");
			team32highNTitleL.setId("smallTitle");
			BorderPane team32teamNumBP = new BorderPane();
			BorderPane team32cyBP = new BorderPane();
			BorderPane team32speBP = new BorderPane();
			BorderPane team32ampBP = new BorderPane();
			BorderPane team32trapBP = new BorderPane();
			BorderPane team32climbBP = new BorderPane();
			BorderPane team32highNBP = new BorderPane();
			team32teamNumBP.setTop(team32teamNumTitleL);
			team32cyBP.setTop(team32cyTitleL);
			team32speBP.setTop(team32speTitleL);
			team32ampBP.setTop(team32ampTitleL);
			team32trapBP.setTop(team32trapTitleL);
			team32climbBP.setTop(team32climbTitleL);
			team32highNBP.setTop(team32highNTitleL);
			team32teamNumBP.setCenter(team32teamNumL);
			team32cyBP.setCenter(team32cyL);
			team32speBP.setCenter(team32speL);
			team32ampBP.setCenter(team32ampL);
			team32trapBP.setCenter(team32trapL);
			team32climbBP.setCenter(team32climbL);
			team32highNBP.setCenter(team32highNL);
			team32teamNumBP.setId("findBestTeamStatBP1");
			team32cyBP.setId("findBestTeamStatBP2");
			team32speBP.setId("findBestTeamStatBP3");
			team32ampBP.setId("findBestTeamStatBP4");
			team32trapBP.setId("findBestTeamStatBP5");
			team32climbBP.setId("findBestTeamStatBP6");
			team32highNBP.setId("findBestTeamStatBP7");
			VBox team32teamVB = new VBox(5);
			team32teamVB.getChildren().addAll(team32teamNumBP, team32cyBP, team32speBP, team32ampBP, team32trapBP, team32climbBP, team32highNBP);
			BorderPane team32teamBP = new BorderPane();
			team32teamBP.setCenter(team32teamVB);
			team32teamBP.setId("findBestTeamStatAllBP1");
			//team 33
			tempT = sortedTL.listOfTeams.get(32);
			int team33teamNum = tempT.getTeamNum();
			double team33cy = tempT.getAvgCycles();
			double team33spe = tempT.getAvgSpe();
			double team33amp = tempT.getAvgAmp();
			double team33trap = tempT.getAvgTrap();
			double team33climb = tempT.getAvgClimb();
			double team33highN = tempT.getHumAmpNotes();
			Label team33teamNumL = new Label(Integer.toString(team33teamNum));
			Label team33cyL = new Label(Double.toString(team33cy));
			Label team33speL = new Label(Double.toString(team33spe));
			Label team33ampL = new Label(Double.toString(team33amp));
			Label team33trapL = new Label(Double.toString(team33trap));
			Label team33climbL = new Label(Double.toString(team33climb));
			Label team33highNL = new Label(Double.toString(team33highN));
			team33teamNumL.setId("avgStat");
			team33cyL.setId("avgStat");
			team33speL.setId("avgStat");
			team33ampL.setId("avgStat");
			team33trapL.setId("avgStat");
			team33climbL.setId("avgStat");
			team33highNL.setId("avgStat");
			Label team33teamNumTitleL = new Label("Team Num");
			Label team33cyTitleL = new Label("Avg Cycles");
			Label team33speTitleL = new Label("Avg Speaker");
			Label team33ampTitleL = new Label("Avg Amp");
			Label team33trapTitleL = new Label("Avg Trap");
			Label team33climbTitleL = new Label("Avg CLimb");
			Label team33highNTitleL = new Label("Avg High Notes");
			team33teamNumTitleL.setId("smallTitle");
			team33cyTitleL.setId("smallTitle");
			team33speTitleL.setId("smallTitle");
			team33ampTitleL.setId("smallTitle");
			team33trapTitleL.setId("smallTitle");
			team33climbTitleL.setId("smallTitle");
			team33highNTitleL.setId("smallTitle");
			BorderPane team33teamNumBP = new BorderPane();
			BorderPane team33cyBP = new BorderPane();
			BorderPane team33speBP = new BorderPane();
			BorderPane team33ampBP = new BorderPane();
			BorderPane team33trapBP = new BorderPane();
			BorderPane team33climbBP = new BorderPane();
			BorderPane team33highNBP = new BorderPane();
			team33teamNumBP.setTop(team33teamNumTitleL);
			team33cyBP.setTop(team33cyTitleL);
			team33speBP.setTop(team33speTitleL);
			team33ampBP.setTop(team33ampTitleL);
			team33trapBP.setTop(team33trapTitleL);
			team33climbBP.setTop(team33climbTitleL);
			team33highNBP.setTop(team33highNTitleL);
			team33teamNumBP.setCenter(team33teamNumL);
			team33cyBP.setCenter(team33cyL);
			team33speBP.setCenter(team33speL);
			team33ampBP.setCenter(team33ampL);
			team33trapBP.setCenter(team33trapL);
			team33climbBP.setCenter(team33climbL);
			team33highNBP.setCenter(team33highNL);
			team33teamNumBP.setId("findBestTeamStatBP1");
			team33cyBP.setId("findBestTeamStatBP2");
			team33speBP.setId("findBestTeamStatBP3");
			team33ampBP.setId("findBestTeamStatBP4");
			team33trapBP.setId("findBestTeamStatBP5");
			team33climbBP.setId("findBestTeamStatBP6");
			team33highNBP.setId("findBestTeamStatBP7");
			VBox team33teamVB = new VBox(5);
			team33teamVB.getChildren().addAll(team33teamNumBP, team33cyBP, team33speBP, team33ampBP, team33trapBP, team33climbBP, team33highNBP);
			BorderPane team33teamBP = new BorderPane();
			team33teamBP.setCenter(team33teamVB);
			team33teamBP.setId("findBestTeamStatAllBP1");
			//team 34
			tempT = sortedTL.listOfTeams.get(33);
			int team34teamNum = tempT.getTeamNum();
			double team34cy = tempT.getAvgCycles();
			double team34spe = tempT.getAvgSpe();
			double team34amp = tempT.getAvgAmp();
			double team34trap = tempT.getAvgTrap();
			double team34climb = tempT.getAvgClimb();
			double team34highN = tempT.getHumAmpNotes();
			Label team34teamNumL = new Label(Integer.toString(team34teamNum));
			Label team34cyL = new Label(Double.toString(team34cy));
			Label team34speL = new Label(Double.toString(team34spe));
			Label team34ampL = new Label(Double.toString(team34amp));
			Label team34trapL = new Label(Double.toString(team34trap));
			Label team34climbL = new Label(Double.toString(team34climb));
			Label team34highNL = new Label(Double.toString(team34highN));
			team34teamNumL.setId("avgStat");
			team34cyL.setId("avgStat");
			team34speL.setId("avgStat");
			team34ampL.setId("avgStat");
			team34trapL.setId("avgStat");
			team34climbL.setId("avgStat");
			team34highNL.setId("avgStat");
			Label team34teamNumTitleL = new Label("Team Num");
			Label team34cyTitleL = new Label("Avg Cycles");
			Label team34speTitleL = new Label("Avg Speaker");
			Label team34ampTitleL = new Label("Avg Amp");
			Label team34trapTitleL = new Label("Avg Trap");
			Label team34climbTitleL = new Label("Avg CLimb");
			Label team34highNTitleL = new Label("Avg High Notes");
			team34teamNumTitleL.setId("smallTitle");
			team34cyTitleL.setId("smallTitle");
			team34speTitleL.setId("smallTitle");
			team34ampTitleL.setId("smallTitle");
			team34trapTitleL.setId("smallTitle");
			team34climbTitleL.setId("smallTitle");
			team34highNTitleL.setId("smallTitle");
			BorderPane team34teamNumBP = new BorderPane();
			BorderPane team34cyBP = new BorderPane();
			BorderPane team34speBP = new BorderPane();
			BorderPane team34ampBP = new BorderPane();
			BorderPane team34trapBP = new BorderPane();
			BorderPane team34climbBP = new BorderPane();
			BorderPane team34highNBP = new BorderPane();
			team34teamNumBP.setTop(team34teamNumTitleL);
			team34cyBP.setTop(team34cyTitleL);
			team34speBP.setTop(team34speTitleL);
			team34ampBP.setTop(team34ampTitleL);
			team34trapBP.setTop(team34trapTitleL);
			team34climbBP.setTop(team34climbTitleL);
			team34highNBP.setTop(team34highNTitleL);
			team34teamNumBP.setCenter(team34teamNumL);
			team34cyBP.setCenter(team34cyL);
			team34speBP.setCenter(team34speL);
			team34ampBP.setCenter(team34ampL);
			team34trapBP.setCenter(team34trapL);
			team34climbBP.setCenter(team34climbL);
			team34highNBP.setCenter(team34highNL);
			team34teamNumBP.setId("findBestTeamStatBP1");
			team34cyBP.setId("findBestTeamStatBP2");
			team34speBP.setId("findBestTeamStatBP3");
			team34ampBP.setId("findBestTeamStatBP4");
			team34trapBP.setId("findBestTeamStatBP5");
			team34climbBP.setId("findBestTeamStatBP6");
			team34highNBP.setId("findBestTeamStatBP7");
			VBox team34teamVB = new VBox(5);
			team34teamVB.getChildren().addAll(team34teamNumBP, team34cyBP, team34speBP, team34ampBP, team34trapBP, team34climbBP, team34highNBP);
			BorderPane team34teamBP = new BorderPane();
			team34teamBP.setCenter(team34teamVB);
			team34teamBP.setId("findBestTeamStatAllBP1");
			//team 35
			tempT = sortedTL.listOfTeams.get(34);
			int team35teamNum = tempT.getTeamNum();
			double team35cy = tempT.getAvgCycles();
			double team35spe = tempT.getAvgSpe();
			double team35amp = tempT.getAvgAmp();
			double team35trap = tempT.getAvgTrap();
			double team35climb = tempT.getAvgClimb();
			double team35highN = tempT.getHumAmpNotes();
			Label team35teamNumL = new Label(Integer.toString(team35teamNum));
			Label team35cyL = new Label(Double.toString(team35cy));
			Label team35speL = new Label(Double.toString(team35spe));
			Label team35ampL = new Label(Double.toString(team35amp));
			Label team35trapL = new Label(Double.toString(team35trap));
			Label team35climbL = new Label(Double.toString(team35climb));
			Label team35highNL = new Label(Double.toString(team35highN));
			team35teamNumL.setId("avgStat");
			team35cyL.setId("avgStat");
			team35speL.setId("avgStat");
			team35ampL.setId("avgStat");
			team35trapL.setId("avgStat");
			team35climbL.setId("avgStat");
			team35highNL.setId("avgStat");
			Label team35teamNumTitleL = new Label("Team Num");
			Label team35cyTitleL = new Label("Avg Cycles");
			Label team35speTitleL = new Label("Avg Speaker");
			Label team35ampTitleL = new Label("Avg Amp");
			Label team35trapTitleL = new Label("Avg Trap");
			Label team35climbTitleL = new Label("Avg CLimb");
			Label team35highNTitleL = new Label("Avg High Notes");
			team35teamNumTitleL.setId("smallTitle");
			team35cyTitleL.setId("smallTitle");
			team35speTitleL.setId("smallTitle");
			team35ampTitleL.setId("smallTitle");
			team35trapTitleL.setId("smallTitle");
			team35climbTitleL.setId("smallTitle");
			team35highNTitleL.setId("smallTitle");
			BorderPane team35teamNumBP = new BorderPane();
			BorderPane team35cyBP = new BorderPane();
			BorderPane team35speBP = new BorderPane();
			BorderPane team35ampBP = new BorderPane();
			BorderPane team35trapBP = new BorderPane();
			BorderPane team35climbBP = new BorderPane();
			BorderPane team35highNBP = new BorderPane();
			team35teamNumBP.setTop(team35teamNumTitleL);
			team35cyBP.setTop(team35cyTitleL);
			team35speBP.setTop(team35speTitleL);
			team35ampBP.setTop(team35ampTitleL);
			team35trapBP.setTop(team35trapTitleL);
			team35climbBP.setTop(team35climbTitleL);
			team35highNBP.setTop(team35highNTitleL);
			team35teamNumBP.setCenter(team35teamNumL);
			team35cyBP.setCenter(team35cyL);
			team35speBP.setCenter(team35speL);
			team35ampBP.setCenter(team35ampL);
			team35trapBP.setCenter(team35trapL);
			team35climbBP.setCenter(team35climbL);
			team35highNBP.setCenter(team35highNL);
			team35teamNumBP.setId("findBestTeamStatBP1");
			team35cyBP.setId("findBestTeamStatBP2");
			team35speBP.setId("findBestTeamStatBP3");
			team35ampBP.setId("findBestTeamStatBP4");
			team35trapBP.setId("findBestTeamStatBP5");
			team35climbBP.setId("findBestTeamStatBP6");
			team35highNBP.setId("findBestTeamStatBP7");
			VBox team35teamVB = new VBox(5);
			team35teamVB.getChildren().addAll(team35teamNumBP, team35cyBP, team35speBP, team35ampBP, team35trapBP, team35climbBP, team35highNBP);
			BorderPane team35teamBP = new BorderPane();
			team35teamBP.setCenter(team35teamVB);
			team35teamBP.setId("findBestTeamStatAllBP1");
			this.add(team1teamBP, 1, 13);
			this.add(team2teamBP, 3, 13);
			this.add(team3teamBP, 5, 13);
			this.add(team4teamBP, 7, 13);
			this.add(team5teamBP, 9, 13);
		}
		if(numOfTeams == 40) {
			//team 36
			tempT = sortedTL.listOfTeams.get(35);
			int team36teamNum = tempT.getTeamNum();
			double team36cy = tempT.getAvgCycles();
			double team36spe = tempT.getAvgSpe();
			double team36amp = tempT.getAvgAmp();
			double team36trap = tempT.getAvgTrap();
			double team36climb = tempT.getAvgClimb();
			double team36highN = tempT.getHumAmpNotes();
			Label team36teamNumL = new Label(Integer.toString(team36teamNum));
			Label team36cyL = new Label(Double.toString(team36cy));
			Label team36speL = new Label(Double.toString(team36spe));
			Label team36ampL = new Label(Double.toString(team36amp));
			Label team36trapL = new Label(Double.toString(team36trap));
			Label team36climbL = new Label(Double.toString(team36climb));
			Label team36highNL = new Label(Double.toString(team36highN));
			team36teamNumL.setId("avgStat");
			team36cyL.setId("avgStat");
			team36speL.setId("avgStat");
			team36ampL.setId("avgStat");
			team36trapL.setId("avgStat");
			team36climbL.setId("avgStat");
			team36highNL.setId("avgStat");
			Label team36teamNumTitleL = new Label("Team Num");
			Label team36cyTitleL = new Label("Avg Cycles");
			Label team36speTitleL = new Label("Avg Speaker");
			Label team36ampTitleL = new Label("Avg Amp");
			Label team36trapTitleL = new Label("Avg Trap");
			Label team36climbTitleL = new Label("Avg CLimb");
			Label team36highNTitleL = new Label("Avg High Notes");
			team36teamNumTitleL.setId("smallTitle");
			team36cyTitleL.setId("smallTitle");
			team36speTitleL.setId("smallTitle");
			team36ampTitleL.setId("smallTitle");
			team36trapTitleL.setId("smallTitle");
			team36climbTitleL.setId("smallTitle");
			team36highNTitleL.setId("smallTitle");
			BorderPane team36teamNumBP = new BorderPane();
			BorderPane team36cyBP = new BorderPane();
			BorderPane team36speBP = new BorderPane();
			BorderPane team36ampBP = new BorderPane();
			BorderPane team36trapBP = new BorderPane();
			BorderPane team36climbBP = new BorderPane();
			BorderPane team36highNBP = new BorderPane();
			team36teamNumBP.setTop(team36teamNumTitleL);
			team36cyBP.setTop(team36cyTitleL);
			team36speBP.setTop(team36speTitleL);
			team36ampBP.setTop(team36ampTitleL);
			team36trapBP.setTop(team36trapTitleL);
			team36climbBP.setTop(team36climbTitleL);
			team36highNBP.setTop(team36highNTitleL);
			team36teamNumBP.setCenter(team36teamNumL);
			team36cyBP.setCenter(team36cyL);
			team36speBP.setCenter(team36speL);
			team36ampBP.setCenter(team36ampL);
			team36trapBP.setCenter(team36trapL);
			team36climbBP.setCenter(team36climbL);
			team36highNBP.setCenter(team36highNL);
			team36teamNumBP.setId("findBestTeamStatBP1");
			team36cyBP.setId("findBestTeamStatBP2");
			team36speBP.setId("findBestTeamStatBP3");
			team36ampBP.setId("findBestTeamStatBP4");
			team36trapBP.setId("findBestTeamStatBP5");
			team36climbBP.setId("findBestTeamStatBP6");
			team36highNBP.setId("findBestTeamStatBP7");
			VBox team36teamVB = new VBox(5);
			team36teamVB.getChildren().addAll(team36teamNumBP, team36cyBP, team36speBP, team36ampBP, team36trapBP, team36climbBP, team36highNBP);
			BorderPane team36teamBP = new BorderPane();
			team36teamBP.setCenter(team36teamVB);
			team36teamBP.setId("findBestTeamStatAllBP1");
			//team 37
			tempT = sortedTL.listOfTeams.get(36);
			int team37teamNum = tempT.getTeamNum();
			double team37cy = tempT.getAvgCycles();
			double team37spe = tempT.getAvgSpe();
			double team37amp = tempT.getAvgAmp();
			double team37trap = tempT.getAvgTrap();
			double team37climb = tempT.getAvgClimb();
			double team37highN = tempT.getHumAmpNotes();
			Label team37teamNumL = new Label(Integer.toString(team37teamNum));
			Label team37cyL = new Label(Double.toString(team37cy));
			Label team37speL = new Label(Double.toString(team37spe));
			Label team37ampL = new Label(Double.toString(team37amp));
			Label team37trapL = new Label(Double.toString(team37trap));
			Label team37climbL = new Label(Double.toString(team37climb));
			Label team37highNL = new Label(Double.toString(team37highN));
			team37teamNumL.setId("avgStat");
			team37cyL.setId("avgStat");
			team37speL.setId("avgStat");
			team37ampL.setId("avgStat");
			team37trapL.setId("avgStat");
			team37climbL.setId("avgStat");
			team37highNL.setId("avgStat");
			Label team37teamNumTitleL = new Label("Team Num");
			Label team37cyTitleL = new Label("Avg Cycles");
			Label team37speTitleL = new Label("Avg Speaker");
			Label team37ampTitleL = new Label("Avg Amp");
			Label team37trapTitleL = new Label("Avg Trap");
			Label team37climbTitleL = new Label("Avg CLimb");
			Label team37highNTitleL = new Label("Avg High Notes");
			team37teamNumTitleL.setId("smallTitle");
			team37cyTitleL.setId("smallTitle");
			team37speTitleL.setId("smallTitle");
			team37ampTitleL.setId("smallTitle");
			team37trapTitleL.setId("smallTitle");
			team37climbTitleL.setId("smallTitle");
			team37highNTitleL.setId("smallTitle");
			BorderPane team37teamNumBP = new BorderPane();
			BorderPane team37cyBP = new BorderPane();
			BorderPane team37speBP = new BorderPane();
			BorderPane team37ampBP = new BorderPane();
			BorderPane team37trapBP = new BorderPane();
			BorderPane team37climbBP = new BorderPane();
			BorderPane team37highNBP = new BorderPane();
			team37teamNumBP.setTop(team37teamNumTitleL);
			team37cyBP.setTop(team37cyTitleL);
			team37speBP.setTop(team37speTitleL);
			team37ampBP.setTop(team37ampTitleL);
			team37trapBP.setTop(team37trapTitleL);
			team37climbBP.setTop(team37climbTitleL);
			team37highNBP.setTop(team37highNTitleL);
			team37teamNumBP.setCenter(team37teamNumL);
			team37cyBP.setCenter(team37cyL);
			team37speBP.setCenter(team37speL);
			team37ampBP.setCenter(team37ampL);
			team37trapBP.setCenter(team37trapL);
			team37climbBP.setCenter(team37climbL);
			team37highNBP.setCenter(team37highNL);
			team37teamNumBP.setId("findBestTeamStatBP1");
			team37cyBP.setId("findBestTeamStatBP2");
			team37speBP.setId("findBestTeamStatBP3");
			team37ampBP.setId("findBestTeamStatBP4");
			team37trapBP.setId("findBestTeamStatBP5");
			team37climbBP.setId("findBestTeamStatBP6");
			team37highNBP.setId("findBestTeamStatBP7");
			VBox team37teamVB = new VBox(5);
			team37teamVB.getChildren().addAll(team37teamNumBP, team37cyBP, team37speBP, team37ampBP, team37trapBP, team37climbBP, team37highNBP);
			BorderPane team37teamBP = new BorderPane();
			team37teamBP.setCenter(team37teamVB);
			team37teamBP.setId("findBestTeamStatAllBP1");
			//team 38
			tempT = sortedTL.listOfTeams.get(37);
			int team38teamNum = tempT.getTeamNum();
			double team38cy = tempT.getAvgCycles();
			double team38spe = tempT.getAvgSpe();
			double team38amp = tempT.getAvgAmp();
			double team38trap = tempT.getAvgTrap();
			double team38climb = tempT.getAvgClimb();
			double team38highN = tempT.getHumAmpNotes();
			Label team38teamNumL = new Label(Integer.toString(team38teamNum));
			Label team38cyL = new Label(Double.toString(team38cy));
			Label team38speL = new Label(Double.toString(team38spe));
			Label team38ampL = new Label(Double.toString(team38amp));
			Label team38trapL = new Label(Double.toString(team38trap));
			Label team38climbL = new Label(Double.toString(team38climb));
			Label team38highNL = new Label(Double.toString(team38highN));
			team38teamNumL.setId("avgStat");
			team38cyL.setId("avgStat");
			team38speL.setId("avgStat");
			team38ampL.setId("avgStat");
			team38trapL.setId("avgStat");
			team38climbL.setId("avgStat");
			team38highNL.setId("avgStat");
			Label team38teamNumTitleL = new Label("Team Num");
			Label team38cyTitleL = new Label("Avg Cycles");
			Label team38speTitleL = new Label("Avg Speaker");
			Label team38ampTitleL = new Label("Avg Amp");
			Label team38trapTitleL = new Label("Avg Trap");
			Label team38climbTitleL = new Label("Avg CLimb");
			Label team38highNTitleL = new Label("Avg High Notes");
			team38teamNumTitleL.setId("smallTitle");
			team38cyTitleL.setId("smallTitle");
			team38speTitleL.setId("smallTitle");
			team38ampTitleL.setId("smallTitle");
			team38trapTitleL.setId("smallTitle");
			team38climbTitleL.setId("smallTitle");
			team38highNTitleL.setId("smallTitle");
			BorderPane team38teamNumBP = new BorderPane();
			BorderPane team38cyBP = new BorderPane();
			BorderPane team38speBP = new BorderPane();
			BorderPane team38ampBP = new BorderPane();
			BorderPane team38trapBP = new BorderPane();
			BorderPane team38climbBP = new BorderPane();
			BorderPane team38highNBP = new BorderPane();
			team38teamNumBP.setTop(team38teamNumTitleL);
			team38cyBP.setTop(team38cyTitleL);
			team38speBP.setTop(team38speTitleL);
			team38ampBP.setTop(team38ampTitleL);
			team38trapBP.setTop(team38trapTitleL);
			team38climbBP.setTop(team38climbTitleL);
			team38highNBP.setTop(team38highNTitleL);
			team38teamNumBP.setCenter(team38teamNumL);
			team38cyBP.setCenter(team38cyL);
			team38speBP.setCenter(team38speL);
			team38ampBP.setCenter(team38ampL);
			team38trapBP.setCenter(team38trapL);
			team38climbBP.setCenter(team38climbL);
			team38highNBP.setCenter(team38highNL);
			team38teamNumBP.setId("findBestTeamStatBP1");
			team38cyBP.setId("findBestTeamStatBP2");
			team38speBP.setId("findBestTeamStatBP3");
			team38ampBP.setId("findBestTeamStatBP4");
			team38trapBP.setId("findBestTeamStatBP5");
			team38climbBP.setId("findBestTeamStatBP6");
			team38highNBP.setId("findBestTeamStatBP7");
			VBox team38teamVB = new VBox(5);
			team38teamVB.getChildren().addAll(team38teamNumBP, team38cyBP, team38speBP, team38ampBP, team38trapBP, team38climbBP, team38highNBP);
			BorderPane team38teamBP = new BorderPane();
			team38teamBP.setCenter(team38teamVB);
			team38teamBP.setId("findBestTeamStatAllBP1");
			//team 39
			tempT = sortedTL.listOfTeams.get(38);
			int team39teamNum = tempT.getTeamNum();
			double team39cy = tempT.getAvgCycles();
			double team39spe = tempT.getAvgSpe();
			double team39amp = tempT.getAvgAmp();
			double team39trap = tempT.getAvgTrap();
			double team39climb = tempT.getAvgClimb();
			double team39highN = tempT.getHumAmpNotes();
			Label team39teamNumL = new Label(Integer.toString(team39teamNum));
			Label team39cyL = new Label(Double.toString(team39cy));
			Label team39speL = new Label(Double.toString(team39spe));
			Label team39ampL = new Label(Double.toString(team39amp));
			Label team39trapL = new Label(Double.toString(team39trap));
			Label team39climbL = new Label(Double.toString(team39climb));
			Label team39highNL = new Label(Double.toString(team39highN));
			team39teamNumL.setId("avgStat");
			team39cyL.setId("avgStat");
			team39speL.setId("avgStat");
			team39ampL.setId("avgStat");
			team39trapL.setId("avgStat");
			team39climbL.setId("avgStat");
			team39highNL.setId("avgStat");
			Label team39teamNumTitleL = new Label("Team Num");
			Label team39cyTitleL = new Label("Avg Cycles");
			Label team39speTitleL = new Label("Avg Speaker");
			Label team39ampTitleL = new Label("Avg Amp");
			Label team39trapTitleL = new Label("Avg Trap");
			Label team39climbTitleL = new Label("Avg CLimb");
			Label team39highNTitleL = new Label("Avg High Notes");
			team39teamNumTitleL.setId("smallTitle");
			team39cyTitleL.setId("smallTitle");
			team39speTitleL.setId("smallTitle");
			team39ampTitleL.setId("smallTitle");
			team39trapTitleL.setId("smallTitle");
			team39climbTitleL.setId("smallTitle");
			team39highNTitleL.setId("smallTitle");
			BorderPane team39teamNumBP = new BorderPane();
			BorderPane team39cyBP = new BorderPane();
			BorderPane team39speBP = new BorderPane();
			BorderPane team39ampBP = new BorderPane();
			BorderPane team39trapBP = new BorderPane();
			BorderPane team39climbBP = new BorderPane();
			BorderPane team39highNBP = new BorderPane();
			team39teamNumBP.setTop(team39teamNumTitleL);
			team39cyBP.setTop(team39cyTitleL);
			team39speBP.setTop(team39speTitleL);
			team39ampBP.setTop(team39ampTitleL);
			team39trapBP.setTop(team39trapTitleL);
			team39climbBP.setTop(team39climbTitleL);
			team39highNBP.setTop(team39highNTitleL);
			team39teamNumBP.setCenter(team39teamNumL);
			team39cyBP.setCenter(team39cyL);
			team39speBP.setCenter(team39speL);
			team39ampBP.setCenter(team39ampL);
			team39trapBP.setCenter(team39trapL);
			team39climbBP.setCenter(team39climbL);
			team39highNBP.setCenter(team39highNL);
			team39teamNumBP.setId("findBestTeamStatBP1");
			team39cyBP.setId("findBestTeamStatBP2");
			team39speBP.setId("findBestTeamStatBP3");
			team39ampBP.setId("findBestTeamStatBP4");
			team39trapBP.setId("findBestTeamStatBP5");
			team39climbBP.setId("findBestTeamStatBP6");
			team39highNBP.setId("findBestTeamStatBP7");
			VBox team39teamVB = new VBox(5);
			team39teamVB.getChildren().addAll(team39teamNumBP, team39cyBP, team39speBP, team39ampBP, team39trapBP, team39climbBP, team39highNBP);
			BorderPane team39teamBP = new BorderPane();
			team39teamBP.setCenter(team39teamVB);
			team39teamBP.setId("findBestTeamStatAllBP1");
			//team 40
			tempT = sortedTL.listOfTeams.get(0);
			int team40teamNum = tempT.getTeamNum();
			double team40cy = tempT.getAvgCycles();
			double team40spe = tempT.getAvgSpe();
			double team40amp = tempT.getAvgAmp();
			double team40trap = tempT.getAvgTrap();
			double team40climb = tempT.getAvgClimb();
			double team40highN = tempT.getHumAmpNotes();
			Label team40teamNumL = new Label(Integer.toString(team40teamNum));
			Label team40cyL = new Label(Double.toString(team40cy));
			Label team40speL = new Label(Double.toString(team40spe));
			Label team40ampL = new Label(Double.toString(team40amp));
			Label team40trapL = new Label(Double.toString(team40trap));
			Label team40climbL = new Label(Double.toString(team40climb));
			Label team40highNL = new Label(Double.toString(team40highN));
			team40teamNumL.setId("avgStat");
			team40cyL.setId("avgStat");
			team40speL.setId("avgStat");
			team40ampL.setId("avgStat");
			team40trapL.setId("avgStat");
			team40climbL.setId("avgStat");
			team40highNL.setId("avgStat");
			Label team40teamNumTitleL = new Label("Team Num");
			Label team40cyTitleL = new Label("Avg Cycles");
			Label team40speTitleL = new Label("Avg Speaker");
			Label team40ampTitleL = new Label("Avg Amp");
			Label team40trapTitleL = new Label("Avg Trap");
			Label team40climbTitleL = new Label("Avg CLimb");
			Label team40highNTitleL = new Label("Avg High Notes");
			team40teamNumTitleL.setId("smallTitle");
			team40cyTitleL.setId("smallTitle");
			team40speTitleL.setId("smallTitle");
			team40ampTitleL.setId("smallTitle");
			team40trapTitleL.setId("smallTitle");
			team40climbTitleL.setId("smallTitle");
			team40highNTitleL.setId("smallTitle");
			BorderPane team40teamNumBP = new BorderPane();
			BorderPane team40cyBP = new BorderPane();
			BorderPane team40speBP = new BorderPane();
			BorderPane team40ampBP = new BorderPane();
			BorderPane team40trapBP = new BorderPane();
			BorderPane team40climbBP = new BorderPane();
			BorderPane team40highNBP = new BorderPane();
			team40teamNumBP.setTop(team40teamNumTitleL);
			team40cyBP.setTop(team40cyTitleL);
			team40speBP.setTop(team40speTitleL);
			team40ampBP.setTop(team40ampTitleL);
			team40trapBP.setTop(team40trapTitleL);
			team40climbBP.setTop(team40climbTitleL);
			team40highNBP.setTop(team40highNTitleL);
			team40teamNumBP.setCenter(team40teamNumL);
			team40cyBP.setCenter(team40cyL);
			team40speBP.setCenter(team40speL);
			team40ampBP.setCenter(team40ampL);
			team40trapBP.setCenter(team40trapL);
			team40climbBP.setCenter(team40climbL);
			team40highNBP.setCenter(team40highNL);
			team40teamNumBP.setId("findBestTeamStatBP1");
			team40cyBP.setId("findBestTeamStatBP2");
			team40speBP.setId("findBestTeamStatBP3");
			team40ampBP.setId("findBestTeamStatBP4");
			team40trapBP.setId("findBestTeamStatBP5");
			team40climbBP.setId("findBestTeamStatBP6");
			team40highNBP.setId("findBestTeamStatBP7");
			VBox team40teamVB = new VBox(5);
			team40teamVB.getChildren().addAll(team40teamNumBP, team40cyBP, team40speBP, team40ampBP, team40trapBP, team40climbBP, team40highNBP);
			BorderPane team40teamBP = new BorderPane();
			team40teamBP.setCenter(team40teamVB);
			team40teamBP.setId("findBestTeamStatAllBP1");
			this.add(team1teamBP, 1, 15);
			this.add(team2teamBP, 3, 15);
			this.add(team3teamBP, 5, 15);
			this.add(team4teamBP, 7, 15);
			this.add(team5teamBP, 9, 15);
		}
	}
}
