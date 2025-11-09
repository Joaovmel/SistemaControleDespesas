package controle;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoUsuario {

    private ArrayList<String> usuarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void menuUsuarios() {
        int opcao;
        do {
            System.out.println("\n--- GERENCIAR USUÁRIOS ---");
            System.out.println("1 - Adicionar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> adicionarUsuario();
                case 2 -> listarUsuarios();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private void adicionarUsuario() {
        System.out.print("Nome do usuário: ");
        String nome = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        usuarios.add(nome + " - " + email);
        System.out.println("Usuário adicionado com sucesso!");
    }

    private void listarUsuarios() {
        System.out.println("\n--- LISTA DE USUÁRIOS ---");
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (String usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }
}
