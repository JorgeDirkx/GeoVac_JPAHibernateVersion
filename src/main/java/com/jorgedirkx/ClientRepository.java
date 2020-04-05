package com.jorgedirkx;

public interface ClientRepository {

    Client getClientById(int id);

    Client getClientByName(String name);

    Client saveClient(Client c);

    void deleteClient(Client c);
}

