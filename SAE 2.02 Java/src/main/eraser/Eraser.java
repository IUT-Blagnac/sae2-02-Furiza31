package main.eraser;

import java.util.ArrayList;
import java.util.Arrays;

public class Eraser {
	
	/**
	 * Methode avec regex
	 * @param req
	 * @return
	 */
	public static String methodeUn(String req) {
		// remplace tous les espaces qui n'ont pas d'espace avant et après par du vide
		return req.replaceAll("(?<! ) (?! )", ""); 
	}

	/**
	 * Methode par création d'une chaine de caractère
	 * @param req
	 * @return
	 */
	public static String methodeDeux(String req) {
		String res = "";
		int length = req.length();
		
		if (Character.compare(req.charAt(0), ' ') == 0 && Character.compare(req.charAt(1), ' ') != 0) {
			res += "";
		} else res += req.charAt(0);
		for (int i = 1; i < length - 1; i++) {
			if (Character.compare(req.charAt(i), ' ') == 0 && Character.compare(req.charAt(i+1), ' ') != 0 && Character.compare(req.charAt(i-1), ' ') != 0) {
				res += "";
			} else {
				res += req.charAt(i);
			}
		}
		if (Character.compare(req.charAt(length - 1), ' ') == 0 && Character.compare(req.charAt(length - 2), ' ') != 0) {
			res += "";
		} else res += req.charAt(length-2);
		return res;
	}
	
	/**
	 * Methode par copy de chaine de caractère pour supprétion
	 * @param req
	 * @return
	 */
	public static String methodeTrois(String req) {
		ArrayList<String> res = new ArrayList<String>(Arrays.asList(req.split("")));
		return res.toString();
	}
	
}
