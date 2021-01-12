package com.marlon.zup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlon.zup.model.Usuario;
import com.marlon.zup.repository.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	/*
	 * Injetando o Usuario
	 * */
	@Autowired
	UsuarioRepository usuarioRepository;

	
	@GetMapping(value = "/usuarios")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	@GetMapping(value = "/usuario/{email}")
	public Usuario usuarioUnico(@PathVariable(value = "email")String email) {
		return usuarioRepository.findByEmail(email);
	}
	
	@PostMapping(value = "/usuario")
	public Usuario salvarUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
