package libary;

import java.util.Date;

public class Reservation {
    private int id;
    private Date createDate;
    private String status;

    private Title title;
    private Lender lender;

    public Reservation(int id, Date createDate, String status, Title title, Lender lender) {
        this.id = id;
        this.createDate = createDate;
        this.status = status;
        this.title = title;
        this.lender = lender;
    }

    public boolean checkCopy(){
        return this.title.checkAvailability();
    };

}
