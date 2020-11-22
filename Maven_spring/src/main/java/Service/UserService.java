package Service;

import DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    @Qualifier(value = "userimpl1")
    private UserDAO userDAO;


    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

     public void add(){
        userDAO.add();
         System.out.println("userservice.....");
     }

}
