package code.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class no01 {
	
	public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		int p1=0,p2=0;
		
		while(p1<n && p2<m) {	//two pointer algorithm �� �迭 ��ġ��
			if(arr1[p1]<arr2[p2]) {
				answer.add(arr1[p1++]);
			}else{
				answer.add(arr2[p2++]);
			}
		}
		while(p1<n) {	//������ �� �־������
			answer.add(arr1[p1++]);
		}
		while(p2<m) {
			answer.add(arr2[p2++]);
		}
		
		/*
		int length = arr1.length+arr2.length;
		int[] answer= new int[length];
		
		for(int i=0;i<arr1.length;i++) {
			answer[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			answer[arr1.length+i]=arr2[i];
		}
		
		Arrays.sort(answer);	//int�� �迭 �������� Arrays.sort()
		*/
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no01 T = new no01();
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

