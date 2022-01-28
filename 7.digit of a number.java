import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      int d = 1;
      int temp = n;
      while(temp>=10){
           temp = temp/10;
           d*= 10;
      }
      while(d>=1){
          int q = n/d;
          int r = n%d;
          System.out.println(q);
           n = r;
           d = d/10;
      }
      
     }
    }
