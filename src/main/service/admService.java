package com.dolcepie.services;

import com.dolcepie.models.admModel;
import com.dolcepie.repository.admRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service


public class admService {
    


@Autowired
    private admRepo admRepo;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Criar administrador
    public Administrador criarAdministrador(Administrador admin) {
        if (admRepo.findByEmail(admin.getEmail()).isPresent()) {
            throw new RuntimeException("Email já cadastrado para um administrador.");
        }

        admin.setSenha(passwordEncoder.encode(admin.getSenha()));
        return admRepo.save(admin);
    }

    // Buscar administrador por ID
    public Administrador buscarPorId(Long id) {
        return admRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Administrador não encontrado."));
    }

    // Listar todos os administradores
    public List<Administrador> listarAdministradores() {
        return admRepo.findAll();
    }

    // Atualizar administrador
    public Administrador atualizarAdministrador(Long id, Administrador dadosAtualizados) {
        Administrador admin = buscarPorId(id);

        admin.setNome(dadosAtualizados.getNome());
        admin.setEmail(dadosAtualizados.getEmail());
        

        if (dadosAtualizados.getSenha() != null && !dadosAtualizados.getSenha().isEmpty()) {
            admin.setSenha(passwordEncoder.encode(dadosAtualizados.getSenha()));
        }

        return admRepo.save(admin);
    }

    // Remover administrador
    public void removerAdministrador(Long id) {
        Administrador admin = buscarPorId(id);
        admRepo.delete(admin);
    }

    // Autenticação de administrador
    public Administrador autenticarAdministrador(String email, String senha) {
        Optional<Administrador> adminOpt = administradorRepository.findByEmail(email);

        if (adminOpt.isEmpty()) {
            throw new RuntimeException("Email ou senha inválidos.");
        }

        Administrador admin = adminOpt.get();

        if (!passwordEncoder.matches(senha, admin.getSenha())) {
            throw new RuntimeException("Email ou senha inválidos.");
        }

        return admin
    }
}
