package dio.desafio.design.pattern.desafio_design_pattern.service.impl;

import dio.desafio.design.pattern.desafio_design_pattern.model.Aluno;
import dio.desafio.design.pattern.desafio_design_pattern.service.AlunoService;
import dio.desafio.design.pattern.desafio_design_pattern.model.AlunoRepository;
import dio.desafio.design.pattern.desafio_design_pattern.model.Livro;
import dio.desafio.design.pattern.desafio_design_pattern.model.LivroRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Id;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private LivroRepository livroRepository;


    @Override
    public Iterable<Aluno> procurarTodos() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno procurarAlunoPorId(Long id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return aluno.orElse(null);
    }

    @Override
    public void inserirAluno(Aluno aluno) {
        Long idLivro  = aluno.getLivro().getIdLivro();
        Livro livro = livroRepository.findById(idLivro).orElseGet(() -> {
            Livro novoLivro = LivroRepository.procurarLivroPorId(idLivro);
            LivroRepository.save(novoLivro);
            return novoAluno.getLivro();
        });
        aluno.setId(id);
        alunoRepository.save(titulo);
    }

    @Override
    public void atualizarAluno(Long id, Aluno aluno) {
        Optional<Aluno> alunoBancoDeDados = alunoRepository.findById(id);
        if(alunoBancoDeDados.isPresent()){
            salvarAlunoComIdLivro(aluno);
        }
    }

    @Override
    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }

    private void salvarAlunoComIdLivro(Aluno aluno){
        Long idLivro = aluno.getLivro().getIdLivro();
        Livro livro = livroRepository.findById(titulo).orElseGet(()-> {
            Aluno novoLivro = livroService.consultarLivro(idLivro);
            livroRepository.save(novoLivro);
            return novoLivro;
        });
        aluno.setLivro(livro);
        alunoRepository.save(livro);
    }
}
