package ivanloy.dam.juego;

import ivanloy.dam.personajes.Personaje;
import ivanloy.cosas.Text;
//import ivanloy.dam.menus.MenusPrincipal;

import java.util.Scanner;


public class DAMNervionGame {

	public static void main(String[] args) throws InterruptedException{
	
		//Scanner scanner = new Scanner(System.in);
		
		Personaje yo = new Personaje("Pepelu", "Enano");
		
		Text presentacion = new Text("Hola alumno, acabas de entrar en el IES Nervion, un lugar lleno de peligros, aventuras,\r\n" + 
				"desafios y muchos, muchos suspensos… %pEn este instituto tendras que apañartelas para\r\n" + 
				"sobrevivir y ser el mejor, usando todo cuanto este en tu mano, enfrentandote a numerosos\r\n" + 
				"peligros, como los canis lupus%p %p(si, hay lobos) o los niños de primero… Te deseo la mejor\r\n" + 
				"suerte%p.%p.%p.\r\n" + 
				"\r\n" + 
				"Elige la raza con la que jugaras:\r\n" + 
				"");
		
		String raza;
		String nombre;
		
		System.out.println(" ____ ____ ____ _________ ____ ____ ____ ____ ____ ____ ____ \r\n" + 
				"||D |||A |||M |||       |||N |||E |||R |||V |||I |||O |||N ||\r\n" + 
				"||__|||__|||__|||_______|||__|||__|||__|||__|||__|||__|||__||\r\n" + 
				"|/__\\|/__\\|/__\\|/_______\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|\n");
		
		yo.mostrarStats();
		
		//presentacion.letterByLetter(50);
		
		//MenusPrincipal.menuElegirRaza1();
		
		//opcionMenu = scanner.nextInt(); //validar entrada blablabla
		
		
		
	}

}
