package libary;

import java.util.ArrayList;

public class Lender extends User{
    private int id;


    public Lender(int id, String name, String email, String password) {
        super(name, email, password);
        this.id = id;
    }

}
