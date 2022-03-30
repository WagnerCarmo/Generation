package com.generation.BlogPessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.generation.BlogPessoal.model.Usuario;
import com.generation.BlogPessoal.service.UsuarioService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private UsuarioService usuarioService;

	@Test
	@Order(1)
	public void devecadastrarUmUsuario() {
		HttpEntity<Usuario> requisicao = new HttpEntity<Usuario>(new Usuario(0L, "Zé Mario", "zemario@ovo.com",
				"ovofrito123", "https://i.pinimg.com/originals/a5/75/de/a575de26e864c95e1ff43bfbea2f4be2.jpg",""));

		ResponseEntity<Usuario> resposta = testRestTemplate
		.exchange("/usuarios/cadastrar", HttpMethod.POST, requisicao, Usuario.class);

		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
		assertEquals(requisicao.getBody().getUsuario(), resposta.getBody().getUsuario());
		assertEquals(requisicao.getBody().getNome(), resposta.getBody().getNome());

	}

	@Test
	@Order(2)
	public void deveAtualizarUmUsuario() {

		Optional<Usuario> usuarioCreate = usuarioService
				.cadastrarUsuario(new Usuario(0L, "Baby Sauro", "naoehamamae@denovo.com.br", "1bebezao",
						"https://i.pinimg.com/originals/f9/35/41/f93541fe33040ebacd15fc592e6d500b.jpg",""));

		Usuario usuarioUpdate = new Usuario(usuarioCreate.get().getId(), "Baby Sauro Senior",
				"naoehamamae@denovo.com.br", "1bebezao",
				"https://i.pinimg.com/originals/f9/35/41/f93541fe33040ebacd15fc592e6d500b.jpg","");

		HttpEntity<Usuario> requisicaoDoCorpo = new HttpEntity<Usuario>(usuarioUpdate);

		ResponseEntity<Usuario> respostaDoCorpo = testRestTemplate.withBasicAuth("root", "root")
				.exchange("/usuarios/atualizar", HttpMethod.PUT, requisicaoDoCorpo, Usuario.class);

		assertEquals(HttpStatus.OK, respostaDoCorpo.getStatusCode());
		assertEquals(requisicaoDoCorpo.getBody().getNome(), respostaDoCorpo.getBody().getNome());
		assertEquals(requisicaoDoCorpo.getBody().getUsuario(), respostaDoCorpo.getBody().getUsuario());

	}
}
