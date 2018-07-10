import java.util.Scanner;
class TestRectangle{
    private double length,breadth;

    public void enterData()
    {
        Scanner input=new Scanner(System.in);
        boolean valInput=false, valIn=false;

        do {
            System.out.println("\n enter the length of the rectangle");
            try
            {
                length = Double.parseDouble(input.nextLine());
                while(length<=0)
                {
                    System.out.println("enter the length greater than zero");
                    length = Double.parseDouble(input.nextLine());
                }
                valInput = true;
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Invalid value");
            }
        }while(!valInput);

        do {
            System.out.println("\n enter the breadth of the rectangle");
            try{
                breadth = Double.parseDouble(input.nextLine());
                while(breadth<=0) {
                    System.out.println("enter the breadth greater than zero");
                    breadth = Double.parseDouble(input.nextLine());
                }
                valIn = true;
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Invalid value");
            }
        }while(!valIn);
        }

    public static void main(String[] args)
    {
        Rectangle[] obj=new Rectangle[5];
        for(int j=0;j<obj.length;j++)
        {
            obj[j]=new Rectangle();
        }
        TestRectangle ob1= new TestRectangle();

        for(int i = 0; i < obj.length; i++)
        {
            ob1.enterData();
            obj[i]=new Rectangle(ob1.length,ob1.breadth);
            obj[i].area();
            obj[i].getLengthBreadth();
        }
    }
}