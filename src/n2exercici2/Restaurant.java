package n2exercici2;

public class Restaurant implements Comparable {
	private String nom;
	private int puntuacio;
	
	public Restaurant(String nom, int puntuacio) {
		this.nom = nom;
		this.puntuacio = puntuacio;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getPuntuacio() {
		return puntuacio;
	}

	@Override
	public String toString() {
		return "Restaurant " + nom + ", " + puntuacio + " punts";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		if (this.nom == other.nom	&& this.puntuacio == other.puntuacio)
			return true;
		else return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + puntuacio;
		return result;
	}

	@Override
	public int compareTo(Object o) {
		
		if (o.getClass() != this.getClass()) {
			return -1;
		}
		
		Restaurant r = (Restaurant) o;
		
		int stringComp = this.nom.compareTo(r.nom);
		
		if (stringComp == 0) {
			if (this.puntuacio < r.puntuacio) {
				return -1;
			} else if (this.puntuacio > r.puntuacio) {
				return 1;
			} else {
				return 0;
			}
		}
		return stringComp;
	}
	
}
