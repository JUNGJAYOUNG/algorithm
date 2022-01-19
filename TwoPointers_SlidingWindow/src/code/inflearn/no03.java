package code.inflearn;

import java.util.Scanner;
//sliding window algorithm
public class no03 {
	
	public int solution(int n, int k, int[] arr) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int answer=0, sum=0;
		
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		answer=sum;
		
		for(int i=k;i<n;i++) {
			sum+=(arr[i]-arr[i-k]);
			answer=Math.max(answer, sum);
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no03 T = new no03();
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
