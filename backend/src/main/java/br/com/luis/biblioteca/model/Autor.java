package br.com.luis.biblioteca.model;
import jakarta.persistence.*; import jakarta.validation.constraints.NotBlank;
@Entity public class Autor {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String nome;
 public Long getId(){return id;} public String getNome(){return nome;} public void setNome(String v){nome=v;}
}
