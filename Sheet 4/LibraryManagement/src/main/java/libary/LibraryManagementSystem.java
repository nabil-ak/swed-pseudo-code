package libary;


import java.util.ArrayList;
import java.util.Date;

public class LibraryManagementSystem {

    private Catalogue catalogue;
    private RentalManagement rentalmanagment;
    private UserManagement usermanagment;

    private SearchAdapter searchAdapter;

    public ArrayList<Title> searchBookButtonClicked(String name){
        return searchAdapter.searchBook(name);
    };

    public ArrayList<Copy> checkAvailabilityButtonClicked(Title title){
        return title.checkAvailability();
    };

    public void deactivateUserButtonClicked(User user){
        user.deactivateUser();
    };

    public void rentBookButtonClicked(int id, int duration, Date startDate, Date deadline, Date returnDate, Copy copy, Lender lender){
        rentalmanagment.rentBook(id, duration, startDate, deadline, returnDate, copy, lender);
    };

    public void returnBookButtonClicked(int id){
        rentalmanagment.returnBook(id);
    };

    public void addBookButtonClicked(int id, int shelf, String status, String condition, Title title){
        title.addCopy(id, shelf, status, condition);
    };

    public void createBookButtonClicked(int id, String name, String ISBN, String author, Date release, String publisher, String topic, int amountCopies){
        catalogue.createBook(id, name, ISBN, author, release, publisher, topic, amountCopies);
    };

    public boolean checkISBNButtonClicked(String isbn){
        catalogue.checkISBN(isbn);
    };

    public void registerUserButtonClicked(int id, String name, String email, String password){
        usermanagment.registerUser(id, name, email, password);
    };

    public void generateBibTexButtonClicked(Title title){
        title.generateBibTeX();
    };

    public void removeBookButtonClicked(int id){
        catalogue.removeBook(id);
    };

    public boolean checkBookAvailabilityButtonClicked(String name){
        return catalogue.checkBookAvailability(name);
    };

    public boolean authenticateUserButtonClicked(String email, String password){
        return usermanagment.authenticateUser(email, password);
    };

    public void extendRentalButtonClicked(Rental rental, Date newDeadline){
        rental.extendRental(newDeadline);
    };

    public void findBookLocationButtonClicked(Title title, int copyID){
        return title.searchCopy(copyID).shelf;
    };

    public ArrayList<Rental> reportBookRentalHistoryClicked(int copyID, Date from, Date to){
        return rentalmanagment.reportBookRentalHistory(copyID, from, to);
    };

    public ArrayList<Rental> reportLenderRentalHistoryClicked(int lenderID, Date from, Date to){
        return rentalmanagment.reportLenderRentalHistory(lenderID, from, to);
    };

    public void reserveBookClicked(int id, Date createDate, String status, Title title, Lender lender){
        rentalmanagment.createReservation(id, createDate, status, title, lender);
    };
}
