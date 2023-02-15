package entities;

import java.util.Scanner;

public class Telefone {
    public String numero;

    public Telefone() {

    }

    public Telefone lerTelefone() {
        Scanner sc = new Scanner(System.in);
        Telefone telefone = new Telefone();
        System.out.print("Informe o numero do telefone: ");
        telefone.numero = sc.next();

        return telefone;

    }
}
