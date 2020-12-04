/*multiclass demo*/
class circle1{
    double x,y,r;

    double circumference(){
        return 2*(22/7)*r;
    }
    double area(){
        return (22/7)*r*r;
    }
}
class box{
    double l,b,h,a;

    double areabox(){
        a=l*b+b*h+h*l;
        return a;
    }
}
public class circbox {
     public static void main(String[] args) {
         circle1 c=new circle1();
         box b=new box();
         c.r=5.5;
         b.l=23.0;
         b.b=21.0;
         b.h=34.0;

         System.out.println("circumference="+c.circumference());
         System.out.println("area="+c.area());
         System.out.println("Total Area"+b.areabox());
         


        
    }
    
}
