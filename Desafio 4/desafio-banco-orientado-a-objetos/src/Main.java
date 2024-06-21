
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerNome = new Scanner(System.in);

        Cliente usuario = new Cliente();

        System.out.println("Digite seu nome: ");
        String nome = lerNome.nextLine();
        usuario.setNome(nome);

        Conta cc = new ContaCorrente(usuario);
        Conta poupanca = new ContaPoupanca(usuario);

        while (true) {
            System.out.println("\nVoc� possui valor a ser depositado na conta? Digite '1' para sim ou '2' para n�o: ");
            int respostaValorDeposito = ler.nextInt();

            switch (respostaValorDeposito) {
                case 1:
                    System.out.println("\nDigite o saldo para dep�sito na conta: ");
                    double valor = ler.nextDouble();
                    cc.depositar(valor);
                    cc.transferir(valor, poupanca);
                    
                    System.out.println("\nSaldo registrado. Confira o extrato banc�rio a seguir: ");
                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    System.exit(0);
                    break;
                case 2:
                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Valor inv�lido, digite novamente");
                    break;
            }

        }

    }

}
