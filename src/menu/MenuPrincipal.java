package menu;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("==============================");
            System.out.println("   SISTEMA DE CONTROLE DE DESPESAS");
            System.out.println("==============================");
            System.out.println("1 - Entrar Despesa");
            System.out.println("2 - Anotar Pagamento");
            System.out.println("3 - Listar Despesas em Aberto");
            System.out.println("4 - Listar Despesas Pagas");
            System.out.println("5 - Gerenciar Tipos de Despesa");
            System.out.println("6 - Gerenciar Usuários");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu: Entrar Despesa");
                    break;
                case 2:
                    System.out.println("Você escolheu: Anotar Pagamento");
                    break;
                case 3:
                    System.out.println("Você escolheu: Listar Despesas em Aberto");
                    break;
                case 4:
                    System.out.println("Você escolheu: Listar Despesas Pagas");
                    break;
                case 5:
                    System.out.println("Você escolheu: Gerenciar Tipos de Despesa");
                    break;
                case 6:
                    System.out.println("Você escolheu: Gerenciar Usuários");
                    break;
                case 7:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println(); // Pula uma linha
        } while (opcao != 7);

        scanner.close();
    }
}
