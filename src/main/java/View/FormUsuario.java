package View;

import Control.Controle;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Ediberto Mariano d Silva
 */
public class FormUsuario extends javax.swing.JFrame {
    private static MongoDatabase database;
    public FormUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NomeUsuariotxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PasswordUsuariotxt = new javax.swing.JPasswordField();
        btnSalvarUsuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CpfUsuariotxt = new javax.swing.JFormattedTextField();
        EmailUsuariotxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Clientes");
        setMinimumSize(new java.awt.Dimension(100, 50));
        setPreferredSize(new java.awt.Dimension(537, 330));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Cadastro de Usuário");

        jLabel2.setText("Nome");

        jLabel3.setText("Password");

        btnSalvarUsuario.setText("Salvar");
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF");

        try {
            CpfUsuariotxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("E-mail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarUsuario)
                .addGap(204, 204, 204))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CpfUsuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordUsuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeUsuariotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(EmailUsuariotxt)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NomeUsuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CpfUsuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordUsuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailUsuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnSalvarUsuario)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(14, 14, 506, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed
        
        // Establish MongoDB connection
        MongoClient mongo = Controle.CriaConexao();
        // Check if the connection was successful
        if (mongo != null) {
            // Get the database instance
            DB db = mongo.getDB("CadCliente");
            // Retrieve values from the form
            String nome = NomeUsuariotxt.getText();
            String cpf = CpfUsuariotxt.getText();
            String email = EmailUsuariotxt.getText();
            String password = new String(PasswordUsuariotxt.getPassword());

            // Validate CPF format
            if (isValidCPF(cpf)) {
                System.out.println("CPF válido");
                // Validate email format
                if (isValidEmail(email)) {
                    System.out.println("E-mail válido");
                    // Check if the user with the given CPF already exists
                    if (isUserExists(db, cpf)) {
                        JOptionPane.showMessageDialog(this, "Usuário com o CPF informado já existe.", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        try {
                            MessageDigest md = MessageDigest.getInstance("SHA-256");
                            byte messageDigest[] = md.digest(password.getBytes("UTF-8"));
                            StringBuilder sb = new StringBuilder();
                            for(byte b : messageDigest) {
                                sb.append(String.format("%02X", 0xFF & b));
                            }
                            String passwordHex = sb.toString();
                            Controle.insertUsuario(db, "usuarios", nome, cpf, email, passwordHex);
                            limpacampos();
                            System.out.println("Usuário inserido no MongoDB");
                        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
                            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "E-mail inválido. Por favor, insira um e-mail válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                limpacampos();
                JOptionPane.showMessageDialog(this, "CPF inválido. Por favor, insira um CPF válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            // Close the MongoDB connection
            mongo.close();
        } else {
            System.out.println("Connection to MongoDB failed");
        }       
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed
    public void limpacampos(){
        NomeUsuariotxt.setText("");
        CpfUsuariotxt.setText("");
        EmailUsuariotxt.setText("");
    }
    private boolean isUserExists(DB database, String cpf) {
    try {
        // Remove any non-digit characters
        cpf = cpf.replaceAll("\\D", "");

        // Perform a query to check if the user with the given CPF already exists
        BasicDBObject query = new BasicDBObject("cpf", cpf);
        DBCollection collection = database.getCollection("usuarios");
        DBObject existingUser = collection.findOne(query);

        // Return true if the user exists, false otherwise
        return existingUser != null;
    } catch (Exception e) {
        // Log the exception and return false
        System.err.println("Error checking if the user exists: " + e.getMessage());
        return false;
    }
}


    private boolean isValidCPF(String cpf) {
        // Dentro do método isValidCPF
        System.out.println("Comprimento do CPF: " + cpf.length());

        try {
            // Remove qualquer caractere que não seja dígito
            cpf = cpf.replaceAll("\\D", "");
            // Verifica se o CPF possui 11 dígitos
            if (cpf.length() != 11) {
                return false;
            }
            // Calcula o primeiro dígito verificador
            int d1 = 0;
            for (int i = 0; i < 9; i++) {
                d1 += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
            }
            d1 = 11 - (d1 % 11);
            if (d1 > 9) {
                d1 = 0;
            }
            // Calcula o segundo dígito verificador
            int d2 = 0;
            for (int i = 0; i < 10; i++) {
                d2 += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
            }
            d2 = 11 - (d2 % 11);
            if (d2 > 9) {
                d2 = 0;
            }
            // Verifica se os dígitos verificadores calculados são iguais aos fornecidos
            return Character.getNumericValue(cpf.charAt(9)) == d1 && Character.getNumericValue(cpf.charAt(10)) == d2;
        } catch (Exception e) {
            // Exibe mensagem de erro
            System.err.println("Erro na validação do CPF: " + e.getMessage());
            return false;
        }
    }
    private boolean isValidEmail(String email) {
        // Utiliza uma expressão regular para validar o e-mail
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
        return email.matches(regex);
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Crie uma instância do formulário
            FormUsuario form = new FormUsuario();
            // Define a largura e altura desejadas
            int largura = 550;
            int altura = 365;
            // Define as dimensões da janela
            form.setSize(largura, altura);
            // Centraliza a janela na tela
            form.setLocationRelativeTo(null);
            // Torna a janela visível
            form.setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CpfUsuariotxt;
    private javax.swing.JTextField EmailUsuariotxt;
    private javax.swing.JTextField NomeUsuariotxt;
    private javax.swing.JPasswordField PasswordUsuariotxt;
    private javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}