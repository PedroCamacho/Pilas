import java.util.Scanner;
import java.util.Stack;

public class Reto {

	public static void main(String[] args) {
		// Inicializaci�n
		Scanner sc = new Scanner(System.in);
		Stack<Character> pila = new Stack<>();
		System.out.print("Escriba la expresi�n con par�ntesis: ");
		String expresion = sc.nextLine();
		char elemento;
		boolean resultado = true;

		// Proceso
		char[] expresionComoArray = expresion.toCharArray();
		for (int i = 0; i < expresionComoArray.length; i++) {
			elemento = expresionComoArray[i];
			if (elemento == '(')
				pila.push(elemento);
			else if (elemento == ')')
				if (pila.isEmpty() || pila.pop() != '(')
					resultado = false;
		}
		if (!pila.isEmpty())
			resultado = false;

		// Salida
		System.out.println(resultado ? "Expresi�n correcta" : "Expresi�n incorrecta");
		sc.close();
	}

}
