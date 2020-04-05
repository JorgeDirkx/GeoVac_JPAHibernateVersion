package com.jorgedirkx;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ClientRepositoryImpl implements ClientRepository {


    private EntityManager em;

    @Override
    public Client getClientById(int id) {
        return em.find(Client.class,id);
    }

    @Override
    public Client getClientByName(String name) {
        TypedQuery<Client> q = em.createQuery("SELECT c FROM Client c WHERE c.name = :name", Client.class);
        q.setParameter("name", name);

        return q.getSingleResult();
    }

    @Override
    public Client saveClient(Client c) {
        //DOES NOT ACCEPT NULL with INT ?
        if (c.getId() == 0) {
            em.persist(c);
        } else {
            c = em.merge(c);
        }
        return c;
    }

    @Override
    public void deleteClient(Client c) {
        if (em.contains(c)) {
            em.remove(c);
        } else {
            em.merge(c);
        }

    }
}






