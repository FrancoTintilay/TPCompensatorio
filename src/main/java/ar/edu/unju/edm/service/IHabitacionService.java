package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.Habitacion;
@Service
public interface IHabitacionService {
	public void guardarHab(Habitacion habitacion);
	public List<Habitacion> listarHab();
	public Habitacion FindByNum(Long numhab);
	public void eliminarHabitacion(Long numhab);
	
	
}
