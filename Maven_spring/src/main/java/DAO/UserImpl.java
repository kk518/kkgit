package DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository(value = "userimpl1")
public class UserImpl implements UserDAO {
    @Override
    public void add() {
        System.out.println("Dao.......");
    }
}
