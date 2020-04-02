package ej6;

public class Triangulo extends Figura{
	private Punto vA,vB,vC;
	
	public Triangulo(String nombre, Punto vA, Punto vB,Punto vC) {
		super(nombre);
		this.vA=vA;
		this.vB=vB;
		this.vC=vC;
	}

	public void mostrarLongitudLados() {
		System.out.println("Lado 1: "+vA.calcularDistanciaA(vB));
		System.out.println("Lado 2: "+vB.calcularDistanciaA(vC));
		System.out.println("Lado 3: "+vC.calcularDistanciaA(vA));
	}
		
	@Override
	public double calcularArea() {
		double parte1=vA.getX()*(vB.getY()-vC.getY());
		double parte2=vB.getX()*(vC.getY()-vA.getY());
		double parte3=vC.getX()*(vA.getY()-vB.getY());
		return ((parte1+parte2+parte3)/2);
	}

	@Override
	public boolean esRegular() {
		if((vA.calcularDistanciaA(vB)==vB.calcularDistanciaA(vC))&&(vA.calcularDistanciaA(vB)==vC.calcularDistanciaA(vA))){
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		if(this.esRegular()) {
			return "TRIANGULO [NOMBRE="+this.getNombre()+"] [REGULAR]: VERTICES "+vA.toString()+","+vB.toString()+","+vC.toString();
		}else {
			return "TRIANGULO [NOMBRE="+this.getNombre()+"] [NO REGULAR]: VERTICES "+vA.toString()+","+vB.toString()+","+vC.toString();
		}
	}

}
