package entities;

import java.util.Scanner;

public class Aluno {

    public Telefone telefone;
    public String nome;
    public int idade;
    public String matricula;

    public Aluno() {

    }

    public Aluno lerAluno() {
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        aluno.nome = sc.next();
        System.out.print("Idade do aluno: ");
        aluno.idade = sc.nextInt();
        System.out.print("Matricula: ");
        aluno.matricula = sc.next();
        aluno.telefone = new Telefone().lerTelefone();

        return aluno;
    }

    public void imprimir(Aluno[] vetAluno) {
        for (Aluno aluno : vetAluno) {
            System.out.println("Nome: "
                    + aluno.nome
                    + " Idade: "
                    + aluno.idade
                    + " Matricula: "
                    + aluno.matricula
                    + " Telefone: "
                    + aluno.telefone.numero);
        }
    }

}
