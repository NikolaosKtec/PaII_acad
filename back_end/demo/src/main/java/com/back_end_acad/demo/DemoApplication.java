package com.back_end_acad.demo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.back_end_acad.demo.Domain.Ficha_treino;
import com.back_end_acad.demo.Domain.Status;
import com.back_end_acad.demo.Domain.Usuario;
import com.back_end_acad.demo.Service.Ficha_treino_service;
import com.back_end_acad.demo.Service.Usuario_service;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(Usuario_service usuario_service, Ficha_treino_service ficha_treino_service) {
	  return (args) -> {
		Set<Ficha_treino> ficha_treinos = null;

		// salve alguns itens
		var usr1 = new Usuario("super adm","admin","xandao@gmail.com",ficha_treinos);
		var ficha_1 = new Ficha_treino(Status.ATIVO,LocalDate.of(2023, 9, 23),LocalDate.now(),usr1);
		// var ficha_2 = new Ficha_treino(Status.ATIVO,LocalDate.of(2023, 9, 23),LocalDate.now(),null);

		usuario_service.insert(usr1);

		ficha_treino_service.insert(ficha_1);
		// ficha_treino_service.insert(ficha_2);
		
		// lista todos usuarios no banco
		for (Usuario usuario : usuario_service.list_all()) {
			log.info(usuario.toString());
		  }
		
		// lista todas as fichas de treino
		for (Ficha_treino treino : ficha_treino_service.list_all()) {
			log.info(treino.toString());
		  }
		log.info("");
	  };
	}

}
