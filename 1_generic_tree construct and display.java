import java.io.*;
import java.util.*;

public class Main {
 private static class Node {
      int data;
        ArrayList<Node> children = new ArrayList<>();
       
        
    }
       
     public static void display(Node node){
    String st = node.data + "->";
    for(Node child : node.children){
        st += child.data +  ",";
    }
    st += ".";
    System.out.println(st);
    for( Node child: node.children){
        display(child);
    }
} 
public static Node construct(int [] arr){
    Stack<Node> st = new Stack<>();
     Node root = null;
     for(int i = 0;i<arr.length;i++){
         if(arr[i]== -1){
             st.pop();
             
         }else{
             Node t = new Node();
             t.data = arr[i];
             if(st.size()>0){
                 st.peek().children.add(t);
             }else{
                 root = t;
                 
             }
             st.push(t);
         }
         
         
     }
         return root;
         
     }
 



  



  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    display(root);
  
     
               }

}
