import java.util.ArrayDeque;
import java.util.Deque;

public class Ejemplo2 {

	public static void main(String[] args) {
		Deque<String> pila = new ArrayDeque<>();

		pila.offerFirst("Primero");
		pila.offerFirst("Segundo");
		pila.addFirst("Tercero");
		pila.addFirst("Cuarto");
		pila.push("Quinto");

		System.out.println(pila.pollFirst());
		System.out.println(pila.pollFirst());
		System.out.println(pila.removeFirst());
		System.out.println(pila.removeFirst());
		System.out.println(pila.pop());
		
	}
}
