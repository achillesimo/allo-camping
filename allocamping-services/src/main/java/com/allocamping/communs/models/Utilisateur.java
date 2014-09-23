package com.allocamping.communs.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity("utilisateur")
public class Utilisateur{
	@Id
	ObjectId id;
	String login;
	String email;
	String passwd;
	
	public Utilisateur(){}

	public Utilisateur(ObjectId id, String login, String email, String passwd) {
		super();
		this.id = id;
		this.login = login;
		this.email = email;
		this.passwd = passwd;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
}
