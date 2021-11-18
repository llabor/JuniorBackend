
public class Gasto {
	
	String descripcion;
	long importe;
	
	public Gasto(String descripcion, long importe) {
		this.descripcion = descripcion;
		this.importe = importe;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public long getImporte() {
		return importe;
	}
	public void setImporte(long importe) {
		this.importe = importe;
	}
	
}
