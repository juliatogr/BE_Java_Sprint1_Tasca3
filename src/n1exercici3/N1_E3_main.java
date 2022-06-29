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
		
		// Llegim els paisos
		HashMap<String, String> countries = readCountries();
	    
		// Llegim el nom de l'usuari
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Introdueix el teu nom:");
	    String name = sc.nextLine();
	    
	    // juguem i escribim la classificació en el fitxer classificacio.txt
	    int points = play(countries);
	    writeClassification(name, points);
	    sc.close();

	}
	
	public static HashMap<String, String> readCountries(){
		// Mètode per llegir el fitxer countries.txt i retornar el HashMap corresponent.
		HashMap<String, String> countries = new HashMap<String, String>();
	    String nomFitxer = "countries.txt";
		
	    try {
	    	File countriesFile = new File(nomFitxer);
	    	Scanner reader = new Scanner(countriesFile);
	    	// Llegim cada linia del fitxer
	        while (reader.hasNextLine()) {		
	          String data = reader.nextLine();
	          String dataArray[] = data.split(" ");		// Separem país i capital
	          countries.put(dataArray[0], dataArray[1]);// i les guardem al HashMap
	        }
	        reader.close();
	    } catch (FileNotFoundException e) {
	        System.out.println("No s'ha trobat el fitxer " + nomFitxer);
	        e.printStackTrace();
	    }
	    return countries;
	}

	public static void writeClassification(String name, int points) {
	    // Mètode per escriure la classificació en el fitxer classificacio.txt
		
		String nomFitxer = "classificacio.txt";
		
		try {
	        FileWriter classificacioFile = new FileWriter(nomFitxer);
	        classificacioFile.write("Jugador/a " + name + ": " + points + " punts");
	        classificacioFile.close();
	        System.out.println("La classificació s'ha guardat en el fitxer " + nomFitxer);
	    } catch (IOException e) {
	        System.out.println("No s'ha pogut guardar el fitxer " + nomFitxer);
	        e.printStackTrace();
	    }
	}
	
	public static int play(HashMap<String, String> countries) {
		// Mètode per jugar a adivinar la capital de 10 països aleatoris
		
		Scanner sc = new Scanner(System.in);
		
		// Inicialització de les variables necessàries
		final int NUM_INTENTS = 10;
		int points = 0;
		
		
		// Obtenim una llista amb tots els paisos del HashMap
	    List<String> keysAsArray = new ArrayList<String>(countries.keySet());
	    
	    // Inicialitzem un número aleatori que permetrà escollir 
	    // un pais aleatori en concret de la llista de paisos
	    Random r = new Random(); 
	    
	    // Joc
	    for (int i=0; i<NUM_INTENTS; i++) {
	    	// busquem el país a partir del número aleatori i la capital corresponent
	    	String pais = keysAsArray.get(r.nextInt(countries.size()));
	    	String capital = countries.get(pais);
	    	
	    	// A l'usuari només li mostrem el país i agafem la capital que introdueix
	    	System.out.println("Introdueix la capital de " + pais);
		    String answer = sc.nextLine();
		    
		    // Analitzem la resposta
		    if (answer.equalsIgnoreCase(capital)) { // Si és correcte suma un punt
		    	System.out.println("La resposta és correcte.");
		    	points++;
		    } else {								// si no és correcte, no suma punts
		    	System.out.println("T'has equivocat");
		    }
		    System.out.println("Punts totals: " + points);
	    }
	    return points;
	}
}
