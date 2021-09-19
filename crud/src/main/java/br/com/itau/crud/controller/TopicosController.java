package br.com.itau.crud.controller;

import java.util.List;
import java.util.Arrays;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.crud.controller.dto.TopicoDto;
import br.com.itau.crud.modelo.Curso;
import br.com.itau.crud.modelo.Topico;

@RestController
public class TopicosController {
	@RequestMapping("/topicos")
	
	
	public List<TopicoDto> lista() {
		Topico topico=new Topico("testando", "teste", new Curso("teste","testando"));
		return TopicoDto.converter(Arrays.asList(topico,topico,topico));
	}
	
}
	
