package oo.composicao;

import java.util.Scanner;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Paulo");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Web");
		Curso curso3 = new Curso("React");
		
		curso1.setAluno(aluno1);
		curso1.setAluno(aluno2); 
		
		curso2.setAluno(aluno1);
		curso2.setAluno(aluno3);
		
		aluno1.setCurso(curso3);
		aluno2.setCurso(curso3);
		aluno3.setCurso(curso3);
		
		System.out.println("Alunos matriculados no curso " + curso1.nome + ": ");
		for(Aluno aluno: curso1.alunos) {
			System.out.println(aluno.nome);
			
		}
		System.out.println("Alunos matriculados no curso " + curso2.nome + ": ");
		for(Aluno aluno: curso2.alunos) {
			System.out.println(aluno.nome);
			
		}
		System.out.println("Alunos matriculados no curso " + curso3.nome + ": ");
		for(Aluno aluno: curso3.alunos) {
			System.out.println(aluno.nome);
			
		}
		
	
		
		Curso teste = aluno3.getNomeCurso("React");  
		System.out.println(teste);
		if(teste != null) {
			System.out.println(teste.nome);
			System.out.println(teste.alunos);
		}
		
		
	}

}
