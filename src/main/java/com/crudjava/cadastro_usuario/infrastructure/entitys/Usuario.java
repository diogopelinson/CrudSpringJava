package com.crudjava.cadastro_usuario.infrastructure.entitys;

// Classe que vai ser salva no banco de dados

//Anotacoes do lombook
import jakarta.persistence.*;
import lombok.*;

@Getter // O @Getter cria o método que retorna o valor do atributo
@Setter // O @Setter cria o método que altera o valor do atributo.
@AllArgsConstructor // Construtores para acessar as classe
@NoArgsConstructor  // Construtores para acessar as classe
@Builder  // Para o Update do CRUD
@Table(name = "usuario") // Indicando que eh uma tabela
@Entity //A @Entity indica que a classe representa uma tabela no banco de dados (JPA).

public class Usuario {

    // Gerando o ID de usuario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    // unique faz com que nao possa exister emails iguais
    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;

}
