package br.sp.senai.jandira.calculadora.model;

public class Triangulo {

	private double base;
	private double ladoA;
	private double ladoB;

	public void setBase(double base) {
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoA() {
		return ladoA;
	}


				
	
	public void mostrarDados() {
		System.out.println("========================");
		System.out.printf("TRIÂNGULO \n");
		System.out.printf("========================= \n");
		System.out.printf("Área: %s\n");
		System.out.println("========================");
	}

}
