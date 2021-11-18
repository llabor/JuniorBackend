import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9,10);
		
		Predicate<Integer> predicado;
 
		System.out.println("Números pares:");
		predicado = (n)-> n%2 == 0;
		evaluar(listaNumeros, predicado);
 
		System.out.println("Números impares:");
		// TO DO
		predicado = n -> n%2 == 1;
		evaluar(listaNumeros, predicado);
		
 		System.out.println("Números mayores a 5:");
		// TO DO
 		predicado = n -> n > 5;
 		evaluar(listaNumeros, predicado);
 		
 		// Uso operación terminal forEach()
 		listaNumeros.stream()
 				.forEach(n -> {
 					System.out.println(n + 1);
 				});
	}
	
	public static void evaluar(List<Integer> listaNumeros, Predicate<Integer> predicado) {
		for(Integer n: listaNumeros)  {
			if(predicado.test(n)) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}
}
