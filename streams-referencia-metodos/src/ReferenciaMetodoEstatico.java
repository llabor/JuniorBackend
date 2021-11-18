import java.util.ArrayList;
import java.util.List;

/*
 * En este ejemplo se utiliza el método System.out::println, como referencia a métodos estáticos.
 */
public class ReferenciaMetodoEstatico {
	
	public static void main(String[] args) {
		List names = new ArrayList();		
	      names.add("Andrea");
	      names.add("Luisa");
	      names.add("Diego");
	      names.add("Paúl");
	      names.add("Dario");			
	      names.forEach(System.out::println);
	}
}
