package application;

import entities.Aluno;
import entities.Telefone;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[2];
        Aluno aluno;
        Telefone telefone;


        for (int i = 0; i < alunos.length; i++) {

            System.out.print("Nome do aluno: ");
            String nome = sc.nextLine();
            System.out.print("Idade do aluno: ");
            int idade = sc.nextInt();
            System.out.print("Matricula: ");
            sc.nextLine();
            String matricula = sc.nextLine();
            System.out.print("Telefone: ");
            String numero = sc.nextLine();

            aluno = new Aluno();
            aluno.nome = nome;
            aluno.idade = idade;
            aluno.matricula = matricula;
            telefone = new Telefone();
            aluno.telefone.numero = numero;

            alunos[i] = aluno;

        }

        for (Aluno var : alunos) {
            System.out.println("Nome: "
                    + var.nome
                    + " Idade: "
                    + var.idade
                    + " Matricula: "
                    + var.matricula
                    + " Telefone: "
                    + var.telefone.numero);
        }


        sc.close();
    }
}
