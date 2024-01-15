package onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone.dto.AadharCard;
import onetoone.dto.Person;

public class AadharCardDao {

	public EntityManager getenEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void saveAadharCard(int personId, AadharCard aadharCard) {
		EntityManager entityManager = getenEntityManager();
		Person dbPerson = entityManager.find(Person.class, personId);

		if (dbPerson != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(aadharCard);
			dbPerson.setAadharCard(aadharCard);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry Id Doesnt Exist");
		}
	}

	public void findAadharCard(int id) {
		EntityManager entityManager = getenEntityManager();
		AadharCard dbAadharCard = entityManager.find(AadharCard.class, id);

		if (dbAadharCard != null) {
			System.out.println(dbAadharCard);
		} else {
			System.out.println("Id is not present");
		}
	}

	public void deleteAadharCard(int id) {
		EntityManager entityManager = getenEntityManager();
		AadharCard dbAadharCard = entityManager.find(AadharCard.class, id);
		if (dbAadharCard != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbAadharCard);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry Id not present ");
		}
	}

	public void updateAadharCard(int id, AadharCard aadharCard) {
		EntityManager entityManager = getenEntityManager();
		AadharCard dbAadharCard = entityManager.find(AadharCard.class, id);

		if (dbAadharCard != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			aadharCard.setId(id);
			entityManager.merge(aadharCard);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry Id not present so cant update");
		}
	}

}
