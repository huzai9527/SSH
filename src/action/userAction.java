package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.userDao;
import hibernateUtil.HibernateSessionFactory;
import pojo.User;

import java.util.List;

public class userAction extends ActionSupport {
    private User user;
    private List<User> users;
    public String execute(){
        users = userDao.getUsers();
        return SUCCESS;
    }
    public User getUser() {
        return user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
