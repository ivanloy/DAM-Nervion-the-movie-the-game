package ivanloy.dam.menus;

import java.util.Scanner;

public class MenusPrincipal {

	static Scanner scanner = new Scanner(System.in);
	
	public static void menuElegirRaza1() {
		
		System.out.println("(1) Poser\n"
				         + "(2) Friki\n"
				         + "(3) Pijo\n"
				         + "(4) Golfo\n"
				         + "(5) Cani\n"
				         + "(6) Informatico\n"
				         + "(7) Gamer\n"
				         + "(8) Gafe\n"
				         + "(9) Sig. Pagina");
		
	}
	
	public static void menuElegirRaza2() {
		
		System.out.println("(1) Chorrero\n"
				         + "(2) Mazado\n"
				         + "(3) Boomer\n"
				         + "(4) Ant. Pagina\n");
		
	}
	
	public static void menuPoserText() {
		
		System.out.println("El poser es una raza que ha comenzado a expandirse este ultimo siglo. Son una raza\r\n" + 
				"problematica, les gusta escupir veneno y atacar a la gente y tienen bastante presencia en\r\n" + 
				"nuestro mundo con sus iPhone y su ropa de marca. Aunque si tienes el doble de neuronas\r\n" + 
				"que ellos, o sea, dos, no tendras problemas, ya que no saben defenderse por si mismos y\r\n" + 
				"Steve Jobs esta muerto.\r\n");
		
		System.out.println("(0) Atras\n"
				         + "(1) Elegir");
		
	}
	
	public static void menuPoser() {
		
		int opcion;
		do {
			
			opcion = scanner.nextInt();
			menuPoserText();
			
		}while(opcion != 0 && opcion !=1);
		
	//	if(opcion == 1) raza = "poser";
	//	else menuElegirRaza1();
		
	}
	
	
	
}
