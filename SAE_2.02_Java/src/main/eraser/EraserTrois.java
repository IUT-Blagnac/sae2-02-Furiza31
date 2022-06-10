package main.eraser;

import java.util.ArrayList;
import java.util.Arrays;

public class EraserTrois {
	/**
	 * Méthode par copy de chaine de caractère pour supprétion
	 * @param req
	 * @return
	 */
	public static String start(String req) {
		ArrayList<String> res = new ArrayList<String>(Arrays.asList(req.split("")));
		if (res.get(0).equals(" ") && !res.get(1).equals(" ")) {
			res.remove(0);
		}
		for (int i = 0; i < res.size() - 1; i++) {
			if (res.get(i).equals(" ") && !res.get(i+1).equals(" ") && !res.get(i-1).equals(" ")) {
				res.remove(i);
			}
		}
		if (res.get(res.size()-1).equals(" ") && !res.get(res.size()-2).equals(" ")) {
			res.remove(res.size()-1);
		}
		return String.join("", res);
	}
}
