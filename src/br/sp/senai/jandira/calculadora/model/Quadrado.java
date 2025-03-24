package br.sp.senai.jandira.calculadora.model;

public class Quadrado {
	
	private double lado;
	private double perimetro;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}



	public double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	
	public double calcularPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}
	
	public void mostrarDados() {
		System.out.println("========================");
		System.out.printf("QUADRADO \n");
		System.out.printf("========================= \n");
		System.out.printf("Área: %s\n", calcularArea());
		System.out.println("========================");
		System.out.printf("Perímetro: %s\n", calcularPerimetro());
	}

}
