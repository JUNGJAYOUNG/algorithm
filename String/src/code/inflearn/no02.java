package code.inflearn;

import java.util.*;
public class no02 {
	
	public String solution(String str) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		String answer = "";
		for(char x: str.toCharArray()) {
			if(x>=97 && x<=122) {	//�ҹ��ڸ�
				answer += (char)(x-32);	//�빮�ڷ� ��ȯ
			}else {
				answer += (char)(x+32);
			}
			/*
			if(Character.isLowerCase(x)) {	//Character.Ŭ���� ���� isLowerCase()�޼ҵ� �̿�		
				answer+=Character.toUpperCase(x);	//answer String�̴ϱ� +=�� ����
			}else {
				answer+=Character.toLowerCase(x);
			}	
			*/
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		no02 T = new no02();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
	
		System.out.print(T.solution(str));
	}

}

