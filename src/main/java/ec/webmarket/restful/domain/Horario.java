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
public class Horario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private LocalDate fecha;
	
	@Column(nullable = false, unique = true)
	private LocalDateTime horaInicio;

	@Column(nullable = false, unique = true)
	private LocalDateTime horafinal;
	
	@Column(nullable = false, unique = true)
	private Boolean disponibilidad;
	
	@Column(nullable = false, unique = true)
	private String RELACIONODONTOLOGOMODIFICAR;
	
}
