package libary;

import java.util.ArrayList;

public class Lender {
    private String matriculationNumber;
    private String name;
    private String email;
    private boolean activated;


    public Lender(String matriculationNumber, String name, String email) {
        this.matriculationNumber = matriculationNumber;
        this.name = name;
        this.email = email;
        this.activated = true;
    }

    public void activateLender(){
        this.activated = true;
    };
    public void deactivateLender(){
        this.activated = false;
    };
}
