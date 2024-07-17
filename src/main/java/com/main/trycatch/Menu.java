package com.main.trycatch;

import java.util.Scanner;

public class Menu {

    public static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" _________________");
        System.out.println("|      Menu       |");
        System.out.println("|       1.        |");
        System.out.println("|       2.        |");
        System.out.println("|       3.        |");
        System.out.println("|_________________|");
        System.out.println("Selecione Uma Opção: ");
        int opcao = sc.nextInt();
        try{
            switch (opcao) {
                case 1:
                    System.out.println("Opção 1");
                    break;
                case 2:
                    System.out.println("Opção 2");
                    break;
                case 3:
                    System.out.println("Opção 3");
                    break;
            
            }
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
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
