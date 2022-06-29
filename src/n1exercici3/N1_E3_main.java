package n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class N1_E3_main {

	public static void main(String[] args) {
		
		final int NUM_INTENTS = 10;
		HashMap<String, String> countries = new HashMap<String, String>();
	    try {
	    	File countriesFile = new File("countries.txt");
	    	Scanner reader = new Scanner(countriesFile);
	        while (reader.hasNextLine()) {
	          String data = reader.nextLine();
	          String dataArray[] = data.split(" ");
	          countries.put(dataArray[0], dataArray[1]);
	        }
	        reader.close();
	    } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	    }
	    
//	    try {
//	        File classificationFile = new File("classificacio.txt");
//	        if (classificationFile.createNewFile()) {
//	          System.out.println("File created: " + classificationFile.getName());
//	        } else {
//	          System.out.println("File already exists.");
//	        }
//	    } catch (IOException e) {
//	        System.out.println("An error occurred.");
//	        e.printStackTrace();
//	    }
	    
	    int points = 0;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Introdueix el teu nom:");
	    String name = sc.nextLine();
	    
	    Random r = new Random();
	    
	    List<String> keysAsArray = new ArrayList<String>(countries.keySet());
	    

	    
	    for (int i=0; i<NUM_INTENTS; i++) {
	    	String pais = keysAsArray.get(r.nextInt(countries.size()));
	    	String capital = countries.get(pais);
	    	System.out.println("Introdueix la capital de " + pais);
		    String answer = sc.nextLine();
		    
		    if (answer.equalsIgnoreCase(capital)) {
		    	System.out.println("La resposta és correcte.");
		    	points++;
		    } else {
		    	System.out.println("T'has equivocat");
		    }
		    System.out.println("Punts totals: " + points);
	    }
	    
	    try {
	        FileWriter classificacioFile = new FileWriter("classificacio.txt");
	        classificacioFile.write("Jugador/a " + name + ": " + points + " punts");
	        classificacioFile.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }

	}

}
