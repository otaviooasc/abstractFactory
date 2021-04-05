package br.com.dominio;

import java.math.BigDecimal;

import br.com.dominio.loja.LojaCentroDaInformatica;
import br.com.dominio.model.Produto;
import br.com.dominio.venda.Venda;
import br.com.dominio.venda.VendaFactory;

public class Principal {
	
	public static void main(String[]args) {
		Produto produto =new Produto();
		
		produto.setNome("XIAOMI MI 11");
		produto.setQuantidade(3);
		produto.setValorUnitario(new BigDecimal(3000));
		
		
		VendaFactory factory = new LojaCentroDaInformatica();
		
		Venda venda = new Venda(factory);
		
		venda.realizarVenda(produto);
	}
}
