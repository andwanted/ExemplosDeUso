package entities;

import java.util.ArrayList;
import java.util.List;

public class Carro {

	private String marca;
	private String modelo;
	private Integer ano;
	private String placa;

	private List<Carro> carros = new ArrayList<>();

	public Carro() {

	}

	public Carro(String marca, String modelo, Integer ano, String placa) {

		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public List<Carro> getCarros() {
		return carros;
	}



	public void addCarro(Carro carro) {
		carros.add(carro);
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " Modelo: " + modelo + " Ano: " + ano + " Placa: " + placa;
	}

}
