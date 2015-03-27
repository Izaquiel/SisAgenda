/**
 *
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Izaquiel Cruz
 *
 */
public class HibernateUtil {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("SisAgendaPU");
	
	/**
	 * 
	 */
	public HibernateUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public static EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
	
	
}
