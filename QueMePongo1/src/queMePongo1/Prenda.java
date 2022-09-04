package queMePongo1;
import queMePongo1.Exceptions.*;

class Prenda {
	TipoDePrenda tipoDePrenda;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	

	Prenda(TipoDePrenda tipoDePrenda, Material material,Color colorPrimario, Color colorSecundario) {
		if(tipoDePrenda == null) {throw new PrendaInvalidaException("Falta el tipo de prenda");}
		if(material == null) {throw new PrendaInvalidaException("Falta el material");}
		if(colorPrimario == null) {throw new PrendaInvalidaException("Falta el color");}
		this.tipoDePrenda = tipoDePrenda;
		this.material = material;
		this.colorPrimario = colorPrimario;
		this.colorSecundario = colorSecundario;		
	}
	
	TipoDePrenda getTipoDePrenda() {
		return tipoDePrenda;
	}
	String getColorSecundario() {
		return colorSecundario.valoresColores();
	}
}