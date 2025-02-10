package ec.webmarket.restful.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.webmarket.restful.domain.Odontologo;

public interface OdontologoRepository extends JpaRepository<Odontologo, Long> {

	List<Odontologo> findByCedula(String cedula);
	
	List<Odontologo> findByNombre(String nombre);
	
	List<Odontologo> findByApellido(String apellido);
	
	List<Odontologo> findByEspecialidad(String especialidad);
	
	List<Odontologo> findByTelefono(String telefono);
	
	List<Odontologo> findByEmail(String email);
}
