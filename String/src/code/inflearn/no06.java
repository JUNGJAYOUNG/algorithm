package code.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class no06 {
	
	public String solution(String str) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		String answer="";
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==i) {	//indexOf�Լ��� ���� ���� ���� �ε����� ��ȯ�ϴϱ� charAt�Ѱ��� �ε����� ����� �ٸ��� �ߺ��ƴٴ� �ǹ�
				answer += str.charAt(i);
			}
			/*
			if(answer.indexOf(str.charAt(i))==-1) {
				answer+=str.charAt(i);
			}
			*/
		}		
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no06 T = new no06();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
