package code.inflearn;

import java.util.*;
public class no01 {
	
	public int solution(String str, char t) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		int answer=0;
		str = str.toUpperCase();		//�� �빮�ڷ� �ٲ����
		t = Character.toUpperCase(t);	//ã������ ���ڵ� �빮�ڷ� �ٲ� Character.toUpperCase();
		//System.out.println(str+" "+t);
		/*
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==t) {	//���ڿ��� �ε����� �����Ϸ��� charAt()���� ����
									//string�� ��쿡�� equals ����ϰ� char�� == �� ����
				answer++;
			}
		}
		*/
		for(char x : str.toCharArray()) {	//���ڿ��� .toCharArray()�� ���ڹ迭�� ������
			if(x==t)
				answer++;
		}	
		return answer;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		no01 T = new no01();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();	//.next() ���ڿ� �о����
		char c = kb.next().charAt(0);	//.next()�� ���ڿ��� �������µ� char ���� �ϳ��� ���������� .charAt(0) ���� �ʿ�
		
		System.out.print(T.solution(str, c));
	}

}
