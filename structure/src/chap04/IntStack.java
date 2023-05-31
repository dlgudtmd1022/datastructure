package chap04;

public class IntStack {
    private int max; // 용량
    private int ptr; // 포인터
    private int[] stk; // 본체

    // 실행 시 예외 : 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){ }
    }

    // 실행 시 예외 : 스택이 가득 참
    public class OverlowIntStackException extends RuntimeException{
        public OverlowIntStackException(){ }
    }

    // 생성자
     public IntStack(int capacity){
        ptr = 0;
        max = capacity;
        try{
            stk = new int[max];         // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e){  // 생성할 수 없음
            max = 0;
        }
     }

     // push 메서드
     // 스택에 x를 푸시
     public int push(int x) throws OverlowIntStackException{
        if(ptr >= max) {                            // 스택이 가득 참
            throw new OverlowIntStackException();
        }
        return stk[ptr++] = x;
        }

     // pop 메서드
     // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException{
        if(ptr <= 0){
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    // peek 메서드
    // 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
    public int peek()throws EmptyIntStackException{
        if(ptr <= 0){
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }

    // IsFull 메서드
    // 스택에서 x를 차자 인덱스(없으면 -1)를 반환
     public int indexOf(int x) {
         for (int i = ptr - 1; i >= 0; i--) {
             if (stk[i] == x) {
                 return i;
             }
         }
         return -1;
     }
    // clear 메서드
    // 스택을 비움
    public void clear(){
        ptr = 0;
    }
    // capacity 메서드
    // 스택의 용량을 반환
    public int capacity(){
        return max;
    }

    // size 메서드
    // 스택에 쌓여 있는 데이터 수를 반환
    public int size(){
        return ptr;
    }

    // IsEmpty 메서드
    // 스택이 비어 있는지 확인
    public boolean isEmpty(){
        return ptr <= 0;
    }

    // IsFull 메서드
    // 스택이 가득 차있는지 확인
    public boolean isFull(){
        return ptr <= 0;
    }

    // dump 메서드
    // 스태 안의 모든 데잍터를 바닥 -> 꼭대기 순서로 출력
    public void dump(){
        if(ptr <= 0){
            System.out.println("스택이 비어 있습니다.");
        }else {
            for(int i = 0; i < ptr; i++){
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}

