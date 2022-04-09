package nfa031;

import java.util.Scanner;


public class Rockpaperscissors {
	
	public static Scanner joueur = new Scanner(System.in);
	
	
	public static void play()
	{
		
		String j = userChoice();
		String o = computerChoice();
		isEqual(j, o);
		resultat(j, o);

	}
	
	
	public static boolean playagain()
	{
		

		System.out.println("Voulez-vous rejouer ? o/n");
		String choix = joueur.nextLine();
		char lettre = choix.toLowerCase().charAt(0);

		if (lettre != 'o' && lettre != 'n')
		{
		  System.out.println("Entrée invalide");
		  return playagain();
		}
		if (lettre == 'o')
		{
		  System.out.println("Super :)");
		  return true;
		}
		System.out.println("Bye, à bientôt :) ");
		return false;
		
	}
	
	
	public static String computerChoice()
	{
		
		int val = (int) (Math.random() * 3 + 1 );
		String c0 = "pierre";
		String c1 = "feuille";
		String c2 = "ciseaux";
		String c = "";
			
		if(val == 0)
		{
			c = c0;
			//return "L'ordi a choisi" + c;
		}
		else if(val == 1)
		{
			c = c1;
			//return "L'ordi a choisi"  + c;
		}
		else
		{
			c = c2;
			//return "L'ordi a choisi"  + c;
	
		}
		return c;
	}
	
	
	public static String userChoice()
	{
		//boolean choice;
		System.out.println("Choisissez votre arme : pierre, feuille, ciseaux");
		String gamer = joueur.nextLine();
		
		if(gamer.toLowerCase().equals("pierre"))
		{
			System.out.println("Vous avez choisi " + gamer);
			//return true;
		}
		else if (gamer.toLowerCase().equals("feuille"))
		{
			System.out.println("Vous avez choisi " + gamer);
			//return true;
		}
		else if(gamer.toLowerCase().equals("ciseaux"))
		{
			System.out.println("Vous avez choisi " + gamer);
			//return true;
		}
		
		else if(!gamer.equals("pierre") || !gamer.equals("feuille") || !gamer.equals("ciseaux"))
		{
				
			System.out.println("Entrée non reconnue");
				
		}
	//	play();
		return gamer;
	}
	
	
	public static void isEqual(String j, String o)
	{
		if(j.equals(o))
		{
			System.out.println("Egalité");
			System.out.println("Recommencez");
			//play();
		}
	}

	
	public static void resultat(String j, String o)
	{
		
		
	if(j.equals("pierre") && o.equals("feuille"))
		{
			System.out.println("You lose");
			System.out.println("L'ordi choisit " + o + " et bat " + j);
	
		}
		else if(j.equals("pierre") && o.equals("ciseaux"))
		{
			System.out.println("You win");
			System.out.println("Votre choix : " + j + " bat " + "L'ordi qui a choisi " + o);
		
		}
		else if(j.equals("feuille") && o.equals("ciseaux"))
		{
			System.out.println("You lose");
			System.out.println("L'ordi choisit " + o + " et bat " + j);
		
		}
		else if(j.equals("feuille") && o.equals("pierre"))
		{
			System.out.println("You win");
			System.out.println("Votre choix : " + j + " bat " + "L'ordi qui a choisi " + o);
		
		}
		else if(j.equals("ciseaux") && o.equals("pierre"))
		{
			System.out.println("You lose");
			System.out.println("L'ordi choisit " + o + " et bat " + j);
		
		}
		else if(j.equals("ciseaux") && o.equals("feuille"))
		{
			System.out.println("You win");
			System.out.println("Votre choix : " + j + " bat " + "L'ordi qui a choisi " + o);
		
		}
	
	}
	
}
