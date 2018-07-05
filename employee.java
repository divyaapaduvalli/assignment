import java.util.Scanner;
public class employee {
    int employee_number;
    String employee_name;
    String joining_date;
    Scanner input= new Scanner(System.in);
    public void setEmployee_number(){
        System.out.println("Enter the employee number");
        employee_number=input.nextInt();
        input.nextLine();
    }
    public void setEmployee_name(){
        System.out.println("Enter the employee name");
        employee_name=input.nextLine();
    }
    public void setEmployee_date(){
        System.out.println("Enter your joining date");
        joining_date=input.nextLine();
    }
    public int getEmployee_number(){
        return employee_number;
    }
    public String getEmployee_name(){
        return employee_name;
    }
    public String getEmployee_date(){
        return joining_date;
    }
    public static void main(String[] args){
        employee[] obj= new employee[5];
        for(int i=0;i<obj.length;i++) {
            obj[i]=new employee();
            obj[i].setEmployee_number();
            obj[i].setEmployee_name();
            obj[i].setEmployee_date();
            System.out.println(obj[i].getEmployee_number()+" | "+obj[i].getEmployee_name()+" | "+obj[i].getEmployee_date());
        }

    }
}
