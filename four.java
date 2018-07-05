import java.util.Scanner;
public class four {
        double length,width;
        Scanner input=new Scanner(System.in);
        four() {
            length = 1;
            width = 1;
        }
        public void setLength()
        {
            System.out.println("enter the length");
            double a=input.nextDouble();
            if(a>0.0 && a<20.0) {
            length = a;
            }
            else {
                System.out.println("length is not in range");
            }
        }
        public void setWidth()
        {
            System.out.println("enter the width");
            double b=input.nextDouble();
            if(b>0.0 && b<20.0) {
            width = b;
            }
            else {
                System.out.println("width is not in range");
            }
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
        obj.setLength();
        obj.setWidth();
        System.out.println("the length of the rectangle is "+obj.getLength());
        System.out.println("the width of the rectangle is "+obj.getWidth());
        obj.area();
        obj.perimeter();
    }
}
