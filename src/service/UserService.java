/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import bean.User;
import dao.AbstractDao;
import dao.UserDao;
import java.util.List;

/**
 *
 * @author ayoub
 */
public class UserService extends AbstractDao<User> {

    CompteService compteService = new CompteService();
    UserDao userDao = new UserDao();
    public List<Compte> findAll;

    public UserService() {
        super(User.class);
    }

    public int save(User t) throws Exception {
        return userDao.save(t);
    }

    public User seConnecter(User user) throws Exception {
        User loadedUser = findById(user.getId());
        if (loadedUser == null) {
            return null;
        }
        if (!loadedUser.getPasword().equals(user.getPasword())) {
            return null;
        }
        loadedUser.setCompte(compteService.findById(loadedUser.getCompte().getId()));
        return loadedUser;
    }
}
