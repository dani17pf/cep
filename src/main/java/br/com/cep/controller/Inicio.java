package br.com.cep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Inicio {


	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		
		return "	Tela Inicial  !!! ";
	}

}
