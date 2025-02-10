package ec.webmarket.restful.persistence;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.webmarket.restful.domain.Horario;
import ec.webmarket.restful.domain.Odontologo;

public interface HorarioRepository extends JpaRepository<Horario, Long>{
	
	List<Horario> findByFecha(LocalDate fecha);
	
	List<Horario> findByHoraInicio(LocalTime horaInicio);
	
	List<Horario> findByHorafinal(LocalTime horafinal);
	
	List<Horario> findByDisponibilidad(Boolean disponibilidad);
	
	List<Horario> findByOdontologo(Odontologo odontologo);
}
