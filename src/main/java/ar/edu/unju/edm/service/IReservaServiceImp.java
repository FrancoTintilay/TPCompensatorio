package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.Reserva;
import ar.edu.unju.edm.repository.IReservaDAO;

@Service
public class IReservaServiceImp implements IReservaService {
	@Autowired
	IReservaDAO iReservaDAO;
	@Override
	public void guardarReser(Reserva reserva) {
		// TODO Auto-generated method stub
		iReservaDAO.save(reserva);
	}

	@Override
	public List<Reserva> listaReser() {
		// TODO Auto-generated method stub
		return (List<Reserva>) iReservaDAO.findAll();
	}

	@Override
	public Reserva FindById(Long id) {
		// TODO Auto-generated method stub
		return iReservaDAO.findById(id).orElse(null);
	}

	@Override
	public void eliminarReser(Long reserva) {
		// TODO Auto-generated method stub
		iReservaDAO.deleteById(reserva);
	}

	@Override
	public Reserva buscarReser(Long id) {
		// TODO Auto-generated method stub
		return iReservaDAO.findById(id).orElse(null);
	}

}
