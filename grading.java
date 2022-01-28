import java.util.*;

public class Main {

    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int m = scn.nextInt();
      if(m>=90){
          System.out.println("excellent");
      }else if(m>=80){
System.out.println("good");
      }else if(m>=70){
          System.out.println("fair");

      }else if(m>=60){
          System.out.println(" meets expectations");
      }else{
          System.out.println("below par");
      }
    }
}
