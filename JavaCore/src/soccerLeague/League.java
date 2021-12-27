package soccerLeague;

public class League {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player();
		player1.playerName = "George Eliot";
		
		Player player2 = new Player();
		player2.playerName = "Graham Greene";
		
		Player player3= new Player();
		player3.playerName = "Geoffrey Chaucer";
		
		Player[] thePlayers = {player1, player2, player3};
		
		Team team1 = new Team();
		team1.teamName = "The Greens";
		team1.playerArray = thePlayers;
		
		/*
		 * for (Player thePlayer: team1.playerArray){
		 * System.out.println(thePlayer.playerName); }
		 */
		
		Team team2 = new Team();
		team2.teamName = "The Reds";
		team2.playerArray = new Player[3];
		
		team2.playerArray[0] = new Player();
		team2.playerArray[0].playerName = "Rober Service";
		
		team2.playerArray[1] = new Player();
		team2.playerArray[1].playerName = "Robbie Burns";
		
		team2.playerArray[2] = new Player();
		team2.playerArray[2].playerName = "Rafael Sabatine";
		
		/*
		 * for (int i=0;i<team2.playerArray.length;i++) {
		 * System.out.println(team2.playerArray[i].playerName); }
		 */
		
		Game currGame = new Game();
		currGame.homeTeam = team1;
		currGame.awayTeam = team2;
		
		Goal goal1 = new Goal();
		goal1.thePlayer = currGame.homeTeam.playerArray[2];
		goal1.theTeam = currGame.homeTeam;
		goal1.theTime = 55;
		
		Goal goal2 = new Goal();
		goal2.thePlayer = currGame.awayTeam.playerArray[2];
		goal2.theTeam = currGame.awayTeam;
		goal2.theTime = 59;
		
		Goal[] theGoals = {goal1, goal2};
		currGame.goals = theGoals;
		
		for ( int i=0; i<currGame.goals.length; i++ ) {
		
		System.out.println("Goal scored after " +
		currGame.goals[i].theTime + " mins by " +
		currGame.goals[i].thePlayer.playerName + " of " +
		currGame.goals[i].theTeam.teamName);
		
		}

	}

}
