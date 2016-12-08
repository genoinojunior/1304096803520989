package controladores;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {

    public static Connection ConectaBanco() {
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

    public void ExecutaSQLupdate(String sql)  {
        try {
            PreparedStatement pst = null;
           pst.execute(sql);
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Houve um erro" + ex.getMessage() );
        }
        
    }

}
