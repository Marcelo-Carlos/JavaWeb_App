package br.edu.infnet.AppSDI.aula01;

import java.util.ArrayList;
import java.util.List;

public class ExemploTeste {
	
	public static void main(String[] args) {
		
		String[] nomes = {"Marcelo", "Maria", "Carlos"};
		String[] emails = {"msac@gmail.com", "aaa@gmail.com", "bbb@gmail.com"};
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int i = 0; i < nomes.length; i++) {
			
			Aluno aluno = new Aluno();
			aluno.setId(i+1);
			aluno.setNome(nomes[i]);
			aluno.setEmail(emails[i]);
			alunos.add(aluno);
			
		}
		
		for (Aluno item : alunos) {
			System.out.println(item);
		}
		
	}
}
