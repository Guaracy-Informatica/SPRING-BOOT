package br.com.itau.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdicionarController {
	
    @RequestMapping("/adicionar")
    @ResponseBody
    
    public String adicionando(){
		return "Página de adicionar";
	}
}
