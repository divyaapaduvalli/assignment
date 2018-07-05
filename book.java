import java.util.Scanner;
public class book {
    String Book_title;
    int Book_price;
    Scanner input = new Scanner(System.in);
    public void setBook_title() {
        System.out.println("enter the description: title of the book");
        String bt = input.nextLine();
        Book_title = bt;
    }
    public void setBook_price(){
        System.out.println("enter the description: price of the book");
        int bp = input.nextInt();
        Book_price=bp;
    }
    public String getBook_title(){
        return Book_title;
    }
    public int getBook_price(){
        return Book_price;
    }
}
