package com.dio.model;

import java.util.Objects;

public class Car {
	// attributes
	private String fabricante;
	private String modelo;
	private Integer ano;
	private String configuracao;
	private String propulsao;
	private String porte;
	private Integer fuelCapacity;

	public Car() {   // Constructor
	}

	public Car(String fabricante, String modelo, Integer ano, String configuracao, String propulsao, String porte, Integer fuelCapacity) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.configuracao = configuracao;
		this.propulsao = propulsao;
		this.porte = porte;
		this.fuelCapacity = fuelCapacity;
	}

	// create methods for each attribute
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
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

	public String getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}

	public String getPropulsao() {
		return propulsao;
	}

	public void setPropulsao(String propulsao) {
		this.propulsao = propulsao;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public Integer getFuelCapacity() {
		return ano;
	}

	public void setFuelCapacity(Integer fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ano, configuracao, fabricante, 
		fuelCapacity, modelo, porte, propulsao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(ano, other.ano) && Objects.equals(configuracao, other.configuracao)
				&& Objects.equals(fabricante, other.fabricante) && Objects.equals(fuelCapacity, other.fuelCapacity) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(porte, other.porte) && Objects.equals(propulsao, other.propulsao);
	}

	@Override
	public String toString() {
		return "Car [fabricante=" + fabricante + ", modelo=" + modelo + ", ano=" + ano + ", configuracao="
				+ configuracao + ", propulsao=" + propulsao + ", porte=" + porte + ", fuelCapacity=" + fuelCapacity + "]";
	}
	
	/*
	 * void finalize() {   // destructor
	 * }
	 */

	double totalTankPrice(double fuelPrice) {
		return fuelCapacity * fuelPrice;
	}

}
