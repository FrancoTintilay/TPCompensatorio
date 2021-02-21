package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.Habitacion;
import ar.edu.unju.edm.repository.IHabitacionDAO;

@Service
public class IHabitacionServiceImp implements IHabitacionService{
	@Autowired
	private IHabitacionDAO iHabitacionDAO;
	@Override
	public void guardarHab(Habitacion habitacion) {
		// TODO Auto-generated method stub
		iHabitacionDAO.save(habitacion);
	}

	@Override
	public List<Habitacion> listarHab() {
		// TODO Auto-generated method stub
		return (List<Habitacion>) iHabitacionDAO.findAll();
	}

	

	@Override
	public void eliminarHabitacion(Long numhab) {
		// TODO Auto-generated method stub
		iHabitacionDAO.deleteById(numhab);
	}

	@Override
	public Habitacion FindByNum(Long numhab) {
		// TODO Auto-generated method stub
		return iHabitacionDAO.findById(numhab).orElse(null);
	}

	

}
