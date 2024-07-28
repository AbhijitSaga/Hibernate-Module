1. Configuration: "The Configuration class in Hibernate is used to set up the framework. It reads the hibernate.cfg.xml file to get the settings needed to create the SessionFactory

2.SessionFactory: The SessionFactory in Hibernate is a heavyweight, thread-safe object that is responsible for creating and managing Session instances. It is configured during the application's startup using configuration settings, typically from a hibernate.cfg.xml file. Given its high cost of creation, a SessionFactory is usually instantiated once and shared across the entire application to manage database connections efficiently.

3. Session: A Session in Hibernate represents a single-threaded unit of work that acts as a runtime interface between a Java application and the database. It provides methods for storing, updating, and retrieving objects.

4. Hibenate Lifecycle: A Session is created by the SessionFactory and is typically used for a single unit of work. It should be opened when needed and closed after the work is done.
            State Management: The Session manages the states of entities:

     Transient: An entity not associated with any Session and not saved in the database.
     Persistent: An entity associated with an open Session and saved in the database.
     Detached: An entity previously associated with a Session, but currently not.
     Transaction Management: A Session is used to begin, commit, and rollback transactions.


3. Hibernate Life Cycle-
Ans- (a)In Hibernate, an object can exist in three states: transient, persistent, and detached. These states define the relationship between the object and the database.
      * Transient State
        Definition: An object is in the transient state when it has been instantiated using the new operator but is not yet associated with a Hibernate session and has no representation in the database.
           Example: Song songObj = new Song();

     * Persistent State
      Definition: An object is in the persistent state when it is associated with a Hibernate session and its state is synchronized with the database.
                  Changes to the object are tracked and will be saved to the database when the session is commit or flushed.
       Example: session.save(songObj); or session.persist(songObj);
    
   * Detached State:
     Definition: An object is in the detached state when it was once associated with a Hibernate session but is no longer associated with any session. Hibernate does not track changes to the object.
     Example: After session.evict(songObj); or after the session is closed.


Transient State ------save(), persist(),  saveOrUpdate()---->    Persistent Stat ----- evict(), close() session------->  Detached State 


4. Hibernate Dirty Checking: 
Hibernate dirty checking is a mechanism that automatically detects changes made to persistent entities(SongObj) within a session. When an entity is loaded, Hibernate creates a snapshot of its initial state. If any property of the entity is modified, Hibernate marks it as "dirty".

How it works:

Entity loading: Hibernate creates a copy of the entity's state when it's loaded into the session.

Property modification: Any changes made to the entity's properties are tracked.

Flush operation: When the session is flushed or committed, Hibernate compares the current state with the original snapshot.

Update generation: If differences are found, Hibernate generates an SQL UPDATE statement.


