package ej6;

public class PruebaTriangulo {

	public static void main(String[] args) {
		Punto vA = new Punto(5, 3);
		Punto vB = new Punto(10, 10);
		Punto vC = new Punto(-3, 2);
		
		Triangulo t1= new Triangulo("t1", vA, vB, vC);
		
		System.out.println(t1.toString());
		
		System.out.println("Area: "+t1.calcularArea());
	}

}
