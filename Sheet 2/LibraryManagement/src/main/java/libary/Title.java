package libary;

import java.util.ArrayList;
import java.util.Date;

public class Title {
    private int id;
    private String name;
    private String ISBN;
    private String author;
    private Date release;
    private String publisher;
    private String topic;
    private int amountCopies;

    private ArrayList<Copy> copys = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>(); 

    public void addBook(Copy copy){
        this.copys.add(copy);
    };

    public void removeBook(Copy copy){
        this.copys.remove(copy);
    };
    public boolean checkAvailability(){};
    public boolean checkISBN(){};
    public void generateBibTeX(){};
}
