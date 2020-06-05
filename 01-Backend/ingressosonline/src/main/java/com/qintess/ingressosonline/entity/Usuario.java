package com.qintess.ingressosonline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usuario_id")
	private Long id;

	@Column(name="nome")
	private String nome;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="senha")
	private String senha;

	public Usuario () {};
	
	public Usuario(String nome, String cpf, String telefone, String email, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email
				+ ", senha=" + senha + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getCpf()=" + getCpf()
				+ ", getTelefone()=" + getTelefone() + ", getEmail()=" + getEmail() + ", getSenha()=" + getSenha()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
