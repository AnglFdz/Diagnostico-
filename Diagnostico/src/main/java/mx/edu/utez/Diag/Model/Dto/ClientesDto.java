package mx.edu.utez.Diag.Model.Dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientesDto {

    private Integer id;
    private String nombre;
    private String apellido;
    private String curp;
	private String fechaNac;
}
