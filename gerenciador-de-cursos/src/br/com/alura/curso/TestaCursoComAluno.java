package br.com.alura.curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Aprendendo coisas", 15));
		javaColecoes.adiciona(new Aula("Aprendendo mais coisas", 18));
		javaColecoes.adiciona(new Aula("Aprendendo muito mais coisas", 21));
		
		javaColecoes.matricula(new Aluno("Enzo", 789));
		javaColecoes.matricula(new Aluno("Valentina", 123));
		javaColecoes.matricula(new Aluno("M de Maria", 456));
		
		Aluno fulanoDeTal = new Aluno("M de Maria", 456);
		
		System.out.println(javaColecoes.estaMatriculado(fulanoDeTal));
	}

}
