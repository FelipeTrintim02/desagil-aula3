package br.edu.insper.desagil.aula3;

import java.util.List;

public class Variancia {

	public double calcula(List<Integer> numeros) {
		double mi = 0.0;
		for (int x : numeros) {
			mi += x;
		}
		double media = mi/numeros.size();
		double soma = 0;
		for (int x : numeros) {
			double quadrado = 0;
			quadrado += (x - media)*(x - media);	
			soma += quadrado;
		}
		double var = soma/numeros.size();
		return var;
	}
}
