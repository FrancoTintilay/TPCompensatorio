package ar.edu.unju.edm.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Reserva implements Serializable {
	private static final long serialVersionaVID=1L;
	@Id
	private Long idreserva;
	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate fechainicio;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate fechasalida;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idusuarios")
	private Usuario usuario;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idhabitacion")
	private Habitacion habitacion;
	@Column
	private boolean desayuno;
	public Reserva(Long idreserva, LocalDate fechainicio, LocalDate fechasalida, Usuario usuario, Habitacion habitacion,
			boolean desayuno) {
		super();
		this.idreserva = idreserva;
		this.fechainicio = fechainicio;
		this.fechasalida = fechasalida;
		this.usuario = usuario;
		this.habitacion = habitacion;
		this.desayuno = desayuno;
	}
	public Long getIdreserva() {
		return idreserva;
	}
	public void setIdreserva(Long idreserva) {
		this.idreserva = idreserva;
	}
	public LocalDate getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}
	public LocalDate getFechasalida() {
		return fechasalida;
	}
	public void setFechasalida(LocalDate fechasalida) {
		this.fechasalida = fechasalida;
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
	public boolean isDesayuno() {
		return desayuno;
	}
	public void setDesayuno(boolean desayuno) {
		this.desayuno = desayuno;
	}
	public static long getSerialversionavid() {
		return serialVersionaVID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (desayuno ? 1231 : 1237);
		result = prime * result + ((fechainicio == null) ? 0 : fechainicio.hashCode());
		result = prime * result + ((fechasalida == null) ? 0 : fechasalida.hashCode());
		result = prime * result + ((habitacion == null) ? 0 : habitacion.hashCode());
		result = prime * result + ((idreserva == null) ? 0 : idreserva.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		if (desayuno != other.desayuno)
			return false;
		if (fechainicio == null) {
			if (other.fechainicio != null)
				return false;
		} else if (!fechainicio.equals(other.fechainicio))
			return false;
		if (fechasalida == null) {
			if (other.fechasalida != null)
				return false;
		} else if (!fechasalida.equals(other.fechasalida))
			return false;
		if (habitacion == null) {
			if (other.habitacion != null)
				return false;
		} else if (!habitacion.equals(other.habitacion))
			return false;
		if (idreserva == null) {
			if (other.idreserva != null)
				return false;
		} else if (!idreserva.equals(other.idreserva))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Reserva [idreserva=" + idreserva + ", fechainicio=" + fechainicio + ", fechasalida=" + fechasalida
				+ ", usuario=" + usuario + ", habitacion=" + habitacion + ", desayuno=" + desayuno + "]";
	}
	
	
	
	

}
