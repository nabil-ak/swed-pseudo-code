package libary;

import java.util.ArrayList;
import java.util.Date;

public class UserManagement {

    private ArrayList<Lender> users = new ArrayList<>();

    public void registerUser(String matriculationNumber, String name, String email){
        this.users.add(new Lender(matriculationNumber, name, email));
    };
}
