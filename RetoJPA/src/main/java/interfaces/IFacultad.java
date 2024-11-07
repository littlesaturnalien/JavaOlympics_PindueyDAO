package interfaces;

import models.Facultad;

import java.util.List;

public interface IFacultad {
    public void save(Facultad facultad);
    public Facultad getFacultad(Long id);
    public void delete(Facultad facultad);
    public void update(Facultad facultad);
    public List<Facultad> getFacultades();
}
