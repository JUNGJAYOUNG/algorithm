package code.inflearn;

import java.util.*;
public class no01 {
	
	public int solution(String str, char t) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int answer=0;
		str = str.toUpperCase();		//다 대문자로 바꿔버림
		t = Character.toUpperCase(t);	//찾으려는 문자도 대문자로 바꿈 Character.toUpperCase();
		//System.out.println(str+" "+t);
		/*
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==t) {	//문자열에 인덱스로 접근하려면 charAt()으로 접근
									//string일 경우에만 equals 써야하고 char는 == 비교 가능
				answer++;
			}
		}
		*/
		for(char x : str.toCharArray()) {	//문자열을 .toCharArray()로 문자배열을 생성함
			if(x==t)
				answer++;
		}	
		return answer;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		no01 T = new no01();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();	//.next() 문자열 읽어오기
		char c = kb.next().charAt(0);	//.next()가 문자열을 가져오는데 char 문자 하나를 가져오려면 .charAt(0) 까지 필요
		
		System.out.print(T.solution(str, c));
	}

}
