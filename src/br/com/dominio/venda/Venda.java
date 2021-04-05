package br.com.dominio.venda;

import br.com.dominio.boleto.Boleto;
import br.com.dominio.model.Produto;
import br.com.dominio.nfe.NFE;

public class Venda {
	
	private NFE notaFiscal;
	private Boleto boleto;
	
	public Venda(VendaFactory factory) {
		this.notaFiscal = factory.criarNFE();
		this.boleto = factory.criarBoleto();
	}
	
	
	public void realizarVenda(Produto pProduto) {
		double imposto = notaFiscal.calcularImposto(pProduto);
		
		boleto.emitir(pProduto, imposto);
	}
}
