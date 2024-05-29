package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owners;

import java.util.List;

public interface OwnerService {

    List<Owners> findByLastName(String lastName);

    List<Owners> findById(int id);

    Owners update(Owners owners);

    void delete(Integer id);


    List<Owners> findALl();

}
