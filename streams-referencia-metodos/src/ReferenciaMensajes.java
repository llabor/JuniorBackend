import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Supplier;

public class ReferenciaMensajes {

	public static void main(String[] args) {

		// referencia a mensajes
		
		LinkedList<Integer> lista = new LinkedList<Integer>(Arrays.asList(1, 2, 3));
		
		// utiliza El método removeLast para eliminar el último elemento de la lista por último, se imprime la lista.
		Supplier<Integer> funcion3 = lista::removeLast;
		
		System.out.println(funcion3.get()); // 3
		
		lista.forEach(System.out::println);
	}

}
