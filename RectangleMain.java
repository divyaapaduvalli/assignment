import java.util.InputMismatchException;
import java.util.*;

public class RectangleMain {
    public static void main(String[] args) {

        boolean vi=false, vain=false;

        Scanner input=new Scanner(System.in);

        double length,width;

        RectangleFour rectangleFour= new RectangleFour();
        do {

        System.out.println("\n enter the length of the rectangle");
        try {
            while (!input.hasNextDouble() || input.hasNextInt()) {
                System.out.println("enter a float");
                input.next();
            }
            length = input.nextDouble();
            if(rectangleFour.setLength(length) == 1.0) {
                System.out.println("not in range, enter again");
            }
            else{
                vi=true;
            }
        }
            catch(InputMismatchException e){
                System.out.println("Invalid value");
            }
        }while(!vi);



        do {
            System.out.println("\n enter the width of the rectangle");
            try{
                while(!input.hasNextDouble()||input.hasNextInt()){
                    System.out.println("enter a float");
                    input.next();
                }
                width=input.nextDouble();
                if(rectangleFour.setWidth(width)==1.0)
                {
                    System.out.println("not in range, enter again");
                }
                else {
                    vain = true;
                }
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid value");
            }
        }while(!vain);



        System.out.println("the length of the rectangle is "+rectangleFour.getLength());
        System.out.println("the width of the rectangle is "+rectangleFour.getWidth());
        System.out.println("area of the rectangle for the dimensions given = "+rectangleFour.area());
        System.out.println("area of the rectangle for the dimensions given = "+rectangleFour.perimeter());
    }
}
