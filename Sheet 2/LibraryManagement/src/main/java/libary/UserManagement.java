package libary;

import java.util.ArrayList;
import java.util.Date;

public class UserManagement {

    private ArrayList<Lender> users = new ArrayList<>();

    public void registerUser(Lender lender){
        this.users.add(lender);
    };
    public void deleteUser(Lender lender){
        this.users.remove(lender);
    };
}
