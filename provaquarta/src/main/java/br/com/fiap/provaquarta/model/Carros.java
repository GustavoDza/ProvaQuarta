package br.com.fiap.provaquarta.model;

public class Carros {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private int ano;
	private double potencia;
	
	public Carros() {
		
	}
	
	public Carros(String marca, String modelo, String placa, String cor, 
				  int ano, double potencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
		this.potencia = potencia;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	
	

}
