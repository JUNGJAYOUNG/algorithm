package code.inflearn;

import java.util.Scanner;
public class no02 {
	
	public int solution(int n, int[] arr) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		int answer=1, max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				answer++;
				max=arr[i];	//���� ū �� update
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

