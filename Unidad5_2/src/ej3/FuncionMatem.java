package ej3;

public class FuncionMatem {
	private double x;

	public FuncionMatem(double x) {
		this.x = x;
	}

	public double evaluar() {
		double parte1 = Math.sin(Math.pow(x, 3) + ((2 * x) / 9));
		double parte2 = Math.tan(Math.pow(Math.E, Math.pow(x, 3)));
		double parte3 = Math.cos(6 * Math.PI + parte2);
		return Math.sqrt(parte1 + parte3);
	}
	
	public static double evaluarX(double x) {
		double parte1 = Math.sin(Math.pow(x, 3) + ((2 * x) / 9));
		double parte2 = Math.tan(Math.pow(Math.E, Math.pow(x, 3)));
		double parte3 = Math.cos(6 * Math.PI + parte2);
		return Math.sqrt(parte1 + parte3);
	}
	
	public static void main(String[] args) {
		FuncionMatem x = new FuncionMatem(0.0);
		System.out.println(x.evaluar());
		System.out.println(FuncionMatem.evaluarX(1.0));
	}

}

