package construtores;
import java.util.Scanner; // Importa a classe Scanner
public class Construtores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta clientes [] = new Conta[2];
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Conta();
        }
        for (int i = 0; i < clientes.length; i++) {
            System.out.printf("  Dados %d Cliente  \n", i+1);
            System.out.printf("Informe o nome do cliente: ");
            clientes[i].nome = ler.next();
            System.out.printf("Informe a Agencia: ");
            clientes[i].agencia = ler.nextInt();
            System.out.printf("Informe o numero da Conta: ");
            clientes[i].numconta = ler.nextInt();
            System.out.printf("Informe o Saldo: ");
            clientes[i].saldo = ler.nextInt();
        }
        //IMPRIMINDO OS ELEMENTOS DO VETOR
        System.out.printf(" DADOS DOS CLIENTES CADASTRADOS \n");
        for (int i = 0; i < clientes.length; i++) {
            System.out.printf(" CLIENTE - %d\n", i+1);
            System.out.printf("Nome : %s \n ", clientes[i].nome);
            System.out.printf("Agencia : %d \n ", clientes[i].agencia);
            System.out.printf("Numero da Conta : %d \n ", clientes[i].numconta);
            System.out.printf("Saldo : %.2f \n ", clientes[i].saldo);
        }
    }
}
