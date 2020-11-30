/*single class demo*/
public class circle {
    double x,y,r;

    double circumference(){
        return 2*(22/7)*r;
    }
    double area(){
        return (22/7)*r*r;
    }
    
}
class circledemon {
     public static void main(String[] args) {
         circle c=new circle();
         c.r=5.5;
         System.out.println("Circumference"+c.circumference());
         System.out.println("Area"+c.area());
        
    }
}

