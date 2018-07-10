import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] obj = new Employee[5];

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Scanner input = new Scanner(System.in);
        boolean temp = false, value = false, tempo = false;
        int employeeNumber = 0;
        String employeeName = "";
        Date joiningDate = null;

        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Employee();
            do {
                System.out.println("Enter the employee number");
                try {
                    employeeNumber = Integer.parseInt(input.nextLine());
                    temp = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid value, enter a number");
                }
            } while (!temp);

            obj[i].setEmployeeNumber(employeeNumber);
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("enter the employee name");
                employeeName = sc.nextLine();
                if (Pattern.matches("[a-zA-Z]+", employeeName)) {
                    value = true;
                } else {
                    System.out.println("Nope!");
                }
            } while (!value);

            obj[i].setEmployeeName(employeeName);

            do {
                System.out.println("Enter your joining date");
                String joining = sc.next();
                try {
                    //Parsing the String
                    joiningDate = dateFormat.parse(joining);
                    tempo = true;
                } catch (ParseException e) {
                    System.out.println("enter the joining date");
                }
            } while (!tempo);

            obj[i].setEmployeeDate(joiningDate);
        }

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].getEmployeeNumber() + " | " + obj[i].getEmployeeName() + " | " + obj[i].getEmployeeDate());
        }
    }
}
