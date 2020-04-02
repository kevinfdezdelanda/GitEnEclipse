package ej6;

public class Punto {
	private double x, y;
	
	public Punto(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "( "+x+", "+y+" )";
	}
	
	public double distanciaOrigen() {
		return Math.sqrt((x*x)+(y*y));
	}
	
	public double calcularDistanciaA(Punto p1) {
		return Math.sqrt(Math.pow((p1.x-this.x), 2)+Math.pow((p1.y-this.y), 2));
	}
	
	public int calcularCuadrante() {
		if((x==0)||(y==0)) {
			return 0;
		}else {
			if(x>0) {
				if (y>0){
					return 1;
				}else {
					return 4;
				}
			}else {
				if (y>0){
					return 2;
				}else {
					return 3;
				}
			}
		}	
	}
	
	public Punto calcularMasCercano(Punto p1, Punto p2, Punto p3) {
		if(this.calcularDistanciaA(p1)<this.calcularDistanciaA(p2)) {
			if(this.calcularDistanciaA(p1)<this.calcularDistanciaA(p3)) {
				return p1;
			}else {
				return p3;
			}
		}else if(this.calcularDistanciaA(p1)>this.calcularDistanciaA(p2)){
			if(this.calcularDistanciaA(p2)<this.calcularDistanciaA(p3)) {
				return p2;
			}else {
				return p3;
			}
		}else {
			return null;
		}
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
}
