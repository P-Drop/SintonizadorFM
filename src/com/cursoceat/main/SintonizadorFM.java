package com.cursoceat.main;

public class SintonizadorFM {

	private double frecuencia;

	public SintonizadorFM(double f) {
		
		if(f<80) {
			this.frecuencia = 80;
		}
		else if(f>108) {
			this.frecuencia = 108;
		}
		else {
			this.frecuencia = f;
		}		
	}
	
	public SintonizadorFM () {
		this(80);
	}
	
	public void setFrecuencia(double f) {
		this.frecuencia = f;
	}
	
	public double up() {
		this.frecuencia += 0.5;
		comprobarFrecuencia();
		return this.frecuencia;
	}
	public double down() {
		this.frecuencia -= 0.5;
		comprobarFrecuencia();
		return this.frecuencia;
	}
	
	private void comprobarFrecuencia() {
		if(this.frecuencia <80) {
			this.frecuencia = 108;
		}
		else if(this.frecuencia>108) {
			this.frecuencia = 80;
		}
	}
	
	public void display() {
		System.out.println("Sintonizando: "+this.frecuencia+" FM");
	}
}
