package libary;

import libary.catalogue.Darmstadt;
import libary.catalogue.Frankfurt;
import libary.catalogue.Koblenz;
import libary.catalogue.Melbourne;

import java.util.ArrayList;

public class SearchAdapter extends Catalogue{
    @Override
    public ArrayList<Title> searchBook(String name){
        ArrayList<Title> titles = new ArrayList<>();

        Darmstadt darmstadt = new Darmstadt();
        Frankfurt frankfurt = new Frankfurt();
        Koblenz koblenz = new Koblenz();
        Melbourne melbourne = new Melbourne();

        titles.addAll(darmstadt.searchBooks(name));
        titles.addAll(frankfurt.search(name));
        titles.addAll(koblenz.bookSearch(name));
        titles.addAll(melbourne.queryBooks(name));

        return titles;
    }
}
