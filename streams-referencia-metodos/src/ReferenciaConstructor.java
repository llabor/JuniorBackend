import java.util.function.Supplier;

/*
 * En este ejemplo se utiliza el operador  new para crea una referencia a un objeto de tipo Persona.
 */
public class ReferenciaConstructor {

	public static void main(String[] args) {

		//referencia a constructores
		Supplier<Persona> usu = Persona::new;
				
		//Construye un objeto de tipo usuario que es devuelto por m�todo get();
		Persona usuario = usu.get();
		
		System.out.println(usuario);
	}

}
