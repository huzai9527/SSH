package hibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
    private final Configuration CONFIG;
    private final SessionFactory FACTORY;
    private static HibernateSessionFactory instance;
    public HibernateSessionFactory(){
        CONFIG = new Configuration().configure();
        FACTORY = CONFIG.buildSessionFactory();
    }
    public static HibernateSessionFactory getInstance(){
        if(instance==null)
            instance = new HibernateSessionFactory();
        return instance;
    }
    public Session getCurrentSession(){
        return FACTORY.openSession();
    }

}
