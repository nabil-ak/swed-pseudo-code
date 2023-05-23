package libary;

import java.util.ArrayList;

public class Catalogue{
    private int amountBooks;

    private ArrayList<Title> inventory = new ArrayList<>();
    private ArrayList<Title> acquisition = new ArrayList<>();
    private ArrayList<Title> abolition = new ArrayList<>();


    public void checkAcquisition(){/*logic for checking if new book schould be buyed*/};
    public void checkAbolition(){/*logic for checking if a book schould be thrown away*/};
    public Title searchBook(String name){}
    public void createBook(Title title){
        this.inventory.add(title);
    };
    public void deleteBook(Title title){
        this.inventory.remove(title);
    };
}