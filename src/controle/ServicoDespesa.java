package controle;

import java.util.ArrayList;
import modelo.RegistroDespesa;

public class ServicoDespesa {

    // Método para calcular o total de todas as despesas
    public double calcularTotal(ArrayList<RegistroDespesa> lista) {
        double total = 0;
        for (RegistroDespesa d : lista) {
            total += d.getValor();
        }
        return total;
    }

    // Método para listar todas as despesas acima de um certo valor
    public void listarDespesasAcimaDe(ArrayList<RegistroDespesa> lista, double valorMinimo) {
        System.out.println("\n--- DESPESAS ACIMA DE R$" + valorMinimo + " ---");
        for (RegistroDespesa d : lista) {
            if (d.getValor() >= valorMinimo) {
                System.out.println(d);
            }
        }
    }
}
