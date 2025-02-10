package ec.webmarket.restful.dto.v1;

import java.time.LocalDate;

import lombok.Data;

@Data
public class HorarioDTO {
	
	private Long id;
	private LocalDate fecha;
	private String horaInicio;
	private String horafinal;
	private Boolean disponibilidad;
	private OdontologoDTO Odontologo;
	
}
