package entidad;

public class Persona {
	private String nombre;
	private String tlf;
	private Direccion direccion;

	public Persona(String nombre, String tlf, Direccion direccion) {
		this.nombre = nombre;
		this.tlf = tlf;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", tlf=" + tlf + ", direccion=" + direccion + "]";
	}
}
