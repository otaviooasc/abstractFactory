package br.com.dominio.nfe;

import java.math.BigDecimal;

import br.com.dominio.model.Produto;

public class NFESaoPaulo implements NFE {

	@Override
	public double calcularImposto(Produto pProduto) {
		
		BigDecimal imposto = new BigDecimal("0.18");
		imposto = imposto.multiply(pProduto.getValorUnitario());
		
		return imposto.doubleValue();
	}

}
