package code.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class no12 {
	
	public String solution(int n,String str) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		String answer = "";
		for(int i=0;i<n;i++) {
			String tmp = str.substring(0,7).replace("#", "1").replace("*", "0");
			int num=Integer.parseInt(tmp, 2);	//String�� 2������ 10������ ��ȯ�Ѵ�.
			answer += (char)num;
			str = str.substring(7);	//7���� �������� ������ �ٲ۴�.
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no12 T = new no12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n,str));
	}
}

