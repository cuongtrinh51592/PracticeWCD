package com.demo.TRINHCAOCUONG.dao;

import com.demo.TRINHCAOCUONG.entity.PhoneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PhoneDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public void insertPhone(PhoneEntity p) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }

    public void updatePhone(int id, PhoneEntity updatePhone){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        PhoneEntity p = em.find(PhoneEntity.class, id);
        if (p != null) {
            p.setName(updatePhone.getName());
            p.setBrand(updatePhone.getBrand());
            p.setPrice(updatePhone.getPrice());
            p.setDescription(updatePhone.getDescription());
            em.getTransaction().commit();
        }
        em.close();
    }

    public void deleteBook(int id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        PhoneEntity p = em.find(PhoneEntity.class, id);
        if (p != null) {
            em.remove(p);
            em.getTransaction().commit();
        }
        em.close();
    }

    public List<PhoneEntity> getAll() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<PhoneEntity> list = em.createQuery("select p from PhoneEntity p", PhoneEntity.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public PhoneEntity findBookByID(int id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        PhoneEntity phoneEntity = em.createQuery("select p from PhoneEntity p where p.id = "+id, PhoneEntity.class).getSingleResult();
        em.getTransaction().commit();
        em.close();
        return phoneEntity;
    }
}
