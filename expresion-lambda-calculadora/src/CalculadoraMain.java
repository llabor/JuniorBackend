import java.util.Arrays;
import java.util.function.Predicate;

public class CalculadoraMain {

	public static void main(String[] args) {

        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(
                (n) -> System.out.print(n + " "));

       // Ejemplo de expresión lambda Predicate
        
        Predicate<String> predicate = (s) -> s.length() > 0;
        
        System.out.println(predicate.test("predicado"));
        
               
        
        int x = 10;
       int y = 5;
       
       // Uso del método con la implementación mediante una exprensión lambda
       
       IFuncionLambda flambda = (a, b)-> {
    	   System.out.println("\n" + (a + b));
       };
       flambda.calcular(x, y);
       
       flambda = (a,b)->{
    	   System.out.println(a - b);
       };
       flambda.calcular(x, y);
    }
}
