package libary;

import java.util.Date;

public class Damage{
    private int id;
    private Date createDate;
    private String description;
    private double fees;

    public Damage(int id, Date createDate, String description, double fees) {
        this.id = id;
        this.createDate = createDate;
        this.description = description;
        this.fees = fees;
    }

    public void calculateFees(){};

}