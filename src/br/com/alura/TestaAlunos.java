package br.com.alura;

import java.util.Collection;
import java.util.HashSet;
public class TestaAlunos {
     public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("allan mateus");
        alunos.add("lucas ");
        alunos.add("mateus");
        alunos.add("pedro");
        alunos.add("joao");
        boolean allanEstaMatriculado=alunos.contains("allan mateus");
        System.out.println(allanEstaMatriculado);
        alunos.remove("lucas");
        System.out.println(alunos.size()); 
        for (String aluno : alunos) {
            System.out.println(aluno);
            
        }
        alunos.forEach(aluno->{
            System.out.println(aluno);
        });
        


     }
}
