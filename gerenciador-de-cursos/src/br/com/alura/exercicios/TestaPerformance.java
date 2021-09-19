package br.com.alura.exercicios;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
		Collection<Integer> numeros = new HashSet<>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i <= 50000; i++) {
			numeros.add(i);
		}
		
		for (Integer integer : numeros) {
			numeros.contains(integer);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoDeExecucao = fim - inicio;
		
		System.out.println("tempo: " + tempoDeExecucao);
	}
}
