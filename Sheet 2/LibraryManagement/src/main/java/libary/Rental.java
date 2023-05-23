package libary;

import java.util.ArrayList;
import java.util.Date;

public class Rental {
    private int id;
    private int duration;
    private Date startDate;
    private Date deadline;
    private Date returnDate;

    private Copy copy;
    private Lender lender;
    private Damage damage;


    public void notifyLender(){};

    public void createDamage(){
        this.damage = new Damage();
    };
    public void deleteDamage(){
        this.damage = null;
    };
}
