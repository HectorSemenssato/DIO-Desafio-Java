import java.util.Scanner;

public class Cliente {
    private String nome;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
   public void criarConta(String nome){
       Scanner ler = new Scanner(System.in);
       System.out.println("Digite o seu nome: ");
       nome = ler.nextLine();
   } 
}
