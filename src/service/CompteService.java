/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import bean.Message;
import dao.AbstractDao;
import dao.ConnectDB;
import util.DaoEngigne;
import dao.CompteDao;
import java.util.List;

/**
 *
 * @author ayoub
 */
public class CompteService extends AbstractDao<Compte> {

    

    CompteDao compteDao = new CompteDao();

    public CompteService() {
        super(Compte.class);
    }
    
    public List<Compte> findByQuery1(String idCompte) throws Exception {
        String requtte = "SELECT * FROM compte WHERE 1=1";

        if (idCompte != null) {
            requtte += " AND id LIKE '%" + idCompte + "%'";
        }
        return load(requtte);
    }

    public int save(Compte t) throws Exception {

        return compteDao.save(t);
    }

    public void update(String requette) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deconnexion(Compte compte, List<Compte> comptes) {
        for (int i = 0; i < comptes.size(); i++) {
            if (compte.getId().equals(comptes.get(i).getId()));
            comptes.get(i).setConnexion("horsligne");
        }

    }

    public void connexion(Compte compte, List<Compte> comptes) {
        for (int i = 0; i < comptes.size(); i++) {
            if (compte.getId().equals(comptes.get(i).getId()));
            comptes.get(i).setConnexion("enligne");
        }

    }

}
