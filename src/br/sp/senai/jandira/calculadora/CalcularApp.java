package br.sp.senai.jandira.calculadora;

import java.util.Scanner;

import br.sp.senai.jandira.calculadora.model.Circunferencia;
import br.sp.senai.jandira.calculadora.model.Menu;
import br.sp.senai.jandira.calculadora.model.Quadrado;
import br.sp.senai.jandira.calculadora.model.Retangulo;
import br.sp.senai.jandira.calculadora.model.Trapezio;
import br.sp.senai.jandira.calculadora.model.Triangulo;

public class CalcularApp {

	public static void main(String[] args) {

		Quadrado q1 = new Quadrado();
		System.out.println(q1);

		Retangulo r1 = new Retangulo();
		System.out.println(r1);

		Triangulo t1 = new Triangulo();
		System.out.println(t1);

		Circunferencia c1 = new Circunferencia();
		System.out.println(c1);

		Trapezio t2 = new Trapezio();
		System.out.println(t2);
		
		Menu.criarMenu();

		Scanner leitor = new Scanner(System.in);
		

	}

}
