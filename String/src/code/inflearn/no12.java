package code.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class no12 {
	
	public String solution(int n,String str) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		String answer = "";
		for(int i=0;i<n;i++) {
			String tmp = str.substring(0,7).replace("#", "1").replace("*", "0");
			int num=Integer.parseInt(tmp, 2);	//String형 2진수를 10진수로 변환한다.
			answer += (char)num;
			str = str.substring(7);	//7부터 끝까지로 문장을 바꾼다.
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

