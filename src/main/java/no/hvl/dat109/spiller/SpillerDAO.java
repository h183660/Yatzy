package no.hvl.dat109.spiller;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SpillerDAO {
	
	@PersistenceContext(name = "yatzyPU")
	private EntityManager em;

	public Spiller finnMedBrukernavn(String brukernavn) {
		return em.find(Spiller.class, brukernavn);
	}
	
	public boolean erRegistrert(String brukernavn) {
		return finnMedBrukernavn(brukernavn) != null;
	}

	public List<Spiller> finnAlleEtterBrukernavn(){
		return em.createQuery("SELECT d FROM Spiller d ORDER BY d.brukernavn ASC", Spiller.class).getResultList();
	}

	public void lagre(Spiller spiller) {
		em.persist(spiller);
	}
	
	public void slett(Spiller spiller) {
		em.remove(spiller);
	}
}