package main;

import main.eraser.EraserUn;
import main.eraser.EraserDeux;
import main.eraser.EraserTrois;

public class Main {

	public static void main(String[] args) {
		String test = "C o u cou  J M  B ";
		System.out.println(EraserUn.start(test));
		System.out.println(EraserDeux.start(test));
		System.out.println(EraserTrois.start(test));
	}

}
