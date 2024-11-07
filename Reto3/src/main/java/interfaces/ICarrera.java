package interfaces;

public interface ICarrera {
    public void guardar(Carrera carrera);
    public Carrera getFacultad(Long id);
    public void eliminar(Carrera carrera);
    public void actualizar(Carrera carrera);
    public List<Carrera> getCarreras();
}

