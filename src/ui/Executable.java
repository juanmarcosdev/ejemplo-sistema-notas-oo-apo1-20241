package ui;

import java.util.Scanner;
import model.Controladora;

public class Executable {

	// Atributos de la clase Ejecutable
	private Scanner reader;
	private Controladora cont;
	private static boolean flag;

	private Executable() {
		reader = new Scanner(System.in);
		cont = new Controladora();
	}
	
	

	public void run(boolean flag)
	{

		flag = false;

		while (!flag) {

			System.out.println("\n \n Bienvenido al menu:\n");
			System.out.println("Opciones:\n" + "1. Registrar profesor \n" + "2. Segunda opcion\n"
					+ "3. Tercera opcion \n" + "4. Salir del programa");

			int option = reader.nextInt();

			reader.nextLine();

			switch (option) {
					case 1:
						registrarProfesor();
						break;
					case 2:
						//segundaOpcion();
						break;
					case 3:
						//terceraOpcion();
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
	
	public void registrarProfesor() {
		
		String nombreProfe, cedulaProfe;
		int edadProfe;
		
		System.out.println("Profesor, ingrese su nombre");
		
		nombreProfe = reader.nextLine();
		
		System.out.println("Profesor, ingrese su edad");
		
		edadProfe = reader.nextInt();
		
		reader.nextLine(); // Limpiar el buffer
		
		System.out.println("Profesor, ingrese su cedula");
		
		cedulaProfe = reader.nextLine();
		
		System.out.println("Datos del profe: \n" + 
		"Nombre: " + nombreProfe + "\n" + 
		"Edad: " + edadProfe + "\n" + 
		"Cedula: " + cedulaProfe);
		
		
		//cont.crearProfesor(
	}



	

	
}