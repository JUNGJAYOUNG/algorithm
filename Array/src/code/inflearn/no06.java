package code.inflearn;

import java.util.ArrayList;
import java.util.Scanner;
public class no06 {
	
	public boolean isPrime(int num) {
		if(num==1) {	//1�� �Ҽ��ƴ�
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;	//����������°� ������ �Ҽ��ƴ�
			}		
		}
		return true;
	}

	public ArrayList<Integer> solution(int n, int[] arr) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int tmp=arr[i];
			int res=0;
			while(tmp>0) {
				int t = tmp%10;
				res = res*10+t;
				tmp = tmp/10;
			}
			if(isPrime(res)) {
				answer.add(res);
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no06 T = new no06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n,arr)) {
			System.out.println(x+" ");
		}
		
	}
}
