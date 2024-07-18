package dio.desafio.design.pattern.desafio_design_pattern.model;

import javax.persistence.*;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    private Livro livro;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro){
        this.livro = livro;
    }
}
