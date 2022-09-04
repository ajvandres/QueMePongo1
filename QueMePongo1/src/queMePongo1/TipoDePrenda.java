package queMePongo1;

public enum TipoDePrenda {
	ZAPATO(Categoria.CALZADO),
    CAMISA(Categoria.PARTE_SUPERIOR),
    PANTALON(Categoria.PARTE_INFERIOR),
	ZAPATILLAS(Categoria.CALZADO),
	CHOMBA(Categoria.PARTE_SUPERIOR)
	;
	
	Categoria categoria;
	
	TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
	}
}