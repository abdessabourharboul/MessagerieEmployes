/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author ayoub
 */
public class Message {

    private int id;
    private String corps;
    private Compte compte = new Compte();
    private String idEmetteur;
    private String etatLecture;

    public String getEtatLecture() {
        return etatLecture;
    }

    public void setEtatLecture(String etatLecture) {
        this.etatLecture = etatLecture;
    }

    @Override
    public String toString() {
        return "Message{" + "id=" + id + ", corps=" + corps + ", idEmetteur=" + idEmetteur + ", etatLecture=" + etatLecture + '}';
    }

   

    public String getIdEmetteur() {
        return idEmetteur;
    }

    public void setIdEmetteur(String idEmetteur) {
        this.idEmetteur = idEmetteur;
    }

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public Message(int id, String corps,String idEmetteur ,String etatLecture) {
        this.id = id;
        this.corps = corps;
        this.idEmetteur = idEmetteur;
        this.etatLecture = etatLecture;
    }

    public Message(int id) {
        this.id = id;
    }

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    
    

}
