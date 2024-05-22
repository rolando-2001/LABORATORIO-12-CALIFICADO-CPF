package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Owners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends JpaRepository<Owners,Integer> {

     List<Owners> findByLastName(String lastName);


     List<Owners> findById(int id);
}
