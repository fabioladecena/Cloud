package com.example.concesionariotemplate;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.concesionariotemplate.modelo.entidad.Coche;
import com.example.concesionariotemplate.modelo.proxy.CocheProxy;

@SpringBootApplication
public class TemaSpringRestTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TemaSpringRestTemplateApplication.class, args);
		
		CocheProxy cProxy = context.getBean("cocheProxy", CocheProxy.class);
		
		System.out.println("Listar Coches");
		List<Coche> listaCoches = cProxy.listarCoche();
		System.out.println(listaCoches);
		
		System.out.println("Obtener Coche");
		Coche c2 = cProxy.obtenerCoche(10);
		System.out.println(c2);
		
		Coche c1 = new Coche();
		c1.setMarca("Fiat");
		c1.setMatricula("C355H");
		c1.setModelo("332");
		c1.setPotencia("120cv");
		
		System.out.println("Dar de alta");
		c1 = cProxy.alta(c1);
		System.out.println(c1);
		
		c2 = new Coche();
		c2.setMarca("Toyota");
		c2.setMatricula("987FF");
		c2.setModelo("67TY");
		c2.setPotencia("240cv");
		
		System.out.println("Modificar Coche");
		Coche c3 = cProxy.modificar(c2);
		
		System.out.println(c3);
		
		System.out.println("Borrar Coche");
		cProxy.borrar(10);
		System.out.println("Coche borrado");
		
		System.out.println("Listar Coche");
		listaCoches = cProxy.listarCoche();
		System.out.println(listaCoches);
	}

}
