package org.com.hibernateOPeration;

import org.com.entity.Song;
import org.com.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        if(sessionFactory!=null) {
            Session session = sessionFactory.openSession();

            Transaction transaction = session.beginTransaction();
            // Song update operation
            Song song = session.get(Song.class, 1);
            song.setSongName("KAL HO NA Ho -UPDATED2");

            //session.update(song);

            transaction.commit();
            session.close();
        }
    }


}
