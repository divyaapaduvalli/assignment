import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] obj = new Employee[5];

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        boolean temp,value,tempo;
        int employeeNumber = 0;
        String employeeName = "";
        Date joiningDate = null;

        for (int i = 0; i < obj.length; i++) {

            obj[i] = new Employee();
            temp=false;
            do {
                System.out.println("Enter the employee number");
                try {
                    Scanner input = new Scanner(System.in);
                    employeeNumber = Integer.parseInt(input.nextLine());
                    temp = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid value, enter a number");
                }
            } while (!temp);

            obj[i].setEmployeeNumber(employeeNumber);
            value = false;
            do {
                System.out.println("enter the employee name");
                Scanner sca = new Scanner(System.in);
                employeeName = sca.nextLine();
                if (Pattern.matches("[a-zA-Z]+", employeeName)) {
                    value = true;
                } else {
                    System.out.println("Nope!");
                }
            } while (!value);

            obj[i].setEmployeeName(employeeName);
            tempo=false;
            do {
                System.out.println("Enter your joining date");
                Scanner sc = new Scanner(System.in);
                String joining = sc.next();

                String[] arr=new String[3];

                arr=joining.split("/");

                int[] array=new int[3];

                for(int j=0;j<arr.length;j++){
                    array[j]=Integer.parseInt(arr[j]);
                }

                if(array[0]<1 || array[0]>31 || array[1]<1 || array[1]>12 || array[2]<1 || array[2]>2018)
                {
                    System.out.println("not a valid date");
                    continue;
                }
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
