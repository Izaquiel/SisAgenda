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
	
	@Autowired
	private Dao<Pessoa> DaoImpl;

	@PostConstruct
	public void init(){
		System.out.println("Contruindo");
	}
	
	Pessoa p = new Pessoa();

	public ControlTest() {
	}

	public String salvar() {
		DaoImpl.salvar(p);
		return "index.xhtml";
	}

	public Pessoa getP() {
		return p;
	}

	public void setP(Pessoa p) {
		this.p = p;
	}

	
	
}
