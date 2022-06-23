package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	final List<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome){
		this.nome = nome;
				
	}
	Curso getNomeCurso(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome));
				return curso;
			
		}
		
		return null;
	}
	
	//RELAÇÃO BIDIRECIONAL
	void setCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
		
		
	}
	@Override
	public String toString() {
		return  nome;
	}
	
	
	

}
