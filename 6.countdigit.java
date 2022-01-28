import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int digt = 0;
    while(n!=0){
        int q = n/10;
        digt++;
        n = q;
        
    }
    System.out.println(digt);
  }
}
