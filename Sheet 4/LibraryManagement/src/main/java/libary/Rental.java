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

    public Rental(int id, int duration, Date startDate, Date deadline, Date returnDate, Copy copy, Lender lender) {
        this.id = id;
        this.duration = duration;
        this.startDate = startDate;
        this.deadline = deadline;
        this.returnDate = returnDate;
        this.copy = copy;
        this.lender = lender;
        this.damage = null;
    }

    public void notifyLender(){};

    public void createDamage(int id, Date createDate, String description, double fees){
        this.damage = new Damage(id, createDate, description, fees);
    };
    public void deleteDamage(){
        this.damage = null;
    };

    public void extendRental(Date newDeadline){
        this.deadline = newDeadline;
    }
}
