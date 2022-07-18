package n2exercici1;

public class Restaurant {
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
	
}
