import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int i = low; i<=high;i++){
            boolean isprime = true;
            int div = 2;
            while(div*div<=i){
                int r =i%div;
                if(r==0){
                  isprime = false;
              break;  
                }
            
              div++;
            }if(isprime==true){
                System.out.println(i);
            }
            
            
        }
    }
}
