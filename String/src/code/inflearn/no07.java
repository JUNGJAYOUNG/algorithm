package code.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class no07 {
	
	public String solution(String str) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		String answer="YES";
		str = str.toLowerCase();
		int len=str.length();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				return "NO";
			}
		}
		/*
		StringBuilder sb = new StringBuilder(str);
		String reverse = sb.reverse().toString();
		if(str.equalsIgnoreCase(reverse)) {	//��ҹ��� ����
			answer="YES";
		}else {
			answer="NO";
		}
		*/
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no07 T = new no07();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

