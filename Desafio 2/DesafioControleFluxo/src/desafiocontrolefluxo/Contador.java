package desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro par�metro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo par�metro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o m�todo contendo a l�gica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException Exception) {
            //imprimir a mensagem: O segundo par�metro deve ser maior que o primeiro
            Exception.getMessage();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro");
        }
        
        int contagem = parametroDois - parametroUm;
        
        //realizar o for para imprimir os n�meros com base na vari�vel contagem
        for (int i = 0; i < contagem; i++) {
            System.out.printf("Imprimindo o n�mero %d \n", i + 1);
        }
    }
}
