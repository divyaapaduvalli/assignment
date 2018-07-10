import java.util.Date;

public class Employee {
    private int employeeNumber;
    private String employeeName;
    private Date joiningDate=null;

    public void setEmployeeNumber(int employeeNumber){
        this.employeeNumber=employeeNumber;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    public void setEmployeeDate(Date joiningDate){
        this.joiningDate=joiningDate;
    }
    public int getEmployeeNumber(){
        return employeeNumber;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public Date getEmployeeDate(){
        return joiningDate;
    }

}