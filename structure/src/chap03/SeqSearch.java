package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class SeqSearch {
    // 요솟수가 n인 배열 a에서 ke와 같은 요소를 선형 검색
    static int seqSearch(int [] a, int n, int key){
        int i = 0;

        while(true){
            if(i == n){ // 요솟수가 0이면 return 반환
                return -1; // 검색실패 시 -1 반환
            }
            if(a[i] == key){
                return i;
            }
            i++;
        }
    }
    // Whiel문 대신 For문을 사용한 메서드
    static int seqSearchFor(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요소수 : ");
        int num = Integer.parseInt(br.readLine());
        int [] x = new int [num];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("검색할 값 : ");
        int ky = Integer.parseInt(br.readLine());

        int idx = seqSearch(x, num, ky);

        if(idx == -1){
            System.out.println("그 값의 요소는 없습니다.");
        }else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }

    }
}
