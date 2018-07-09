import java.util.Scanner;
public class four {
        double length,width;

        four() {
            length = 1;
            width = 1;
        }
        four(double l,double w){
            setLength(l);
            setWidth(w);
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
        public double area()
        {
            double result=length*width;
            return result;
        }
        public double perimeter()
        {
            double peri=2*(length+width);
            return peri;
        }

    public static void main(String[] args) {

        boolean vi=false, vain=false;

        Scanner input=new Scanner(System.in);

        double length=0,width=0;

        do {
            System.out.println("\n enter the length of the rectangle");
            try{
                length = Double.parseDouble(input.nextLine());
                while(length<0.0||length>20.0) {
                    System.out.println("not in range, enter again");
                    length = Double.parseDouble(input.nextLine());
                }
                vi = true;
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid value");
            }
        }while(!vi);

        Scanner in=new Scanner(System.in);

        do {
            System.out.println("\n enter the width of the rectangle");
            try{
                width = Double.parseDouble(input.nextLine());
                while(width<0.0||width>20.0) {
                    System.out.println("not in range, enter again");
                    width = Double.parseDouble(input.nextLine());
                }
                vain = true;
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid value");
            }
        }while(!vain);

        four obj= new four(length,width);

        System.out.println("the length of the rectangle is "+obj.getLength());
        System.out.println("the width of the rectangle is "+obj.getWidth());
        System.out.println("area of the rectangle for the dimensions given = "+obj.area());
        System.out.println("area of the rectangle for the dimensions given = "+obj.perimeter());
    }
}
