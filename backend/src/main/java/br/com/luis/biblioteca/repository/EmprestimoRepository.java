package br.com.luis.biblioteca.repository;
import br.com.luis.biblioteca.model.*; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface EmprestimoRepository extends JpaRepository<Emprestimo,Long>{List<Emprestimo> findByStatus(StatusEmprestimo status);}
