package br.com.alura;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColeçoes=new Curso("dominando as coleçoes ","allan");
        javaColeçoes.adciona(new Aula("trabalhando com arraylist", 21));
        javaColeçoes.adciona(new Aula("criando a aula ", 20));
        javaColeçoes.adciona(new Aula("modelando com coleçao ", 25));
        List<Aula> aulasimutaveis=javaColeçoes.geAulas();
        System.out.println(aulasimutaveis);
        List<Aula> aulas=new ArrayList<>(aulasimutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColeçoes.getTempoTotal());
    }
}
