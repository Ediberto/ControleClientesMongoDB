//AULA05 */
package encapsulamento;
import java.text.DecimalFormat;

public class Encapsulamento {
    public static void main(String[] args) {
        Conta cliente1 = new Conta();
        cliente1.setNome("Ediberto");
        cliente1.setAgencia(1172);
        cliente1.setNumconta(1232); // Remova os zeros à esquerda
        cliente1.setSaldo(3400.78);
        System.out.println("DADOS DO CLIENTE");
        System.out.println("Nome : " + cliente1.getNome());
        System.out.println("Agencia : " + cliente1.getAgencia());
        System.out.println("Numero da Conta : " + cliente1.getNumconta());
        
        // Formate o saldo com duas casas decimais
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println("Saldo : " + df.format(cliente1.getSaldo()));
    }
}
