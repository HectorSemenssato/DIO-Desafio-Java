package dio.desafio.design.pattern.desafio_design_pattern.service;

import dio.desafio.design.pattern.desafio_design_pattern.model.Aluno;

public interface AlunoService {

    Iterable<Aluno> procurarTodos();

    Aluno procurarAlunoPorId(Long id);

    void inserirAluno(Aluno aluno);

    void atualizarAluno(Long id, Aluno aluno);

    void deletarAluno(Long id);
}
