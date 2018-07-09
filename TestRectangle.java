import java.util.Scanner;
class TestRectangle{
    double len,bre;
    public void enterData(){
        Scanner input=new Scanner(System.in);
        boolean valInput=false, valIn=false;

        do {
            System.out.println("\n enter the length of the rectangle");
            try{
                len = Double.parseDouble(input.nextLine());
                while(len<=0) {
                    System.out.println("enter the length greater than zero");
                    len = Double.parseDouble(input.nextLine());
                }
                valInput = true;
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid value");
            }
        }while(!valInput);

        do {
            System.out.println("\n enter the breadth of the rectangle");
            try{
                bre = Double.parseDouble(input.nextLine());
                while(bre<=0) {
                    System.out.println("enter the breadth greater than zero");
                    bre = Double.parseDouble(input.nextLine());
                }
                valIn = true;
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid value");
            }
        }while(!valIn);
        }

    public static void main(String[] args){
        Rectangle[] obj=new Rectangle[5];
        for(int j=0;j<obj.length;j++) {
            obj[j]=new Rectangle();
        }
        testRectangle ob1= new testRectangle();
        for(int i = 0; i < obj.length; i++) {
            ob1.enterData();
            obj[i]=new Rectangle(ob1.len,ob1.bre);
            obj[i].area();
            obj[i].getLenBre();
        }
    }
}