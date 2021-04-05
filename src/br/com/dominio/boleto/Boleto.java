package br.com.dominio.boleto;

import br.com.dominio.model.Produto;

public interface Boleto {
	
	public void emitir(Produto pProduto, double pImposto);
}
