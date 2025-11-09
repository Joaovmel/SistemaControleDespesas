import java.util.Scanner;
import controle.GestaoDespesa;
import controle.GestaoUsuario;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestaoDespesa gestaoDespesa = new GestaoDespesa();
        GestaoUsuario gestaoUsuario = new GestaoUsuario();

        int opcao = -1;

        do {
            System.out.println("\n==============================");
            System.out.println("  SISTEMA DE CONTROLE DE DESPESAS");
            System.out.println("==============================");
            System.out.println("1 - Gerenciar despesas");
            System.out.println("2 - Gerenciar usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gestaoDespesa.menuDespesas();
                    break;
                case 2:
                    gestaoUsuario.menuUsuarios();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
