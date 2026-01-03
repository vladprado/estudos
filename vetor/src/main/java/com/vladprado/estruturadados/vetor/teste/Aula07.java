package com.vladprado.estruturadados.vetor.teste;

import com.vladprado.estruturadados.vetor.Vetor;

public class Aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 4");
        vetor.adiciona("elemento 5");

        System.out.println(vetor);

        vetor.adiciona(0, "elemento 1");

        System.out.println(vetor);

        vetor.adiciona(2, "elemento 3");
        System.out.println(vetor);
    }

}
