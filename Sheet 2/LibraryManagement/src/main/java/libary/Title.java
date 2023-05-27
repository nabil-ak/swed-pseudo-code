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

    private ArrayList<Copy> copys;


    public Title(int id, String name, String ISBN, String author, Date release, String publisher, String topic, int amountCopies) {
        this.id = id;
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
        this.release = release;
        this.publisher = publisher;
        this.topic = topic;
        this.amountCopies = amountCopies;
        this.copys = new ArrayList<>();
    }

    public void addCopy(int id, int shelf, String status, String condition){
        this.copys.add(new Copy(id, shelf, status, condition));
    };

    public void removeCopy(int id){
        for (Copy c: copys){
            if(c.id == id){
                this.copys.remove(c);
            }
        }
    };
    public Copy checkAvailability(){};

    public void generateBibTeX(){};
}
