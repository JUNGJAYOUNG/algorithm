package code.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class no01 {
	
	public String solution(int[] arr) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		String answer = arr[0]+" ";
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]<arr[i]) {
				answer+=arr[i]+" ";
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no01 T = new no01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(arr));
	}
}
