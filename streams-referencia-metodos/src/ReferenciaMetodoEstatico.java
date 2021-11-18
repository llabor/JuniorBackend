import java.util.ArrayList;
import java.util.List;

/*
 * En este ejemplo se utiliza el m�todo System.out::println, como referencia a m�todos est�ticos.
 */
public class ReferenciaMetodoEstatico {
	
	public static void main(String[] args) {
		List names = new ArrayList();		
	      names.add("Andrea");
	      names.add("Luisa");
	      names.add("Diego");
	      names.add("Pa�l");
	      names.add("Dario");			
	      names.forEach(System.out::println);
	}
}
