package ej2;

public class PruebaDirectorio {

	public static void main(String[] args) {
		Directorio d1 = new Directorio("c:hoLa /hey/ que / tal", 3166728);
		Directorio d2 = new Directorio("c:d2 /directorio/ usuario/gato", 15);
		d1.ver();
		d2.ver();
		d2.setTamaño(d2.getTamaño()+((d1.getTamaño())/2));
		d1.ver();
		d2.ver();
		System.out.println("d1: "+d1.getTamaño()/1024+"kb");
		
	}

}
