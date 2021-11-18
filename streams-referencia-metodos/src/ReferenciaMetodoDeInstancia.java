import java.util.function.Function;

public class ReferenciaMetodoDeInstancia {
	
	public static void main(String[] args) {
		
	//recibe un objeto Usuario y devuelve la impresi�n de sus propiedades.
		
		Function<Persona, String> ftoString= Persona::toString;
	// En este ejemplo se utiliza el m�todo toString() que fue redefinido en la clase Persona.
		
		System.out.println(ftoString.apply(new Persona("Santiago","Pardo","Nueva Direcci�n")));
	
	}

}
