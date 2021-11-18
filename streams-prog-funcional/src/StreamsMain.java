import java.util.ArrayList;

public class StreamsMain {

	public static void main(String[] args) {
		 
		 ArrayList<Gasto> lista= new ArrayList<Gasto>();
		 
		 long a = 80;
		 long b = 50;
		 long c = 70;
		 long d = 95;
		 
		 lista.add(new Gasto("A", a));
		 lista.add(new Gasto("B", b));
		 lista.add(new Gasto("C", c));
		 lista.add(new Gasto("D", d));
		 
//		 double totalPago=0;
//		 
//		 for (Gasto g:lista) {
//		 	 if (g.getImporte()*1.21 < 100) {
//		 			 totalPago = totalPago + g.getImporte()*1.21;
//		 	 }
//		 }
	//	 System.out.println(totalPago);
		 
		 // Stream + programación funcional
		 
		 		 
		 double resultado = lista.stream()
		 				.mapToDouble(gasto -> gasto.getImporte()*1.21)
		 				.filter(gasto -> gasto < 100)
		 				.sum();
		 System.out.println(resultado);
		 
	}
}
