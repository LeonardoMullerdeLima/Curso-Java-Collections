package br.com.alura.curso;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Aprendendo coisas", 15));
		javaColecoes.adiciona(new Aula("Aprendendo mais coisas", 18));
		javaColecoes.adiciona(new Aula("Aprendendo muito mais coisas", 21));
		
		System.out.println(javaColecoes);
	}

}
