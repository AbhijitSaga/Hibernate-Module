package org.com.hibernateOPeration;

import org.com.entity.Song;
import org.com.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        if(sessionFactory!=null) {
        Session session=sessionFactory.openSession();
        Song song=    session.get(Song.class,1);


        System.out.println("Song: "+song);
        }
    }




}
