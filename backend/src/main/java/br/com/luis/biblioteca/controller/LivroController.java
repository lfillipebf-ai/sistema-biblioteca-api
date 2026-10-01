package br.com.luis.biblioteca.controller;
import br.com.luis.biblioteca.model.*; import br.com.luis.biblioteca.repository.*; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/livros") public class LivroController{
 private final LivroRepository repo; private final AutorRepository autores; public LivroController(LivroRepository r,AutorRepository a){repo=r;autores=a;}
 @GetMapping public List<Livro> listar(){return repo.findAll();} @GetMapping("/disponiveis") public List<Livro> disponiveis(){return repo.findByDisponivelTrue();}
 @PostMapping public Livro criar(@Valid @RequestBody Livro l){l.setAutor(autores.findById(l.getAutor().getId()).orElseThrow());return repo.save(l);}
 @PatchMapping("/{id}/disponibilidade") public Livro disponibilidade(@PathVariable Long id,@RequestParam boolean valor){Livro l=repo.findById(id).orElseThrow();l.setDisponivel(valor);return repo.save(l);}
}
