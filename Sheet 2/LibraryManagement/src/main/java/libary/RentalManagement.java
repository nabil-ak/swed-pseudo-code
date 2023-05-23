package libary;

import java.util.ArrayList;
import java.util.Date;

public class RentalManagement {

    private ArrayList<Rental> rentals = new ArrayList<>();

    public void rentBook(Rental rental){
        this.rentals.add(rental);
    };
    public void returnBook(Rental rental){
        this.rentals.remove(rental);
    };

}
