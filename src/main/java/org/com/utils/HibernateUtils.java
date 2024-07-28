package org.com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory=null;
    public static SessionFactory getSessionFactory() {
        try {
        if(sessionFactory==null) {

            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
        }
        }catch (Exception ex){
           ex.getStackTrace();
           System.out.println(ex);
        }
        return sessionFactory;
    }
}
