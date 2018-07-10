
public class RectangleFour {

        private double length,width;


        RectangleFour() {
            length = 1;
            width = 1;
        }

        public double setLength(double length)
        {
            double x=1.0;
           if(length<0.0||length>20.0){
               return x;
           }
           else {
               x=0.0;
               this.length=length;
               return x;
           }
        }
        public double setWidth(double width)
        {
            double x=1.0;
            if(width<0.0||width>20.0){
                return x;
            }
            else {
                x=0.0;
                this.width=width;
                return x;
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
        public double area()
        {
            double result=length*width;
            return result;
        }
        public double perimeter()
        {
            double perimeter=2*(length+width);
            return perimeter;
        }

}