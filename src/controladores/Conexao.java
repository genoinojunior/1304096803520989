package controladores;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection ConectaBanco() {
        Connection con = null;
        try {
            String url = "jdbc:postgresql://localhost/sistema";
            String usuario = "postgres";
            String senha = "qwert159";
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Houve um problema " + ex.getMessage());
            }

            con = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão realizada com sucesso.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Houve um problema " + ex.getMessage());
        }
        return con;
    }
    public void ExecutaSQL(){
        
    }

}
