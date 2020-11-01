package br.edu.infnet.infra;

import br.edu.infnet.dominio.Contato;
import br.edu.infnet.infra.FabricaDeConexoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {


    public void inserir(Contato contato) {
        
        try(Connection con = FabricaDeConexoes.conectar()) {
            
            String sql = "INSERT INTO contatos"
                    + "   (nome, email, fone)"
                    + "   VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, contato.getNome());
            ps.setString(2, contato.getEmail());
            ps.setString(3, contato.getFone());
            ps.executeUpdate();
            ps.close();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    public List<Contato> listar() {
        
        List<Contato> retorno = new ArrayList<>();
        try(Connection con = FabricaDeConexoes.conectar()) {
            
            Statement stmt = con.createStatement();
            String sql = "SELECT id, nome, email, fone"
                    + "   FROM contatos"
                    + "   ORDER BY nome";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                
                Contato contato = new Contato();
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setFone(rs.getString("fone"));
                retorno.add(contato);
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return retorno;
    }
}
