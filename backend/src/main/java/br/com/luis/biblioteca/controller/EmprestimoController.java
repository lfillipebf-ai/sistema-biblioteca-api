package br.com.luis.biblioteca.controller;
import br.com.luis.biblioteca.model.*; import br.com.luis.biblioteca.repository.*; import org.springframework.web.bind.annotation.*; import java.time.LocalDate; import java.util.List;
@RestController @RequestMapping("/api/emprestimos") public class EmprestimoController{
 private final EmprestimoRepository repo; private final LivroRepository livros; private final LeitorRepository leitores;
 public EmprestimoController(EmprestimoRepository r,LivroRepository l,LeitorRepository le){repo=r;livros=l;leitores=le;}
 @GetMapping public List<Emprestimo> listar(){return repo.findAll();} @GetMapping("/ativos") public List<Emprestimo> ativos(){return repo.findByStatus(StatusEmprestimo.ATIVO);}
 @PostMapping public Emprestimo criar(@RequestParam Long livroId,@RequestParam Long leitorId){
  Livro l=livros.findById(livroId).orElseThrow(); if(!l.isDisponivel()) throw new IllegalStateException("Livro indisponível");
  Emprestimo e=new Emprestimo();e.setLivro(l);e.setLeitor(leitores.findById(leitorId).orElseThrow());l.setDisponivel(false);livros.save(l);return repo.save(e);
 }
 @PatchMapping("/{id}/devolver") public Emprestimo devolver(@PathVariable Long id){Emprestimo e=repo.findById(id).orElseThrow();e.setStatus(StatusEmprestimo.DEVOLVIDO);e.setDataDevolucao(LocalDate.now());e.getLivro().setDisponivel(true);livros.save(e.getLivro());return repo.save(e);}
}
