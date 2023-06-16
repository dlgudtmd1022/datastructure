import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class DequeUseMethod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()){
                case "push_front" :
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    if(deque.isEmpty()){
                        System.out.println(-1);
                    }else {
                        System.out.println(deque.pollFirst());
                    }
                    break;
                case "pop_back" :
                    if(deque.isEmpty()){
                        System.out.println(-1);
                    }else {
                        System.out.println(deque.pollLast());
                    }
                    break;
                case "size" :
                    System.out.println(deque.size());
                    break;
                case "empty" :
                    if (deque.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekFirst());
                    }
                    break;
                case "back" :
                    if(deque.isEmpty()){
                        System.out.println(-1);
                    }else {
                        System.out.println(deque.peekLast());
                    }
                    break;
            }
        }
        br.close();
    }
}
