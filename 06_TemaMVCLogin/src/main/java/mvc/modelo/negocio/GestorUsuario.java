package mvc.modelo.negocio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.modelo.entidad.Usuario;
import mvc.modelo.persistencia.DaoUsuario;

@Service
public class GestorUsuario {

	@Autowired
	private DaoUsuario daoUsuario;

	public boolean validar(Usuario usuario) {
		Optional <Usuario> userBBDD = daoUsuario.findByUsername(usuario.getPassword());
		if (!userBBDD.isPresent()) {
			return false;
		}
		if (usuario.getPassword().equals(userBBDD.get().getPassword())) {
			return true;
		} else {
			return false;
		}
	}
}
