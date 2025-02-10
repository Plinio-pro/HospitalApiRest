package ec.webmarket.restful.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
public class Cita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String RELACIONPACIENTEMODIFICAR;
	
	@Column(nullable = false, unique = true)
	private String RELACIONODONTOLOGOMODIFICAR;

	@Column(nullable = false, unique = true)
	private String RELACIONHORARIOMODIFICAR;
	
	@Column(nullable = false, unique = true)
	private LocalDate fecha;
	
	@Column(nullable = false, unique = true)
	private LocalDateTime Hora;
	
	@Column(nullable = false, unique = true)
	private String estado;
	
	@Column(nullable = false, unique = true)
	private String motivo;
	
}
