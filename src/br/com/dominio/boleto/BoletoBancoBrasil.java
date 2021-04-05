package br.com.dominio.boleto;

import br.com.dominio.model.Produto;

public class BoletoBancoBrasil implements Boleto {

	@Override
	public void emitir(Produto pProduto, double pImposto) {
		System.out.println("BANCO DO BRASIL");
		
		System.out.println("--------------------------------------");
		
		System.out.println("Descrição: " + pProduto.getNome());
		System.out.println("Quantidade: " + pProduto.getQuantidade());
		System.out.println("Valor: R$" + pProduto.getValorUnitario());
		System.out.println("Valor total: R$" + pProduto.getValorTotal(pImposto));
	}

}
