import java.io.*;
import java.util.*;

public class seven8 {
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    n=((n<<3)-n)>>3;
    System.out.println(n);
  }

}