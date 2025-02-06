package ec.webmarket.restful.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;

	@Column(nullable = false, unique = true)
	private String cedula;
	
	@Column(nullable = false, unique = true)
	private String nombre;

	@Column(nullable = false, unique = true)
	private String apellido;
	
	@Column(nullable = false, unique = true)
	private String telefono;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, updatable = false)
	private String fechaNacimiento;
	
	@Column(nullable = false, unique = false)
	private String direccion;
}
