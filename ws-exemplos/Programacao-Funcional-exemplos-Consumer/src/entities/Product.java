package entities;

public class Product {

	private String name;
	private Double price;
	private Integer validity;
	private Integer batch;

	public Product(String name, Double price, Integer validity, Integer batch) {
		super();
		this.name = name;
		this.price = price;
		this.validity = validity;
		this.batch = batch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}

	public Integer getBatch() {
		return batch;
	}

	public void setBatch(Integer batch) {
		this.batch = batch;
	}

	public static void staticPriceUpdate(Product p) {
		// TODO Auto-generated method stub
		p.setPrice(p.getPrice() * 1.1);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", validity=" + validity + ", batch=" + batch + "]";
	}

}
