/**
 *
 */
package testes;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;

import persistencia.Dao;
import entidade.Pessoa;

/**
 * @author Izaquiel Cruz
 *
 */
@ManagedBean(name="teste")
@RequestScoped
public class ControlTest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Dao<Pessoa> dao;

	@PostConstruct
	public void init(){
		System.out.println("Contruindo");
	}
	
	Pessoa p = new Pessoa();

	public ControlTest() {
	}

	public String salvar() {
		dao.salvar(p);
		return "index.xhtml";
	}

	public Pessoa getP() {
		return p;
	}

	public void setP(Pessoa p) {
		this.p = p;
	}

	public Dao<Pessoa> getDao() {
		return dao;
	}
	
	@Autowired
	public void setDao(Dao<Pessoa> dao) {
		this.dao = dao;
	}
	
}
