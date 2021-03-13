package entidad;

import java.util.ArrayList;

public class Casa {
	private Direccion direccion;
	private ArrayList<Habitacion> habitaciones;
	private float metros;
	private Persona dueño;
	private ArrayList<Persona> inquilino;

	public Casa(Direccion direccion, ArrayList<Habitacion> habitaciones, float metros, Persona dueño,
			ArrayList<Persona> inquilino) {
		this.direccion = direccion;
		this.habitaciones = habitaciones;
		this.metros = metros;
		this.dueño = dueño;
		this.inquilino = inquilino;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public float getMetros() {
		return metros;
	}

	public void setMetros(float metros) {
		this.metros = metros;
	}

	public Persona getDueño() {
		return dueño;
	}

	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}

	public ArrayList<Persona> getInquilino() {
		return inquilino;
	}

	public void setInquilino(ArrayList<Persona> inquilino) {
		this.inquilino = inquilino;
	}

	@Override
	public String toString() {
		return "Casa [direccion=" + direccion + ", habitaciones=" + habitaciones + ", metros=" + metros + ", dueño="
				+ dueño + ", inquilino=" + inquilino + "]";
	}
}
