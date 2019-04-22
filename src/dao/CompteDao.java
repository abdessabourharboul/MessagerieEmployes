/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Compte;

/**
 *
 * @author ayoub
 */

    public class CompteDao extends AbstractDao<Compte>{

    public CompteDao() {
        super(Compte.class);
    }
    
    
    public int  updatee (Compte Compte) throws Exception{
    
        return update(Compte);
    
    
    }
    }

