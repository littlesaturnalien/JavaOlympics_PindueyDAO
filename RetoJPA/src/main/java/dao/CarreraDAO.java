package dao;

import interfaces.ICarrera;
import jakarta.persistence.EntityManager;
import models.Carrera;

import java.util.List;

public class CarreraDAO implements ICarrera {
    @Override
    public void save(Carrera carrera) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(carrera);
        em.getTransaction().commit();
    }

    @Override
    public Carrera getCarrera(Long id) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(Carrera.class, id);
    }

    @Override
    public void delete(Carrera carrera  ) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        Carrera bookToDelete = em.find(Carrera.class, carrera.getId());
        if (bookToDelete != null) {
            em.remove(bookToDelete);
        }
    }

    @Override
    public void update(Carrera carrera) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(carrera);
        em.getTransaction().commit();
    }

    @Override
    public List<Carrera> getCarreras() {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.createQuery("SELECT c FROM Carrera c", Carrera.class).getResultList();
    }
}
