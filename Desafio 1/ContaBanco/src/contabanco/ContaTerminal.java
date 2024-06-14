package contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner lerNum = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        
        int numero;
        String agencia, nomeCliente;
        double saldo;
        
        System.out.println("Por favor, digite o número da conta: ");
        numero = lerNum.nextInt();
        
        System.out.println("Digite o código da agência: ");
        agencia = lerTexto.nextLine();
        
        System.out.println("Agora digite seu nome: ");
        nomeCliente = lerTexto.nextLine();
        
        System.out.println("Certo, agora digite o seu saldo: ");
        saldo = lerNum.nextDouble();
        
        System.out.println("\n\n");
        System.out.printf("Olá, %s, boas-vindas e muito obrigado por criar uma conta em nosso banco :) "
                        + "\nSua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque ", nomeCliente, agencia, numero, saldo);
    }
    
}
