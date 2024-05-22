package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owners;
import com.tecsup.petclinic.repositories.OwnerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OwnerServiceImpl implements OwnerService{


    OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository){
        this.ownerRepository=ownerRepository;
    }




    @Override
    public List<Owners> findByLastName(String lastName) {
        List<Owners> owners=ownerRepository.findByLastName(lastName);
        System.out.println(owners);
        owners.stream().forEach(owner -> log.info(""+owner));

        return owners;
    }
}
