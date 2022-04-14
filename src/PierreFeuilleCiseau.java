package nfa031;

public class PierreFeuilleCiseau {
	
	public static void main(String[] args) {
		
		Rockpaperscissors.play();
		
		//Relancer le programme tant que le joueur choisi de recommencer une partie
	
		while(Rockpaperscissors.playagain())
		{
			Rockpaperscissors.play();
		}
	}
}
