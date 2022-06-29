package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class N1_E2_main {

	public static void main(String[] args) {
		List<Integer> ints1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println("Primera llista d'enters: " + ints1);
		
		List<Integer> ints2 = new ArrayList<Integer>();
		System.out.println("Creem una segona llista d'enters buida: " + ints2);
		
		System.out.println("Agegint els enters de la primera llista en ordre invers a la segona llista... ");
		ListIterator<Integer> intsIt = ints1.listIterator(ints1.size());
	
		while (intsIt.hasPrevious()) {
			ints2.add(intsIt.previous());
		}
		System.out.println("Segona llista d'enters: " + ints1);
	}

}
