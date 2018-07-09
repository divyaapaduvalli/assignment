import java.util.Scanner;
import java.util.regex.Pattern;

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
        int n = 0;
        boolean val=false, value=false, v=false;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("enter the number books you want to add");
            try{
                n = Integer.parseInt(input.nextLine());
                val = true;
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid value");
            }
        }while(!val);

        book[] obj = new book[n];
        String bt="";

        for (int i = 0; i < n; i++) {
            obj[i] = new book();
            Scanner sca=new Scanner(System.in);

            do {
                System.out.println("enter the title of the book");
                bt=sca.nextLine();
                if(Pattern.matches("[a-zA-Z]+", bt))
                {
                    value = true;
                }
                else
                    {
                        System.out.println("Nope!");
                    }
            }while(!value);


            Scanner sc = new Scanner(System.in);
            int bp=0;


            do {
                System.out.println("enter the price of the book");
                try{
                    bp = Integer.parseInt(sc.nextLine());
                    v = true;
                }
                catch(IllegalArgumentException e){
                    System.out.println("Invalid value");
                }
            }while(!v);

            ob.createBooks(obj[i],bt,bp);
        }
        System.out.println("Book Title" + "   " + "Book Price");
        for (int i = 0; i < n; i++){
            ob.showBooks(obj[i]);
        }
    }
}
