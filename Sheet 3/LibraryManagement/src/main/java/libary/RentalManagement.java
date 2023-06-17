package libary;

import java.util.ArrayList;
import java.util.Date;

public class RentalManagement {

    private ArrayList<Rental> rentals = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void rentBook(int id, int duration, Date startDate, Date deadline, Date returnDate, Copy copy, Lender lender){
        this.rentals.add(new Rental(id, duration, startDate, deadline, returnDate, copy, lender));
    };
    public void returnBook(int id){
        for(Rental r: rentals){
            if(r.id == id){
                r.returnDate = new Date();
            }
        }
    };

    public void deleteReservation(int id){
        for(Reservation r: reservations){
            if(r.id == id){
                reservations.remove(r);
            }
        }
    };
    public void createReservation(int id, Date createDate, String status, Title title, Lender lender){
        this.reservations.add(new Reservation(id, createDate, status, title, lender));
    };

    public ArrayList<Rental> reportBookRentalHistory(int copyID, Date from, Date to){
        ArrayList<Rental> rentalsfiltered = new ArrayList<>();
        for(Rental r: rentals){
            if(r.copy.id == copyID && r.startDate.after(from) && r.startDate.before(to)){
                rentalsfiltered.add(r);
            }
        }
        return  rentalsfiltered;
    }

    public ArrayList<Rental> reportLenderRentalHistory(int lenderID, Date from, Date to){
        ArrayList<Rental> rentalsfiltered = new ArrayList<>();
        for(Rental r: rentals){
            if(r.lender.id == lenderID && r.startDate.after(from) && r.startDate.before(to)){
                rentalsfiltered.add(r);
            }
        }
        return  rentalsfiltered;
    }

}
