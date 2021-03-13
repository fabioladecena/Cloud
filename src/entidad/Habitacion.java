package entidad;

public class Habitacion {
	private float metros;
	private TipoHabitacion tipoHabitacion;

	public Habitacion(float metros, TipoHabitacion tipoHabitacion) {
		this.metros = metros;
		this.tipoHabitacion = tipoHabitacion;
	}

	public float getMetros() {
		return metros;
	}

	public void setMetros(float metros) {
		this.metros = metros;
	}

	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [metros=" + metros + ", tipoHabitacion=" + tipoHabitacion + "]";
	}

}
