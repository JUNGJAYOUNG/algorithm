package code.inflearn;

import java.util.Scanner;
import java.util.*;
public class no08 {
	
	public int[] solution(int n, int[] arr) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		int[] answer=new int[n];	//�迭�� ��ü�����ϸ� �⺻������ 0���� �ʱ�ȭ�ȴ�.
		
		for(int i=0;i<n;i++) {
			int cnt=1;
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {
					cnt++;	//��� �ϳ� ����
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


