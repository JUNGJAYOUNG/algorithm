package code.inflearn;

import java.util.Scanner;
//sliding window algorithm
public class no03 {
	
	public int solution(int n, int k, int[] arr) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
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
