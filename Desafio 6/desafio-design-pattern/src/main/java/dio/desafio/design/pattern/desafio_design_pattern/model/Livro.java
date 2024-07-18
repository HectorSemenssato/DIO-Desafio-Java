package dio.desafio.design.pattern.desafio_design_pattern.model;

import javax.persistence.Id;

public class Livro {
    @Id
    private Long idLivro;
    private String titulo;
    private String genero;

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long id) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
