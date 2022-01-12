package code.inflearn;

import java.util.Scanner;
public class no04 {
	
	public int[] solution(int n) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int[] answer= new int[n];
		answer[0]=1;
		answer[1]=1;
		for(int i=0;i<n-2;i++) {
			answer[i+2]=answer[i]+answer[i+1];
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no04 T = new no04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		for(int a : T.solution(n)) {
			System.out.print(a+" ");
		}
	}
}
