/**
 * 9093
 * https://www.acmicpc.net/problem/9093
 * 단어 뒤집기
 */
import java.io.*;
import java.util.*;

class Num_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            String str = br.readLine(); // I am happy
            StringTokenizer st = new StringTokenizer(str, " "); // I, am, happy == st

            while(st.hasMoreTokens()){
                Stack<Character> stack = new Stack<>();

                String tmp = st.nextToken();
                for(int j = 0; j < tmp.length(); j++){
                    stack.add(tmp.charAt(j));
                }
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());

    }
    
}