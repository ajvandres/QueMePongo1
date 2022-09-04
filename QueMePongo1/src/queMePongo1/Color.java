package queMePongo1;

class Color {
	int rojo, verde, azul;
	
	Color(int rojo, int verde, int azul) {
		this.rojo = rojo;
		this.verde = verde;
		this.azul = azul;
	}
	
	String valoresColores() {
		return String.valueOf(rojo)+"-"+String.valueOf(verde)+"-"+String.valueOf(azul);
	}
}