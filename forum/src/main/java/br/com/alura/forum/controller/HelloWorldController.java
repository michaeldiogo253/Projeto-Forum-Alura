package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping("/")
	@ResponseBody // para indicar pro servidor que a resposta não será uma pagina 
	public String Hello () {
		return "Hello World! ";

	}

}