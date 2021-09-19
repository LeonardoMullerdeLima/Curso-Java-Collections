package br.com.alura.curso;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {

	public static void main(String[] args) {

		Set<Aluno> alunos = new HashSet<>();
		alunos.add(new Aluno("Enzo", 789));
		alunos.add(new Aluno("Valentina", 123));
		alunos.add(new Aluno("M de Maria", 456));
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
	}

}
