package code.inflearn;

import java.util.Scanner;
public class no09 {
	
	public int solution(int n, int[][] arr) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		int answer=0;
		int x1=0;	//���� �밢�� ��
		int x2=0;	//������ �밢�� ��
		int sumx =0; //�� �밢���� ��
		int sum;
		int sum1, sum2;
		//�� ���� ��
		for(int i=0;i<n;i++) {
			sum1=sum2=0;
			for(int j=0;j<n;j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer=Math.max(answer, sum1);	//�� �� �� ū�� �� Math.max()�Լ� ���
			answer=Math.max(answer, sum2);
		}
		
		//���� �밢���� ��
		sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i][i];
		}
		answer=Math.max(answer, sum);
		//������ �밢���� ��
		sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i][n-1-i];
		}
		answer=Math.max(answer, sum);
		
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no09 T = new no09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {		
				arr[i][j]= kb.nextInt();
			}	
		}
		System.out.println(T.solution(n, arr));
	}
}

