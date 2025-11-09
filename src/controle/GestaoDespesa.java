package controle;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import modelo.RegistroDespesa;

public class GestaoDespesa {

    private ArrayList<RegistroDespesa> listaDespesas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void menuDespesas() {
        int opcao = -1;
        do {
            System.out.println("\n--- GERENCIAR DESPESAS ---");
            System.out.println("1 - Adicionar despesa");
            System.out.println("2 - Listar despesas");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números válidos!");
                continue;
            }

            switch (opcao) {
                case 1:
                    adicionarDespesa();
                    break;
                case 2:
                    listarDespesas();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);
    }

    private void adicionarDespesa() {
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        double valor = 0;
        while (true) {
            try {
                System.out.print("Valor: ");
                valor = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Digite um valor numérico válido!");
            }
        }

        System.out.print("Data (ex: 09/11/2025): ");
        String data = scanner.nextLine();

        RegistroDespesa despesa = new RegistroDespesa(descricao, valor, data);
        listaDespesas.add(despesa);

        System.out.println("Despesa adicionada com sucesso!");
    }

    private void listarDespesas() {
        System.out.println("\n--- LISTA DE DESPESAS ---");

        if (listaDespesas.isEmpty()) {
            System.out.println("Nenhuma despesa cadastrada ainda.");
        } else {
            for (RegistroDespesa d : listaDespesas) {
                System.out.println(d);
            }
        }
    }
}
