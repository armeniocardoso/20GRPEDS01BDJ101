package br.edu.infnet.infra;

import br.edu.infnet.dominio.Funcionario;
import java.util.Collection;
import java.util.HashMap;

public class FuncionarioDAO {

    private HashMap<Integer, Funcionario> funcionarios;
    
    public FuncionarioDAO() {
        
        funcionarios = new HashMap();
    }
    
    public void inserir(Funcionario funcionario) {
        
        funcionarios.put(funcionario.getMatricula(), funcionario);
    }
    
    public Funcionario obter(int id) {
        
        return funcionarios.get(id);
    }
    
    public void excluir(Funcionario funcionario) {
        
        funcionarios.remove(funcionario.getMatricula());
    }
    
    public void alterar(Funcionario funcionario) {
        
        funcionarios.replace(funcionario.getMatricula(), funcionario);
    }
    
    public Collection<Funcionario> listar() {
        
        return funcionarios.values();
    }
}
