package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColeçoes=new Curso("dominando as coleçoes ","allan");
        javaColeçoes.adciona(new Aula("trabalhando com arraylist", 21));
        javaColeçoes.adciona(new Aula("criando a aula ", 20));
        javaColeçoes.adciona(new Aula("criando aula ", 22));
        List<Aula> aulas=javaColeçoes.geAulas();
        System.out.println(javaColeçoes.geAulas());
        System.out.println(aulas);
        
    }
}
