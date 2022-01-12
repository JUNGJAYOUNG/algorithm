package code.inflearn;

import java.util.Scanner;
public class no02 {
	
	public int solution(int n, int[] arr) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int answer=1, max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				answer++;
				max=arr[i];	//제일 큰 수 update
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no02 T = new no02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}
}

