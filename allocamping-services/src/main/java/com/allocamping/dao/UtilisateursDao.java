package com.allocamping.dao;

import java.net.UnknownHostException;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.allocamping.communs.models.Utilisateur;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class UtilisateursDao {
	public void addUser(Utilisateur utilisateur) {
		
		Mongo mongo = null;
		try {
			mongo = new MongoClient();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		Morphia morphia = new Morphia();
		morphia.map(Utilisateur.class);
		Datastore ds = morphia.createDatastore(mongo, "allocamping");
		
		ds.save(utilisateur);
	}
}
