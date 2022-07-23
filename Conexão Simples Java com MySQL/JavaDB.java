package com.mycompany.javadb;

//Conexão simples Java/MySQL by Luã Leonardo DEV.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaDB {

    public static void main(String[] args) throws SQLException {
        
        Connection conexao = null;
        
        try {
            //Driver MySQL:
            Class.forName("com.mysql.jdbc.Driver");
            //URL conexão:(clientes = Database acessado)
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientes", "root", "");
            //Mensagem confirmando a conexção:
            System.out.println("Conectado com Sucesso.");
        } catch (ClassNotFoundException ex) {
            //Mensagem caso ocorra falta de comunicação com o driver do Banco:
            System.out.println("Driver do Banco de Dados não encontrado.");
        } catch (SQLException ex) {
            //Mensagem caso ocorra erro de comunicação Servidor/Rede:
            System.out.println("Ocorreu um erro ao acessar o Banco de Dados.\nDescrição do Erro: " + ex.getMessage());
        } finally {
            //Se a conexão não tiver seu valor alterado, será fechada:
            if(conexao != null){
                conexao.close();
            }
            
        }        
 
    }

}
