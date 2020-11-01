package br.edu.infnet.api;

import br.edu.infnet.dominio.Funcionario;
import br.edu.infnet.dominio.Horista;
import br.edu.infnet.dominio.Mensalista;
import br.edu.infnet.dominio.Vendedor;

public class FolhaPagamento {

    public static void main(String[] args) {
        
        Funcionario [] funcs = new Funcionario[3];        
        funcs[0] = new Mensalista(123, "Machado de Assis", "Jornalista", 2_345.67);
        funcs[1] = new Vendedor(456, "Rachel de Queroz", 1_234.56, 0.05, 30_000);
        funcs[2] = new Horista(678, "Clarice Lispector", "Professor", 70, 160);
        
        for (int i = 0; i < funcs.length; i++) {
            
            funcs[i].calcularSalario();
        }
    }
}
