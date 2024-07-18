package com.main.trycatch;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void menuPrincipal() {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("lucas");
        nomes.add("Enzo");
        nomes.add("Eloisa");

        Scanner sc = new Scanner(System.in);
        System.out.println(" _________________");
        System.out.println("|      Menu       |");
        System.out.println("|       1.        |");
        System.out.println("|       2.        |");
        System.out.println("|       3.        |");
        System.out.println("|_________________|");
        System.out.println("Selecione Uma Opção: ");

        try {

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("Opção 1\n");
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println((i + 1) + "-" + nomes.get(i));
                    }
                    System.out.println("Escolha o Nome: ");
                    int escolha = sc.nextInt() - 1;
                    sc.nextLine();
                    try {
                        System.out.println("Nome escolhido: " + nomes.get(escolha));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Nome não encontrado");
                        System.out.println("Erro: " + e.getMessage());
                    }

                    break;
                case 2:
                    System.out.println("Opção 2");
                    break;
                case 3:
                    System.out.println("Opção 3");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;

            }
        } catch (ExceptionDado e) {
            System.out.println("Número Inválido, Tente Novamente!");
            System.out.println("Erro: " + e.getMessage());
        }
        sc.nextLine();

    }

    public static void divisaoDoisNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro Número: ");
        int numero2 = scanner.nextInt();
        try {
            System.out.println("Resultado: " + numero1 / numero2);
        } catch (Exception e) {
            System.out.println("O número : " + numero1 + " Não é divisivel por Zero");
            e.getMessage();
        }
    }
}
