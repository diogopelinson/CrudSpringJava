package com.crudjava.cadastro_usuario.business;

import com.crudjava.cadastro_usuario.infrastructure.entitys.Usuario;
import com.crudjava.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service // Indica ao Spting que esta classe eh a de servico
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    // Metodo que salva e fecha a conexao com o BD
    public void salvarUsuario(Usuario usuario) {
        repository.saveAndFlush(usuario);
    }

    // Metodo que Busca os Usuarios
    public Usuario buscarUsuarioPorEmail(String email) {
        //orElseThrow retorna uma execao personalizada
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado"));
    }

    // Metodo que Deleta o Usuario por email
    public void deletarUsuarioPorEmail(String email) {
        repository.deleteByEmail(email);
    }

    // Metodo IMPORTANTE
    public void atualizarUsuarioPorId(Integer id, Usuario usuario){
        Usuario usuarioEntity = repository.findById(id).orElseThrow(() ->
                new RuntimeException("Usuario não encontrado"));
        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ? usuario.getEmail() :
                        usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ? usuario.getNome() :
                        usuarioEntity.getNome())
                .id(usuarioEntity.getId())
                .build();


        repository.saveAndFlush(usuarioAtualizado);
    }

}
