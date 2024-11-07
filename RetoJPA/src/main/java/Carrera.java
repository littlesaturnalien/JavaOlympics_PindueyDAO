import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@Entity
@Table ("Carrera")
public class Carrera {
    @Id
    @GeneratedValue(generator = "system-uuid", strategy = GenerationType.AUTO)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id_carrera;
    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id_facultad")
    private Facultad facultad;
}
