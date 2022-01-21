package com.classificado.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * Java - Doc
 * Classe Modelo para persistência no Banco de Dados.
 * 
 * <p>
 * - idUser: Chave primaria da tabela. Tipo Long
 * </p>
 * <p>
 * - name: Coluna nome da tabela tb_user. Tipo String
 * </p>
 * <p>
 * - name: Coluna nome da tabela tb_user. Tipo String
 * </p>
 * @author Gustavo Boaz
 * @author Paulo Francisco
 * @since 21/01/2022
 * @see UserRepository
 * @see UserController
 */

@Entity
@Table(name = "tb_users")
public class User {
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idUser;
	private String name;
	private @NotBlank @Email String email; //Aqui está um comentário
	private String password;
	private Long idade;
	
	
	public Long getIdUser() {
		return idUser;
	}
	
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
