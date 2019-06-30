import java.util.*;
import java.io.*;
import java.io.Serializable;
import java.rmi.RemoteException;

public class BookMethodImpl extends java.rmi.server.UnicastRemoteObject implements BookMethod{
    BookMethodImpl() throws RemoteException  {
        super();
    }
    ArrayList<Book> books = new ArrayList<Book>();
    BookList query = new BookList();

    public void initData() throws RemoteException, FileNotFoundException {
        File file = new File("content.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            int id = input.nextInt();
            String name = input.next();
            books.add(new Book(id, name));
        }
        input.close();
    }

    public void update() throws RemoteException, FileNotFoundException {
        File file = new File("content.txt");
        PrintWriter output = new PrintWriter(file);
        for (int i = 0; i < books.size(); i++) {
            output.print(books.get(i).getID() + " ");
            output.println(books.get(i).getName());
        }
        output.close();
    }

    public boolean add(Book b) throws RemoteException, FileNotFoundException{
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getID() == b.getID()) {
                return false;
            }
        }
        books.add(b);
        update();
        return true;
    }

    public Book queryByID(int bookID) throws RemoteException{
        Book b = null;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getID() == bookID) {
                b = books.get(i);
                return b;
            }
        }
        return null;
    }

    public BookList queryByName(String name) throws RemoteException{
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getName().indexOf(name)!=-1){
                query.booklist.add(books.get(i));
            }
        }
        return query;
    }

    public boolean delete(int bookID) throws RemoteException, FileNotFoundException {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getID() == bookID) {
                books.remove(books.get(i));
                update();
                return true;
            }
        }
        return false;
    }

    public String booksInfo() throws RemoteException {
        String info = "********current books**********\n";
        for (int i = 0; i < books.size(); i++) {
            info += ("ID: " + books.get(i).getID()
                    + " name:" + books.get(i).getName() + "\n");
        }
        return info;
    }

    public void showAllTheBooks() throws RemoteException {
        System.out.println(booksInfo());
    }
}
