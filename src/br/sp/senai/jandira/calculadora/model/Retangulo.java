package br.sp.senai.jandira.calculadora.model;

public class Retangulo {

	private double base;
	private double altura;
	private double perimetro;

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
	
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double getPerimetro() {
		return perimetro;
	}

	public double calcularPerimetro() {
		double perimetro = 2 * (base + altura);
		return perimetro;
	}

	public void mostrarDados() {
		System.out.println("========================");
		System.out.printf("RETÂNGULO \n");
		System.out.printf("======================== \n");
		System.out.printf("Área: %s\n", calcularArea());
		System.out.println("========================");
		System.out.printf("Perímetro: %s\n", calcularPerimetro());
	}

}
