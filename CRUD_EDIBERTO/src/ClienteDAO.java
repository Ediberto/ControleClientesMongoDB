import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet ;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ClienteDAO {
    public void adicionar(Cliente obj ) throws Exception{
        String  sql = "INSERT INTO cliente(mat, nome, email)VALUES(?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = (Connection) Conexao.getConnection();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, obj.getMat());
            pstm.setString(2, obj.getNome());
            pstm.setString(3, obj.getEmail());
            pstm.execute();
        }catch(SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro ao salvar dados "+ e.toString());
            //System.out.println("Erro ao salvar dados "+ e.getMessage().toLowerCase());
        }finally {
            try {
                if(pstm!=null) {
                    JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!!!");
                    pstm.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            }catch (Exception e) {
                System.out.println("Erro ao salvar dados "+ e.getMessage().toLowerCase());           
            }
        }
    }
}
