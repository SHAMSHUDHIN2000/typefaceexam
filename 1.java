import java.util.*;
import java.io.*;
public class Main {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String result = "";
     while(N>0){
        int rem = N%3;
        N = N/3;
        result = rem + result;
     }
    System.out.println(result);
    }
}
