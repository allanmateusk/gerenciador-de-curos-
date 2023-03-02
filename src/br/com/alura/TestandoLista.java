package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoLista{
    public static void main(String[] args) {
        String aula1="conhecendo mais de listas";
        String aula2="modelando a classe aula";
        String aula3="trabalhando com cursos e sets";
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);
        aulas.remove(0);
        System.out.println(aulas);
        for (String aula : aulas) {
            System.out.println("aula:"+aula);
        }
        String primeiraAula=aulas.get(0);
        System.out.println("a primeira aula e:"+primeiraAula);
        for(int i=0;i<aulas.size();i++){
            System.out.println("aulas:"+aulas.get(i));
        }
        aulas.forEach(aula ->{
            System.out.println("pecorrendo:");
            System.out.println(aula);
        });
        aulas.add("aumentando nosso conhecimento");
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println("depois de ordenado ");
        System.out.println(aulas);
    }
}   