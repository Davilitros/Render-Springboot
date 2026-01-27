package com.RegistroApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.RegistroApp.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
