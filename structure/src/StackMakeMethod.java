import java.io.*;
import java.util.StringTokenizer;

public class StackMakeMethod {
    static int[] stack; // 스택 구현 배열
    static int size = 0; // 스택의 크기를 나타내는 변수

    public static void push(int num) { // 데이터 추가
        stack[size] = num; // num을 인자로,
        size++; // 스택의 현재 top위치에 데이터를 저장하고 스택의 크기 1 증가
    }

    public static int pop() { // 가장 마지막에 추가된 데이터(top) 제거
        if (size == 0) { // 스택이 비어있으면,
            return -1; // -1반환
        } else { // 스택이 비어있지 않으면,
            int outNum = stack[size - 1]; // top에 있는 데이터 제거 후
            stack[size - 1] = 0; // 위치의 데이터를 0으로 설정
            size--; // 스택 크기 1 감소
            return outNum; // top의 데이터 반환
        }
    }

    public static int size() { // 스택의 현재 크기 반환
        return size;
    }

    public static int empty() { // 스택이 비어있는지 확인
        if (size == 0) { // 스택이 비어있다면,
            return 1; // 1반환
        } else { // 스택이 비어있지 않다면,
            return 0; // 0반환
        }
    }

    public static int top() {// top에 있는 데이터 반환
        if (size == 0) { //스택이 비어있으면,
            return -1; // -1반환
        } else { // 스택이 비어있지 않다면,
            return stack[size - 1]; // top의 데이터 반환
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        stack = new int[N];

        for (int i = 1; i <= N; i++) { // 명령어의 개수만큼 반복
            StringTokenizer tk = new StringTokenizer(br.readLine());

            switch (tk.nextToken()) { // switch case를 이용해 명령어 실행
                case "push":
                    push(Integer.parseInt(tk.nextToken()));
                    // push 1과 같이 띄고 명령허 실행되니까 토큰분리
                    break;
                case "pop":
                    bw.write(pop() + "\n");
                    break;
                case "size":
                    bw.write(size() + "\n");
                    break;
                case "empty":
                    bw.write(empty() + "\n");
                    break;
                case "top":
                    bw.write(top() + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}