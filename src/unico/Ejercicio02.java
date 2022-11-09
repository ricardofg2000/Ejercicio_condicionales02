package unico;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*Realiza un programa que pida una 
		 * hora por teclado y que luego muestre 
		 * "buenos días", "buenas tardes" o "buenas noches" 
		 * según la hora. Se utilizarán los tramos de 6 a 12, 
		 * de 13 a 20 y de 21 a 5. respectivamente. Sólo se 
		 * tienen en cuenta las horas, los minutos no se deben introducir por teclado.*/

		final String MAÑANA = "Buenos dias";
		final String TARDE = "Buenas tardes";
		final String NOCHE = "Buenas noches";
		
		int tipo = 0;
		int respuesta;
		String mensaje = null;
		
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("¿Qué hora es? [Sin minutos]");
		respuesta = leer.nextInt();
		
		if (respuesta >= 6 && respuesta <= 12) {
			mensaje = MAÑANA;
		}
		if (respuesta >= 13 && respuesta <= 20) {
			mensaje = TARDE;
		}
		if ((respuesta >= 0 && respuesta <= 5) || (respuesta >= 21 && respuesta <= 24)) {
			mensaje = NOCHE;
		}
		if (respuesta > 24) {
			mensaje = "ERROR";
		}
		
		System.out.println(mensaje);
	}
}