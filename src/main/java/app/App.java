package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Address;
import model.Contact;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;

		try {
			emf = Persistence.createEntityManagerFactory("td-jpa");
			em = emf.createEntityManager();
			Contact contact = new Contact("John");
			em.getTransaction().begin(); // transaction nécessaire, ne marche pas sans
			em.persist(contact);

			// récupérer et affiche contact id=2 (pas forcément dans une transaction)
			// Contact contact2 = em.find(Contact.class, 2l);
			// System.out.println(contact2);

			// modifier contact2 (doit être dans une transaction)
			// contact2.setBirth(new Date());
			// em.merge(contact2);

			// supprimer contact3
			// Contact contact3 = em.find(Contact.class, 3l);
			// em.remove(contact3);

			// ajout d'un contact avec adresse
			Contact cAd = new Contact("jbm with address");
			Address address = new Address("3bis", "rue des Roses", "44400", "Nantes");
			cAd.setMainAddress(address);

			em.persist(cAd);

			em.getTransaction().commit();

			// récupérer les contacts de la base
			TypedQuery<Contact> query = em.createQuery("from Contact", Contact.class);
			// from Contact -> nom de l'entité => nom de la classe et non pas de la table
			List<Contact> list = query.getResultList();

			for (Contact c : list) {
				System.out.println(c);
			}

		} finally {
			if (emf != null) {
				emf.close();
			}
			if (em != null) {
				em.close();
			}
		}

	}

}
