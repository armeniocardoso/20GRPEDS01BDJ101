package br.edu.infnet.app;

import br.edu.infnet.dominio.Funcionario;
import br.edu.infnet.dominio.Vendedor;

public class FolhaPagamento {

    public static void main(String[] args) {
        
        Funcionario func = new Funcionario(123, "Machado de Assis", "Jornalista", 2_345.67);
        func.calcularSalario();
        Vendedor vend = new Vendedor(456, "Rachel de Queroz", 1_234.56, 0.05, 30_000);
        vend.calcularSalario();
    }
}
