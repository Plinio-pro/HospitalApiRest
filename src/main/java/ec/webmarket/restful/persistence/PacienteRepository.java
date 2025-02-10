package ec.webmarket.restful.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.webmarket.restful.domain.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

	List<Paciente> findByCedula(String cedula);
	
	List<Paciente> findByNombre(String nombre);
	
	List<Paciente> findByApellido(String apellido);
	
	List<Paciente> findByTelefono(String telefono);
	
	List<Paciente> findByEmail(String email);
	
	List<Paciente> findByFechaNacimiento(String fechaNacimiento);
	
	List<Paciente> findByDireccion(String direccion);
}
