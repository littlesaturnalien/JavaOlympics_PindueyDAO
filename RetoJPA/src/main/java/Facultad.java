import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table("Facultad")
@Getter
@Setter
public class Facultad {
    @Id
    @GeneratedValue(generator = "system-uuid", strategy = GenerationType.AUTO)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id_facultad;
    private String nombre;
    private String descripcion;
}
