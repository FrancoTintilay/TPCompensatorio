package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.Reserva;

@Service
public interface IReservaService {
	public void guardarReser(Reserva reserva);
	public List<Reserva> listaReser();
	public Reserva FindById(Long id);
	public void eliminarReser(Long reserva);
	public Reserva buscarReser(Long id);

}
