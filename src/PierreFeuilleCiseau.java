package nfa031;

public class PierreFeuilleCiseau {
	
	public static void main(String[] args) {
		
		Rockpaperscissors.play();
	
		while(Rockpaperscissors.playagain())
		{
			Rockpaperscissors.play();
		}
	}
}
		
	
