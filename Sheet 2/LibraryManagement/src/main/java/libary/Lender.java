package libary;

import java.util.ArrayList;

public class Lender {
    private String matriculationNumber;
    private String name;
    private String email;
    private boolean activated;

    private ArrayList<Reservation> reservations = new ArrayList<>();
    private ArrayList<Rental> rentals = new ArrayList<>();


    public void activateLender(){
        this.activated = true;
    };
    public void deactivateLender(){
        this.activated = false;
    };

    public void deleteReservation(Reservation reservation){
        reservations.remove(reservation);
    };
    public void createReservation(Reservation reservation){
        this.reservations.add(reservation);
    };
}
