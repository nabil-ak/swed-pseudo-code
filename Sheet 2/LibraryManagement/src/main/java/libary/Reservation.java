package libary;

import java.util.Date;

public class Reservation {
    private int id;
    private Date createDate;
    private String status;

    private Title title;

    public boolean checkCopy(){
        return this.title.checkAvailability();
    };

}
