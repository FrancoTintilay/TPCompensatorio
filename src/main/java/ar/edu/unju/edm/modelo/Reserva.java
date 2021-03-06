package ar.edu.unju.edm.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Component
@Entity
public class Reserva implements Serializable {
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReserva;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idHabitacion")
	private Habitacion habitacion;
	@Column
	private String desayuno;
	
	public Reserva() {
		
	}

	public Reserva(Long idReserva, LocalDate fecha, Usuario usuario, Habitacion habitacion, String desayuno) {
		super();
		this.idReserva = idReserva;
		this.fecha = fecha;
		this.usuario = usuario;
		this.habitacion = habitacion;
		this.desayuno = desayuno;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public String getDesayuno() {
		return desayuno;
	}

	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", fecha=" + fecha + ", usuario=" + usuario + ", habitacion="
				+ habitacion + ", desayuno=" + desayuno + "]";
	}

	

}
