package dio.desafio.design.pattern.desafio_design_pattern.controller;


import dio.desafio.design.pattern.desafio_design_pattern.model.Aluno;
import dio.desafio.design.pattern.desafio_design_pattern.model.Livro;
import dio.desafio.design.pattern.desafio_design_pattern.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Alunos")
public class AlunoRestController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public ResponseEntity<Iterable<Aluno>> procurarAluno(){
        return ResponseEntity.ok(alunoService.procurarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> procurarAlunoPorId(@PathVariable Long id){
        return ResponseEntity.ok(alunoService.procurarAlunoPorId(id));
    }

    @PostMapping
    public ResponseEntity<Aluno> inserirAluno(@RequestBody Aluno aluno) {
        alunoService.inserirAluno(aluno);
        return ResponseEntity.ok(aluno);
    }

//    public ResponseEntity<Livro> inserirLivro(@RequestBody Livro livro){
//        livroSe
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizarAluno(@PathVariable Long id, @RequestBody Aluno aluno){
        alunoService.atualizarAluno(id, aluno);
        return ResponseEntity.ok(aluno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Aluno> deletarAluno(@PathVariable Long id){
        alunoService.deletarAluno(id);
        return ResponseEntity.ok().build();
    }



}
