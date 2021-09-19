package br.com.alura.curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String titulo;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String titulo, String instrutor) {
		if (titulo == null) {
			throw new NullPointerException("Titulo não pode ser nulo");
		}
		if (instrutor == null) {
			throw new NullPointerException("Instrutor não pode ser nulo");
		}
		this.titulo = titulo;
		this.instrutor = instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaMatriculado(int numero) {
		if (!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException();
		}
		return matriculaParaAluno.get(numero);
	}
	
	public int getTempoTotal() {
		int total = 0;
		for (Aula aula : this.aulas) {
			total += aula.getDuracao();
		}
		return total;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.titulo + ", tempo total: " + getTempoTotal() + ", aulas: " + this.getAulas() + "]";
	}
}
