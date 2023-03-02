package br.com.alura;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColeçoes=new Curso("dominando as coleçoes ","allan");
        javaColeçoes.adciona(new Aula("trabalhando com arraylist", 21));
        javaColeçoes.adciona(new Aula("criando a aula ", 20));
        javaColeçoes.adciona(new Aula("modelando com coleçao ", 25));
        Aluno a1= new Aluno("allan", 1222);
        Aluno a2 = new Aluno("lucas", 2222);
        Aluno a3 = new Aluno("pedro", 3333);
        javaColeçoes.matricula(a1);
        javaColeçoes.matricula(a2);
        javaColeçoes.matricula(a3);
System.out.println("todods os alunos matriculados no curso: ");
javaColeçoes.getAlunos().forEach(a ->{
    System.out.println(a);
} );
    
System.out.println("o aluno "+a1+"estamatriculado?");
    System.out.println(javaColeçoes.estaMatriculado(a1));
    String nome="allan";


    }

}
