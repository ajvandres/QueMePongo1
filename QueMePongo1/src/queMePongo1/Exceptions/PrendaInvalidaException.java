package queMePongo1.Exceptions;

public class PrendaInvalidaException extends RuntimeException {
	
	public PrendaInvalidaException(String causa) {
		super("La Prenda es invalida porque: " + causa);
	}
}