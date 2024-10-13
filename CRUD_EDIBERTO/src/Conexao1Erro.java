import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao1Erro {
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://localhost:3306/bancoteste";
    public static Connection conectar()throws SQLException, ClassNotFoundException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection conexao1 = (Connection) DriverManager.getConnection(URL, USUARIO, SENHA);
        return conexao1;
    }
    public static void main(String[] args) throws ClassNotFoundException{
        try {
            Connection conexao1 = TestaConexao.conectar();
            System.out.println("Conexao ao Banco realizada com sucesso");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Conexao ao Banco falhou");
        }
    }
}