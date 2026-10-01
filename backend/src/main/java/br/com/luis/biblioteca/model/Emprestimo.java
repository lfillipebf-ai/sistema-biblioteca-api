package br.com.luis.biblioteca.model;
import jakarta.persistence.*; import java.time.LocalDate;
@Entity public class Emprestimo {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) private Livro livro; @ManyToOne(optional=false) private Leitor leitor;
 private LocalDate dataEmprestimo=LocalDate.now(); private LocalDate dataDevolucao;
 @Enumerated(EnumType.STRING) private StatusEmprestimo status=StatusEmprestimo.ATIVO;
 public Long getId(){return id;} public Livro getLivro(){return livro;} public void setLivro(Livro v){livro=v;} public Leitor getLeitor(){return leitor;} public void setLeitor(Leitor v){leitor=v;}
 public LocalDate getDataEmprestimo(){return dataEmprestimo;} public void setDataEmprestimo(LocalDate v){dataEmprestimo=v;}
 public LocalDate getDataDevolucao(){return dataDevolucao;} public void setDataDevolucao(LocalDate v){dataDevolucao=v;}
 public StatusEmprestimo getStatus(){return status;} public void setStatus(StatusEmprestimo v){status=v;}
}
