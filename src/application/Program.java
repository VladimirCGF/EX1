package application;

import entities.Aluno;
import entities.Telefone;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno[] vetor = new Aluno[2];
        Aluno aluno = new Aluno();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aluno.lerAluno();
        }

        aluno.imprimir(vetor);

        System.out.println("Hello mundo");

        sc.close();
    }

}
