import java.text.DecimalFormat;
public class Rectangle
{
    private double length;
    private double breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }
    Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public void getLengthBreadth()
    {
        System.out.println("length of rectangle = "+length+" and breadth of rectangle = "+breadth);
    }
    public void area()
    {
        double result=length*breadth;
        System.out.println("area of the rectangle for the dimensions given = "+roundTwoDecimals(result));
    }
    double roundTwoDecimals(double d) {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
    }

}