import java.text.DecimalFormat;
public class Rectangle{
    double length,breadth;
    Rectangle() {
        length = 0;
        breadth = 0;
    }
    public void setLenBre(double a,double b)
    {
       // if(a>0.0 && a<20.0 && b>0.0 && b<20.0) {
            length = a;
            breadth = b;
       // }
       // else {
        //    System.out.println("length or breadth is not in range");
        //}
    }
    public void getLenBre()
    {
        System.out.println("length of rectangle = "+length+" and breadth of rectangle = "+breadth);
    }
    public void area()
    {
        double result=length*breadth;
        System.out.println("area of the rectangle for the dimensions given = "+roundTwoDecimals(result));
    }
    public void perimeter()
    {
        double peri=2*(length+breadth);
        System.out.println("perimeter of the rectangle for the dimensions given = "+roundTwoDecimals(peri));
    }
    double roundTwoDecimals(double d) {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
    }

}