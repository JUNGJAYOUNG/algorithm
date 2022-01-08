package code.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class no04 {
	
	public ArrayList<String> solution(int n,String[] arr) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		ArrayList<String> answer = new ArrayList<String>();
		
		for(String x:arr) {
			char[] s= x.toCharArray();
			int lt=0, rt=x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		/*
		for(int i=0;i<arr.length;i++) {
			StringBuilder sb = new StringBuilder(arr[i]);
			answer[i] = sb.reverse().toString();
		}
		*/
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no04 T = new no04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = kb.next();
		}
		for(String x :T.solution(n,arr)) {
			System.out.println(x);
		}
	}
}
