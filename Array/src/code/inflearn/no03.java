package code.inflearn;

import java.util.Scanner;
public class no03 {
	
	public String solution(int n, int[] a, int[] b) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		String answer="";
		
		for(int i=0;i<n;i++) {
			if(a[i]==b[i]) {
				answer+="D";
			}else if(a[i]==1 && b[i]==3) {		//�̱�� ���
				answer +="A";
			}else if(a[i]==2 && b[i]==1) {
				answer +="A";
			}else if(a[i]==1 && b[i]==2) {
				answer +="A";
			}else {
				answer +="B";	//�ƴϸ� �� �����
			}	
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no03 T = new no03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=kb.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(T.solution(n,a,b).charAt(i));
		}
	}
}

