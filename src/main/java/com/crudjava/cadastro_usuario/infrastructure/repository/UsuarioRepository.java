package com.crudjava.cadastro_usuario.infrastructure.repository;

import com.crudjava.cadastro_usuario.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

// JpaRepository Facilitador e qual tabela minha interface se esta se referindo que eh Usuario e o tipo do campo de ID
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    // Criando o Find by Email, usar o optional para enviar o NullPointerException
    Optional<Usuario> findByEmail(String email);

    @Transactional
        // Usado para se caso houver um erro ele nao pode deletar
    void deleteByEmail(String email);



}
