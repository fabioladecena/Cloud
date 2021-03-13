package mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mvc.modelo.entidad.Usuario;
import mvc.modelo.persistencia.DaoUsuario;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		DaoUsuario dao = context.getBean("daoUsuario", DaoUsuario.class);

		Usuario u = new Usuario();
		u.setUsername("goku");
		u.setPassword("123456");

		dao.save(u);
	}

}
