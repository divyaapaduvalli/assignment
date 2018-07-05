import java.util.Scanner;
class testRectangle{
    double len,bre;
    public void enterData(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length of the rectangle");
        len = input.nextDouble();
        while(len<=0) {
                System.out.println("invalid number");
                System.out.println("enter the length of the rectangle again");
                len = input.nextDouble();
        }
        System.out.println("enter the breadth of the rectangle");
        bre=input.nextDouble();
        while(bre<=0) {
                System.out.println("invalid number");
                System.out.println("enter the breadth of the rectangle again");
                bre = input.nextDouble();
        }

    }

    public static void main(String[] args){
        Rectangle[] obj=new Rectangle[5];
        for(int j=0;j<obj.length;j++) {
            obj[j]=new Rectangle();
        }
        testRectangle ob1= new testRectangle();
        for(int i = 0; i < obj.length; i++) {
            ob1.enterData();
            obj[i].setLenBre(ob1.len,ob1.bre);
            obj[i].area();
            obj[i].getLenBre();
            //obj[i].perimeter();
        }
    }
}