package ar.edu.unju.edm.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.modelo.Usuario;
import ar.edu.unju.edm.modelo.Reserva;
@Repository
public interface IReservaDAO extends CrudRepository<Reserva,Long> {
	public Optional<Reserva> findByFecha(LocalDate fecha);
	public Reserva findByUsuario(Usuario usuario);
}
