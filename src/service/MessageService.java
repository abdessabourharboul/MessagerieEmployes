/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import bean.Message;
import dao.AbstractDao;
import dao.MessageDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ayoub
 */
public class MessageService extends AbstractDao<Message> {

    MessageDao messageDao = new MessageDao();

    public MessageService() {
        super(Message.class);
    }

    public int deleteMessage(Message message) throws Exception {
        String requette = "delete from message where id ='" + message.getId() + "'";
        messageDao.execUpdate(requette);
        delete(message);
        return 1;
    }

    public List<Message> findByQuery(String LU) throws Exception {
        String requtte = "SELECT * FROM message WHERE 1=1";

        if (LU != null) {
            requtte += " AND  etatLecture LIKE '%" + LU + "%'";
        }
        return load(requtte);

    }

    public int NombreMessagesNonLus(String idCompte) throws Exception {

        List<Message> messages = new ArrayList<>();
        String requette = "SELECT * FROM message WHERE etatLecture LIKE 'Non lu' and compte='" + idCompte + "' ";
        messages = messageDao.load(requette);
        int c = 0;
        for (int i = 0; i < messages.size(); i++) {
//            Message get = messages.get(i);
            c = c + 1;

        }

        return c;

    }

}
