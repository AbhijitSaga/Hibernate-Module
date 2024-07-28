1. Hibernate Life Cycle-
Ans- (a)In Hibernate, an object can exist in three states: transient, persistent, and detached. These states define the relationship between the object and the database.
      * Transient State
        Definition: An object is in the transient state when it has been instantiated using the new operator but is not yet associated with a Hibernate session and has no representation in the database.
           Example: Employee emp = new Employee();

     * Persistent State
      Definition: An object is in the persistent state when it is associated with a Hibernate session and its state is synchronized with the database.
                  Changes to the object are tracked and will be saved to the database when the session is commit or flushed .
       Example: session.save(emp); or session.persist(emp);
    
   * Detached State:
     Definition: An object is in the detached state when it was once associated with a Hibernate session but is no longer associated with any session. Hibernate does not track changes to the object.
     Example: After session.evict(emp); or after the session is closed.

   +-------------------+                      
   |  Transient State  |                       
   |                   |                                          
   +-------------------+                       
            |                                           
            | save(), persist(), or                     
            | saveOrUpdate()                            
            V                                           
   +-------------------+                                  +---------------------+
   |  Persistent State |                                  |  Detached State     |
   |                   | --- evict(), close() session-->  |                     |
   +-------------------+                                  +---------------------+
            |
            | delete()
            |
		  
   +-------------------+
   |  Removed State    |
   |                   |
   +-------------------+
