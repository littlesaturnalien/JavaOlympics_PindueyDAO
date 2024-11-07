package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@Entity
@Table (name = "Carrera")
public class Carrera {
    @Id
    @GeneratedValue(generator = "system-uuid", strategy = GenerationType.AUTO)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Facultad facultad;
}