package code.inflearn;

import java.util.Scanner;
public class no04 {
	
	public int solution(int n, int k, int[] arr) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int answer=0, sum=0, lt=0;

		for(int rt=0;rt<n;rt++) {
			sum+=arr[rt];
			if(sum==k) {
				answer++;
			}
			while(sum>=k) {
				sum-=arr[lt++];
				if(sum==k) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no04 T = new no04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n,k,arr));
	}
}
