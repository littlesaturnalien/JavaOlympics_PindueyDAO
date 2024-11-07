import dao.CarreraDAO;
import dao.FacultadDAO;
import models.Carrera;
import models.Facultad;

public class Main {
    public static void main(String[] args) {
        FacultadDAO facultadDao = new FacultadDAO();
        CarreraDAO carreraDao = new CarreraDAO();
        Facultad newFacultad = new Facultad();
        Carrera newCarrera = new Carrera();


        newFacultad.setNombre("FIA");
        newFacultad.setDescripcion("Facultad de ingenieria y arquitectura");

        facultadDao.save(newFacultad);
        System.out.println("Facultad saved successfully!");

        newFacultad.setNombre("Facultad de marketing");
        facultadDao.update(newFacultad);

        /*facultadDao.getFacultad(newFacultad.getId());

        facultadDao.delete(newFacultad);

        newCarrera.setNombre("INGENIERIA EN SISTEMAS");
        carreraDao.save(newCarrera);
        newCarrera.setFacultad(newFacultad);

        newCarrera.setNombre("INGENIERIA CIVIL");
        carreraDao.update(newCarrera);
        carreraDao.getCarrera(newCarrera.getId());
        carreraDao.delete(newCarrera);*/

    }
}

