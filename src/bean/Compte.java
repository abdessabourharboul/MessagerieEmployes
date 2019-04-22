/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.swing.ImageIcon;

/**
 *
 * @author ayoub
 */
public class Compte {

    private String id;
    private String nom;
    private String password;
    private String prenom;
    private String adresse;
    private String role;
    private double telMob;
    private List<Message> messages = new ArrayList();
    private String confermationPassword;
    private String connexion;

    public String getConnexion() {
        return connexion;
    }

    public void setConnexion(String connexion) {
        this.connexion = connexion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getTelMob() {
        return telMob;
    }

    public void setTelMob(double telMob) {
        this.telMob = telMob;
    }

    public String getConfermationPassword() {
        return confermationPassword;
    }

    public void setConfermationPassword(String confermationPassword) {
        this.confermationPassword = confermationPassword;
    }

    public Compte(String id, String connexion, String nom, String password, String prenom, String adresse, String role, double telMob, String confermationPassword) {
        this.id = id;
        this.nom = nom;
        this.password = password;
        this.prenom = prenom;
        this.adresse = adresse;
        this.role = role;
        this.telMob = telMob;
        this.confermationPassword = confermationPassword;
        this.connexion = connexion;

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
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
        final Compte other = (Compte) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nom=" + nom + ", password=" + password + ", prenom=" + prenom + ", adresse=" + adresse + ", role=" + role + ", telMob=" + telMob + ", confermationPassword=" + confermationPassword + ",connection=" + connexion + '}';
    }

    public Compte() {
    }

    public Compte(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

}
