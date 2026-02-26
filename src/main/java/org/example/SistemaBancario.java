package org.example;

import java.util.Locale;
import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        double salario = 0;
        String nome;

        System.out.println("****************************");
        System.out.println("\nDados iniciais do Cliente: ");
        System.out.print("Nome:             ");
        nome = sc.nextLine();
        System.out.println("Tipo conta:       Corrente   ");
        System.out.print("Saldo inicial:    R$ ");
        salario = sc.nextDouble();
        System.out.println("\n****************************");

        int Operador;
        Double Novosalario = 0.0;
        Double transferir = 0.0;

        do {
            String menu = """
                    ** Digite sua opção **
                    1 - Consultar saldo
                    2 - Receber Valor
                    3 - Transferir Valor
                    4 - Sair
                    """;
            System.out.println(menu);
            Operador = sc.nextInt();

            switch(Operador) {
                case 1:
                    System.out.println("Seu Saldo é: " + salario);
                    break;
                case 2:
                    System.out.print("Informe o valor do Recebimento: ");
                    Novosalario = sc.nextDouble();
                    salario += Novosalario;
                    System.out.println("Seu novo saldo é: " + salario);
                    break;
                case 3:
                    System.out.print("Informe quanto deseja transferir: ");
                    transferir = sc.nextDouble();
                    if (transferir > salario) {
                        System.out.println("Saldo Insuficiente!");
                    }else {
                        salario = salario - transferir;
                        System.out.println("Saldo atualizado: R$ " + salario);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado!!");
                    break;
                default:
                    System.out.println();
                    System.out.println("Digite uma opção válida!");
                    break;
            }


        } while (Operador != 4);









        sc.close();
    }
}


