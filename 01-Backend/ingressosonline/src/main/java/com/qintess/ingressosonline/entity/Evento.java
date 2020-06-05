package com.qintess.ingressosonline.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

//@AllArgsConstructor   //cria automaticamente um construtor com todas os atributos da classe como argumento
//@NoArgsConstructor   //cria automaticamente um construtor vazeio (sem argumentos)
//@Data                //cria automaticamente os métodos to String, equals, hasCode, getters e setters
@Entity
@Table(name="evento")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="evento_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "casa_show_id", nullable = false)
	private Casashow casaShow;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="ingresso_total")
	private Integer ingressoTotal;

	@Column (name = "data")
	private LocalDate data;

	public Evento () {};
	
	public Evento(Casashow casaShow, String nome, String descricao, Integer ingressoTotal, LocalDate data) {
		this.casaShow = casaShow;
		this.nome = nome;
		this.descricao = descricao;
		this.ingressoTotal = ingressoTotal;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Casashow getCasaShow() {
		return casaShow;
	}

	public void setCasaShow(Casashow casaShow) {
		this.casaShow = casaShow;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getIngressoTotal() {
		return ingressoTotal;
	}

	public void setIngressoTotal(Integer ingressoTotal) {
		this.ingressoTotal = ingressoTotal;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", casaShow=" + casaShow + ", nome=" + nome + ", descricao=" + descricao
				+ ", ingressoTotal=" + ingressoTotal + ", data=" + data + "]";
	}
	
	
	//passei o metodo para o service
	/*public void setIngressoTotal(Integer qtd, Integer ingressoTotal) {
		if (qtd <= 4) {
		this.ingressoTotal = ingressoTotal - qtd;
		} else {
			System.out.println("Cada usuário pode comprar até 4 ingressos");
		} */
	}
	
