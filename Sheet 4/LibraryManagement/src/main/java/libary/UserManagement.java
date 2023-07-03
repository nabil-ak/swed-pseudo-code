package libary;

import java.util.ArrayList;
import java.util.Date;

public class UserManagement {

    private ArrayList<User> users = new ArrayList<>();

    public void registerUser(int id, String name, String email, String password){
        this.users.add(new Lender(id, name, email, password));
    };

    public boolean authenticateUser(String email, String password){
        for(User u: users) {
            if (u.email == email && u.password == password) {
                return true;
            }
        }
        return false;
    }
}
