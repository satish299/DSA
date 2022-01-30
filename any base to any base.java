import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans = convertfromb1tob2(n,sourceBase,destBase);
     System.out.println(ans);
   }
   public static int convertfromb1tob2(int n, int b1, int b2){
    //b1 to decimal
    int dec = getvalueIndecimal(n,b1);
    int ans = getvalueInbase(dec,b2);
    return ans;
   }
     public static int getvalueInbase(int n , int b){
     int dn = 0;
     int bp = 1;
     while(n>0){
       int r = n%b;
       n = n/b;
       dn = dn + r*bp;
       bp = bp*10;

     }
     return dn;

   }

   public static int getvalueIndecimal(int n, int b){
     int dn = 0;
     int bp = 1;
     while(n>0){
       int r = n%10;
       n = n/10;
       dn = dn + r*bp;
       bp = bp*b;

     }
     return dn;
   }
 

  }
