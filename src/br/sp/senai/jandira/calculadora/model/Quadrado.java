package br.sp.senai.jandira.calculadora.model;

public class Quadrado {
	
	private double base;
	private double altura;

	public void setBase(double base) {

		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * (base + altura);
		return perimetro;
	}
	
	public void mostrarDados() {
		System.out.println();
		System.out.printf("QUADRADO");
		System.out.println();
		System.out.printf("Área: %s\n");
		System.out.println();
	}

}
