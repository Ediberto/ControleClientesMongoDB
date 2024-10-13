package excecao;

import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Soma som = new Soma();
        System.out.printf("Informe um numero: ");
        int num1 = ler.nextInt();
        System.out.printf("Informe outro numero : ");
        int num2 = ler.nextInt();
        // INVOCA OS MÉTODOS
        mostrarCalculo(new Divisao(), a, b);
       
    }
    public static void mostraCalculo(OperacaoMatematica operacao, int x, int y) {
         System.out.println("Resultado : " + operacao.calcular(x, y));
    }
}


