public class BookInventory{
    private int amountBooks;

    private ArrayList<Title> inventory = new ArrayList<>();
    private ArrayList<Title> acquisition = new ArrayList<>();
    private ArrayList<Title> abolition = new ArrayList<>();


    public boolean checkAcquisition();
    public boolean checkAbolition();
    public void createBook();
    public void deleteBook();
}