package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class N1_E1_main {

	public static void main(String[] args) {
		ArrayList<Month> months = new ArrayList<Month>();
		
		System.out.println("****Afegim 11 mesos, exceptuant Agost****");
		months.add(new Month("Gener"));
		months.add(new Month("Febrer"));
		months.add(new Month("Març"));
		months.add(new Month("Abril"));
		months.add(new Month("Maig"));
		months.add(new Month("Juny"));
		months.add(new Month("Juliol"));
		months.add(new Month("Setembre"));
		months.add(new Month("Octubre"));
		months.add(new Month("Novembre"));
		months.add(new Month("Desembre"));
		
		imprimirMesosArrayList(months);
		
		System.out.println();
		
		System.out.println("****Afegim el mes d'Agost****");
		
		Month agost = new Month ("Agost");
		months.add(7, agost);
		
		imprimirMesosArrayList(months);

		System.out.println();
		
		System.out.println("****Convertim l'ArrayList en un HashSet****");
		
		HashSet<Month> monthsHS = new HashSet<>(months);
		
		imprimirMesosForHS(monthsHS);
		
		System.out.println();
		
		System.out.println("****Afegint un duplicat d'Agost****");
		monthsHS.add(agost);
		imprimirMesosIteradorHS(monthsHS);
		
	}
	
	public static void imprimirMesosArrayList(ArrayList<Month> months) {
		
		System.out.println("Mesos:");
		int numMonths = months.size();
		
		for (int i=0; i<numMonths; i++) {
			System.out.println("    - " + months.get(i).toString());
		}
	}
	
	public static void imprimirMesosForHS(HashSet<Month> months) {
		System.out.println("Imprimim els mesos mitjançant un bucle for:");
		
		for (Month value : months) {
			System.out.println("    - " + value);
		}
	}	
	
	
	public static void imprimirMesosIteradorHS(HashSet<Month> months) {
		System.out.println("Imprimim els mesos mitjançant un iterador:");
		
		Iterator<Month> monthsIt = months.iterator();
		while(monthsIt.hasNext()) {
			System.out.println("    - " + monthsIt.next().toString());
		}
	}	

}
