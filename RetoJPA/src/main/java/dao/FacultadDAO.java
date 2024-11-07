package dao;

import interfaces.IFacultad;
import jakarta.persistence.EntityManager;
import models.Facultad;

import java.util.List;

public class FacultadDAO implements IFacultad {
    @Override
    public void save(Facultad facultad) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(facultad);
        em.getTransaction().commit();
    }

    @Override
    public Facultad getFacultad(Long id) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(Facultad.class, id);
    }

    @Override
    public void delete(Facultad facultad) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        Facultad bookToDelete = em.find(Facultad.class, facultad.getId());
        if (bookToDelete != null) {
            em.remove(bookToDelete);
        }
    }

    @Override
    public void update(Facultad facultad) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(facultad);
        em.getTransaction().commit();
    }

    @Override
    public List<Facultad> getFacultades() {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.createQuery("SELECT f FROM Facultad f", Facultad.class).getResultList();
    }
}
