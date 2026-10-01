package br.com.luis.biblioteca.repository;
import br.com.luis.biblioteca.model.Livro; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface LivroRepository extends JpaRepository<Livro,Long>{List<Livro> findByDisponivelTrue();}
