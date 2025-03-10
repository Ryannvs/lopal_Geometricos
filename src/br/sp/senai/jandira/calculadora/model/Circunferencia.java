package br.sp.senai.jandira.calculadora.model;

public class Circunferencia {
	
	private double raio;
	
	public void serRaio (double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double calcularArea() {
		double area = Math.PI * (raio * raio);
		return area;
	}
	
	public void mostrarDados() {
		System.out.println("==================");
		System.out.printf("CIRCUNFERÊNCIA");
		System.out.println("==================");
		System.out.printf("Área: %s\n");
		System.out.println("==================");
	}

}
