package br.sp.senai.jandira.calculadora.model;

public class Trapezio { 
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}
	
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public double getBaseMenor() {
		return baseMenor;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double calcularArea() {
		double area = (baseMaior + baseMenor) * altura / 2;
		return area;
	}
	
	public void mostrarDados() {
		System.out.println("========================");
		System.out.printf("TRAPÉZIO \n");
		System.out.printf("======================== \n");
		System.out.printf("Área: %s\n", calcularArea());
		System.out.println("========================");
	}
	

}
