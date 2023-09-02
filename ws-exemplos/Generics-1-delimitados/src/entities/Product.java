package entities;

public class Product implements Comparable<Product> {

	private String produto;
	private Double valor;
	private Integer id;

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Product(String produto, Double valor, Integer id) {
		this.produto = produto;
		this.valor = valor;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Name " + produto + " Price: " + String.format("%.2f", valor);
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return valor.compareTo(o.getValor());
	}

}
