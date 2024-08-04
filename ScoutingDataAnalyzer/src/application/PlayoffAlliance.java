package application;

public class PlayoffAlliance {
	private Team team1;
	private Team team2;
	private Team team3;
	private Team team4;
	//constructor for all teams
	PlayoffAlliance(Team inputedTeam1, Team inputedTeam2, Team inputedTeam3, Team inputedTeam4){
		setTeam1(inputedTeam1);
		setTeam2(inputedTeam2);
		setTeam3(inputedTeam3);
		setTeam4(inputedTeam4);
	}
	//constructor for 3 teams
	PlayoffAlliance(Team inputedTeam1, Team inputedTeam2, Team inputedTeam3){
		setTeam1(inputedTeam1);
		setTeam2(inputedTeam2);
		setTeam3(inputedTeam3);
	}
	//constructor for 2 teams
	PlayoffAlliance(Team inputedTeam1, Team inputedTeam2){
		setTeam1(inputedTeam1);
		setTeam2(inputedTeam2);
	}
	//constructor for 1 teams
	PlayoffAlliance(Team inputedTeam1){
		setTeam1(inputedTeam1);
	}
	public void setTeam1(Team inputedTeam) {
		team1 = inputedTeam;
	}
	
	public void setTeam2(Team inputedTeam) {
		team2 = inputedTeam;
	}
	
	public void setTeam3(Team inputedTeam) {
		team3 = inputedTeam;
	}
	
	public void setTeam4(Team inputedTeam) {
		team4 = inputedTeam;
	}
	
	public Team getTeam1() {
		return team1;
	}
	
	public Team getTeam2() {
		return team2;
	}
	
	public Team getTeam3() {
		return team3;
	}
	
	public Team getTeam4() {
		return team4;
	}
}
