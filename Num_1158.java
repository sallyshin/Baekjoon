/**
 * 1158
 * https://www.acmicpc.net/problem/1158
 * 요세푸스 문제
 */
import java.io.*;
import java.util.*;

class Num_1158 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < n; i++){
            queue.add(i+1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(queue.size() > 1){
            for(int i = 0; i < k-1; i++){
                queue.add(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");

        System.out.println(sb.toString());

    }
}