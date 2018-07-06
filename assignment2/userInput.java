package assignment2;
import java.util.*;

public class userInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of contacts you want to add");
        int value = input.nextInt();

        searchContact obj = new searchContact(value);

        while(true) {
            System.out.println("choose from the following options : \n 1.Add \n 2.List \n 3.Search \n 4.Quit");
            switch (input.nextInt()) {
                case 1:
                    for (int i = 0; i < value; i++) {
                        System.out.println("Enter the " + (i + 1) + " contact name");

                        Scanner in = new Scanner(System.in);
                        String name = in.nextLine();

                        System.out.println("Enter the " + (i + 1) + " contact number");

                        Scanner inp = new Scanner(System.in);
                        long num = inp.nextLong();

                        obj.add(name, num, i);
                    }
                    break;
                case 2:
                    System.out.println(obj.toString());

                    break;
                case 3:
                    System.out.println("enter the name whose contact must be retrieved");
                    Scanner sc = new Scanner(System.in);
                    obj.search(sc.nextLine());
                    break;
                case 4:
                    java.lang.System.exit(0);
            }
        }
    }
}