package queMePongo1;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Testo {

	@Test
	public void CamisaConColorSecundario() {
		Prenda camisa = new Prenda(TipoDePrenda.CAMISA, Material.ALGODON, new Color(18,43,204), new Color(17,175,207));	
		Assertions.assertEquals("17-175-207", camisa.getColorSecundario());		
	}
	@Test
	public void CamisaSinColor() {
		try {
			Prenda camisa = new Prenda(TipoDePrenda.CAMISA, Material.ALGODON, null, null);	
		}
		catch(RuntimeException e) {
			Assertions.assertEquals("La Prenda es invalida porque: Falta el color", e.getMessage());
		}
	}
	@Test
	public void PantalonSinMaterial() {
		try {
			Prenda pantalon = new Prenda(TipoDePrenda.PANTALON, null, new Color(53,63,11), null);	
		}
		catch(RuntimeException e) {
			Assertions.assertEquals("La Prenda es invalida porque: Falta el material", e.getMessage());
		}
	}
	@Test		
	public void ZapatoSinTipoDePrenda() {
			try {
				Prenda zapato = new Prenda(null, Material.CUERO, new Color(0,0,0), null);	
			}
			catch(RuntimeException e) {
				Assertions.assertEquals("La Prenda es invalida porque: Falta el tipo de prenda", e.getMessage());
			}		
	}	
	

}
