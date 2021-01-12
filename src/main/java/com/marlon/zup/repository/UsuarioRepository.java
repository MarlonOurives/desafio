package com.marlon.zup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.zup.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByEmail(String email);
}
