package com.RegistroApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.RegistroApp.Perfil;
import com.RegistroApp.Usuario;
import com.RegistroApp.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        Usuario usuario = new Usuario();
        usuario.setPerfil(new Perfil());
        model.addAttribute("usuario", usuario);
        return "usuario-form";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/usuarios/lista";
    }

    @GetMapping("/lista")
   public String listarUsuarios(Model model) {
    	model.addAttribute("usuarios", usuarioRepository.findAll());
       return "index";
   }
    @GetMapping("/")
    public String index(Model model) {
     	model.addAttribute("usuarios", usuarioRepository.findAll());
        return "index";
    }
}