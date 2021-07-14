import java.io.*;
import java.util.*;

public class minStackSpaceOp {

  public static class MinStack {
    Stack<Integer> data;
    int min;

    public MinStack() {
      data = new Stack<>();
    }

    int size() {
      return data.size();
    }

    void push(int val) {
      if(data.size()==0){
        data.push(val);
        min=val;
      }
      else if(val>min){
        data.push(val);
      }else{
       data.push(2*val-min);
       min=val;
      }

    }

    int pop() {
      if(data.peek()<min){
        int t=min;
        min=2*min-data.peek();
        data.pop();
        return  t;
      }
      return data.pop();
    }

    int top() {
      if(data.peek()<min){
        return min;
      }
      return data.peek() ;
    }

    int min() {
      return min;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MinStack st = new MinStack();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      } else if (str.startsWith("min")) {
        int val = st.min();
        if (val != -1) {
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}