package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ar.edu.unju.edm.modelo.Usuario;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class UserController {
	@Autowired
	Usuario unUsuario;
	@Autowired
	IUsuarioService iUsuarioService;
	

}
