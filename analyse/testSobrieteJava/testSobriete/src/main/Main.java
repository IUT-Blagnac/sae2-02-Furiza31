package main;

import main.scripts.sobriete_67;
import main.ReadFile;

public class Main {

	public static void main(String[] args) {
		String text = ReadFile.readFile();
		sobriete_67.erase(text);
	}
	


}
