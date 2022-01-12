package code.inflearn;

import java.util.Scanner;
import java.util.*;
public class no08 {
	
	public int[] solution(int n, int[] arr) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int[] answer=new int[n];	//배열은 객체선언하면 기본적으로 0으로 초기화된다.
		
		for(int i=0;i<n;i++) {
			int cnt=1;
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {
					cnt++;	//등수 하나 증가
				}
			}
			answer[i]=cnt;
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no08 T = new no08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n,arr)) {
			System.out.print(x+" ");
		}
	}
}


