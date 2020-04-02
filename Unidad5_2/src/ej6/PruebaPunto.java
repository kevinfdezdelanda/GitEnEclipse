package ej6;

public class PruebaPunto {

	public static void main(String[] args) {
		Punto p1 = new Punto(-5, 2);
		
		System.out.println("p1: "+p1.toString());
		
		System.out.println(p1.distanciaOrigen());
		
		System.out.println("p1 y:"+p1.getY());
		
		System.out.println("Cuadrante: "+p1.calcularCuadrante());
		
		Punto p2 = new Punto(5, 3);
		Punto p3 = new Punto(10, 10);
		Punto p4 = new Punto(-3, 2);
		
		System.out.println("p1-p2: "+p1.calcularDistanciaA(p2));
		System.out.println("p1-p3: "+p1.calcularDistanciaA(p3));
		System.out.println("p1-p4: "+p1.calcularDistanciaA(p4));
		
		System.out.println(p1.calcularMasCercano(p2, p3, p4));
	}

}
