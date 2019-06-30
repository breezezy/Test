import java.util.*;
import java.io.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.io.Serializable;

public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException, FileNotFoundException {
        BookMethod method = (BookMethod)Naming.lookup("rmi://localhost:9999/BookMethod");
        method.initData();
        Scanner input = new Scanner(System.in);
        System.out.println(menu());
        int choose = input.nextInt();
        while (choose != 0) {
            switch(choose) {
                case 1: System.out.println(" input bookID and name \n");
                    int newBookID = input.nextInt();
                    String newName = input.next();
                    Book newBook = new Book(newBookID, newName);
                    if (method.add(newBook)) {
                        System.out.println("add successful\n");
                    } else {
                        System.out.println("bookID:" + newBookID + " pre_existing, add book failed\n");
                    }
                    break;
                case 2: System.out.println("input bookID to query it\n");
                    int queryBookID = input.nextInt();
                    Book queryid = method.queryByID(queryBookID);
                    if (queryid != null) {
                        System.out.println("*******query listing *********\n");
                        queryid.showInfo();
                    } else {
                        System.out.println("this book is not existing");
                    }
                    break;
                case 3: System.out.println(" input name to query \n");
                    String queryBookKeyword = input.next();
                    BookList list = method.queryByName(queryBookKeyword);
                    if (list != null) {
                        System.out.println("*******query listing *********\n");
                        list.showInfo();
                    } else {
                        System.out.println("this book is not existing");
                    }
                    break;
                case 4: System.out.println(" input bookID to delete \n");
                    int deleteID = input.nextInt();
                    if (method.delete(deleteID)) {
                        System.out.println("delete sucessful\n");
                    } else {
                        System.out.println("delete failed\n");
                    }
                    break;
                /*case 5: System.out.println(method.booksInfo());
                    break;*/
                default: System.out.println(" input again!\n");
                    break;
            }
            System.out.println(menu());
            choose = input.nextInt();
        }
    }
    public static String menu() {
        return "**********menu**********\n"
                + "1.add book\n"
                + "2.Book queryBy ID\n"
                + "3.Book queryBy Name\n"
                + "4.Book deleteBy ID\n"
               /* + "5.show All Books\n"*/
                + "0.stop\n"
                + "************************\n";
    }

}
