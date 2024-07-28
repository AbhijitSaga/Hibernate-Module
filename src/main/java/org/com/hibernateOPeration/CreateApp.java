package org.com.hibernateOPeration;


import org.com.entity.Song;
import org.com.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class CreateApp
{


    public static void main( String[] args ) throws Exception
    {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
          if(sessionFactory!=null) {
              //initialize the session object
              Session session = sessionFactory.openSession();

              //For every save or update operation, it is essential to begin a transaction before performing the operation and to commit the transaction after the operation to ensure data integrity
              session.beginTransaction();

              //Song object operation to save database
               //song object is in transient state
              Song song = new Song("sarki je sar se dhire dhire", "kumar sanu");
              // song object is now in persistent state
              session.save(song);
              session.getTransaction().commit();
              // song object is now in detached state
              session.close();
          }


    }


}
