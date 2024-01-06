package mx.edu.utez.Diag.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = “clientes”)
public class ClientesBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autor”, unique = true)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos”)
    private String apellidos;

    @Column(name = “curp”, unique - true)
    private String Curp;

	@Column(name = “fecha_nac”)
	private String fechaNac;
}
