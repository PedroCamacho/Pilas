import java.util.Stack;

public class Ejemplo1 {
	public static void main(String[] args) {
			Stack<String> pila = new Stack<>();
			
			pila.push("Primero");
			pila.push("Segundo");
			pila.push("Tercero");
			pila.push("Cuarto");
			pila.push("Quinto");

			while (!pila.isEmpty()){
				System.out.println(pila.pop());
			}
	}
}
