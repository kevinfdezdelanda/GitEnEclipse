package ej2;

public class Directorio {
	private String nombre;
	private int tama�o;
	private final int MAXCAR=40;
	
	public Directorio(String nombre,int tama�o) {
		this.nombre=nombre;
		this.tama�o=tama�o;
	}
	
	public void ver() {
		System.out.println("nombre: "+nombre);
		System.out.println("tama�o: "+tama�o);
	}
	
	public int niveles() {
		int numCaracter=nombre.length();
		int niveles=1;
		for (int i = 0; i < numCaracter; i++) {
			if((nombre.charAt(i)== '/')||((nombre.charAt(i)== '0')&&(i==1))) {
				niveles++;;
			}
		}
		return niveles;
	}
	
	public String ultimo() {
		int numCaracter=nombre.length();
		for (int i = numCaracter-1; i > 0; i--) {
			if(nombre.charAt(i)== '/') {
				return nombre.substring(i+1, numCaracter);
			}
		}
		return nombre;
	}
	
	private boolean carIlegales() {
		int numCaracter=nombre.length();
		for (int i = 0; i < numCaracter; i++) {
			if((nombre.charAt(i)== '*')||(nombre.charAt(i)== '#')||(nombre.charAt(i)== '@')) {
				return true;
			}
		}
		return false;
	}
	
	public String dirValido() {
		String motivo="";
		if (nombre.length()>=MAXCAR) {
			motivo+="Su longitud no debe pasar de 40\n";
		}
		if (carIlegales()==true) {
			motivo+="El nombre del directorio no deb contener caracteres ilegales\n";
		}
		int numCaracteres= nombre.length();
		for (int i = 0; i < numCaracteres-1; i+=1) {
			//nombre.indexOf("//")!=-1
			if(nombre.substring(i, i+2).equals("//")) {
				motivo+="No debe incluir 2 caracteres / contiguos ( // )\n";
			}
		}
		if((!(nombre.charAt(0)>='a')||!(nombre.charAt(0)<='z'))&&(nombre.charAt(1)!=':')) {
			motivo+="Debe comenzar por un nombre de unidad de disco tal como c:, d:, f:, etc\n";
		}
		if(motivo.contentEquals("")) {
			return "ok";
		}else {
			return motivo;
		}
	}
	
	public void compactarDir() {
		int numCaracter=nombre.length();
		String nombreCopacto="";
		for (int i = 0; i < numCaracter; i++) {
			if(nombre.charAt(i)== ' ') {
				if((nombre.charAt(i+1)!='/')&&(nombre.charAt(i-1)!='/')) {
					nombreCopacto+=nombre.charAt(i);
				}
			}else {
				nombreCopacto+=nombre.charAt(i);
			}
		}
		nombreCopacto=nombreCopacto.toLowerCase();
		nombre=nombreCopacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
}
