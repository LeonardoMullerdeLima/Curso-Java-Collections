package br.com.alura.exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {

		Set<Funcionario> funcionarios = new HashSet<>();
		funcionarios.add(new Funcionario("Barney", 21));
		funcionarios.add(new Funcionario("Jonatan", 19));
		funcionarios.add(new Funcionario("Guaraciara", 20));

		Iterator<Funcionario> iterador = funcionarios.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}
	}
}
