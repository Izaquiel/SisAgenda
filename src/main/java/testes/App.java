/**
 *
 */
package testes;

import persistencia.Dao;
import entidade.Pessoa;

/**
 * @author Izaquiel Cruz
 *
 */
public class App {
	

	static Dao<Pessoa> dao;
	
	public static void main(String[] args) {
		
		
        Pessoa p = new Pessoa();
        p.setNome("Izaquiel");
        
        dao.salvar(p);
        
//        em.getTransaction().begin();
//        em.persist(p);
//        em.getTransaction().commit();
//        
	}

}
