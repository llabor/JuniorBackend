import java.util.function.Function;

public class ReferenciaMetodoDeInstancia {
	
	public static void main(String[] args) {
		
	//recibe un objeto Usuario y devuelve la impresión de sus propiedades.
		
		Function<Persona, String> ftoString= Persona::toString;
	// En este ejemplo se utiliza el método toString() que fue redefinido en la clase Persona.
		
		System.out.println(ftoString.apply(new Persona("Santiago","Pardo","Nueva Dirección")));
	
	}

}
