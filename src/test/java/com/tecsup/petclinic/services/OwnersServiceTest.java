package com.tecsup.petclinic.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.tecsup.petclinic.entities.Owners;
import com.tecsup.petclinic.repositories.PetRepository;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecsup.petclinic.entities.Pet;
import com.tecsup.petclinic.exception.PetNotFoundException;

import lombok.extern.slf4j.Slf4j;
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

	@Test
	public void testFindOwnerByLastName(){
		String LAST_NAME = "test";
		int SIZE_EXPECTED = 0;

		List<Owners> owners=this.ownerService.findByLastName(LAST_NAME);
		System.out.println(LAST_NAME);
        System.out.println(owners);

		assertEquals(SIZE_EXPECTED, owners.size());

	}
}
