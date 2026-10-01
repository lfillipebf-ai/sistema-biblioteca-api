package br.com.luis.biblioteca.model;
import jakarta.persistence.*; import jakarta.validation.constraints.NotBlank;
@Entity public class Livro {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String titulo; private String isbn; private boolean disponivel=true;
 @ManyToOne(optional=false) private Autor autor;
 public Long getId(){return id;} public String getTitulo(){return titulo;} public void setTitulo(String v){titulo=v;}
 public String getIsbn(){return isbn;} public void setIsbn(String v){isbn=v;} public boolean isDisponivel(){return disponivel;} public void setDisponivel(boolean v){disponivel=v;}
 public Autor getAutor(){return autor;} public void setAutor(Autor v){autor=v;}
}
