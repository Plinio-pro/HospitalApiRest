package ec.webmarket.restful.persistence;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.webmarket.restful.domain.Cita;
import ec.webmarket.restful.domain.Horario;
import ec.webmarket.restful.domain.Odontologo;
import ec.webmarket.restful.domain.Paciente;

public interface CitaRepository extends JpaRepository<Cita, Long>{
	
	List<Cita> finByPaciente(Paciente paciente);
	
	List<Cita> finByOdontologo(Odontologo Odontologo);
	
	List<Cita> finByHorario(Horario Horario);
	
	List<Cita> finByFechayHora(LocalDateTime FechayHora);
	
	List<Cita> finByEstado(String Estado);
	
	List<Cita> finByMotivo(String Motivo);
} 
