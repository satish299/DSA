import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i = 0;i<arr.length;i++){
        arr [i] = scn.nextInt();
    }

   int sum = ((n+1)*(n+2))/2;
   for(int i = 0;i<arr.length;i++){
       sum -= arr[i];
       
   }
   System.out.println(sum);
   }
}
