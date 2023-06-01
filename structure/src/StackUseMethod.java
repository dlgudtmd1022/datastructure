import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackUseMethod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer tk = new StringTokenizer(br.readLine());
            String command = tk.nextToken();

            switch (command){
                case "push": // 스택에 데이터 삽입
                    stack.push(Integer.parseInt(tk.nextToken()));
                    break;
                case "pop" : // 스택에서 가장 마지막에 들어간 데이터를 꺼냄
                    if(stack.isEmpty()){
                        bw.write("-1\n");
                    }else {
                        bw.write(stack.pop() + "\n");
                    }
                    break;
                case "size" :
                    bw.write(stack.size() + "\n");
                    break;
                case "empty" : // 스택에 데이터가 있는지 확인
                    if(stack.isEmpty()){
                        bw.write("1\n");
                    }else {
                        bw.write("0\n");
                    }
                    break;
                case "top" :    // 스택의 가장 마지막 데이터를 확인
                    if (stack.isEmpty()){
                        bw.write("-1\n");
                    }else {
                        bw.write(stack.peek() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
