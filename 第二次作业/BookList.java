import java.util.*;
import java.io.*;
import java.io.Serializable;
import java.rmi.RemoteException;

class BookList implements Serializable{
    ArrayList<Book> booklist = new ArrayList<Book>();
    public String getInfo() {
        String info ="";
        for (int i = 0; i < booklist.size(); i++) {
            info += ("ID: " + booklist.get(i).getID()
                    + " name:" + booklist.get(i).getName() + "\n");
        }
        return info;
    }
    public void showInfo() {
        System.out.println(getInfo());
    }
}
