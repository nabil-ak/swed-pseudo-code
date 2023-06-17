package libary;

import java.util.ArrayList;
import java.util.Date;

public class Catalogue{
    private int amountBooks;

    private ArrayList<Title> inventory = new ArrayList<>();
    private ArrayList<Title> acquisition = new ArrayList<>();
    private ArrayList<Title> abolition = new ArrayList<>();


    public void checkAcquisition(){/*logic for checking if new book schould be buyed*/};
    public void checkAbolition(){/*logic for checking if a book schould be thrown away*/};
    public ArrayList<Title> searchBook(String name){}
    public void createBook(int id, String name, String ISBN, String author, Date release, String publisher, String topic, int amountCopies){
        this.inventory.add(new Title(id, name, ISBN, author, release, publisher, topic, amountCopies));
    };

    public void removeBook(int id){
        for (Title t: this.inventory){
            if(t.id == id){
                this.inventory.remove(t);
            }
        }
    }

    public boolean checkBookAvailability(String name){
        return this.searchBook(name).size() != 0;
    }

    public boolean checkISBN(String isbn){};
}