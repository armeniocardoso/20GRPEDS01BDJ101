package br.edu.infnet.app;

import br.edu.infnet.dominio.Contato;
import br.edu.infnet.infra.ContatoDAO;
import java.util.List;

public class JdbcPrimer {

    public static void main(String[] args) {

        ContatoDAO dao = new ContatoDAO();
        Contato contato = new Contato();
        contato.setNome("Machado de Assis");
        contato.setEmail("machado@abl.org.br");
        contato.setFone("2122.8800");
        dao.inserir(contato);
        //-------------------------------------
        List<Contato> lista = dao.listar();
        for (Contato cont : lista) {

            System.out.println(cont.getId() + " - " + cont.getNome());
        }
    }
}
