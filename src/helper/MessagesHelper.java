/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Compte;
import bean.Message;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author moulaYounes
 */
public class MessagesHelper extends AbstractHelper<Message> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{new AbstractHelperItem("Emetteur", "idEmetteur"),
            new AbstractHelperItem("Contenue", "corps"), new AbstractHelperItem("Etat Lecture", "etatLecture")};
    }

    public MessagesHelper(JTable jTable, List<Message> list) {
        super(titres, jTable, list);
    }

    public MessagesHelper(JTable jTable) {
        super(titres, jTable);

    }

}
