package org.com.hibernateOPeration;

import org.com.entity.Song;
import org.com.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteApp {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        if(sessionFactory!=null) {
            Session session = sessionFactory.openSession();

            session.beginTransaction();
            //Song Delete Operation

            Song song = session.get(Song.class, 4);
            //An object is in the removed state when it has been marked for deletion from the database.
            session.delete(song);
            session.getTransaction().commit();

            session.close();

        }

    }




}
