package interfaces;
import models.Carrera;

import java.util.List;

public interface ICarrera {
    public void save(Carrera carrera);
    public Carrera getCarrera(Long id);
    public void delete(Carrera carrera);
    public void update(Carrera carrera);
    public List<Carrera> getCarreras();
}
