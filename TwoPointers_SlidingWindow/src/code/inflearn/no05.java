package code.inflearn;

import java.util.Scanner;
public class no05 {
	//two pointers algorithm
	public int solution(int n) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		int answer=0, sum=0, lt=0;
		int[] arr = new int[n];
		
		for(int i=0;i<n/2+1;i++) {	//���ӵ� ������ ���ؼ� �׼��� �Ƿ��� �װ��� ������2�Ѱſ� +1 �Ѱű����� ���ϸ� �ȴ�.
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
				if(sum==n) {	//lt���� ���� sum�� �������ϱ� n�� ������ �ٽ��ѹ� Ȯ��
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
