package ej6;

public abstract class Figura {
	@SuppressWarnings("unused")
	private String nombre;
	
	public Figura(String nombre) {
		this.nombre=nombre;
	}
	
	public abstract double calcularArea();
	
	public abstract boolean esRegular();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
