package br.edu.infnet.infra;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FabricaDeConexoes {

    private FabricaDeConexoes(){
    }
    
    public static Connection conectar() {
        
        Connection retorno = null;
        try {
            
            //1ºPasso: carregar o driver na memória
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2ºPasso: parametrizar a conexão
            String url = "jdbc:mysql://localhost:3306/engsoft2020?useTimezone=true&serverTimezone=UTC";
            String usr = "root";
            String pwd = "";
            
            //3ºPasso: conectar
            retorno = DriverManager.getConnection(url, usr, pwd);
            
            //4ºPasso (opcional): obter dados da conexão
            DatabaseMetaData dbmd = retorno.getMetaData();
            System.out.println("Banco de Dados ---> " + dbmd.getDatabaseProductName());
            System.out.println("Versão         ---> " + dbmd.getDatabaseProductVersion());
            
        } catch (ClassNotFoundException ex) {
            
            System.out.println("ERRO: Driver não encontrado");
        } catch (SQLException ex) {

            System.out.println("ERRO: Não foi possível conectar");
            ex.printStackTrace();
        }
        return retorno;
    }
}
