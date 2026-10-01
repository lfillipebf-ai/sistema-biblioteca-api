package br.com.luis.biblioteca.controller;
import br.com.luis.biblioteca.model.Autor; import br.com.luis.biblioteca.repository.AutorRepository; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/autores") public class AutorController{
 private final AutorRepository repo; public AutorController(AutorRepository r){repo=r;}
 @GetMapping public List<Autor> listar(){return repo.findAll();} @PostMapping public Autor criar(@Valid @RequestBody Autor a){return repo.save(a);} @DeleteMapping("/{id}") public void excluir(@PathVariable Long id){repo.deleteById(id);}
}
