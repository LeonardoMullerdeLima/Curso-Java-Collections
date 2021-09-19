package br.com.alura.curso;

import java.util.ArrayList;
import java.util.List;

public class TestaAula {

	public static void main(String[] args) {
		
		List<Aula> aulas = new ArrayList<>();
		aulas.add(new Aula("Aprendendo coisas", 15));
		aulas.add(new Aula("Aprendendo mais coisas", 18));
		aulas.add(new Aula("Aprendendo muito mais coisas", 21));
		
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
	}
}
