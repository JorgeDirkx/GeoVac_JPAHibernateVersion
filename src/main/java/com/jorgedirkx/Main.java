package com.jorgedirkx;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        //setting up the EntityManagerFactory to connect with DB
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("geovac_db");
        EntityManager em = emf.createEntityManager();

        Client client = new Client();
        client.setName("testwithrepositoryperson");

        //create our repositories
        ClientRepositoryImpl clientRepository = new ClientRepositoryImpl(em);

        clientRepository.saveClient(client);

        //use of implementations




        /*//entities
        Client client1 = new Client();
        client1.setName("test person");
        client1.setGender("male");

        Location location1 = new Location();
        location1.setLocation("city x, country y");

        location1.setClient(client1);


        EntityTransaction et = em.getTransaction();

        et.begin();

        //instructions to the DB

        em.persist(client1);
        em.persist(location1);

        et.commit();

        em.close();
        emf.close();
/*
        //FINDING A CLIENT WITH LOCATION ID PRINT OUT
        Integer primaryKey =5;
        Location location= em.find(Location.class, primaryKey);
        System.out.println(location);
*/

    }
}





