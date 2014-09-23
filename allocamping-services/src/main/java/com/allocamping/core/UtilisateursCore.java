package com.allocamping.core;

import com.allocamping.communs.models.Utilisateur;
import com.allocamping.dao.UtilisateursDao;

public class UtilisateursCore {
	UtilisateursDao userDao = new UtilisateursDao();
	public void addUser(Utilisateur utilisateur) {
		userDao.addUser(utilisateur);

	}
}
