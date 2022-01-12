package code.inflearn;

import java.util.Scanner;
public class no05 {
	
	public int solution(int n) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		int answer= 0;
		int[] ch = new int[n+1];	//�ε�����ȣ�� n������ ���ܾ��ؼ� n+1���̸�ŭ �����.
		for(int i=2;i<=n;i++) {		//0,1�� �Ҽ��� ���� �ȵǴϱ� 2���� ����
			if(ch[i]==0) {
				answer++;
				for(int j=i;j<=n;j=j+i) {	//j�� i�� ����� ���ƾ��ϴϱ� i�� ����
					ch[j]=1;
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

