package no.hvl.dat109.yatzy;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class YatzyDAO {

	@PersistenceContext(name = "yatzyPU")
	private EntityManager em;

	public List<Yatzy> finnAlleSpill() {
		return em.createQuery("SELECT y FROM yatzy y ORDER BY y.id ASC", Yatzy.class).getResultList();
	}

}
