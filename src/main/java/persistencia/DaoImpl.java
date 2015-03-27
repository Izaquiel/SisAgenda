/**
 *
 */
package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Izaquiel Cruz
 *
 */
@Component
@Transactional
public class DaoImpl<T> implements Dao<T>{

	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void salvar(T entity) {
		em.persist(entity);		
	}


	@Override
	public List<T> listar() {
		return null;
	}

	@Override
	public T getPorId(Long id) throws NoResultException {
		return null;
	}	
	
}
