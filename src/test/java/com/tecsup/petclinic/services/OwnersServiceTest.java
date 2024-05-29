package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owners;
import com.tecsup.petclinic.repositories.PetRepository;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecsup.petclinic.entities.Pet;
import com.tecsup.petclinic.exception.PetNotFoundException;

import lombok.extern.slf4j.Slf4j;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
public class OwnersServiceTest {

	@Autowired
	private OwnerService ownerService;

	/**
	 * 
	 */
	/*
	@Test
	public void testFindOwnerById() {

		long ID = 1;
		String NAME = "Jaime";
		Owner owner = null;
		
		try {
			
			owner = ownerService.findById(ID);
			
		} catch (OwnertNotFoundException e) {
			fail(e.getMessage());
		}
		log.info("" + owner);

		assertEquals(NAME, owner.getName());

	}
	*/

	//search by name
	@Test
	public void testFindOwnerByLastName(){
		String LAST_NAME = "Franklin";
		int SIZE_EXPECTED = 1;

		List<Owners> owners=this.ownerService.findByLastName(LAST_NAME);
		System.out.println(LAST_NAME);
        System.out.println(owners);

		assertEquals(SIZE_EXPECTED, owners.size());

	}

	//search by id
	@Test
	public void testFindOwnerById(){

		int TYPE_ID = 5;
		int SIZE_EXPECTED = 1;
		List<Owners>owners=this.ownerService.findById(TYPE_ID);
		for ( Owners owner:owners){
			System.out.println(owner.getFirstName());

		}

        System.out.println(owners);

		assertEquals(SIZE_EXPECTED,owners.size());


	}

	@Test
	public void testOwnersDelete(){
		   int OWNER_ID=2;
		   int SIZE_EXPECTED = 0;
		try{
			// Primero aseguramos que el dueño existe
			List<Owners> owner = this.ownerService.findById(OWNER_ID);
			System.out.println("owners01"+owner);

			// Ahora intentamos eliminar el dueño
			this.ownerService.delete(OWNER_ID);
			List<Owners> owners = this.ownerService.findById(OWNER_ID);
			System.out.println("owners02"+owners);

			assertEquals(SIZE_EXPECTED, owners.size());
		}catch  (EntityNotFoundException e) {
			// Maneja la excepción según sea necesario
			e.printStackTrace();
		}

    }

	@Test
	public  void testOwnersAll(){

		List<Owners> owners=this.ownerService.findALl();
		int dato=owners.size();
		System.out.println(dato);
		for(Owners owner:owners){
			System.out.println(owner.getFirstName());
		}
		System.out.println(owners);

	}


}
