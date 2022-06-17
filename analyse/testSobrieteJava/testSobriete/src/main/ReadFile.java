package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class ReadFile {

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
