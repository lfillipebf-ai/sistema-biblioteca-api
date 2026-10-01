package br.com.luis.biblioteca.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*;
@Entity public class Leitor {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String nome; @Email @NotBlank @Column(unique=true) private String email;
 public Long getId(){return id;} public String getNome(){return nome;} public void setNome(String v){nome=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;}
}
