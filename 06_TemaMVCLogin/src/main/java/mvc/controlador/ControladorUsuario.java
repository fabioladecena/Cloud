package mvc.controlador;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.modelo.entidad.Usuario;
import mvc.modelo.negocio.GestorUsuario;

@Controller
public class ControladorUsuario {

	@Autowired
	private GestorUsuario gestorUsuario;

	@PostMapping("/doLogin")
	public String login(@RequestParam("nombre") String username, @RequestParam("pass") String password, Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setUsername(username);
		usuario.setPassword(password);
		boolean validado = gestorUsuario.validar(usuario);
		
		if (validado) {
			model.addAttribute("nombre", username);
			model.addAttribute("fecha", new Date());
			return "inicio";
		} else {
			return "errorLogin";
		}
	}
}
