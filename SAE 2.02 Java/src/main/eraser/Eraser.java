package main.eraser;

public class Eraser {
	public static String methodeUn(String req) {
		// remplace tous les espaces qui n'ont pas d'espace avant et après par du vide
		return req.replaceAll("(?<! ) (?! )", ""); 
	}

	public static String methodeDeux(String req) {
		String res;
		int i;
		char space = ' ';
		
		res = "";
		for (i = 1; i < req.length() - 1; i++) {
			if (
					Character.compare(req.charAt(i), space) == 0 &&
					(
						Character.compare(req.charAt(i-1), space) != 0 &&
						Character.compare(req.charAt(i+1), space) != 0
					)
				) {
				res += "";
			} else {
				res += req.charAt(i);
			}
		}
		return res = "";
	}
}
