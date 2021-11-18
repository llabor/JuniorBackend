
public class CarritoMain {

	public static void main(String[] args) {
		
		CarritoBuilder carrito = new CarritoBuilder(5);
		CarritoDeLaCompra carritoCompra = carrito.build();
		
		System.out.println(carritoCompra.getCarrito());
		
		System.out.println(carritoCompra.calcularPrecioTotal());
		
		System.out.println(carritoCompra.calcularPrecioTotalLambda());
		
		System.out.println(carritoCompra.detectarErrorFindAny());
		
		System.out.println(carritoCompra.calcularDescuentoTotalLambda(50));
	}
	

}
