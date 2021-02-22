package ar.edu.unju.edm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.modelo.Habitacion;
import ar.edu.unju.edm.service.IHabitacionService;

@Controller
public class HabitacionController {
@Autowired
private IHabitacionService iHabitacionService;
	@GetMapping ("/listahabitaciones")
	public String listarhabn(Model model) {
		List<Habitacion>listahabitaciones= iHabitacionService.listarHab();
		model.addAttribute("lista",listahabitaciones);
		return "habitaciones";
	}
	@GetMapping ("/altahab")
	public String agregarHab(Model model){
		model.addAttribute("habitacionnuevo",new Habitacion());
		return "agregarHabitacion";
		
	}
	@PostMapping ("/guardarhabitacion")
	public String guardaHabitacion(Model model,Habitacion habitacionnuevo) {
		iHabitacionService.guardarHab(habitacionnuevo);
		return "redirect:/listahabitaciones";
	}
	@GetMapping ("/editarhabitacion/{numhab}")
	public String editarhabitacion(Model model, @PathVariable Long numhab) {
		Habitacion habitacion=iHabitacionService.FindByNum(numhab);
		model.addAttribute("habitacionnuevo",habitacion);
		return "edithabitacion";
	}
	@GetMapping ("/eliminarhabitacion/{numhab}")
	public String eliminarHabitacion(Model model, @PathVariable Long numhab) {
		iHabitacionService.eliminarHabitacion(numhab);
		return "redirect:/listahabitaciones";
	}
}
