import java.util.Collection;

public class CarritoDeLaCompra {

	private Collection<Integer> precios;
	 
    public CarritoDeLaCompra(Collection<Integer> precios) {
         this.precios = precios;
    }
 
    public int calcularPrecioTotal() {
        int precioTotal = 0;
        for(Integer precio : precios){
             precioTotal += precio;
         }
        return precioTotal;
    }
    
    public int calcularPrecioTotalLambda() {
        int precioTotal = this.precios.stream()
        		//.mapToInt(precio -> precio.intValue())  // ver referencia a métodos utilizando el operador :: (java 8: Integer::intValue)
        		.mapToInt(Integer::intValue)
        		.sum();
        return precioTotal;
    }
    
    public boolean detectarErrorFindAny( ) {
    	
    	return this.precios.stream()
    			.filter(precio -> precio.intValue() < 0)
    			.findAny()
    			.isPresent();
    }
    
    public long calcularDescuentoTotalLambda(int cantidadConDescuento){

        long descuentoTotal = 0;

        Long numeroDeDescuentos = 0L;//STREAM
        
        numeroDeDescuentos = this.precios.stream()
        				//.filter(n -> n >= cantidadConDescuento)
        				.filter(precio -> precio.intValue() >= cantidadConDescuento)
        				.count();

        return numeroDeDescuentos;
    }
   // Contar los elementos de la lista cuyo precio >= cantidadConDescuento;
    
    
    	// Ver filter(), anyMatch(), findAny() con Optional, findFirst() , isPresent()
    
    
    public int contarNumeroProductos() {
         return precios.size();
    }
    
    public Collection<Integer> getCarrito() {
    	return this.precios;
    }
}
