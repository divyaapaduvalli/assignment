import java.util.Scanner;
import java.text.*;
import java.util.Date;
import java.util.regex.Pattern;

public class employee {
    int employee_number;
    String employee_name;
    Date joining_date=null;

    public void setEmployee_number(int emnum){
        employee_number=emnum;
    }
    public void setEmployee_name(String emname){
        employee_name=emname;
    }
    public void setEmployee_date(Date jd){
        joining_date=jd;
    }
    public int getEmployee_number(){
        return employee_number;
    }
    public String getEmployee_name(){
        return employee_name;
    }
    public Date getEmployee_date(){
        return joining_date;
    }
    public static void main(String[] args){
        employee[] obj= new employee[5];
        SimpleDateFormat joiningDate= new SimpleDateFormat("dd/MM/yyyy");
        Scanner input= new Scanner(System.in);
        boolean temp=false,value=false,tempo=false;
        int emnum=0;
        String emname="";
        Date jd=null;

        for(int i=0;i<obj.length;i++) {
            obj[i]=new employee();
            do {
                System.out.println("Enter the employee number");
                try{
                        emnum = Integer.parseInt(input.nextLine());
                        temp = true;
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Invalid value, enter a number");
                    }
                }while(!temp);

            obj[i].setEmployee_number(emnum);
            Scanner sc= new Scanner(System.in);
            do {
                System.out.println("enter the employee name");
                emname=sc.nextLine();
                if(Pattern.matches("[a-zA-Z]+", emname))
                {
                    value = true;
                }
                else
                {
                    System.out.println("Nope!");
                }
            }while(!value);

            obj[i].setEmployee_name(emname);

            do {
                System.out.println("Enter your joining date");
                String joining=sc.next();
                try {
                    //Parsing the String
                    jd = joiningDate.parse(joining);
                    tempo=true;
                } catch (ParseException e) {
                    System.out.println("enter the joining date");
                }
            }while(!tempo);

            obj[i].setEmployee_date(jd);
        }

        for(int i=0;i<obj.length;i++) {
            System.out.println(obj[i].getEmployee_number() + " | " + obj[i].getEmployee_name() + " | " + obj[i].getEmployee_date());
        }
    }
}