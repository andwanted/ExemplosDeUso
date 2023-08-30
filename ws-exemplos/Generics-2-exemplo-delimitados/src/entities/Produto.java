package entities;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	private String produto;
	private Integer quantidade;
	private Double price;

	private List<Produto> produtos = new ArrayList<>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void addProduto(Produto p) {
		produtos.add(p);
	}

	public Produto() {

	}

	public Produto(String produto, Integer quantidade, Double price) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.price = price;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Produto [produto=" + produto + ", quantidade=" + quantidade + ", price=" + price + ", produtos="
				+ produtos + "]";
	}

}
