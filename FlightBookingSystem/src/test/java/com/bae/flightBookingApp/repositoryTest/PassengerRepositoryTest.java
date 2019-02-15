package com.bae.flightBookingApp.repositoryTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.flightBookingApp.FlightBookingSystemApplication;
import com.bae.flightBookingApp.business.PassengerService;
import com.bae.flightBookingApp.persistence.domain.Passenger;
import com.bae.flightBookingApp.persistence.repository.PassengerRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = FlightBookingSystemApplication.class)
@DataJpaTest
public class PassengerRepositoryTest {
	
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private PassengerRepository Repo;
	

	
	@Test
	public void retrieveByIdTest() {
		Passenger model1 = new Passenger("Bruce Wayne");
		entityManager.persist(model1);
		entityManager.flush();
		assertTrue(Repo.findById(model1.getId()).isPresent());

	}


}
