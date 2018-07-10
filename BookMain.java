import java.util.Scanner;
import java.util.regex.Pattern;

public class BookMain {

    public void createBooks(Book obj,String bookTitle, int bookPrice)
    {
            obj.setBookTitle(bookTitle);
            obj.setBookPrice(bookPrice);

    }


    public void showBooks(Book obj)
    {
        System.out.println(obj.getBookTitle() + "           " + obj.getBookPrice());
    }


    public static void main(String[] args)
    {
        BookMain ob=new BookMain();
        int n = 0;
        boolean val=false, value=false, v=false;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("enter the number of books you want to add");
            try{
                n = Integer.parseInt(input.nextLine());
                val = true;
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid value");
            }
        }while(!val);

        Book[] obj = new Book[n];
        String bookTitle="";

        for (int i = 0; i < n; i++) {
            obj[i] = new Book();
            Scanner sca=new Scanner(System.in);

            do {
                System.out.println("enter the title of the book");
                bookTitle=sca.nextLine();
                if(Pattern.matches("[a-zA-Z]+", bookTitle))
                {
                    value = true;
                }
                else
                    {
                        System.out.println("Nope!");
                    }
            }while(!value);


            Scanner sc = new Scanner(System.in);
            int bookPrice=0;


            do {
                System.out.println("enter the price of the book");
                try{
                    bookPrice = Integer.parseInt(sc.nextLine());
                    v = true;
                }
                catch(IllegalArgumentException e){
                    System.out.println("Invalid value");
                }
            }while(!v);

            ob.createBooks(obj[i],bookTitle,bookPrice);
        }
        System.out.println("Book Title" + "   " + "Book Price");
        for (int i = 0; i < n; i++){
            ob.showBooks(obj[i]);
        }
    }
}
