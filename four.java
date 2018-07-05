import java.util.Scanner;
public class four {
        double length,width;

        four() {
            length = 1;
            width = 1;
        }
        public void setLength(double a)
        {
            length = a;
        }
        public void setWidth(double b)
        {
            width = b;
        }
        public double getLength()
        {
            return length;
        }
        public double getWidth()
        {
            return width;
        }
        public void area()
        {
            double result=length*width;
            System.out.println("area of the rectangle for the dimensions given = "+result);
        }
        public void perimeter()
        {
            double peri=2*(length+width);
            System.out.println("perimeter of the rectangle for the dimensions given = "+peri);
        }

    public static void main(String[] args) {
        four obj= new four();

        Scanner input=new Scanner(System.in);

        System.out.println("enter the length");

        double len=input.nextDouble();
        if (len<0.0||len>20.0) {
            System.out.println("not in range, enter again");
            len=input.nextDouble();
        }
        obj.setLength(len);

        Scanner in=new Scanner(System.in);
        System.out.println("enter the width");

        double wid=input.nextDouble();
        if (wid<0.0 || wid>20.0) {
            System.out.println("not in range, enter again");
            wid=input.nextDouble();
        }
        obj.setWidth(wid);

        System.out.println("the length of the rectangle is "+obj.getLength());
        System.out.println("the width of the rectangle is "+obj.getWidth());
        obj.area();
        obj.perimeter();
    }
}
