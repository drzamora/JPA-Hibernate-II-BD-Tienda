package com.latam.alura.tienda.modelo;

import javax.persistence.Entity;

@Entity
public class Libros extends Producto {
	
	private String autor;
	private int paginas;
	
	public Libros() {
	}

	public Libros(String autor, int numeroDePagina) {
		this.autor = autor;
		this.paginas = numeroDePagina;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroDePagina() {
		return paginas;
	}

	public void setNumeroDePagina(int numeroDePagina) {
		this.paginas = numeroDePagina;
	}
	
	
	

	
}
