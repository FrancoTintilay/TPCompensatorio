package ar.edu.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.modelo.Reserva;
@Repository
public interface IReservaDAO extends CrudRepository<Reserva,Long> {

}
