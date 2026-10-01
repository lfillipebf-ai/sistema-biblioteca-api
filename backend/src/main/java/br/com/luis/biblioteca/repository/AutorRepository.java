package br.com.luis.biblioteca.repository;
import br.com.luis.biblioteca.model.Autor; import org.springframework.data.jpa.repository.JpaRepository;
public interface AutorRepository extends JpaRepository<Autor,Long>{}
