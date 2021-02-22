package ar.edu.unju.edm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.edm.modelo.Habitacion;
import ar.edu.unju.edm.modelo.Reserva;
import ar.edu.unju.edm.repository.IReservaDAO;
import ar.edu.unju.edm.service.IReservaService;


@Controller

public class ReservaController {
	
	@Autowired
	IReservaService iReservaService;
	@Autowired
	IReservaDAO iReservaDAO;
	
	@GetMapping("/Reserva")
	public String ReservaHabitacion(Model model) {
		model.addAttribute("reservas1", iReservaService.listarReservas());
		model.addAttribute("reservaDelForm", new Reserva());
		return "redirect:/listareservas";
	}
	
	@GetMapping ("/listareservas")
	public String listarreserva(Model model) {
		List<Reserva>listaReservas = iReservaService.listarReservas();
		model.addAttribute("listareservas",listaReservas);
		return "reservas";
	}
	@PostMapping ("/guardarreserva")
	public String guardareserva(Model model,Reserva reserva) {
		iReservaService.guardarReserva(reserva);
		return "redirect:/listareservas";
	}
	@GetMapping ("/eliminarreserva/{idreserva}")
	public String eliminar_reserva (Model model, @PathVariable Long idreserva) {
		iReservaService.eliminarReserva(idreserva);
		return "redirect:/listareservas";
	}
}
