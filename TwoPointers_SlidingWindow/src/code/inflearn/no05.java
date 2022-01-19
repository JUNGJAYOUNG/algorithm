package code.inflearn;

import java.util.Scanner;
public class no05 {
	//two pointers algorithm
	public int solution(int n) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int answer=0, sum=0, lt=0;
		int[] arr = new int[n];
		
		for(int i=0;i<n/2+1;i++) {	//연속된 수에서 더해서 그수가 되려면 그값을 나누기2한거에 +1 한거까지만 비교하면 된다.
			arr[i]=i+1;
		}

		for(int rt=0;rt<=n/2+1;rt++) {
			sum+=arr[rt];
			if(sum==n) {
				answer++;
			}
			while(sum>=n) {
				sum-=arr[lt];
				lt++;
				if(sum==n) {	//lt값을 빼서 sum이 변했으니까 n과 같은지 다시한번 확인
					answer++;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no05 T = new no05();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
