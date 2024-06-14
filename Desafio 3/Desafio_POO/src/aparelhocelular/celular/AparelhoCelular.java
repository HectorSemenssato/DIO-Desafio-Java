package aparelhocelular.celular;

import aparelhocelular.funcoes.Telefonia;
import aparelhocelular.funcoes.NavegadorInternet;
import aparelhocelular.funcoes.ReprodutorMusical;
        
public class AparelhoCelular {

    public static void main(String[] args) {        
       Telefonia telefone = new Telefonia();
        
       telefone.ligar("99999-9999");
       telefone.atender();
       telefone.iniciarCorreioDeVoz();
       
       NavegadorInternet navegador = new NavegadorInternet();
       
       navegador.exibirPagina("www.google.com");
       navegador.adicionarNovaAba();
       navegador.atualizarPagina();
       
       ReprodutorMusical musica = new ReprodutorMusical();
       
       musica.tocar();
       musica.pausar();
       musica.selecionarMusica("Musica - Musica");
       
    }
    
}
