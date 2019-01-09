package dao;

import hibernateUtil.HibernateSessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.User;

import java.util.List;

public class userDao {
    public static List<User> getUsers(){
        Session session = HibernateSessionFactory.getInstance().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from User order by id desc");
        List<User> list = query.list();
        return list;
    }
}
