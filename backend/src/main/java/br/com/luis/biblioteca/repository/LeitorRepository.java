package br.com.luis.biblioteca.repository;
import br.com.luis.biblioteca.model.Leitor; import org.springframework.data.jpa.repository.JpaRepository;
public interface LeitorRepository extends JpaRepository<Leitor,Long>{}
