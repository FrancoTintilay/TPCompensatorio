package ar.edu.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.edm.modelo.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario ,Long>{
	public Usuario findByDni(int dni);
}
