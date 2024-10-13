package aula02_heranca;
import javax.swing.JOptionPane;

public class Aula02_Heranca {
    public static void mostraTecnico(int m, String n, String t) {
        JOptionPane.showMessageDialog(null, "Matricula: " + m + "\n" +
        "Nome: " + n + "\n" + "Titulo: " + t, "DADOS DO TECNICO", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        int mat_aux;
        String mat = JOptionPane.showInputDialog(null, "Digite a matrícula do Técnico:", 
            "DADOS DOS TÉCNICO", JOptionPane.INFORMATION_MESSAGE);
        
        // CONVERTENDO O VALOR DE STRING PARA INTEIRO
        mat_aux = Integer.parseInt(mat);
        String nome_aux = JOptionPane.showInputDialog("Digite o nome do Técnico:");
        String titulo_aux = JOptionPane.showInputDialog("Digite o título do Técnico:");
        mostraTecnico(mat_aux, nome_aux, titulo_aux);
    }
}

