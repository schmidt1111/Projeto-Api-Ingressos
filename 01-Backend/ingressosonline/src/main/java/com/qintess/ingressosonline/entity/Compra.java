package com.qintess.ingressosonline.entity;

//import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="compra")
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="compra_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "evento_id", nullable = false)
	private Evento evento;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;
	
	@Column(name="qtd")
	private int qtd;
	
	@Column(name="valor_unit")
	private double valorUnit;
	
	@Column(name="valor_total")
	private double valorTotal;
	
	@Column(name="date")
	private LocalDate date;
	
	/*public void setValorTotal(double valorUnitario, Integer qtd, double valorTotal) {
			this.valorTotal = valorTotal - (valorUnitario * qtd);
		}*/
	
	public Compra () {};
	
	public Compra(Evento evento, Usuario usuario, int qtd, double valorUnit, double valorTotal, LocalDate date) {
		super();
		this.evento = evento;
		this.usuario = usuario;
		this.qtd = qtd;
		this.valorUnit = valorUnit;
		this.valorTotal = valorTotal;
		this.date = date;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", evento=" + evento + ", usuario=" + usuario + ", qtd=" + qtd + ", valorUnit="
				+ valorUnit + ", valorTotal=" + valorTotal + ", date=" + date + "]";
	}

}
