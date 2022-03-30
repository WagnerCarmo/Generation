package com.generation.BlogPessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.generation.BlogPessoal.model.Usuario;

@SpringBootTest (webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTests {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@BeforeAll
	void start() {
		usuarioRepository.save(new Usuario(0L,"Charlie Brown Senior", "ogigante@acordou.com","1223456789","https://i.imgur.com/FETvs2O.jpg",""));
		
		usuarioRepository.save(new Usuario(0L,"Tsubasa do Anime Senior", "ehmelhorqueoetoo@futibol.com","pernadepau","https://i.imgur.com/FETvs2O.jpg",""));
		
		usuarioRepository.save(new Usuario(0L,"Naruto sei lá do que Senior", "prefirosakura@cardcaptor.com","samuraix","https://i.imgur.com/FETvs2O.jpg",""));
	}
	
	@Test
	@DisplayName("Retorna apenas um usuário")
	public void deveRetornarUmUsuario() {
		
		Optional<Usuario> usuario = usuarioRepository.findByUsuario("Tsubasa do Anime");
		assertTrue(usuario.get().getUsuario().equals("ehmelhorqueoetoo@futibol.com"));			
	}
	
	@Test
	@DisplayName("DeUsruaRetorna 3 usuários")
	public void deveRetornarTresUsuarios () {
		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Senior");
		assertEquals(3, listaDeUsuarios.size());
		assertTrue(listaDeUsuarios.get(0).getNome().equals("Charlie Brown Senior"));
		assertTrue(listaDeUsuarios.get(1).getNome().equals("Tsubasa do Anime Senior"));
		assertTrue(listaDeUsuarios.get(2).getNome().equals("Naruto sei lá do que Senior"));	
	}
	
	@AfterAll     
	public void end() {
		usuarioRepository.deleteAll();
	}
}