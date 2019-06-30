import java.util.*;
import java.io.*;
import java.io.Serializable;
import java.rmi.RemoteException;

class Book implements Serializable{
    private int book_id;
    private String book_name;
    public Book(int ID, String name){
        this.book_id = ID;
        this.book_name = name;
    }
    public int getID() {
        return book_id;
    }
    public String getName() {
        return book_name;
    }
    public String getInfo() {
        return  "ID: " + book_id
                + " name:" + book_name + "\n";
    }
    public void showInfo() {
        System.out.println(getInfo());
    }
}
