package util;

import java.util.Scanner;

public class EntradaConsole {
    private static Scanner scanner = new Scanner(System.in);

    public static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static double lerNumero(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        int valor = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer
        return valor;
    }
}
