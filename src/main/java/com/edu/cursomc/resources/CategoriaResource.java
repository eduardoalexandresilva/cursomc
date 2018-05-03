package com.edu.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@RequestMapping("/novo")
	public String novo() {
		return"olá spring";
	}
}
