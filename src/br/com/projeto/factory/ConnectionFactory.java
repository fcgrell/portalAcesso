
// situa em qual package ou “pacote” está a classe
package br.com.projeto.factory;
// faz as importações de classes necessárias para o funcionamento do programa
import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções
import com.mysql.jdbc.Driver;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
                 //Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/projetojava","root","admin");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}