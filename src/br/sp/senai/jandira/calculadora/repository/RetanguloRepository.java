package br.sp.senai.jandira.calculadora.repository;

import java.util.Scanner;
import br.sp.senai.jandira.calculadora.model.Retangulo;

public class RetanguloRepository {

	public void criarRetangulo() {
		Scanner leitor = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println();
		System.out.println("Criando um retangulo...");
		
		System.out.print("Qual a medida da base do retangulo?");
		retangulo.setBase(leitor.nextDouble());
		
		System.out.print("Qual a medida da altura do retangulo?");
		retangulo.setAltura(leitor.nextDouble());

		retangulo.mostrarDados();

		leitor.close();

	}

}
