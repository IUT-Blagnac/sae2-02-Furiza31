package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

import main.scripts.efficacite_10;
import main.scripts.efficacite_124;

public class Main {
	public static void main(String[] args) {

		String text = readFile();

		long start = System.currentTimeMillis();

		for (int i = 0; i < 1000; i++) {
			efficacite_10.erase2(text);
		}
		System.out.println("efficacite_10: " + ((System.currentTimeMillis() - start) / 1000F) + " secondes");
		start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			efficacite_124.Eraser_court(text);
		}
		System.out.println("efficacite_124: " + ((System.currentTimeMillis() - start) / 1000F) + " secondes");
	}

	public static String readFile() {

		String text = "";
		File file;
		String st;
		try {
			
			file = new File(Main.class.getResource("text/text.txt").toURI());
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) text += st;
			
		} catch (URISyntaxException | IOException e) {
			System.out.println("HUUMM");
		}

		return text;
	}
}
