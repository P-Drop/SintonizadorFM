package com.cursoceat.main;

import java.util.Scanner;

public class Main {

	static Scanner keyboard = new Scanner(System.in);
	public static SintonizadorFM radio = new SintonizadorFM();
	public static void main(String[] args) {
		boolean salir = false;
		do {
			System.out.println("\n *** RADIO FM *** ");
			System.out.println(" 1. Subir");
			System.out.println(" 2. Bajar");
			System.out.println(" 3. Indicar un favorito");
			System.out.println(" 4. Apagar la radio");
			System.out.print("\nOpcion -> ");
			int opcion = keyboard.nextInt();
			switch (opcion) {
			case 1 -> {
				radio.up();
				radio.display();
			}
			case 2 -> {
				radio.down();
				radio.display();
			}
			case 3 -> {
				System.out.print("Indica la frecuencia favorita: ");
				double frecFav = keyboard.nextDouble();
				radio.setFrecuencia(frecFav);
				radio.display();
			}
			case 4 -> {
				System.out.println("Apagando...");
				salir = true;
			}
			default -> {
				System.err.println("\nERROR: Opción incorrecta\n");
			}
			}
		}while(!salir);
	}
}
