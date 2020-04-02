package ej4;

public class CalculosVarios {
	public static void main(String[] args) {
		String str_int1="12", str_int2="34";
		System.out.println(str_int1+str_int2);
		System.out.println(Integer.parseInt(str_int1)+Integer.parseInt(str_int2));
		
		
		String str_f1="15.5", str_f2="4.5";
		System.out.println(str_f1+str_f2);
		System.out.println(Float.parseFloat(str_f1)+Float.parseFloat(str_f2));
		
		Integer n1=20, n2=30;
		int n3=n1*n2;
		System.out.println(n3);
		
		System.out.println(Math.ceil(2.3));
		System.out.println(Math.round(2*Math.PI));
		
		System.out.println(Math.abs(Math.sin(-2)));
		
		System.out.println(Math.min(Math.sin(Math.PI/180),Math.sin(Math.PI/270)));
		
		for (int i = 1; i < 10; i++) {
			System.out.println("3^"+i+": "+Math.pow(3, i));
		}
		
		int numAleatorio=1000;
		while((numAleatorio<0)||(numAleatorio>10)) {
			numAleatorio=(int) (Math.random()*100);
		}
		System.out.println(numAleatorio);
		
		numAleatorio=1000;
		while((numAleatorio<10)||(numAleatorio>20)) {
			numAleatorio=(int) (Math.random()*100);
		}
		System.out.println(numAleatorio);
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
			numAleatorio=1000;
			while((numAleatorio<10)||(numAleatorio>20)) {
				numAleatorio=(int) (Math.random()*100);
			}
			System.out.println(numAleatorio);
		}
		
		System.out.println();
		System.out.println("dado");
		for (int i = 0; i < 3; i++) {
			System.out.println(dado());
		}
		
		System.out.println();
		numAleatorio=1000;
		int numAleatorio2=3;
		while((numAleatorio<-20)||(numAleatorio>10)) {
			numAleatorio=(int) (Math.random()*100);
			if((numAleatorio>=-20)&&(numAleatorio<=10)){	
				numAleatorio2=(int) (Math.random()*10);
			}
			if(numAleatorio2>5) {
				numAleatorio*=-1;
			}
		}
		System.out.println(numAleatorio);
		
		System.out.println();
		char letra='A';
		numAleatorio=1000;
		while((numAleatorio<0)||(numAleatorio>26)) {
			numAleatorio=(int) (Math.random()*100);
		}
		letra+=numAleatorio;
		System.out.println(letra);
		
	}
	
	public static int dado() {
		int numAleatorio=1000;
		while((numAleatorio<1)||(numAleatorio>6)) {
			numAleatorio=(int) (Math.random()*10);
		}
		return numAleatorio;
	}
}
