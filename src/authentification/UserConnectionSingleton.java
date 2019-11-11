package authentification;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * Singleton Class which servers as an interface to the Database with User rights
 * @Author: Gheorghe Mironica
 */
public class UserConnectionSingleton {
    private static EntityManagerFactory factory;
    private static UserConnectionSingleton ourInstance = new UserConnectionSingleton();
    private static EntityManager em;
    private final String PERSISTENCE_UNIT_NAME = "User";

    public static UserConnectionSingleton getInstance() {
        return ourInstance;
    }

    /**
     * Method that returns an instance to this class
     */
    private UserConnectionSingleton() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();

    }
    // fetch ze manager
    /**
     * Method that returns an instance to an associated with a persistence context. It is used to create, remove, update, find entities.
     */
    public EntityManager getManager(){
        return em;
    }
}
