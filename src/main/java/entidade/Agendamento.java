/**
 *
 */
package entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import enums.Status;

/**
 * @author Izaquiel Cruz
 *
 */
@Entity
public class Agendamento implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	private Pessoa pessoa;
	
	@OneToOne(cascade=CascadeType.MERGE)
	private Compromisso compromisso;
	
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@Temporal(TemporalType.TIME)
	private Date horaCadastro;
	
	@Temporal(TemporalType.DATE)
	private Date dataExecucao;
	
	@Temporal(TemporalType.TIME)
	private Date horaExecucao;
	
	@Enumerated(EnumType.STRING)
	private Status status;

	public Agendamento() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Compromisso getCompromisso() {
		return compromisso;
	}

	public void setCompromisso(Compromisso compromisso) {
		this.compromisso = compromisso;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getHoraCadastro() {
		return horaCadastro;
	}

	public void setHoraCadastro(Date horaCadastro) {
		this.horaCadastro = horaCadastro;
	}

	public Date getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(Date dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	public Date getHoraExecucao() {
		return horaExecucao;
	}

	public void setHoraExecucao(Date horaExecucao) {
		this.horaExecucao = horaExecucao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
