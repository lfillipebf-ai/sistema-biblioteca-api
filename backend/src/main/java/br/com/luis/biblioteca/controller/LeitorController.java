package br.com.luis.biblioteca.controller;
import br.com.luis.biblioteca.model.Leitor; import br.com.luis.biblioteca.repository.LeitorRepository; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/leitores") public class LeitorController{
 private final LeitorRepository repo; public LeitorController(LeitorRepository r){repo=r;}
 @GetMapping public List<Leitor> listar(){return repo.findAll();} @PostMapping public Leitor criar(@Valid @RequestBody Leitor l){return repo.save(l);}
}
