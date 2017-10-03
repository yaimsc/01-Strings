import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// creamos un objeto para leer del teclado
		Scanner lector = new Scanner(System.in);

		System.out.println("Escribe tu nombre"); // para que aparezca en
													// pantalla
		String nombre = lector.nextLine(); // leemos del teclado para texto

		System.out.println("Escribe tu primer apellido");
		String apellido1 = lector.nextLine();

		System.out.println("Escribe tu segundo apellido");
		String apellido2 = lector.nextLine();

		// como aparecen todos los string y lo que hemos escrito
		System.out.println("Hola, " + apellido1 + " " + apellido2 + "," + nombre);

		System.out.println("Ecribe tu edad");
		int edad = lector.nextInt(); // int para num
		// para realizar condiciones

		if (edad < 18) {
			System.out.println("Eres menor de edad");
		} else // igual que si no
			System.out.println("Eres mayor de edad");
	}

}
