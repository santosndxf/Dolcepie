package com.dolcepie.services;

import com.dolcepie.models.Usuario;
import com.dolcepie.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private userRepo  userRepo;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Criar usuário
    public Usuario criarUsuario(Usuario usuario) {
        if (userRepo.findByEmail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("Email já cadastrado.");
        }

        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        return uuserRepo.save(usuario);
    }

    // Buscar por ID
    public Usuario buscarPorId(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado."));
    }

    // Listar todos os usuários
    public List<Usuario> listarUsuarios() {
        return userRepo.findAll();
    }

    // Atualizar usuário
    public Usuario atualizarUsuario(Long id, Usuario dadosAtualizados) {
        Usuario usuario = buscarPorId(id);

        usuario.setNome(dadosAtualizados.getNome());
        usuario.setEmail(dadosAtualizados.getEmail());
        usuario.setRole(dadosAtualizados.getRole());

        if (dadosAtualizados.getSenha() != null && !dadosAtualizados.getSenha().isEmpty()) {
            usuario.setSenha(passwordEncoder.encode(dadosAtualizados.getSenha()));
        }

        return userRepo.save(usuario);
    }

    // Deletar usuário
    public void removerUsuario(Long id) {
        Usuario usuario = buscarPorId(id);
        userRepo.delete(usuario);
    }

    // Autenticar usuário (login)
    public Usuario autenticarUsuario(String email, String senha) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByEmail(email);

        if (usuarioOpt.isEmpty()) {
            throw new RuntimeException("Email ou senha inválidos.");
        }

        Usuario usuario = usuarioOpt.get();

        if (!passwordEncoder.matches(senha, usuario.getSenha())) {
            throw new RuntimeException("Email ou senha inválidos.");
        }

        return usuario;
    }
}
