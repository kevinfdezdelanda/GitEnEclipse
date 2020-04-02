package ej6;

public class Cuadrado extends Figura{
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;
	private Punto vertice4;
	
	public Cuadrado(String nombre, Punto vertice1, Punto vertice3) {
		super(nombre);
		this.vertice1=vertice1;
		this.vertice3=vertice3;
	}
	

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean esRegular() {
		// TODO Auto-generated method stub
		return false;
	}

}
