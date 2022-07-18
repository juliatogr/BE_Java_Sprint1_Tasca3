package n2exercici2;

import java.util.HashSet;
import java.util.TreeSet;

public class N2_E2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashSet declaration
	      TreeSet<Restaurant> restaurants = 
	               new TreeSet<Restaurant>();

	      // Afegint diferents restaurants al HashSet
	      restaurants.add(new Restaurant("Takumi Ramen", 7));
	      restaurants.add(new Restaurant("Tagliatella", 6));
	      restaurants.add(new Restaurant("La Conreria", 9));
	      restaurants.add(new Restaurant("Sabes una cosa", 9));
	      
	      System.out.println("****Restaurants actuals****");
	      System.out.println(restaurants);
	      System.out.println();
	      
	      //Afegim duplicats
	      restaurants.add(new Restaurant("Takumi Ramen", 7));
	      restaurants.add(new Restaurant("Tagliatella", 6));
	      restaurants.add(new Restaurant("La Conreria", 9));
	      restaurants.add(new Restaurant("Sabes una cosa", 9));
	      
	      System.out.println("****Restaurants actuals després d'afegir duplicats****");
	      System.out.println(restaurants);
	      System.out.println();
	      	      
	      //Afegim duplicats amb diferent puntuació
	      restaurants.add(new Restaurant("Takumi Ramen", 8));
	      restaurants.add(new Restaurant("Tagliatella", 7));
	      restaurants.add(new Restaurant("La Conreria", 10));
	      restaurants.add(new Restaurant("Sabes una cosa", 9));
	      
	      System.out.println("****Restaurants actuals després d'afegir duplicats amb diferent puntuació****");
	      System.out.println(restaurants);
	      System.out.println(); 
	}

}
