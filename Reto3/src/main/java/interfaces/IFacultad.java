package interfaces;

public interface IFacultad {
    public void guardar(Facultad facultad);
    public Facultad getFacultad(Long id);
    public void eliminar(Facultad facultad);
    public void actualizar(Facultad facultad);
    public List<Facultad> getFacultades();
}
