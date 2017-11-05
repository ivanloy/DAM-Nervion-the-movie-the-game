package ivanloy.dam.personajes;

import java.util.Scanner;

public class Personaje {
	
	
    //Variables, objetos y constantes
	Scanner scanner = new Scanner(System.in);
	
	
	Raza razaBoost;
	float statBoost;
	
	public String nombre;
	public String raza; 
	public String tipo;  
	
	
	public short nivel;
	public long exp;
	public short nivelDAM;
	public long expDAM;
	public long damios;
	
	
	public int puntosStats;
	
	public int puntosHP;
	public int hp;
	
	public int puntosDP;
	public int dp;
	
	public int puntosPrecision;
	public int precision;
	
	public int puntosAtaque;
	public int ataque;
	
	public int puntosDefensa;
	public int defensa;
	
	public int puntosAgilidad;
	public int agilidad;
	
	public int puntosSuerte;
	public int suerte;
	//---------------------------------
	
	
	public Personaje(String nombre, String raza) {
		
		this.nombre = nombre;
		this.raza = raza;
		this.tipo = "jugador";
		
		razaBoost = new Raza(raza);
		statBoost = 10; //Cantidad de puntos necesarios para subir el equivalente a 1 nivel en un stat determinado, cuanto mas pequeño, mejor.
		
		nivel = 1;
		exp = 0;
		nivelDAM = 0;
		expDAM = 0;
		damios = 0;
		
		puntosStats = 50;
		
		puntosHP = 0;
		puntosDP = 0;
		puntosPrecision = 0;
		puntosAtaque = 0;
		puntosDefensa = 0;
		puntosAgilidad = 0;
		puntosSuerte = 0;
		
		hp = 0;
		dp = 0;
		precision = 0;
		ataque = 0;
		defensa = 0;
		agilidad = 0;
		suerte = 0;
		
		actualizarStats();
		
	}
	
	
	public void usarPuntosHP() { 
		
		if(puntosStats == 0) System.out.println("No tienes puntos de stat para usar");
		
		else{
			
			System.out.println("Hola " + nombre + ", escriba cuantos puntos quiere gastar en HP.\n"
					           + "Tienes: " + puntosStats + " puntos de stat y " + hp + "(" + puntosHP + ") HP(ptos. HP)");
			int cantidad = scanner.nextInt();
			
			if(cantidad <= puntosStats) {
				
				puntosHP += cantidad;
				puntosStats -= cantidad;
				
			}else System.out.println("No tienes tantos puntos");
			
			actualizarHP();
			
		}
		
	}
	
	
	public void usarPuntosDP() { 
		
		if(puntosStats == 0) System.out.println("No tienes puntos de stat para usar");
		
		else{
			
			System.out.println("Hola " + nombre + ", escriba cuantos puntos quiere gastar en HP.\n"
					           + "Tienes: " + puntosStats + " puntos de stat y " + dp + "(" + puntosDP + ") DP(ptos. DP)");
			int cantidad = scanner.nextInt();
			
			if(cantidad <= puntosStats) {
				
				puntosDP += cantidad;
				puntosStats -= cantidad;
				
			}else System.out.println("No tienes tantos puntos");
			
			actualizarDP();
			
		}
		
	}
	
	
	public void actualizarStats() {
		
		actualizarHP();
		actualizarDP();
		
	}
	
	
	public void actualizarHP() {
		
		switch(raza) {
		
			case "Enano" : hp = (int)(nivel * razaBoost.hp + (puntosHP * razaBoost.hp) / 15); break;
		
		}
		
	}
	
	
	public void actualizarDP() {
		
		switch(raza) {
		
			case "Enano" : dp = (int)(nivel * razaBoost.dp + (puntosDP * razaBoost.dp) / 15); break;
		
		}
		
	}
		
	
}
	
	

