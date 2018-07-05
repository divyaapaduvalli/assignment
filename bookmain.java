import java.util.Scanner;

public class bookmain {
    public void createBooks(book obj,String bt, int bp)
    {
            obj.setBook_title(bt);
            obj.setBook_price(bp);

    }


    public void showBooks(book obj)
    {
        System.out.println(obj.getBook_title() + "           " + obj.getBook_price());
    }


    public static void main(String[] args)
    {
        bookmain ob=new bookmain();

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number books you want to add");

        int n = input.nextInt();
        book[] obj = new book[n];

        for (int i = 0; i < n; i++) {
            obj[i] = new book();

            System.out.println("enter the title of the book");

            Scanner sc = new Scanner(System.in);

            String bt=sc.nextLine();

            System.out.println("enter the price of the book");
            int bp=sc.nextInt();

            ob.createBooks(obj[i],bt,bp);
        }
        System.out.println("Book Title" + "   " + "Book Price");
        for (int i = 0; i < n; i++){
            ob.showBooks(obj[i]);
        }
    }
}
