package com.allocamping.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.allocamping.communs.models.Utilisateur;
import com.allocamping.core.UtilisateursCore;



@Path("/utilisateurs")
public class UtilisateursServices {
	UtilisateursCore userCore = new UtilisateursCore();
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addUser(Utilisateur utilisateur) {
		userCore.addUser(utilisateur);

	}
	
	@GET
	public String getAdherents() {
		// TODO Auto-generated method stub
		return "OK";
	}
}
