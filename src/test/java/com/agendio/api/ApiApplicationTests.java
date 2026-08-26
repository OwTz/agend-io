package com.agendio.api;


import com.agendio.api.services.UsuarioFind;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ApiApplicationTests {

	@Test
	void contextLoads() {

		new UsuarioFind().deveRetornarUsuarioPorId();


	}


}
