package onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone.dao.AadharCardDao;
import onetoone.dao.PersonDao;
import onetoone.dto.AadharCard;
import onetoone.dto.Person;

public class PersonAadharMain {

	public static void main(String[] args) {

		AadharCard aadharCard = new AadharCard();
		aadharCard.setId(500);
		aadharCard.setName("Munde");
		aadharCard.setAge(24);

		Person person = new Person();
		person.setId(5);
		person.setName("Munde");
		person.setAddress("parli");

		//dont save here save when aadhar card is saved
		//person.setAadharCard(aadharCard);

//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		Person dbperson = entityManager.find(Person.class, 5);
//		entityTransaction.begin();
//		entityManager.remove(dbperson);
//		entityTransaction.commit();

		// use for cascade for all

//		PersonDao personDao = new PersonDao();
//		personDao.savePerson(person);
		
		AadharCardDao aadharCardDao = new AadharCardDao();
		aadharCardDao.saveAadharCard(5, aadharCard);

		// add both simultaneously without cascade either person first or aadhaar first doesnt make any sense 

//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
//		entityManager.persist(person);
//		entityManager.persist(aadharCard);
//		entityTransaction.commit();

		// add person and then aadhaar card one after other

//		Person person = new Person();
//		person.setId(4);
//		person.setName("Ashok");
//		person.setAddress("Ambajogai");
//	
//		PersonDao personDao = new PersonDao();
//		personDao.savePerson(person);

//		AadharCard aadharCard = new AadharCard();
//		aadharCard.setId(400);
//		aadharCard.setName("Vedant");
//		aadharCard.setAge(25);
//		
//		AadharCardDao aadharCardDao = new AadharCardDao();
//		aadharCardDao.saveAadharCard(4, aadharCard);

		// Find

//		PersonDao personDao = new PersonDao();
//		personDao.findperson(3);

//		AadharCardDao aadharCardDao = new AadharCardDao();
//		aadharCardDao.findAadharCard(100);

		// delete Aadhar
		
		
		// to delete aadhaar first we need to delete person then only we can delete aadhaar bcz non wowning side



//		PersonDao personDao = new PersonDao();
//		personDao.deleteperson(5);
		
//		AadharCardDao aadharCardDao = new AadharCardDao();
//		aadharCardDao.deleteAadharCard(500);

		// update aadharcard

//		AadharCard aadharCard = new AadharCard();
//		aadharCard.setName("Ashok");
//		aadharCard.setAge(25);
//		
//		AadharCardDao aadharCardDao = new AadharCardDao();
//		aadharCardDao.updateAadharCard(300, aadharCard);

		// update Person

//		Person person = new Person();
//		person.setName("Mangesh");
//		person.setAddress("sonhivra");
//		
//		PersonDao personDao = new PersonDao();
//		personDao.updatePerson(3, person);

		// find person by name other than primary key

//		PersonDao  personDao = new PersonDao();
//		personDao.findpersonbyname("Rohan");

	}

}
