package ivanloy.dam.personajes;

public class Raza {

	String raza;
	
	public float hp;
	public float dp;
	public float ataque;
	public float defensa;
	public float suerte;
	public float agilidad;
	public float precision;
	
	
	public Raza(String raza) {
		
		this.raza = raza;
		
		switch(raza) {
		
			case "Enano" : 
				
				hp = 38;
				dp = 73;
				ataque = 20;
				defensa = 13;
				suerte = 12;
				agilidad = 25;
				precision = 16;
		
		}
		
	}
	
	
}
