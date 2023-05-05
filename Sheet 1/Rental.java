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

    public void startRent();
    public void returnCopy();
    public double calculateFee();
    public void notifyLender();
}
