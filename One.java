import java.util.Scanner;
public class one{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int value=0;
        Boolean validInput=false;

        do {
            System.out.println("Please enter an integer");
            try{
                value = Integer.parseInt(obj.nextLine());
                validInput = true;
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid value");
            }
        }while(!validInput);

        for (int i = 0; i <= value; i = i + 2) {
            System.out.println(i);
        }
    }
}
