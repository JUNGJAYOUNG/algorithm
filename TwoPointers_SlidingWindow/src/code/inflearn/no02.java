package code.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class no02 {
	
	public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int p1=0,p2=0;
		
		while(p1<n && p2<m) {
			if(arr1[p1]==arr2[p2]) {
				answer.add(arr1[p1++]);
				p2++;
			}
			else if(arr1[p1]<arr2[p2]) {
				p1++;
			}else {
				p2++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no02 T = new no02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=kb.nextInt();
		}
		int m = kb.nextInt();
		int[] arr2 = new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=kb.nextInt();
		}
		
		for(int x: T.solution(n,m,arr1,arr2)) {
			System.out.print(x+" ");
		}
		
	}
}

