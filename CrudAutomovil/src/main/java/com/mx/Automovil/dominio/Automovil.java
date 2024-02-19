package com.mx.Automovil.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "AUTOMOVIL")
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Automovil {

	@Id
	private int idAutomovil;
	private String marca;
	private String subMarca;
	private int modelo; 
	private double km;
	private String version;
	private int capPasajeros;
	private int kmLitro;
	
	
	public int getIdAutomovil() {
		return idAutomovil;
	}
	public void setIdAutomovil(int idAutomovil) {
		this.idAutomovil = idAutomovil;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSubMarca() {
		return subMarca;
	}
	public void setSubMarca(String subMarca) {
		this.subMarca = subMarca;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getCapPasajeros() {
		return capPasajeros;
	}
	public void setCapPasajeros(int capPasajeros) {
		this.capPasajeros = capPasajeros;
	}
	public int getKmLitro() {
		return kmLitro;
	}
	public void setKmLitro(int kmLitro) {
		this.kmLitro = kmLitro;
	}
	
	
	
	
}
