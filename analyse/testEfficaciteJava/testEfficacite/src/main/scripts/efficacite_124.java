package main.scripts;

public class efficacite_124 {
	
	public static void Eraser_court(String mot_avec_espace) {

		String str = mot_avec_espace.replaceAll("   ", "~");
		str= str.replaceAll("  ", "~~");
		str = str.replaceAll(" ", "");
		str = str.replaceAll("~~", "  ");
		str = str.replaceAll("~", "   ");
		
	}
}
