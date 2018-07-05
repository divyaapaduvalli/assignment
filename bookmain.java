import java.util.Scanner;

public class bookmain {
    Scanner input= new Scanner(System.in);
    public void createBooks(book[] obj,int n) {
        for(int i=0;i<n;i++) {
            obj[i].setBook_title();
            obj[i].setBook_price();
        }
    }
    public void showBooks(book[] obj,int n){
        System.out.println("Book Title"+"   "+"Book Price");
        for(int i=0;i<n;i++){
            System.out.println(obj[i].getBook_title()+"            "+obj[i].getBook_price());
        }
    }
    public static void main(String[] args){
        bookmain ob=new bookmain();
        System.out.println("enter the number books you want to add");
        int n = ob.input.nextInt();
        book[] obj = new book[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new book();
        }
        ob.createBooks(obj,n);
        ob.showBooks(obj,n);
    }
}
