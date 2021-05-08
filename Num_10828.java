import java.io.*;
import java.util.*;

class Num_10828 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");
            String st = str.nextToken();

            if(st.equals("push")){
                stack.add(Integer.parseInt(str.nextToken()));
            }
            else if(st.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }
            else if(st.equals("size")){
                System.out.println(stack.size());
            }
            else if(st.equals("empty")){;
                if(stack.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            else if(st.equals("top")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                } else{
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
