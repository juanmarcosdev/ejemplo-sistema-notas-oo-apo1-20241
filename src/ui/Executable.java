package ui;

import java.util.Scanner;
import model.Controladora;

public class Executable {

	// Variables globales
	private Scanner reader;
	private Controladora cont;
	private boolean flag;

	private Executable() {
		reader = new Scanner(System.in);
		cont = new Controladora();
	}
	
	

	public static void run(boolean flag)
	{

		flag = false;

		while (!flag) {

			System.out.println("\n \n Bienvenido al menu:\n");
			System.out.println("Opciones:\n" + "1. Primera opcion \n" + "2. Segunda opcion\n"
					+ "3. Tercera opcion \n" + "4. Salir del programa");

			int option = reader.nextInt();

			reader.nextLine();

			switch (option) {
					case 1:
						primeraOpcion();
						break;
					case 2:
						segundaOpcion();
						break;
					case 3:
						terceraOpcion();
						break;
					case 4:
						flag = true;
						System.exit(0);
						break;
					default:
						System.out.print("Por favor ingrese una opcion valida");
						continue;
			}

		}

	}

	public static void main(String[] args) {
		Executable mainApp = new Executable();
		mainApp.run(flag);
	}


	

	
}