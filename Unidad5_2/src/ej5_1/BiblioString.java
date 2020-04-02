package ej5_1;

public class BiblioString {

	static public String concatenarInverso() {
		String string, texto = "";
		string="";
		int contador=1;
		while ((!string.equalsIgnoreCase("fin"))&&(contador<=10)) {
			System.out.println("introduce un String: ");
			string = Consola.leeString();
			texto=string +texto;
			contador++;
		}
		texto=texto.trim();
		return texto;
	}
	
	static public int sustituir (String texto, char caracter1, char caracter2) {
		int numCaracter=texto.length();
		int numSust=0;
		String textoResultado="";
		for (int i = 0; i < numCaracter; i++) {
			if(texto.charAt(i)== caracter1){
				textoResultado+=caracter2;
				numSust++;
			}else {
				textoResultado+=texto.charAt(i);
			}
		}
		System.out.println(textoResultado);
		return numSust;
	}
	
	static public String eliminarCar(String texto, char  caracter) {
		int numCaracter=texto.length();
		String textoResultado="";
		for (int i = 0; i < numCaracter; i++) {
			if(texto.charAt(i)!= caracter){
				textoResultado+=texto.charAt(i);
			}
		}
		return textoResultado;
	}
	
	static public String completar$(String texto, int longitud) {
		int numCaracter=texto.length();
		if(numCaracter>=longitud) {
			return texto;
		}else {
			int contador=longitud-numCaracter;
			for (int i = 0; i < contador; i++) {
				texto+="$";
			}
			return texto;
		}
	}
	
	static public String verPalabras(String texto) {
		texto=texto.toLowerCase();
		int numCaracter=texto.length();
		String textoResultado="";
		for (int i = 0; i < numCaracter; i++) {
			if(texto.charAt(i)== ' ') {
				textoResultado+="\n";
			}else {
				textoResultado+=texto.charAt(i);
			}
		}
		return textoResultado;
	}
	
	static public String verPalabrasAlReves(String texto) {
		texto=texto.toUpperCase();
		int numCaracter=texto.length();
		numCaracter--;
		String textoResultado="";
		int palabraAnterior=0;
		for (int i = 0; i < numCaracter; i++) {
			if(texto.charAt(i)== ' ') {
				textoResultado=texto.substring(palabraAnterior, i)+textoResultado;
				textoResultado="\n"+textoResultado;
				palabraAnterior=i+1;
			}
		}
		textoResultado=texto.substring(palabraAnterior, texto.length())+textoResultado;
		return textoResultado;
	}
	
}
