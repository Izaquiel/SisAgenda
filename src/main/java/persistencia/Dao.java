/**
 *
 */
package persistencia;

import java.util.List;

import javax.persistence.NoResultException;

/**
 * @author Izaquiel Cruz
 *
 */
public interface Dao<T> {
	
	public void salvar(T entity);
	
	public List<T> listar();
	
	public T getPorId(Long id) throws NoResultException;
}
