package com.jorgedirkx.application;

import com.jorgedirkx.entities.Client;
import com.jorgedirkx.entities.Location;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        //setting up the EntityManagerFactory to connect with DB
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("geovac_db");
        //EntityManager allows you to work with the DB
        EntityManager em = emf.createEntityManager();

        //turn class into entities: use annotations @entity in order to use .persist and @Id for primarykey
        Client client1 = new Client();
        client1.setName("test person 10");
        client1.setGender("female");

        Location location1 = new Location();
        location1.setLocation("city test, country test");

        location1.setClient(client1);


        EntityTransaction et = em.getTransaction();

        et.begin();

        //instructions to the DB:

        //INSERT records
        em.persist(client1);
        em.persist(location1);

        //UPDATE records
        /*em.merge(client1); or through find method + eg setClient...*/

        //DELETE records
        /*Client client1 = em.find(Client.class, primaryKey:4);
         em.remove(client1) */

        et.commit();

        //FINDING A CLIENT WITH LOCATION ID PRINT OUT
        Integer primaryKey =5;
        Location location= em.find(Location.class, primaryKey);
        System.out.println(location);
        
        em.close();
        emf.close();


    }
}





