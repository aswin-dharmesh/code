
/*avg of array elements*/
class avgarray{
     public static void main(String[] args) {
         int x[]={10,20,30,40,50};
         for(int i=0;i<x.length;i++)
         {
         System.out.println(x[i]);
         }
         float sum=0,avg;
         for(int i=0;i<x.length;i++)
         {
             sum+=x[i];
         }
         avg=sum/x.length;
         System.out.println(avg);
        
    }
    
}
