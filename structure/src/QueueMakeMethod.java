import java.io.*;
import java.util.StringTokenizer;

public class QueueMakeMethod {
    // QUEUE : 데이터를 임시 저장하는 자료구조
    // FIFO구조 : 선입선출

    static int queue []; // 큐 구현 배열
    static int size = 0; // 큐 크기 변수
    static int front=0; // 큐의 앞을 가리키는 변수 (출력)
    static int last=0; // 큐의 뒤를 가리키는 변수 (입력)

    public static void push(int num){ // 큐의 front에 데이터 추가
        queue[last++] = num; // 큐의 back 데이터 위치에 데이터 저장
        size++; //큐의 크기 1 증가
    }

    public static int pop(){ // 큐의 front에 있는 데이터를 제거
        if(size == 0) { // 비어있으면
            return -1; // -1반환
        }else { // 비어있지 않으면
            return queue[front++]; // front 테이터 반환 후 , front 위치 1증가
        }
    }
    public static int size(){ // 큐의 현재 크기 반환
        return size;
    }
    public static int empty(){ // 큐가 비어있는지 확인
        return size == 0 ? 1 : 0;
    }
    public static int front() { // 큐의 front에 있는 데이터 반환
        if(size == 0) { // 큐가 비어있으면,
            return -1; // -1을 반환하고
        } else { // 큐가 비어있지 않으면,
            return queue[front]; // front의 데이터 반환
        }
    }

    public static int back() { // 큐의 back에 있는 데이터 반환
        if(size == 0) { // 큐가 비어있다면,
            return -1; // -1 반환
        } else { // 큐가 비어있지 않다면,
            return queue[last - 1]; // back 위치 바로 앞의 데이터 반환
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        queue = new int[N];
        for(int i = 0; i  < N ; i++){ // N만큼 반복하는 반복문
            StringTokenizer tk = new StringTokenizer(br.readLine());
            switch (tk.nextToken()){
                case "push" :
                    push(Integer.parseInt(tk.nextToken()));
                    break;
                case "pop" :
                    bw.write(pop() + "\n");
                    break;
                case "size" :
                    bw.write(size() + "\n");
                    break;
                case "empty" :
                    bw.write(empty() + "\n");
                    break;
                case "front" :
                    bw.write(front() + "\n");
                    break;
                case "back" :
                    bw.write(back() + "\n");
                    break;
            }
        }
        br.close();
        bw.close();
        bw.flush();
    }
}
